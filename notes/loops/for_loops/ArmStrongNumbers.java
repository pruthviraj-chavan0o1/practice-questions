package notes.loops.for_loops;

public class ArmStrongNumbers {
    public static void main(String[] args) {
        int num=153;
        int m=num;

        //digits
        int digits=0;
        

        while(m>0){
            int last=m%10;
            digits++;
            m = m /10;
        }
        m = num;//153

        int sum=0;

        while (m > 0){
            int last=m%10;
            sum = sum + ((int)Math.pow(last, digits));
            m = m /10;

        }
        if(sum==sum)System.out.println("Armstrong");
        else System.out.println("Not");
    }
}
