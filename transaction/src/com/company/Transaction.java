package com.company;

import java.security.PublicKey;
import java.util.ArrayList;

public class Transaction {
    public String transactionHash; // хеш транзакцій
    public PublicKey sender; // Відправник
    public PublicKey Receiver; // Адрес отримувача
    public double value; // Сума
    public byte [] signature; // Дані підпису
    public long timeStamp; // Час відправки

    public ArrayList<TransactionInput> inputs = new ArrayList <TransactionInput> (); // Ввід транзакцій
    public ArrayList <TransactionOutput> output = new ArrayList <TransactionOutput> (); // вивід транзакцій

}
