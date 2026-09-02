package hospital;


public class Visit {


    int visitID;
    String visitDate;
    String doctorName;
    String diagnosis;
    String treatment;




    public Visit(int visitID,
                 String visitDate,
                 String doctorName,
                 String diagnosis,
                 String treatment){



        this.visitID = visitID;
        this.visitDate = visitDate;
        this.doctorName = doctorName;
        this.diagnosis = diagnosis;
        this.treatment = treatment;



    }






    public void displayVisit(){


        System.out.println("--------------------------");

        System.out.println("Visit ID    : " + visitID);
        System.out.println("Date        : " + visitDate);
        System.out.println("Doctor      : " + doctorName);
        System.out.println("Diagnosis   : " + diagnosis);
        System.out.println("Treatment   : " + treatment);


        System.out.println("--------------------------");


    }


}