package com.company;

public class TransactionInput {
    public String transactionOutputId; // id вывода транзакции
    public TransactionOutput UTXO; //Contains the Unspent transaction output

    public TransactionInput(String transactionOutputId) {
        this.transactionOutputId = transactionOutputId;
    }
}
