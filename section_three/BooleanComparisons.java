public class BooleanComparisons {
    public static void main(String[] args) {
        int chemGrade = 95;
        int bioGrade = 75;
        int engGrade = 75;

        System.out.println(chemGrade >= engGrade);

        String sentence = "i love this course";
        String sentence2 = "i love this course";
        
        System.out.println(sentence.equals(sentence2)); // how to check equals with strings
        System.out.println(!sentence.equals(sentence2)); // how to check if NOT equal with strings
    }
}

// comparison operators:
// > greater than
// < less than
// >= greater than or equal 
// <= less than or equal
// == equal 
// != not equal
// equals  for strings this is equal
// !equal for strings