package New_Program;

public class arraynew {
    public static void main(String[] args) {
        String[] name=new String[5];
        name[0]="Aman"; name[1]="Alok"; name[2]="Vivek"; name[3]="Ram"; name[4]="Rajesh";

            System.out.println(name.length);
        for( int b=0; b<name.length; b++){
            System.out.println(name[b]);
        }
    }
}
