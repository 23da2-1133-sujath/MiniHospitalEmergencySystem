package hospital;

import java.util.Scanner;



public class Main {


public static void main(String[] args){



Scanner sc = new Scanner(System.in);



PatientBST bst = new PatientBST();

EmergencyQueue queue = new EmergencyQueue();

TreatmentStack stack = new TreatmentStack();

VisitLinkedList visits = new VisitLinkedList();




int choice;



do{


System.out.println("\n===== Hospital Management System =====");

System.out.println("1. Add Patient");
System.out.println("2. Display Patients");
System.out.println("3. Search Patient");
System.out.println("4. Delete Patient");

System.out.println("5. Add Emergency Patient");
System.out.println("6. Treat Patient");

System.out.println("7. Add Treatment");
System.out.println("8. View Treatment");

System.out.println("9. Add Visit");
System.out.println("10. View Visits");

System.out.println("0. Exit");

System.out.print("Enter choice: ");


choice=sc.nextInt();




switch(choice){



case 1:


System.out.print("Patient ID: ");
int id=sc.nextInt();


System.out.print("Name: ");
String name=sc.next();


System.out.print("Age: ");
int age=sc.nextInt();


System.out.print("Contact: ");
String contact=sc.next();


System.out.print("Condition: ");
String condition=sc.next();



Patient p =
new Patient(id,name,age,contact,condition);



bst.insert(p);


break;






case 2:

bst.displayPatients();

break;





case 3:

System.out.print("Enter ID: ");

bst.search(sc.nextInt());

break;






case 4:

System.out.print("Enter ID: ");

bst.delete(sc.nextInt());

break;







case 5:

System.out.print("Patient ID: ");

int qid=sc.nextInt();

queue.enqueue(
new Patient(qid,"Emergency",30,"000","Emergency")
);

break;







case 6:

queue.dequeue();



break;







case 7:

sc.nextLine();

System.out.print("Treatment: ");

stack.push(sc.nextLine());

break;







case 8:

stack.displayStack();

break;






case 9:

    System.out.println("\n===== Add Patient Visit =====");

    System.out.print("Enter Visit ID: ");
    int visitID = sc.nextInt();

    sc.nextLine(); // clear input buffer

    System.out.print("Enter Visit Date: ");
    String visitDate = sc.nextLine();

    System.out.print("Enter Doctor Name: ");
    String doctorName = sc.nextLine();

    System.out.print("Enter Diagnosis: ");
    String diagnosis = sc.nextLine();

    System.out.print("Enter Treatment: ");
    String treatment = sc.nextLine();

    Visit visit = new Visit(
            visitID,
            visitDate,
            doctorName,
            diagnosis,
            treatment
    );

    visits.addVisit(visit);

    break;







case 10:

visits.displayVisits();

break;




}


}while(choice!=0);



System.out.println("System Closed");


}



}