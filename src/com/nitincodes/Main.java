package com.nitincodes;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
/*
   Pooja would like to withdraw X $US from an ATM. The cash machine will
   only accept the transaction if X is a multiple of 5,
   and Pooja's account balance has enough cash to
   perform the withdrawal transaction (including bank charges).
   For each successful withdrawal the bank charges 0.50 $US.
   Calculate Pooja's account balance after an attempted transaction.
 */

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double withdraw, balance;
        withdraw = sc.nextDouble();
        balance = sc.nextDouble();
        if(withdraw%5==0 && balance>=(withdraw+0.50)){
            balance = balance - 0.50;
            System.out.printf("%.2f",balance);
        }
        else{
            System.out.printf("%.2f",balance);
        }
    }
}
