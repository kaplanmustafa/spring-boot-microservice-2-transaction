package com.sha.springbootmicroservice2transaction.sevice;

import com.sha.springbootmicroservice2transaction.model.Transaction;

import java.util.List;

public interface TransactionService {

    Transaction saveTransaction(Transaction transaction);

    void deleteTransaction(Long transactionId);

    List<Transaction> findAllTransactionsOfUser(Long userId);
}
