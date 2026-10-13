package string_Methods;

public class countUppercaseLowercase {
    public static void main(String[] args) {
        String s="ApplePhone";
        //upper case=5
        //lowercase=5

        int uppercaseCounter=0;
        int lowercaseCounter=0;

        for(int i=0;i<s.length(); i++){
            char c=s.charAt(i);

            if(Character.isUpperCase(c)){
                uppercaseCounter++;
            }
            else{
                lowercaseCounter++;
            }
        }
        System.out.println("Total upper case"+uppercaseCounter);
        System.out.println("Total lowercase"+lowercaseCounter);
    }
}
