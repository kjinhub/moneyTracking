package com.wallet.walletManagement.Controller;

import com.wallet.walletManagement.model.Transcation;
import com.wallet.walletManagement.service.TransactionService;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/transactions")
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionService transactionService;
    @Autowired
    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }
    @GetMapping
    public ResponseEntity<List<Transcation>> getAllTransactions() {
        return ResponseEntity.ok(transactionService.getAllTransactions());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Transcation> getTransactionById(@PathVariable Long id) {
        return ResponseEntity.ok(transactionService.getTransactionById(id));
    }

    @GetMapping("/account/{accountId}")
    public ResponseEntity<List<Transcation>> getTransactionsByAccount(@PathVariable Long accountId) {
        return ResponseEntity.ok(transactionService.getTransactionsByAccount(accountId));
    }

    @GetMapping("/range")
    public ResponseEntity<List<Transcation>> getTransactionsByDateRange(
            @RequestParam("start") String start,
            @RequestParam("end") String end) {
        return ResponseEntity.ok(
                transactionService.getTransactionsByDateRange(LocalDateTime.parse(start), LocalDateTime.parse(end))
        );
    }

    @PostMapping
    public ResponseEntity<Void> createTransaction(@RequestBody Transcation transcation) {
        transactionService.createTransaction(transcation);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateTransaction(@PathVariable Long id, @RequestBody Transcation transcation) {
        transcation.setId(id);
        transactionService.updateTransaction(transcation);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTransaction(@PathVariable Long id) {
        transactionService.deleteTransaction(id);
        return ResponseEntity.ok().build();
    }
}