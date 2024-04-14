package OOP.Annotations;

import java.lang.reflect.Field;

public class Computer {

    @MyAnno(myInt = 1,myStr = "Str")
    private int ram;

    String brand;

    public Computer(int ram,String brand) {
        this.ram = ram;
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }
}

class Demo{
    public static void main(String[] args) {
        Computer computer = new Computer(4,"Hp");
        Class<?> computerClass =computer.getClass();

        Field[] fields = computerClass.getDeclaredFields();

        System.out.println(computer.getRam());

        for (Field field : fields){
            if(field.isAnnotationPresent(MyAnno.class)){
                field.setAccessible(true);
                try {
                    field.set(computer,6);
                } catch (IllegalAccessException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        System.out.println(computer.getRam());
    }
}
