package hospital;



class TreatmentNode {


    String treatment;
    TreatmentNode next;



    public TreatmentNode(String treatment){

        this.treatment = treatment;
        this.next = null;

    }

}




public class TreatmentStack {


    TreatmentNode top;



    // Add treatment record

    public void push(String treatment){


        TreatmentNode newNode =
                new TreatmentNode(treatment);



        newNode.next = top;

        top = newNode;



        System.out.println(
        "Treatment record added");


    }


}