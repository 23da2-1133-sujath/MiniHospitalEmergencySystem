package hospital;


class PatientNode {


    Patient patient;
    PatientNode left;
    PatientNode right;


    public PatientNode(Patient patient){

        this.patient = patient;

    }

}



public class PatientBST {


    PatientNode root;



    public void insert(Patient patient){

        root = insertNode(root,patient);

    }



    private PatientNode insertNode(PatientNode root,
                                   Patient patient){


        if(root == null){

            return new PatientNode(patient);

        }


        if(patient.patientID < root.patient.patientID){

            root.left = insertNode(root.left,patient);

        }
        else{

            root.right = insertNode(root.right,patient);

        }


        return root;

    }




    public void search(int id){

        PatientNode result = searchNode(root,id);


        if(result != null){

            result.patient.displayPatient();

        }

        else{

            System.out.println("Patient Not Found");

        }

    }





    private PatientNode searchNode(PatientNode root,int id){


        if(root == null ||
           root.patient.patientID == id){

            return root;

        }



        if(id < root.patient.patientID){

            return searchNode(root.left,id);

        }

        else{

            return searchNode(root.right,id);

        }


    }






    public void displayPatients(){

        inorder(root);

    }





    private void inorder(PatientNode root){


        if(root != null){

            inorder(root.left);

            root.patient.displayPatient();

            inorder(root.right);

        }


    }




    public void delete(int id){

        root = deleteNode(root,id);
        System.out.println("Patient Delete Successfully");
    }





    private PatientNode deleteNode(PatientNode root,int id){


        if(root == null){

            return null;

        }


        if(id < root.patient.patientID){

            root.left = deleteNode(root.left,id);

        }


        else if(id > root.patient.patientID){

            root.right = deleteNode(root.right,id);

        }


        else{


            if(root.left == null){

                return root.right;

            }


            else if(root.right == null){

                return root.left;

            }


            root.patient = findMin(root.right);

            root.right =
            deleteNode(root.right,
            root.patient.patientID);

        }


        return root;

    }





    private Patient findMin(PatientNode root){


        while(root.left != null){

            root = root.left;

        }


        return root.patient;

    }


}