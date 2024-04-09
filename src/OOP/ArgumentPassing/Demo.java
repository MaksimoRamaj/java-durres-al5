package OOP.ArgumentPassing;

public class Demo {
    //kalimi ne vlere dhe kalimi ne reference
    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        Obj obj = new Obj(5,7);

        System.out.println("a: " + obj.a + " b: " + obj.b);

        Demo demo = new Demo();
        demo.swap(obj);

        System.out.println("a: " + obj.a + " b: " + obj.b);

    }

    void swap(Obj obj){
        int temp = obj.a;
        obj.a = obj.b;
        obj.b = temp;
    }

    void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
