public class TypeConversion {
    public static void main(String[] args) {
      double salary = 5833.3333;
      int roundedSalary = (int)salary; //this is type casting, it will change salary from a double to a INT
      System.out.println("Salary is $" + (int)salary);  //this also works if you dont want to create another variable
    }
}