package Model;
import java.util.*;

public abstract class Member {
	
    private String id;
    private String password;
    private String name;
    private String phoneNo;
    private String address;
    private Boolean gender;
    private Date birth;
    private ArrayList<Account> accountList;
    
    public Member() {
    	
    }
    
    public String getID() {
        return id;
    }
    
    public String getPassword() {
        return password;
    }
    
    public String getName() {
        return name;
    }
    
    public String getPhoneNo() {
        return phoneno;
    }
    
    public String getAddress() {
        return address;
    }
    
    public Boolean getGender() {
        return null;
    }
    
    public Date getBirth() {
        return null;
    }
    
    public void showAccountList() {
        
    }

}