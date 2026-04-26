package com.payment.model;

import java.math.BigDecimal;

public class PaymentInstruction {

    private String senderVpa;
    private String receiverVpa;
    private BigDecimal amount;
    private String pinHash;
    private String nonce;     // UUID, unique per payment intent
    private Long signedAt;    // epoch millis, when sender signed

}
