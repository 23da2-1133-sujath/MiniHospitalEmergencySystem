package hospital;


class PatientNode {


    Patient patient;
    PatientNode left;
    PatientNode right;



    public PatientNode(Patient patient){

        this.patient = patient;
        left = null;
        right = null;

    }


}



public class PatientBST {


    PatientNode root;



    public void insert(Patient patient){

        root = insertNode(root, patient);

    }



    private PatientNode insertNode(PatientNode root,
                                   Patient patient){


        if(root == null){

            return new PatientNode(patient);

        }


        if(patient.patientID < root.patient.patientID){

            root.left = insertNode(root.left, patient);

        }

        else{

            root.right = insertNode(root.right, patient);

        }


        return root;

    }


}