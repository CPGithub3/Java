package New_Program;

public class proarray {
    public static void main(String[] args) {
        int[] i={1,2,3,4,5};
        int prod=1;
        for(int j=0; j<i.length; j++){
            prod=prod*i[j];
        }
        System.out.println(prod);
    }
}
