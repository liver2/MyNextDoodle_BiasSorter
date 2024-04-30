import java.util.*;

public class Merger {
    public List<Term> mergeSort(List<Term> termList) {
        if (termList.size() <= 1) {
            return termList;
        }

        List<Term> leftTermList = termList.subList(0,termList.size()/2);

        System.out.println(leftTermList);

        List<Term> rightTermList = termList.subList(termList.size()/2,termList.size());

        System.out.println(rightTermList);

        leftTermList = mergeSort(leftTermList);
        rightTermList = mergeSort(rightTermList);

        return mergeLists(leftTermList,rightTermList,termList.size());
    }

    public List<Term> mergeLists(List<Term> termListA, List<Term> termListB, int originalTermListSize) {
        List<Term> returnList = new ArrayList<Term>();

        int aSize = originalTermListSize/2 + 1;
        int bSize = originalTermListSize - originalTermListSize/2 + 1;

        while(aSize != 0 && bSize != 0) {
            int userInput = compare(termListA.get(0).getTermString(),termListB.get(0).getTermString());

            if (userInput == 1) {
                returnList.add(termListB.remove(0));
                bSize--;
            } else {
                returnList.add(termListA.remove(0));
                aSize--;
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
