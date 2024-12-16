package CIE;


public class Internals extends Personal {
    public int[] internalMarks = new int[5];

    
    public Internals(String usn, String name, int sem, int[] internalMarks) {
        super(usn, name, sem);
        this.internalMarks = internalMarks;
    }
}
