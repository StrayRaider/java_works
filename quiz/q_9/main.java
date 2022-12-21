import java.util.ArrayList;

public class main {

   public static void main(String[] args) {

      ArrayList animaliList = new ArrayList<Animal>();

      int i;
      for (i = 0; i < 11; i++) {
         if (i < 2)
            animaliList.add(new Animal(5, "male"));
         else if (i < 5)
            animaliList.add(new Duck(4, "female"));
         else if (i < 7)
            animaliList.add(new Fish(1, "nonbinary"));
         else if (i < 11)
            animaliList.add(new Zebra(10, "male"));
      }
      // method deneme

      for (i = 0; i < animaliList.size(); i++) {
         System.out.println(animaliList.get(i));
         System.out.println("\n\n");
         if (animaliList.get(i) instanceof Fish) {
            Fish loc = (Fish) animaliList.get(i);
            loc.voice();
            loc.isMamaml();
            loc.sleep();
            loc.mate();
            loc.swim();
            System.out.println(((Fish) animaliList.get(i)).SizeInFt + "\t" + ((Fish) animaliList.get(i)).canEat);
         }

         else if (animaliList.get(i) instanceof Duck) {
            Duck loc = (Duck) animaliList.get(i);
            System.out.println(((Animal) animaliList.get(i)).getClass().toString() + ((Animal) animaliList.get(i)).age
                  + "\t" + ((Animal) animaliList.get(i)).gender);
                              loc.voice();
            loc.isMamaml();
            loc.sleep();
            loc.mate();
            loc.swim();
            loc.voice();
            System.out.println(((Duck) animaliList.get(i)).beakcolor);
         }

         else if (animaliList.get(i) instanceof Zebra) {
            Zebra loc = (Zebra) animaliList.get(i);
            System.out.println(((Animal) animaliList.get(i)).getClass().toString() + ((Animal) animaliList.get(i)).age
                  + "\t" + ((Animal) animaliList.get(i)).gender);
            System.out.println("\t" + ((Zebra) animaliList.get(i)).isWild);
            loc.voice();
            loc.isMamaml();
            loc.sleep();
            loc.mate();
            loc.run();
         }
         else{
            ((Animal) animaliList.get(i)).voice();
            ((Animal) animaliList.get(i)).isMamaml();
            ((Animal) animaliList.get(i)).sleep();
            ((Animal) animaliList.get(i)).mate();
            System.out.println(((Animal) animaliList.get(i)).getClass().toString() + ((Animal) animaliList.get(i)).age
            + "\t" + ((Animal) animaliList.get(i)).gender);
         }
      }
   }

}
