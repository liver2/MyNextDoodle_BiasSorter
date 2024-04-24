import java.util.*;

public class Merger {
    public List<Term> mergeSort(List<Term> termList) {
        if (termList.size() <= 1) {
            return termList;
        }

        List<Term> leftTermList = termList.subList(0,termList.size()/2);
        List<Term> rightTermList = termList.subList(termList.size()/2,termList.size());

        leftTermList = mergeSort(leftTermList);
        rightTermList = mergeSort(rightTermList);

        return mergeLists(leftTermList,rightTermList);
    }

    public List<Term> mergeLists(List<Term> termListA, List<Term> termListB) {
        List<Term> returnList = new ArrayList<Term>();

        while(termListA.size() != 0 && termListB.size() != 0) { // CONCURRENT MODIFICATION EXCEPTION THROWN HERE
            int userInput = compare(termListA.get(0).getTermString(),termListB.get(0).getTermString());

            if (userInput == 1) {
                returnList.add(termListB.remove(0));
            } else {
                returnList.add(termListA.remove(0));
            }
        }

        return returnList;
    }

    public int compare(String s1, String s2) { // uses Term.getTermString
        Scanner scan = new Scanner(System.in);

        System.out.println("Please compare " + s1 + " and " + s2 + ". Type 1 for the first option, 2 for the second option.");
        int userInput = scan.nextInt();

        scan.close();

        return userInput;
    }
}
