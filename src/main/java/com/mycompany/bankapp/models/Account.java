package com.mycompany.bankapp.models;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Account {
    
    private int accountid;
    private String account;
    private double currentBal;
    
    public Account(){}                  // blank constructor
                                                // no-argument constructor in addition to the default constructor
    
    public Account(int id, String account){
        this.accountid = id;
        this.account= account;
        this.currentBal = currentBal;
        
    }

    public int getId() {
        return accountid;
    }

    public void setId(int id) {
        this.accountid = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
    
    public double getBal(){
        return currentBal;
    }
    
    public void setBal(double currentBal){
        this.currentBal = currentBal;
    }
    
    public  String printAccount() {                        // extra method 
        String str = this.getId() + this.getAccount();
        return str;
        
    }
}
