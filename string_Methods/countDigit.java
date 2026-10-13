package string_Methods;

public class countDigit {
    public static void main(String[] args) {
        String email="pruthvirajchavan413@mai.com";
        int digitCount=0;

        for(int i=0; i<email.length();i++){
            char c=email.charAt(i);
            if(Character.isDigit(c)){
                digitCount++;
            }
        }
        System.out.println("Total digits are"+digitCount);
    }
}
