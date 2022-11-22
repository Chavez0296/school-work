public class BankAccount {
    private String accountType;
    private String accountNumber;
    private String accountCreationDate;
    Customer customer;
    public BankAccount(){
        this.customer = new Customer();
    }
    public Customer getCustomer() {
        return customer;
    }
    public String getAccountType() {
        return accountType;
    }
    public boolean setAccountType(String accountType) {
        if(accountType.equals("saving") || accountType.equals("checking"))
        {
            this.accountType = accountType;
            return true;
        }
        return false;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public boolean setAccountNumber(String accountNumber) {
        if(accountNumber.length()==6)
        {
            this.accountNumber = accountNumber;
            return true;
        }
        return false;
    }
    public String getAccountCreationDate() {
        return accountCreationDate;
    }
    public boolean setAccountCreationDate(String accountCreationDate) {
        if(!accountCreationDate.isEmpty())
        {
            this.accountCreationDate = accountCreationDate;
            return true;
        }
        return false;
    }

}
