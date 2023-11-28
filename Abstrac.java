abstract class first{
    public void display(){
        System.out.println("from abstract class");
    }
    abstract void print_out();
}

class second extends first{
    public void show(){
        System.out.println("from child class");
    }
    void print_out(){
        System.out.println("a abstract method is implemented......");
    }
}

public class Abstrac {
    public static void main(String[] main){
        second fr = new second();
        fr.show();
        fr.print_out();

    }
}
