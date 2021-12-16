/* x16348791
    issue with github means i can't push it to origin myself

*/

package com.mycompany.bankapp.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Transaction {
    private int transId;
    private Date transactionDate;
    private String description;
    private double balancechange;
    
    private List<Transaction> transactions = new ArrayList<>();
    
    public Transaction(){
    }
    
    public Transaction (int transId, Date transactionDate, String description, int balancechange, List<Transaction> transactions){
       
        this.transId = transId;
        this.transactionDate = transactionDate;
        this.description = description;
        this.balancechange = balancechange;
        
    }
    
    public int getId(){
        return transId;
    }
    
    public void setId(int transId){
        this.transId = transId;
    }
    
    public Date getTransDate(){
        return transactionDate;
    }
    
    public void setTransDate(Date transactionDate){
        this.transactionDate = transactionDate;
    }
    
    public String getDesc(){
        return description;
    }
    
    public void setDesc(String description){
        this.description = description;
    }
    
    public double getBChange(){
        return balancechange;
    }
    
    public void setBChange(double balancechange){
        this.balancechange = balancechange;
    }
    
   
}
