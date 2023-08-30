package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl  implements UserService{


    //fake user list
    List<User>list = List.of(
            new User(1311L, "Hafiz","5773661748"),
            new User(1312L, "Masum","5773661749"),
            new User(1313L, "Rahman","5773661750"),
            new User(1314L, "Md","5773661751")
            );
    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
