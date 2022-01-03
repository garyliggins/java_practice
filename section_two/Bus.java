public class Bus {
    public static void main(String[] args) {
        String sentence = "Number of passengers: ";
       int passengers = 0; //initializign the variable with a value of 0
       passengers = passengers + 9; // updating passengers to equal the value of passengers + 9
       passengers += 9; //cleaner way to do the code above
       System.out.println(sentence + passengers);
       passengers -= 5;
       System.out.println( sentence + passengers);
       passengers -= 4;
       System.out.println(sentence + passengers);
    }
}

//updating variables