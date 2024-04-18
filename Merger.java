import java.util.*;

public class Merger { // Deriving Merge Sort
    public void Merge(List<Term> termList) {
        List<List<Term>> mergedTerms = new ArrayList<List<Term>>();
        int termListSize = termList.size();

        mergedTerms.add(termList.subList(0, termListSize/2));
        mergedTerms.add(termList.subList(termListSize/2,termListSize));
    }
}
