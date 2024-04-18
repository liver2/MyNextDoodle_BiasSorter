import java.util.*;

public class Sorter {
    public static void main(String[] args) {
        ArrayList<String> inputStrings = new ArrayList<String>();
        ArrayList<Term> terms = new ArrayList<Term>();

        System.out.println("Please input terms you would like to sort. Input \"X\" to cancel.");
        Scanner scan = new Scanner(System.in);

        while(true) {
            String userInput = scan.nextLine();

            if (userInput.equals("X")) {
                break;
            } else {
                inputStrings.add(userInput);
            }
        }

        for (String s : inputStrings) {
            terms.add(new Term(s,0));
        }

        // BRUTE FORCE SORT
        // for (int i = 0; i < terms.size(); i++) {
        //     for (int j = i+1; j < terms.size(); j++) {
        //         int userInput;

        //         do {
        //             System.out.println("Please compare " + terms.get(i).getTermString() + " and " + terms.get(j).getTermString() + ". Type 1 for the first option, 2 for the second option.");
        //             userInput = scan.nextInt();
        //         } while (!(userInput == 1 || userInput == 2));
                
        //         if (userInput == 1) {
        //             terms.get(i).increment();
        //         } else if (userInput == 2) {
        //             terms.get(j).increment();
        //         } else {
        //             System.out.println("error");
        //         }
        //     }
        // }

        for (Term t : terms) {
            System.out.println(t);
        }
    }
}