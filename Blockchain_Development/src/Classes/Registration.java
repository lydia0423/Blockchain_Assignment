package Classes;

public class Registration {
    protected String userId, name, icOrPassportNumber, email; 

    public Registration(String userId, String name, String icOrPassportNumber, String email) {
        super();
        this.userId = userId;
        this.name = name;
        this.icOrPassportNumber = icOrPassportNumber;
        this.email = email;
    }
    
    public Registration(String userId) {
        super();
        this.userId = userId;
    }
    
    public Registration(String userId, String email) {
        super();
        this.userId = userId;
        this.name = email;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcOrPassportNumber() {
        return icOrPassportNumber;
    }

    public void setIcOrPassportNumber(String icOrPassportNumber) {
        this.icOrPassportNumber = icOrPassportNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
