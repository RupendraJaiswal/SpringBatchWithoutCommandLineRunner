package com.devbuild.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.devbuild.model.User;

@Component
public class UserItemProcessor implements ItemProcessor<User, User> {
    @Override
    public User process(User user) {
        user.setEmail(user.getEmail().toLowerCase());
        return user;
    }
}
