package com.estudo.api_banco.service;

import com.estudo.api_banco.domain.model.User;
import com.estudo.api_banco.domain.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User findById(Long id){
        return repository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    public User create(User user){
        if(repository.existsByAccountNumber(user.getAccount().getNumber())){
            throw new IllegalArgumentException("This user Account number aleready exists.");
        }
        return repository.save(user);
    }

}
