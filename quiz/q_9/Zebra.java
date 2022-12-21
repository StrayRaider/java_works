public class Zebra extends Animal{

    boolean isWild;

    Zebra(int age,String gender){
        super(age, gender);
        this.isWild = true;
    }

    public void run() {
        System.out.println("Zebra run");
    }
    
    @Override
    public void voice() {
        // TODO Auto-generated method stub
        System.out.println("Zebra Voice");
    }
    @Override
    public void isMamaml() {
        System.out.println("memeli");
    }
}
