package com.payment.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "accounts")
@Data
public class Account {
    @Id
    private String vpa; // Virtual Payment Address (VPA) as primary key

    @Column(nullable = false)
    private String holderName;

    @Column(nullable = false, precision = 19, scale = 2)
    private BigDecimal balance;

    @Version  // Optimistic locking — prevents lost updates on concurrent transfers
    private Long version;

}
