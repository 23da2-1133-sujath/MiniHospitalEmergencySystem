package hospital;

public class Patient {

    int patientID;
    String name;
    int age;
    String contactNumber;
    String medicalCondition;



    public Patient(int patientID, 
                   String name, 
                   int age,
                   String contactNumber,
                   String medicalCondition){


        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.contactNumber = contactNumber;
        this.medicalCondition = medicalCondition;


    }



    public void displayPatient(){


        System.out.println("---------------------------");

        System.out.println("Patient ID : " + patientID);
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Contact    : " + contactNumber);
        System.out.println("Condition  : " + medicalCondition);

        System.out.println("---------------------------");


    }

}