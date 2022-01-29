package com.nx.chiragnx.Service.Impl;

import com.nx.chiragnx.Service.UserService;
import com.nx.chiragnx.entity.User;
import com.nx.chiragnx.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public User findByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }


}
