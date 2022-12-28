package New_Program;

import java.io.IOException;

public class newClass{
    public static void main(String[] args) throws IOException {
        String fname="Chandra", lname="    Prakash    ";
        char mname=' ';

        System.out.println(fname.length());
        System.out.println(fname.toUpperCase());
        System.out.println(fname.toLowerCase());
        System.out.println(lname.trim());
        System.out.println(fname + " " + "malviya");
        System.out.println(fname + mname + lname + ".");
        System.out.println(fname.replace('a', 'c'));
        System.out.println(fname.replace('a','i') + lname.replace('a','i'));
        System.out.println(lname.substring(7));
        System.out.println(lname.substring(5,9));
        System.out.println(fname.charAt(2));
        System.out.println(fname.equals(lname));

    }

}
