package com.cpluss.multiDB.repository.user;

import com.cpluss.multiDB.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
