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
        // TODO REQUIRED: Initialize the patient-specific fields.
    }

    // Getters
    public String getPatientID() {
        return patientID; // TODO REQUIRED: Return the patient ID.
    }

    public String getFirstName() {
        return firstName; // TODO REQUIRED: Return the first name.
    }

    public String getLastName() {
        return lastName; // TODO REQUIRED: Return the last name.
    }

    public int getAge() {
        return age; // TODO REQUIRED: Return the age.
    }

    public String getChiefComplaint() {
        return chiefComplaint; // TODO REQUIRED: Return the chief complaint.
    }

    public int getTriageLevel() {
        return triageLevel; // TODO REQUIRED: Return the triage level.
    }

    public String getCurrentStage() {
        return currentStage; // TODO REQUIRED: Return the current stage.
    }

    public String getAssignedRoom() {
        return assignedRoom; // TODO REQUIRED: Return the assigned room.
    }

    public int getArrivalHour() {
        return arrivalHour; // TODO REQUIRED: Return the arrival hour.
    }

    public String getInsuranceID() {
        return insuranceID; // TODO REQUIRED: Return the insurance ID.
    }

    // Setters
    public void setPatientID(String patientID) {
        // TODO REQUIRED: Update the patient ID.
        this.patientID= patientID;
    }

    public void setFirstName(String firstName) {
        // TODO REQUIRED: Update the first name.
        this.firstName= firstName;
    }

    public void setLastName(String lastName) {
        // TODO REQUIRED: Update the last name.
        this.lastName=lastName;
    }

    public void setAge(int age) {
        // TODO REQUIRED: Update the age.
        // OPTIONAL (+5%): Reject ages outside the range 0 through 120.
        // this.age=age; might have to uncomment this
        if(age>120 || age<0){
            System.out.println("This age is not in the range. enter a new age");
        }
        else this.age=age; 
    }

    public void setChiefComplaint(String chiefComplaint) {
        // TODO REQUIRED: Update the chief complaint.
        this.chiefComplaint=chiefComplaint;
    }

    public void setTriageLevel(int triageLevel) {
        // TODO REQUIRED: Update the triage level.
        this.triageLevel=triageLevel;
    }

    public void setCurrentStage(String currentStage) {
        // TODO REQUIRED: Update the current stage.
        this.currentStage=currentStage;
    }

    public void setAssignedRoom(String assignedRoom) {
        // TODO REQUIRED: Update the assigned room.
        this.assignedRoom=assignedRoom;
    }

    public void setArrivalHour(int arrivalHour) {
        // TODO REQUIRED: Update the arrival hour.
        this.arrivalHour=arrivalHour;
    }

    public void setInsuranceID(String insuranceID) {
        // TODO REQUIRED: Update the insurance ID.
        this.insuranceID=insuranceID;
    }

    @Override
    public String toString() {
        return "The patient ID Number " + patientID + "First name " + firstName + "Last Name"+ lastName + " Age" + age + "In Hospital for " + chiefComplaint + " Current Stage " + currentStage + "Assign Room " + assignedRoom ; 
        // TODO REQUIRED: Return a useful representation of a patient.
        //String patientID, String firstName, String lastName, int age, 
             //      String chiefComplaint, int triageLevel, String currentStage, 
           //        String assignedRoom, int arrivalHour, String insuranceID 
           // So i know what i need to write in.
    }
}