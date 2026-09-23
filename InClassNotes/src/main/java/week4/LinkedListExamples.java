package week4;

import java.util.ArrayList;

public class LinkedListExamples {
    public static void main(String[] args){
        // Create a sample linked list for testing
        LLNode<String> head = new LLNode<>("First");
        head.setNext(new LLNode<>("Second"));
        head.getNext().setNext(new LLNode<>("Third"));
        head.getNext().getNext().setNext(new LLNode<>("Fourth"));
        
        // Test your functions here
    }
    
    
    /**
     * 2. Program to display both elements and their position in a linked list
     * Shows: Position 0: "First", Position 1: "Second", etc.
     */
    public static <T> void displayWithPositions(LLNode<T> head) {
        // TODO: Implement this function
        int counter = 0;
        while(head != null) {
            // Print the current position and the info of the node
            System.out.println("Position: " + counter + ", Info: " + head.getInfo());
            head = head.getNext();
            counter++;
        }
        // hint: Use a counter variable and traverse the list    
    }
    
    /**
     * 3. Program to remove a specified element from a linked list
     * Returns the new head of the list (important if first element is removed)
     */
    public static <T> LLNode<T> removeElement(LLNode<T> head, T target) {
        // TODO: Implement this function
        // Handle special case: removing the first element
        // For other elements: find the node before the target
        
        return head; // placeholder
    }
    
    /**
     * 4. Program to remove all elements from a linked list
     * Returns null (empty list)
     */
    public static <T> LLNode<T> removeAllElements(LLNode<T> head) {
        // TODO: Implement this function
        // Hint: This is simpler than you might think!
        return null; // placeholder
    }
    
    /**
     * 5. Program to copy a linked list to another linked list
     * Creates a completely new list with the same values
     */
    public static <T> LLNode<T> copyList(LLNode<T> original) {
        // TODO: Implement this function
        // Create new nodes for each element in the original list
        return null; // placeholder
    }
    
    /**
     * 6. Program to check if a particular element exists in a linked list
     * Returns true if found, false otherwise
     */
    public static <T> boolean contains(LLNode<T> head, T target) {
        // TODO: Implement this function
        // Traverse the list and compare each element with target
        return false; // placeholder
    }
    
    /**
     * Helper function to calculate the length of a linked list
     * Useful for other operations
     */
    public static <T> int getLength(LLNode<T> head) {
        // TODO: Implement this helper function
        
        return 0; // placeholder
    }

    /**
     * 7. Program to convert a linked list to an array list
     * Returns an ArrayList containing all elements in the same order
     */
    public static <T> ArrayList<T> toArrayList(LLNode<T> head) {
        // TODO: Implement this function
        // Create ArrayList and add each element from the linked list
        return new ArrayList<>(); // placeholder
    }
        
    /**
     * Helper function to get the element at a specific position
     * Returns null if position is out of bounds
     */
    public static <T> T getElementAt(LLNode<T> head, int position) {
        // TODO: Implement this helper function
        return null; // placeholder
    }
}
