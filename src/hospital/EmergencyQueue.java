package hospital;



class QueueNode {


    Patient patient;
    QueueNode next;



    public QueueNode(Patient patient){

        this.patient = patient;

    }

}





public class EmergencyQueue {


    QueueNode front;
    QueueNode rear;




    // Add patient

    public void enqueue(Patient patient){


        QueueNode newNode =
                new QueueNode(patient);



        if(rear == null){

            front = rear = newNode;

        }

        else{

            rear.next = newNode;
            rear = newNode;

        }


        System.out.println("Patient added to queue");


    }







    // Remove patient

    public void dequeue(){



        if(front == null){

            System.out.println("Queue is empty");

            return;

        }



        Patient patient =
                front.patient;



        front = front.next;



        if(front == null){

            rear = null;

        }



        System.out.println("Patient sent for treatment:");

        patient.displayPatient();


    }







    // Display waiting patients

    public void displayQueue(){


        if(front == null){

            System.out.println("No patients waiting");

            return;

        }



        QueueNode current = front;



        System.out.println("Emergency Waiting Queue");



        while(current != null){


            current.patient.displayPatient();

            current = current.next;


        }


    }



}