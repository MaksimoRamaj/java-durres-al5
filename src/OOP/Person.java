package OOP;

public class Person {
    private String id;
    String emri;
    String profesioni;

    static int popullsia;

    public Person(String id, String emri, String profesioni) {
        this.id = id;
        this.emri = emri;
        this.profesioni = profesioni;
        popullsia++;
    }

     static void methA(){
        System.out.println("Inside static method!");
    }

    public Person() {
    }
    void sleep(){
        System.out.println(this.emri + " is sleeping");
    }

    String speak(String word){
        System.out.println(this.emri + " : " + word);
        return "Pershendetje";
    }
}
