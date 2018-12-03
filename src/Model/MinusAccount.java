package Model;
import java.util.*;

public class MinusAccount extends Account {
	
    private char credit_rate; // 신용등급
	
    public MinusAccount() {
        
    }

    public char getCreditRate() { 
    	return creditrate; 
    }
    
    public void setCreditRate(char credit_rate) { 
    	creditrate = credit_rate; 
    }

}