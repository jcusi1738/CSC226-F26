package patient_intake;
// Switch from using ArrayList to a flat array implementation for patient storage.

public class PatientRegistry {
    // Flat array to store patients and a size field to track the number of stored patients.
    private Patient[] patientRegistry;
    private int size=0; // track actual number of patients

    // Initial capacity for the flat array. Can be adjusted as needed.
    private static final int INITIAL_CAPACITY = 10;

    public PatientRegistry() {
        // TODO REQUIRED: Create the initial array and set the starting size.
        this.patientRegistry=new Patient[INITIAL_CAPACITY];
        this.size=0;
        
    }

    public void addPatient(Patient patient) {
        // TODO REQUIRED: Add a patient to the registry.
        patientRegistry[size]=patient;
        size++;

        
        // TODO OPTIONAL (+5%): Expand the array when it becomes full.
        // if(size<patientRegistry.length){
        //     patientRegistry[size]++;
        // }
    }

    /**
     * Returns the patients currently stored in the registry.
     * The optional encapsulation extension requires returning a defensive copy.
     */
    public Patient[] getPatientRegistry() {
        return patientRegistry; // TODO REQUIRED: Return the patients currently stored.
    }

    public Patient getPatientByID(String patientID) {
        for(int i=0; i<size;i++){
            if(patientRegistry[i].getPatientID().equals(patientID)){
                return patientRegistry[i];

        }
        

        }
        return null; // TODO REQUIRED: Search for and return the matching patient. // the code above return the patients if it matches
    }

    /**
     * Removes a patient from the registry by patientID.
     * @param patientID The ID of the patient to remove
     * @return true if patient was found and removed, false otherwise
     */
    public boolean removePatient(String patientID) {
        for(int i=0;i<size;i++){
            if(patientRegistry[i].getPatientID().equals(patientID)){
                removePatient(i);
                return true;
            }
        }
        return false; // TODO OPTIONAL (+5%): Remove the patient with this ID.
    }

    /**
     * Removes a patient from the registry by index.
     * @param index The index of the patient to remove
     * @return the removed Patient, or null if index is invalid
     */
    public Patient removePatient(int index) {
        if(index<0 || index>= size){ // have to be less than 0 and greater than size
            return null;
        }
        Patient removedPatient =patientRegistry[index];
        for(int i=0;i<size-1;i++){
            patientRegistry[i]=patientRegistry[i+1];
        }
        patientRegistry[size-1]=null;
        size--; 
        return removedPatient; // TODO OPTIONAL (+5%): Remove by index and shift later elements left.
    }

    /**
     * Updates a patient in the registry by matching patientID.
     * @param updatedPatient The patient with updated information
     * @return true if patient was found and updated, false otherwise
     */
    public boolean updatePatient(Patient updatedPatient) {
        for(int i=0;i<size;i++){
            if(patientRegistry[i].getPatientID().equals(updatedPatient.getPatientID())){
                patientRegistry[i]=updatedPatient;
                return true;
            }
        }
        
        return false; // TODO OPTIONAL (+5%): Replace the patient with the same ID.
    }
    
    @Override
    public String toString() {
        return "The patient registry contains " + size + " patients."; // TODO REQUIRED: Return a useful representation of the registry.
    }

}


