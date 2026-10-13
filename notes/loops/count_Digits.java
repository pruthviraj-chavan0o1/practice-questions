package notes.loops;

public class count_Digits {
    public static void main(String[] args) {
        int num=345;
        int count=0;

        while(num>0){
            int last=num% 10;
            count++;
            num = num/10;
        }
        System.out.println("the Total count is"+count);
    }
}
