package hospital;


class QueueNode {

    Patient patient;
    QueueNode next;


    public QueueNode(Patient patient){

        this.patient = patient;
        this.next = null;

    }

}




public class EmergencyQueue {


    QueueNode front;
    QueueNode rear;



    // Add patient to queue

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


        System.out.println("Patient added to emergency queue");

    }


}