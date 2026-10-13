package string_Methods;

public class Demo {
    public static void main(String[] args) {
        String s1="Pruthvi";
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(1));
        System.out.println(s1.charAt(2));

        System.out.println(s1.indexOf('i'));
        System.out.println(s1.indexOf('p'));
        System.out.println(s1.indexOf('r'));


        String s2="Sumit";
        System.out.println(s2.indexOf('s'));
        System.out.println(s2.indexOf('u'));
        System.out.println(s2.indexOf('m'));


        String s3="JAva";
        System.out.println("Total length of"+s3+"is"+s3.length());

        String s4="Mobie";
        String s5="bhh";
        System.out.println(s4.concat(s5));

        String s6="Mumbai";
        System.out.println(s6.startsWith("y"));
        System.out.println(s6.endsWith("ai"));
        System.out.println(s6.replace('a', '*'));
        System.out.println(s6.contains("mb"));


        String a="naman";
        String b="baban";
        System.out.println(a.compareTo(b));
    }
}
