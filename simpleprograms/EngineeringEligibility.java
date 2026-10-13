package simpleprograms;

public class EngineeringEligibility {
    public static void main(String[]args){
        int PhysicsMarks=40;
        int Chemystry=40;
        int Mathematics=40;
        int totalmarks=PhysicsMarks+Chemystry+Mathematics;//120

        //JEE
        int JEEScore=40;
        if((totalmarks>=150)|| (JEEScore>=50)){
            System.out.println("Eligible for Engineering");
        }
        else{
            System.out.println("Not  eligible....");
        }

    }
}
