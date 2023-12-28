package com.example.useraggregator.service;

import com.example.useraggregator.conf.DataSourcesProperties;
import com.example.useraggregator.model.entity.User;
import com.example.useraggregator.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
    public class UserService {
    private final DataSourcesProperties dataSourcesProperties;
    private final UserRepository userRepository;

    @Autowired
    public UserService(DataSourcesProperties dataSourcesProperties, UserRepository userRepository) {
        this.dataSourcesProperties = dataSourcesProperties;
        this.userRepository = userRepository;
    }

        public List<User> getAllUsers() {
            return userRepository.getUsers(dataSourcesProperties.getConfigurations());
        }
    }
