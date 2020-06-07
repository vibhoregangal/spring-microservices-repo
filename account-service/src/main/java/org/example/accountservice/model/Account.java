package org.example.accountservice.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@NoArgsConstructor
@Entity
@Table(name = "ACCOUNT_TABLE")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "account_number")
    private int accountNumber;
    @Column(name = "account_holder_name")
    private String accountHolderName;
    @Column(name = "account_balance")
    private double accountBalance;
    @Column(name = "active_status")
    private boolean isActive;
    public Account(String accountHolderName, double accountBalance, boolean isActive) {
        super();
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
        this.isActive = isActive;
    }
}
