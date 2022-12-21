public class Fish extends Animal {
    
    int SizeInFt;
    boolean canEat;

    Fish(int age,String gender){
        super(age, gender);
        this.SizeInFt=5;
        this.canEat=true;
    }
    public void swim() {
        System.out.println("Fish Swim");
    }

    
    @Override
    public void voice() {
        // TODO Auto-generated method stub
        System.out.println("Fish Voice");
    }
    @Override
    public void isMamaml() {
        System.out.println("memeli değil");
    }
}
