/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise9_3;

/**
 *
 * @author Jakexz
 */
public class Problem1 {

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

//replacing sync method with sync block
class Account {
    private int balance = 0;
    
    void deposit(int amount){
        
        ////////this is the sync block
        synchronized(this){
            balance += amount;
        }
        //////////////////////////////
    }
    
    int getBalance(){
        return balance;
    }
}

class Customer extends Thread{
    Account myAccount;
    
    //instance constructor
    Customer(Account myAccount){
        this.myAccount = myAccount;
    }
    
    public void run(){
        try{
            for(int i = 0; i < 10000; i++){
                myAccount.deposit(10);
            }
        }catch(Exception e ){
            e.printStackTrace();
        }
    }
    
}