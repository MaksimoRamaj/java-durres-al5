package OOP.NestedClass;

public class Demo {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        System.out.println(OuterClass.b);
        OuterClass.InnerClass innerClass = outerClass.new InnerClass(7);

        OuterClass.staticInnerClass staticInnerClass = new OuterClass.staticInnerClass(7);

        innerClass.print();

        staticInnerClass.print();
    }
}
