package New_Program;
class formula{
    private int area; private int base; private int height;
    public void set(int b, int h){
        area = b*h/2;
        base = b;
        height = h;
//        System.out.println("Enter Base and Height");
        System.out.println("Area of Triangle is " + area);

    }
}
public class getset {
    public static void main(String[] args) {
        formula f=new formula();
        f.set(5,8);
    }
}
