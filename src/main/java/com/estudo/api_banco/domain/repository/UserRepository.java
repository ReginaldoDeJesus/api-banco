package com.estudo.api_banco.domain.repository;

import com.estudo.api_banco.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    boolean existsByAccountNumber(String accountNumber);
}
