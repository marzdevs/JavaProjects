package emailapp;
/* Email Application
   will create email accounts for new hires
   1. generate and email with following syntax: firstname.lastname@department.company.com
   2. determine the department(sales,dev, accounting) if none leave blank
   3. generate random String for a password
   4. have set methods to change password, set the mailbox capacity, and define an alternate email address
   5. have get methods to display the name, email, and mailbox capacity
*/

public class EmailApp {
    public static void main(String[] args) {
        Email em1 = new Email("John", "Smith");
        System.out.println(em1.showInfo());

        /*things to add on:
                when department is none remove the . before company
                ask user the name and use it instead
         */

    }
}


