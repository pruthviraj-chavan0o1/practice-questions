package string_Methods;

public class Demo1 {
    public static void main(String[] args) {
        Character c1='W';//65
        Character c2='D';

        System.out.println(c1.compareTo(c2));



        System.out.println(Character.toLowerCase('A'));
        System.out.println(Character.toUpperCase('d'));


        System.out.println(Character.toLowerCase('Z'));
        System.out.println(Character.isLowerCase('Z'));


        Character c3='A';

        if(Character.isUpperCase(c3)){
            System.out.println("uppercase");

        }
        else{
            System.out.println("Lowercase");
        }

        Character c4='a';
        Character c5='a';
        System.out.println(c4.equals(c5));


        Character c6=' ';
        System.out.println(Character.isWhitespace(c6));

        System.out.println(Character.isDigit('1'));

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isLetterOrDigit('1'));

    }
}
