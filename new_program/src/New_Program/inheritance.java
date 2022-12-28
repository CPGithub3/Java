package New_Program;
class calculator{
        int x; int y;
}
class add extends calculator{
    public int add(int x, int y){
        return x+y;
    }
}
class mul extends add{
    public int mul(int x, int y){
        return x*y;
    }
}
class div extends mul{
    public int div(int x, int y){
        return x/y;
    }
}
class sub extends div{
    public int sub(int x, int y){
        return x-y;
    }
}

public class inheritance {
    public static void main(String[] args) {

        sub s=new sub();

        System.out.println("Addition " + s.add(5,2));
        System.out.println("Subtraction " + s.sub(5,2));
        System.out.println("Multiply " + s.mul(5,2));
        System.out.println("Division " + s.div(5,2));
    }
}
