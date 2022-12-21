public class Duck extends Animal{
    public String beakcolor;
    Duck(int age,String gender){
        super(age, gender);
        this.beakcolor="yellow";
    }
    public void swim() {
        System.out.println("Duck swim");
    }
    @Override
    public void voice() {
        // TODO Auto-generated method stub
        System.out.println("Duck Voice");
    }
    @Override
    public void isMamaml() {
        System.out.println("memeli değil");
    }
}
