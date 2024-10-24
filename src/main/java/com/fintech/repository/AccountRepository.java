package com.fintech.repository;

import com.fintech.common.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<AccountEntity, Long> {
    Boolean existsByAccountNumber(String accountNumber);
}
