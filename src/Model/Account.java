package Model;
import java.util.*;

public abstract class Account {
	
    private int accountNo; // °èÁÂ¹øÈ£
    private int balance; // ÀÜ°í
    private int accountType; // °èÁÂÁ¾·ù
    Normal normal;
	
    public Account() {
    	
    }

    public int getAccountNo() { 
    	return accountNo; 
    }
    
    public int getAccountType() { 
    	return accountType; 
    }
    
    public int getBalance() { 
    	return balance;
    }
    
    public void setBalance(int amount) { 
    	balance = amount; 
    }

}