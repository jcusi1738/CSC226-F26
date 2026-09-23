package patient_intake;

public class Patient extends Person {
    private String patientID;
    private String chiefComplaint;
    private int triageLevel;
    private String currentStage;
    private String assignedRoom;
    private int arrivalHour;
    private String insuranceID;

    public Patient(String patientID, String firstName, String lastName, int age, 
                   String chiefComplaint, int triageLevel, String currentStage, 
                   String assignedRoom, int arrivalHour, String insuranceID) {
        super(firstName, lastName, age);
        this.patientID=patientID;
        this.firstName=firstName;
        this.lastName= lastName;
        this.age=age;
        this.chiefComplaint=chiefComplaint;
        this.triageLevel=triageLevel;
        this.currentStage=currentStage;
        this.assignedRoom=assignedRoom;
        this.arrivalHour=arrivalHour;
        this.insuranceID=insuranceID;
        
    }

    public Patient(String patientID2, String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        this.patientID=patientID2;
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }

    // Getters
    public String getPatientID() {
        return patientID; 
    }

    public String getFirstName() {
        return firstName; 
    }

    public String getLastName() {
        return lastName; 
    }

    public int getAge() {
        return age; 
    }

    public String getChiefComplaint() {
        return chiefComplaint; 
    }

    public int getTriageLevel() {
        return triageLevel; 
    }

    public String getCurrentStage() {
        return currentStage; 
    }

    public String getAssignedRoom() {
        return assignedRoom; 
    }

    public int getArrivalHour() {
        return arrivalHour; 
    }

    public String getInsuranceID() {
        return insuranceID; 
    }

    // Setters
    public void setPatientID(String patientID) {
        
        this.patientID= patientID;
    }

    public void setFirstName(String firstName) {
        
        this.firstName= firstName;
    }

    public void setLastName(String lastName) {
        
        this.lastName=lastName;
    }

    public void setAge(int age) {
        //  Update the age.
        // OPTIONAL (+5%): Reject ages outside the range 0 through 120.
        // this.age=age; might have to uncomment this
        if(age>120 || age<0){
            System.out.println("This age is not in the range. enter a new age");
        }
        else this.age=age; 
    }

    public void setChiefComplaint(String chiefComplaint) {
        
        this.chiefComplaint=chiefComplaint;
    }

    public void setTriageLevel(int triageLevel) {
        
        this.triageLevel=triageLevel;
    }

    public void setCurrentStage(String currentStage) {
       
        this.currentStage=currentStage;
    }

    public void setAssignedRoom(String assignedRoom) {
        
        this.assignedRoom=assignedRoom;
    }

    public void setArrivalHour(int arrivalHour) {
       
        this.arrivalHour=arrivalHour;
    }

    public void setInsuranceID(String insuranceID) {
        //  Update the insurance ID.
        this.insuranceID=insuranceID;
    }

    @Override
    public String toString() {
        return "The patient ID Number " + patientID + "First name " + firstName + "Last Name"+ lastName + " Age" + age + "In Hospital for " + chiefComplaint + " Current Stage " + currentStage + "Assign Room " + assignedRoom ; 
        //  Return a useful representation of a patient.
        //String patientID, String firstName, String lastName, int age, 
             //      String chiefComplaint, int triageLevel, String currentStage, 
           //        String assignedRoom, int arrivalHour, String insuranceID 
           // So i know what i need to write in.
    }
}