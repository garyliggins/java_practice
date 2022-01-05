import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nWelcome to JavaGram! Let's sign you up.");
        

        //Task 1 - Using Scanner, ask the user questions
        System.out.println("\nwhat is your first name?");
        String first_name = scan.nextLine();
        //Ask for their first name.
        System.out.println("\nwhat is your last name?");
        String last_name = scan.nextLine();
        //Ask for their last name.
        System.out.println("\nhow old are you?");
        int age = scan.nextInt();
        //Ask: how old are you?
        scan.nextLine();
        System.out.println("\ncreate a username");
        String username = scan.nextLine();
        //Ask them to make a username.
        System.out.println("\nwhat city do you live in?");
        String city = scan.nextLine();
        //Ask what city they live in.
        System.out.println("\nwhat country are you from?");
        String country = scan.nextLine();
        //Ask what country that's from.


        //Task 2 - Print their information. 

        System.out.println("\nThank you for joining JavaGram!");

        //Print their information like so:

        // Your information:
        //        First Name: Rayan
        //        Last Name: Slim
        //        Age: 27
        //        Username: monotonic_relu
        //        City: Ottawa
        //        Country: Canada
        //
        System.out.println("\nYour information:\nFirst Name: " + first_name + "\nLast Name: " + last_name + "\nAge: " + age + "\nUsername: " + username + "\nCity: " + city + "\nCountry: " + country);

        //close scanner. It's good practice :D ! 
        scan.close();
    }
}