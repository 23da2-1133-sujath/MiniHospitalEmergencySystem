package hospital;



class VisitNode {


    Visit visit;
    VisitNode next;



    public VisitNode(Visit visit){


        this.visit = visit;
        this.next = null;


    }

}





public class VisitLinkedList {


    VisitNode head;



    // Add visit

    public void addVisit(Visit visit){


        VisitNode newNode =
                new VisitNode(visit);



        if(head == null){


            head = newNode;


        }


        else{


            VisitNode current = head;



            while(current.next != null){


                current = current.next;


            }



            current.next = newNode;


        }



        System.out.println("Visit Added");


    }



}