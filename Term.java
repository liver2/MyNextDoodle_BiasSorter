public class Term {
    private String termString;
    private int value;
    
    public Term(String s, int i) {
        termString = s;
        value = i;
    }

    public void increment() {
        value++;
    }

    public String getTermString() {
        return termString;
    }

    public String toString() {
        return ("String: " + termString + "\nValue: " + value + "\n");
    }
}
