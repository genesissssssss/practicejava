public class Person {

    private String name;
    private int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    void showPerson(){
        System.out.println("Name: " + name + "| Age: " + age);
    }

    public String getName() {return name; };
    public int getAge() {return age;};
}
