package string_Methods;

public class printWhiteSpace {
    public static void main(String[] args) {
        String s="P r u t h v i";
        int count=0;
        for(int i=0; i<s.length();i++){
            char c=s.charAt(i);

            if(Character.isWhitespace(c)){
                count++;
            }
        }
        System.out.println("Total White space are"+count);
    }
}
