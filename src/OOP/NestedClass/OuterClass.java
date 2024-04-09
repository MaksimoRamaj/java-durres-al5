package OOP.NestedClass;

public class OuterClass {
    int x = 5;
    static int b = 0;

    static {
        System.out.println("Brenda bllokut statik");
    }

    class InnerClass{
        int y;
        static int p;

        InnerClass(int y){
            this.y = y;
        }

        void print(){
            System.out.println("Inside non static inner class");
            System.out.println("Value of x: " + x + " Value of y: " + y + " Static b: " + b);
        }
    }

    static class staticInnerClass{
        int y = 4;

        public staticInnerClass(int y) {
            this.y = y;
        }

        void print(){
            OuterClass outerClass = new OuterClass();
            System.out.println("Inside static inner class");
            System.out.println("Value of x: "+outerClass.x+" Value of y: " + y + " Static b: " + b);
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
}
