package hospital;



class TreatmentNode {


    String treatment;
    TreatmentNode next;



    public TreatmentNode(String treatment){

        this.treatment = treatment;

    }

}





public class TreatmentStack {


    TreatmentNode top;




    // Push

    public void push(String treatment){


        TreatmentNode newNode =
                new TreatmentNode(treatment);



        newNode.next = top;

        top = newNode;


        System.out.println(
        "Treatment added");


    }






    // Remove latest treatment

    public void pop(){



        if(top == null){


            System.out.println(
            "Stack is empty");


            return;

        }



        System.out.println(
        "Removed Treatment: "
        + top.treatment);



        top = top.next;



    }








    // Display treatments

    public void displayStack(){



        if(top == null){

            System.out.println(
            "No treatment history");


            return;

        }



        TreatmentNode current = top;



        System.out.println(
        "Treatment History");



        while(current != null){


            System.out.println(
            current.treatment);



            current = current.next;


        }


    }



}