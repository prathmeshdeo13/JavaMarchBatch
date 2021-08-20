package abstraction;

public abstract class FilmDemo {
   public abstract void film();
   public void Censor() {
      System.out.println("18+ should be required");
   }
}


class Fast9 extends FilmDemo {

   @Override
   public void film() {
      System.out.println("U/A Film");
   }
   public static void main(String[] args) {
      Fast9 fast9 = new Fast9();
      fast9.film();
   }
}

class Murder2 extends FilmDemo{

   @Override
   public void film() {
      System.out.println("A Film");
   }

   public static void main(String[] args) {
      Murder2 murder2 = new Murder2();
      murder2.film();
      murder2.Censor();
   }
}




