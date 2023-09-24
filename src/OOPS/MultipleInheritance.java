package OOPS;
interface A{
    int a=2;
    public void print();
    public void read();
}
interface B{
    int b=4;
    public void print();
    public void write();
}
class C implements A,B{
    C(){
        System.out.println("Initiated");
    }
    @Override
    public void print() {
        System.out.println("Printing"+A.a+B.b);
    }

    @Override
    public void write() {

    }

    @Override
    public void read() {

    }
}
public class MultipleInheritance {


    public static void main(String[] args) {
        C obj=new C();
        obj.print();
        A ob=new C();
        ob.print();
        ob.read();//I cant ob.write() here
    }
}
