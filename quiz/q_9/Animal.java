/**
 * Animal
 */
public class Animal {

    int age;
    String gender;

    Animal(int age,String gender){}

    public void isMamaml() {
        System.out.println("is mamal");
    }
    public void mate() {
        System.out.println("mate");
    }
    public void voice() {
        System.out.println("Animal Voice");
    }
    public final void sleep() {
        System.out.println("Sleeping...");
    }
}