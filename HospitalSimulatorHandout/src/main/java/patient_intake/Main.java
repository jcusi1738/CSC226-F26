package patient_intake;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
      String filePath = "src/main/java/patient_intake/patients.csv";
      PatientRegistry patients = new PatientRegistry();

      try (Scanner fileReader = new Scanner(new File(filePath))) {
         if (fileReader.hasNextLine()) {
            fileReader.nextLine(); // Skip the CSV header.
         }

         while (fileReader.hasNextLine()) {
            String line = fileReader.nextLine();
            String[] parts = line.split(",");
            String patientID = parts[0]; //first id is 0 on array list
            String fullName = parts[1];
            int age = Integer.parseInt(parts[2]);
            String nameParts[] = fullName.split(" "); // split full name instead 2 
            String firstName = nameParts[0]; // new array list to split the full name into first and last name
            String lastName = nameParts[1];
            Patient patient = new Patient(patientID, firstName, lastName, age);
            patients.addPatient(patient);



            // TODO REQUIRED: Parse the fields from parts.
            // TODO REQUIRED: Split the full name into firstName and lastName.
            // TODO REQUIRED: Create a Patient and add it to patients.
         }

         // TODO REQUIRED: Display the completed registry.
      } catch (FileNotFoundException exception) {
         System.out.println("Error: Input file not found: " + filePath); // filepath is the file that is missing so it would show up as its not found.
         // TODO REQUIRED: Report a missing input file.
      }
   }
}
git pull origin Main