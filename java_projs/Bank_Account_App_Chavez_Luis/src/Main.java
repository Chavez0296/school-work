import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        System.out.println("Welcome to CS136 bank\nPlease create a new account");
        createAccount(bankAccount);
        checkSsn(bankAccount);
    }

    private static void createAccount(BankAccount bankAccount) {
        takeInput("Account type: (saving,checking)","AccountType",bankAccount);
        takeInput("Account number: (6 characters)","AccountNumber",bankAccount);
        takeInput("Create date:","CreateDate",bankAccount);

        System.out.println("Customer Info:");
        takeInput("First name:", "FirstName", bankAccount);
        takeInput("Last name:","LastName",bankAccount);
        takeInput("Date of birth:","DOB",bankAccount);
        takeInput("Last 4 of SSN:","SSN",bankAccount);

        System.out.println("Address info:");
        takeInput("Address1:","Address1",bankAccount);
        takeInput("Address2:","Address2",bankAccount);
        takeInput("City:","City",bankAccount);
        takeInput("State:","State",bankAccount);
        takeInput("Zipcode:","Zipcode",bankAccount);
    }
    private static void displayInformation(BankAccount bankAccount) {
        System.out.println("Account type: "+bankAccount.getAccountType());
        System.out.println("Account number: "+bankAccount.getAccountNumber());
        System.out.println("Create date: "+bankAccount.getAccountCreationDate());

        System.out.println("Customer Info");
        System.out.println("\tFirst name: "+bankAccount.customer.getFirstName());
        System.out.println("\tLast name: "+bankAccount.customer.getLastName());
        System.out.println("\tDate of birth: "+bankAccount.customer.getDob());

        System.out.println("Address:");
        System.out.println("\t\tAddress1: "+bankAccount.customer.address.getAddress1());
        System.out.println("\t\tAddress2: "+bankAccount.customer.address.getAddress2());
        System.out.println("\t\tCity: "+bankAccount.customer.address.getCity());
        System.out.println("\t\tState: "+bankAccount.customer.address.getState());
        System.out.println("\t\tZipcode: "+bankAccount.customer.address.getZipcode());
    }

    private static void takeInput(String msg, String variable,BankAccount bankAccount) {
        while(true)
        {
            boolean flag = false;
            System.out.println(msg);
            switch(variable)
            {
                case "AccountType":
                    flag = bankAccount.setAccountType(scanner.nextLine());
                    break;
                case "AccountNumber":
                    flag = bankAccount.setAccountNumber(scanner.nextLine());
                    break;
                case "CreateDate":
                    flag = bankAccount.setAccountCreationDate(scanner.nextLine());
                    break;
                case "FirstName":
                    flag = bankAccount.customer.setFirstName(scanner.nextLine());
                    break;
                case "LastName":
                    flag = bankAccount.customer.setLastName(scanner.nextLine());
                    break;
                case "DOB":
                    flag = bankAccount.customer.setDob(scanner.nextLine());
                    break;
                case "SSN":
                    flag = bankAccount.customer.setSsn(scanner.nextInt());
                    scanner.nextLine();
                    break;
                case "Address1":
                    flag = bankAccount.customer.address.setAddress1(scanner.nextLine());
                    break;
                case "Address2":
                    flag = bankAccount.customer.address.setAddress2(scanner.nextLine());
                    break;
                case "City":
                    flag = bankAccount.customer.address.setCity(scanner.nextLine());
                    break;
                case "State":
                    flag = bankAccount.customer.address.setState(scanner.nextLine());
                    break;
                case "Zipcode":
                    flag = bankAccount.customer.address.setZipcode(scanner.nextLine());
                    break;
                default:
                    break;
            }
            if(flag)
                break;
            else
                System.out.println("Invalid "+variable+", please try again.");
        }
    }
    private static void checkSsn(BankAccount bankAccount) {
        System.out.println("Checking the last 4");
        int n = 3;
        while(true)
        {
            System.out.println("Please enter last 4 to verify: (number of attempts "+n+")");
            if(scanner.nextInt()!=bankAccount.customer.getSsn())
            {
                System.out.println("Invalid last 4 digits, Please try again.");
                n--;
            }
            else
            {
                displayInformation(bankAccount);
                break;
            }
            if(n==0)
            {
                System.out.println("Failed to verify last 4.");
                break;
            }
        }
    }

}
