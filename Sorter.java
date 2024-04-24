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

        Merger merger = new Merger();
        merger.mergeSort(terms);

        for (Term t : terms) {
            System.out.println(t);
        }

        scan.close();
    }
}