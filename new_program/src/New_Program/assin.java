package New_Program;

class cp {
    int a; int b; String fname; String lname;
    public void add(){
        System.out.println(a+b);
        }
    public void  name(){
        System.out.println(fname + " " + lname);
        }
}

public class assin {

    public static void main(String[] args) {
        cp ad=new cp();
        ad.a=5; ad.b=4; ad.fname="Chandra"; ad.lname="Praksh";
        ad.add();
        ad.name();
        }
}
