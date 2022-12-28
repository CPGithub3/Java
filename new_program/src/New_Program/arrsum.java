package New_Program;

public class arrsum {
    public static int sum(int ...num){

        int total=0;
        for (int j=0; j<num.length; j++){
            total=total+num[j];
        }return total;
    }

    public static void main(String[] args) {

        arrsum cw = new arrsum();
        System.out.println(cw.sum(10, 20, 30));

    }
}
