package Model;
import java.util.*;

public abstract class Account {
	
    private int accountNo; // ���¹�ȣ
    private int balance; // �ܰ�
    private int accountType; // ��������
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