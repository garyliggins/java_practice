import java.util.Scanner; //scanner must be imported before using

public class Survey {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nthank you for taking the survey");

        int counter = 0;
        System.out.println("\nwhat is your name?");
        String name = scan.nextLine();
        counter++;
        //after the above print statements this line waits for the user to input text, then it will print out that text, since we are doing this in our own terminal we will write in the text inside of the termimal, we are saving the value inside of a variable name to be used later

        System.out.println("\nhow much do you spend on coffee?");
        double coffeePrice = scan.nextDouble();
        counter++;

        System.out.println("\nhow much do you spend on fast food?");
        double foodPrice = scan.nextDouble();
        counter++;

        System.out.println("\nhow many times a week do you buy coffee?");
        int coffeeAmount = scan.nextInt();
        counter++;

        System.out.println("\nthank you " + name + " for answering " + counter + " questions.");
        System.out.println("\nyour fast food expenses are " + (foodPrice/coffeePrice) + " times your coffee expense");
        // all of the anwsers are saved to variables and can be resused like the example above
        // \n - this is a escape character so it will create a new line before or after depending on where you put its
        System.out.println("\nweekly you spend $ " + (coffeeAmount*coffeePrice) + " on coffee");
      

        scan.close(); // closing the scanner to prevent memory leaks
    }
}

// to set up a scanner you need 3 things 
// 1st is setting the variable to a type of scanner
// 2nd creating a new variable name
// 3rd setting a new scanner instance value to take in the input
// Scanner scan = new Scanner(System.in);

// nextLine() - this waits for a user to enter a string
// nextDouble() - this waits for a user to enter a double value
// nextInt() - waits for a user to enter a whole integer value

// closing scanner - scan.close();
// if you dont do this it causes a memory leak