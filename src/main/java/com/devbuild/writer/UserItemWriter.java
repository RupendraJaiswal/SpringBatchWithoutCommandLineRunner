package com.devbuild.writer;

import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.devbuild.model.User;
import com.devbuild.repository.UserRepository;

@Component
public class UserItemWriter implements ItemWriter<User> {

    @Autowired
    private UserRepository repository;

    @Override
    public void write(Chunk<? extends User> chunk) throws Exception {
        repository.saveAll(chunk.getItems());
    }
}
