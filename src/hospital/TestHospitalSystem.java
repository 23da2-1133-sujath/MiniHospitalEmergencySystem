package hospital;

public class TestHospitalSystem {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("   MINI HOSPITAL SYSTEM - TESTING");
        System.out.println("==========================================");


        // =====================================
        // 1. TEST PATIENT BST
        // =====================================

        System.out.println("\n===== TEST 1: PATIENT BST =====");

        PatientBST bst = new PatientBST();


        Patient patient1 = new Patient(
                101,
                "Ahmed",
                25,
                "0771234567",
                "Fever"
        );


        Patient patient2 = new Patient(
                105,
                "Kamal",
                30,
                "0772345678",
                "Headache"
        );


        Patient patient3 = new Patient(
                103,
                "Fathima",
                22,
                "0773456789",
                "Cold"
        );


        bst.insert(patient1);
        bst.insert(patient2);
        bst.insert(patient3);


        System.out.println("\nPatients in ascending order:");

        bst.displayPatients();


        System.out.println("\nSearching for Patient ID 103:");

        bst.search(103);


        System.out.println("\nDeleting Patient ID 105:");

        bst.delete(105);

        bst.displayPatients();



        // =====================================
        // 2. TEST EMERGENCY QUEUE
        // =====================================

        System.out.println("\n===== TEST 2: EMERGENCY QUEUE =====");

        EmergencyQueue queue = new EmergencyQueue();


        Patient emergency1 = new Patient(
                201,
                "Ali",
                40,
                "0711111111",
                "Accident"
        );


        Patient emergency2 = new Patient(
                202,
                "Sara",
                35,
                "0722222222",
                "Chest Pain"
        );


        Patient emergency3 = new Patient(
                203,
                "John",
                45,
                "0733333333",
                "Injury"
        );


        System.out.println("\nAdding patients to emergency queue:");

        queue.enqueue(emergency1);
        queue.enqueue(emergency2);
        queue.enqueue(emergency3);


        System.out.println("\nPatients currently waiting:");

        queue.displayQueue();


        System.out.println("\nDequeue next patient:");

        queue.dequeue();


        System.out.println("\nRemaining patients:");

        queue.displayQueue();



        // =====================================
        // 3. TEST TREATMENT STACK
        // =====================================

        System.out.println("\n===== TEST 3: TREATMENT STACK =====");

        TreatmentStack stack = new TreatmentStack();


        System.out.println("\nAdding treatment records:");

        stack.push("Patient 201 - First Aid");
        stack.push("Patient 202 - Medicine");
        stack.push("Patient 203 - X-Ray");


        System.out.println("\nTreatment history:");

        stack.displayStack();


        System.out.println("\nRemoving latest treatment:");

        stack.pop();


        System.out.println("\nRemaining treatment history:");

        stack.displayStack();



        // =====================================
        // 4. TEST PATIENT VISIT LINKED LIST
        // =====================================

        System.out.println("\n===== TEST 4: PATIENT VISIT HISTORY =====");

        VisitLinkedList visits = new VisitLinkedList();


        Visit visit1 = new Visit(
                1,
                "2026-08-20",
                "Dr. Ahmed",
                "Fever",
                "Medicine"
        );


        Visit visit2 = new Visit(
                2,
                "2026-08-25",
                "Dr. Kamal",
                "Headache",
                "Painkillers"
        );


        Visit visit3 = new Visit(
                3,
                "2026-09-04",
                "Dr. Sara",
                "Cold",
                "Syrup"
        );


        System.out.println("\nAdding visits:");

        visits.addVisit(visit1);
        visits.addVisit(visit2);
        visits.addVisit(visit3);


        System.out.println("\nAll visit history:");

        visits.displayVisits();


        System.out.println("\nSearching for Visit ID 2:");

        visits.searchVisit(2);


        System.out.println("\nRemoving Visit ID 1:");

        visits.removeVisit(1);


        System.out.println("\nUpdated visit history:");

        visits.displayVisits();



        // =====================================
        // TEST COMPLETED
        // =====================================

        System.out.println("\n==========================================");
        System.out.println("       ALL TESTS COMPLETED");
        System.out.println("==========================================");

    }
}