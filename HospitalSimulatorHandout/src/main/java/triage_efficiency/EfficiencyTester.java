package triage_efficiency;
import java.util.Arrays;
import java.util.*;
import patient_intake.Patient;

public class EfficiencyTester {

   int i =0;

        


        
    

    /**
     * REQUIRED (80%): Implement linear search.
     *
     * Search through the patient array one element at a time until the matching
     * patientID is found. Return the Patient if it exists; otherwise return null.
     *
     * This method must run in O(n) time.
     */
    public Patient linearSearch(Patient[] patients, String pid) {
        // TODO REQUIRED: Implement linear search.
        // Search the entire array in order and return the matching Patient.
        for(int i=0;i<patients.length; i++){
            if(pid.equals(patients[i].getPatientID())){ // wrong syntax come back to it later there we go needed a .equals with get patient id 
                return patients[i];
            }
            

        }
        return null; // Remove this line and implement the method.
    }

    /**
     * REQUIRED (80%): Implement binary search.
     *
     * This method works only on an array that is sorted by patientID.
     * Repeatedly divide the search range in half until the target is found.
     *
     * This method must run in O(log n) time.
     */
   
    public Patient binarySearch(Patient[] patients, String pid) {
        // TODO REQUIRED: Implement iterative binary search.
        // The array must be sorted by patientID before calling this method.
        int high=patients.length-1;
        int low=0;
        // int mid= (high+low)/2; // might put inside function
        while(low<high){
            int mid= (high+low)/2;
            if(pid.compareTo(patients[mid].getPatientID())==0){ // same as above have to implent the search  // same as above need a .equals with get patient id
                return patients[mid];
            }
            else if 
                (pid.compareTo(patients[mid].getPatientID()) < 0){
                high=mid-1;
            }
            else if (pid.compareTo(patients[mid].getPatientID()) > 0){ // must fix syntax 
            
                low=mid+1;
            }
            // not sure if this correct
            
        }
        return null;
    }

    /**
     * OPTIONAL (+5%): Implement a different O(log n) search algorithm.
     *
     * Pick one of the following approaches and implement it:
     * - Exponential search
     * - Jump search
     * - Ternary search
     *
     * Add a short comment above the method explaining:
     * - which algorithm you chose
     * - where you learned about it
     * - why it works
     */
    public Patient logNSearch(Patient[] patients, String pid) { // gonna do this last
        // TODO OPTIONAL: Research and implement a second O(log n) algorithm.
        // Cite your source and explain the approach in a comment before the logic.
        return null; // Remove this line and implement the method.
    }

    public void timeDemo() {
        long startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            int x = 5 + 5;
        }
        long endTime = System.nanoTime();

        System.out.println("The example addition took: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            int x = 5 * 5;
        }
        endTime = System.nanoTime();
        System.out.println("The example multiplication took: " + (endTime - startTime) + " ns");
    }
}
