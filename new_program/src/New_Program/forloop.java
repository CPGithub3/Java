package New_Program;

import java.io.IOException;

public class forloop {
    public static void main(String[] args) throws IOException {
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            };
            System.out.println("");
        }
    }
}
