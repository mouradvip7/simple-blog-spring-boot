package com.example.simpleblog.repository;

import com.example.simpleblog.entities.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface UserRepository extends ElasticsearchRepository<User, String> {

    User findByUsername(String username);
}


