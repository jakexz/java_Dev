/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankDemo;

/**
 *
 * @author Jakexz
 */
public class BankDemo {

    /**
     * @param args the command line arguments
     */
    private final static int CUSTOMERS_NUMBER = 10;
    public static void main(String[] args) {
        Account myAccount = new Account();// TODO code application logic here
        
        Customer myCustomers[] = new Customer[CUSTOMERS_NUMBER];
        for(int i = 0; i < CUSTOMERS_NUMBER; i++){
            myCustomers[i] = new Customer(myAccount);
            myCustomers[i].start();
        }
        
        //wait for thread
        for(int i = 0; i < CUSTOMERS_NUMBER; i++){
            try{
                myCustomers[i].join();
            }catch(InterruptedException ex){
                ex.printStackTrace();
            }
        }
        
        //done with thread exes' print final message
        System.out.println(myAccount.getBalance());
        
    }
    
}


class Account {
    private int balance = 0;
    
    synchronized void deposit(int amount){
        balance += amount;
    }
    
    int getBalance(){
        return balance;
    }
}

class Customer extends Thread{
    Account account;
    
    Customer(Account account){
        this.account = account;
    }
    
    public void run(){
        try{
            for(int i = 0; i <10000;i++)
                account.deposit(10);
        }catch(Exception e ){
            e.printStackTrace();
            }
    }
}