package triage_efficiency;

import patient_intake.Patient;

public class Main {
    public static void main(String[] args) {
        //  Generate the patient data.
        String [] patientIDs = {"P001","P002","P003","P004","P005","P006","P007","P008","P009","P010"}; // its already sorted but im still trying to test the code on bottom 
        String [] firstNames = {"John","Mary","Robert","Patricia","Michael","Linda","James","Elizabeth","David","Barbara"};
        String [] lastNames = {"Smith","Johnson","Williams","Brown","Davis","Miller","Wilson","Moore","Taylor","Anderson"};
        int [] ages = {45,32,67,28,8,55,41,72,19,35};
        
        // TODO REQUIRED: Sort the data by patientID when needed.
        // TODO REQUIRED: Run each search method and print a found and not-found example.
    
        // TODO OPTIONAL: Call timeDemo() to compare algorithm runtimes.
    }

    /**
     * REQUIRED (80%): Generate sample patient data for testing.
     *
     * Build an array of Patient objects with realistic IDs, names, complaints,
     * and triage information so you can test each search method.
     */
    public static Patient[] generatePatients(int count) {
        // TODO REQUIRED: Create the patient array and fill it with sample data.
        // Patient [] patients = new Patient[count];
        // String [] patientIDs = {"P001","P002","P003","P004","P005","P006","P007","P008","P009","P010"};
        // String [] firstNames = {"John","Mary","Robert","Patricia","Michael","Linda","James","Elizabeth","David","Barbara"};
        // String [] lastNames = {"Smith","Johnson","Williams","Brown","Davis","Miller","Wilson","Moore","Taylor","Anderson"}; // this is generetated already and dont need it into the function
        // int [] ages = {45,32,67,28,8,55,41,72,19,35};
       for(int i=0;i<count;i++){
            patients[i]= new Patient(patientIDs[i],firstNames[i],lastNames[i],ages[i]);
        }
        return patients; // this return the patients that just got added the array and shows patient id first, last names and ages



/*P001,John Smith,45,Chest Pain,1,Admission,ER-101,8,INS-12345
P002,Mary Johnson,32,Headache,3,Admission,ER-102,9,INS-23456
P003,Robert Williams,67,Abdominal Pain,2,Triage,ER-103,10,INS-34567
P004,Patricia Brown,28,Shortness of Breath,1,Treatment,ER-104,11,INS-45678
P005,Michael Davis,8,Fractured Arm,2,Pediatrics,PED-201,12,INS-56789
P006,Linda Miller,55,Allergic Reaction,3,Recovery,REC-301,13,INS-67890
P007,James Wilson,41,Nausea and Vomiting,3,Admission,ER-105,14,INS-78901
P008,Elizabeth Moore,72,Dizziness,2,Triage,ER-106,15,INS-89012
P009,David Taylor,19,Back Pain,4,Waiting,WR-001,16,INS-90123
P010,Barbara Anderson,35,Cut on Hand,3,Treatment,ER-107,17,INS-01234 */ // all the names imma try to use from patinets csv

        
        
    }

    /**
     * REQUIRED (80%): Sort patients by patientID before binary search.
     *
     * The binary-search version only works on an array sorted by patientID.
     */
    public static Patient[] sortByPatientId(Patient[] patients) {
        // TODO REQUIRED: Sort the array by patientID before testing binary search.
        for(int i=0;i<patients.length;i++){
            for(int j=i+1;j<patients.length;j++){
                if(patients[i].getPatientID().compareTo(patients[j].getPatientID())>0){ // i dont have a single idea as of now where this 0 comes from i had it written as if patients[i].getPatientID()>(patients[j].getPatientID())
                    Patient temp=patients[i];
                    patients[i]=patients[j];
                    patients[j]=temp;
                }
            }
        
        } // this is the function that will sort the array by patient id before testing binary search
       // this is the function that will sort the array by patient id before testing binary search
        return patients; // Replace this with your implementation.
    }
}
