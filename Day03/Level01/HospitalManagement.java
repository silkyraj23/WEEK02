public class HospitalManagement{
    public static void main(String[] args) {
        Patient patient1 = new Patient("Om Tiwari", 21, "Headache", 69);
        if (patient1 instanceof Patient) {
            patient1.displayPatientDetails();
            Patient.getTotalPatients();
        }
    }
}

class Patient {
    static String hospitalName;
    static int countPatient = 0;
    private String name;
    private int age;
    private String ailment;
    private final int patientId;

    // Constructor to intitialize the attributes
    Patient(String name, int age, String ailment, int patientId){
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientId = patientId;
        countPatient++;
    }
    
    // Method to display the details of the patient

    void displayPatientDetails(){
        System.out.println("Patient name :- "+ name +"\nPatient age:- "+age + "\nPatient ailment:- "+ailment+"\nPatient ID:- "+patientId);
    }

    // Method to display the total patients in the hospital
    static void getTotalPatients(){
        System.out.println("Total Patients are:- "+ countPatient);

    }
}