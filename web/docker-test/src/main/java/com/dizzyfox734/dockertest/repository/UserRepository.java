package com.dizzyfox734.dockertest.repository;

import com.dizzyfox734.dockertest.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
