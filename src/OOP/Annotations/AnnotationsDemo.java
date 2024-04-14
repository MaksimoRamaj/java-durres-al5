package OOP.Annotations;

public class AnnotationsDemo {
    public static void main(String[] args) {

        @SuppressWarnings("deprecated")
        int a = sum(5,6);
    }

    @Deprecated
    static int sum(int a,int b){
        return a+b;
    }
}

class MyClass{

    @SuppressWarnings("deprecated")

    static void myMeth(){
        AnnotationsDemo.sum(5,6);
    }
}
