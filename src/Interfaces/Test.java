package Interfaces;

public class Test {
    public static void main(String[] args) {
        Animal cat = new Animal(0);
        Person boy = new Person("George");
        Info info1 = new Animal(1);
        Info info2 = new Person("Jade");

        boy.sayHello();
        boy.showInfo();
        cat.sleep();
        cat.showInfo();

        System.out.println(" ");

        info1.showInfo();
        info2.showInfo();

        Info info = new Info() {
            @Override
            public void showInfo() {
                System.out.println("here is your info");
            }
        };

        info.showInfo();
    }
}
