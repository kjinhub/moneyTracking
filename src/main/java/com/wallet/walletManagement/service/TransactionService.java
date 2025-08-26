package com.wallet.walletManagement.service;

import com.wallet.walletManagement.model.Transcation; // ⚠️ 현재 파일명이 Transcation이므로 맞춤
import com.wallet.walletManagement.repository.TrasactionRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionService<TrasactionService> {

    private final TrasactionRepository trasactionRepository;
    @Autowired
    public TransactionService(TrasactionRepository trasactionRepository) {
        this.trasactionRepository = trasactionRepository;
    }
    public List<Transcation> getAllTransactions() {
        return trasactionRepository.findAll();
    }

    public Transcation getTransactionById(Long id) {
        return trasactionRepository.findById(id);
    }

    public List<Transcation> getTransactionsByAccount(Long accountId) {
        return trasactionRepository.findByAccountId(accountId);
    }

    public List<Transcation> getTransactionsByDateRange(LocalDateTime start, LocalDateTime end) {
        return trasactionRepository.findByDateRange(start, end);
    }

    public void createTransaction(Transcation transcation) {
        trasactionRepository.insert(transcation);
    }

    public void updateTransaction(Transcation transcation) {
        trasactionRepository.update(transcation);
    }

    public void deleteTransaction(Long id) {
        trasactionRepository.delete(id);
    }
}
