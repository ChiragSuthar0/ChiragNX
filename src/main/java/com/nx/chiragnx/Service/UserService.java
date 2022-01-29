package com.nx.chiragnx.Service;

import com.nx.chiragnx.entity.User;

public interface UserService {
    User findByUserName(String userName);
}
