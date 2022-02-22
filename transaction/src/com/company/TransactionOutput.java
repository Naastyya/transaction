package com.company;

import java.security.PublicKey;

public class TransactionOutput {
    public String id;
    public PublicKey receiver; //
    public double value; // Баланс получателя
    public String parentTransactionHash; // Хеш транзакции, который сгенерировал вывод транзакции


    public TransactionOutput(PublicKey receiver, float value, String parentTransactionHash) {
        this.receiver = receiver;
        this.value = value;
        this.parentTransactionHash = parentTransactionHash;

    }
}
