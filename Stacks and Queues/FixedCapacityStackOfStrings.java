/* 
 * Cheated with the capacity of the array 
 * Code written by Kevin Wayne and Robert Sedgewick
 */
public class FixedCapacityStackOfStrings {
    private String[] s;
    private int N = 0;
    
    // Uses a cheat to initialize the array, bad implementation due to 
    // requiring the user to pass the capacity required.
    public FixedCapacityStackOfStrings(int capacity) {
        s = new String[capacity];
    }
    
    public boolean isEmpty() {
        return N == 0;
    }
    
    // Should we allow null items??
    public void push(String item) {
        s[N++] = item;
    }
    
    /* This is a loitering issue, where we maintain the pointer to the old 
     * object even when it is not in use.
    public String pop() {
        return s[--N];
    } */
    
    public String pop() {
        String item = s[--N];
        s[N] = null;
        return item;
    }
}