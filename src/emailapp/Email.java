package emailapp;

import java.awt.desktop.SystemEventListener;
import java.util.Locale;
import java.util.Scanner;

public class Email {
    // using encapsulation to hide them, dont want others accessing it directly
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private String alternatemail;

    private String companySuffix = "yahocompany.com";
    private int mailboxCapacity  = 500;
    private int defaultPasswordLength = 10;

    // Constructor to recieve the first and last name
    public Email(String firstName, String lastName){
        // class level first name = local parameter first name
        this.firstName = firstName;
        this.lastName = lastName;
        //S ystem.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

    // call method asking for the department - return the department
        this.department = setDepartment();
       // System.out.println("Department: " + this.department);

        // Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        // Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        // System.out.println("Your email is: " + email);
    }
    // Ask for the department
    private String setDepartment() {
        System.out.println("New worker: " + firstName + " " + lastName + " " + ". Department Codes\n1 for Sales\n2. for Development\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if(depChoice == 1){ return "sales"; }
        else if(depChoice == 2){ return "dev"; }
        else if(depChoice == 3){ return "acc"; }
        else{ return ""; }

    }

    // Generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for(int i =0; i<length; i++){
           int rand =  (int) (Math.random() * passwordSet.length());
           password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
    // Set mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    // Set the alternate email
    public void setAlternatemail(String altEmail){
        this.alternatemail = altEmail;
    }

    // Change the password
    public void changePassword(String password){
        this.password = password;
    }

    // get mailbox capacity
    public int getMailboxCapacity(){ return mailboxCapacity; }
    public String getAlternatemail(){return alternatemail; }
    public String getPassword(){return password; }

    public String showInfo(){
        return "DISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMPANY NAME: " + email +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
    }
}