package me.kalinowski.RozPal.api;

import me.kalinowski.RozPal.Transactions;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/transactions")

public class TransactionsApi {

    private List<Transactions> transactions;

    public TransactionsApi(){
        transactions = new ArrayList<>();
        transactions.add(new Transactions(1, "101", "102", "22.02.2022", "PKD19991", 1, 10, 2, 1, 2, 13, 4, 4));
    }

    @GetMapping("/all")
    public List<Transactions> getAll(){
        return transactions;
    }

    @GetMapping
    public Transactions getById(@RequestParam int transactionId){
        Optional<Transactions> first = transactions.stream().filter(element -> element.getId() == transactionId).findFirst();
        return first.get();
    }

    @PostMapping
    public Boolean addTransaction (@RequestBody Transactions transactions){
        return addTransaction(transactions);
    }

    @PostMapping
    public Boolean updateTransaction (@RequestBody Transactions transactions){
        return addTransaction(transactions);
    }

    @PostMapping
    public Boolean deleteTransaction (@RequestParam int transactionId){
        return deleteTransaction(transactionId);
    }
}
