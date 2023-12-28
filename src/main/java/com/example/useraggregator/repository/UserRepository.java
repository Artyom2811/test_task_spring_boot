package com.example.useraggregator.repository;

import com.example.useraggregator.conf.DataSourcesProperties;
import com.example.useraggregator.model.entity.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    public List<User> getUsers(List<DataSourcesProperties.DataSourceConfig> configurations) {
        List<User> users = new ArrayList<>();
        configurations.forEach(conf -> {
                    DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource(conf.getUrl(), conf.getUser(), conf.getPassword());
                    JdbcTemplate jdbcTemplate = new JdbcTemplate(driverManagerDataSource);

                    users.addAll(jdbcTemplate.query(
                                    "SELECT * FROM public.%s;".formatted(conf.getTable()),
                                    (rs, rowNum) -> new User(
                                            rs.getLong(conf.getMapping().getId()),
                                            rs.getString(conf.getMapping().getUsername()),
                                            rs.getString(conf.getMapping().getName()),
                                            rs.getString(conf.getMapping().getSurname()))
                            )
                    );
                }

        );

        return users;
    }
}