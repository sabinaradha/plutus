package com.bankapp.Dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bankapp.domain.SavingsTransaction;

public interface SavingsTransactionDao extends CrudRepository<SavingsTransaction, Long> {

    List<SavingsTransaction> findAll();
}

