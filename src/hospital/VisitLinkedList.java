package hospital;



class VisitNode {


    Visit visit;
    VisitNode next;



    public VisitNode(Visit visit){

        this.visit = visit;

    }


}





public class VisitLinkedList {



    VisitNode head;




    // Add Visit

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







    // Display Visits

    public void displayVisits(){


        if(head == null){


            System.out.println(
            "No visit history");


            return;

        }



        VisitNode current = head;



        while(current != null){


            current.visit.displayVisit();


            current = current.next;


        }



    }







    // Search Visit

    public void searchVisit(int id){


        VisitNode current = head;



        while(current != null){



            if(current.visit.visitID == id){


                System.out.println(
                "Visit Found");


                current.visit.displayVisit();

                return;


            }


            current = current.next;


        }



        System.out.println(
        "Visit Not Found");


    }







    // Remove Visit

    public void removeVisit(int id){



        if(head == null){

            return;

        }




        if(head.visit.visitID == id){


            head = head.next;

            return;

        }




        VisitNode current = head;



        while(current.next != null){



            if(current.next.visit.visitID == id){


                current.next =
                current.next.next;


                System.out.println(
                "Visit Removed");


                return;


            }



            current = current.next;


        }



        System.out.println(
        "Visit Not Found");


    }



}