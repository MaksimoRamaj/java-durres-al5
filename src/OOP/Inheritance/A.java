package OOP.Inheritance;

class A{
    public A() {
        System.out.println("Inside A");
    }

    void greet(){
        System.out.println("Hello from A");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("Inside B");
    }
    @Override
    void greet(){
        System.out.println("Hello from B");
    }
}

class C extends B {
    public C() {
        super();
        System.out.println("Inside C");
    }

    @Override
    void greet(){
        super.greet();
        System.out.println("and from C");
    }
}

class Demo{
    public static void main(String[] args) {
        C c = new C();
        c.greet();

    }
}
