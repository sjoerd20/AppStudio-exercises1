class Flea {
   
   // Properties of the class...
   protected String name;
   
   // Constructor of the class...
   public Flea(String aName) {
      name = aName;
   }

   // Methods of the class...
   public String toString() {
      return "I am a flea called " + name;
   }

}

class Dog {

   // Properties of the class...
   protected String name;
   private int    age;
   protected Flea   dogsFlea;

   // Constructor of the class...
   public Dog(String aName, int anAge, Flea aFlea) {
      name     = aName;
      age      = anAge;
      dogsFlea = aFlea;
   }

   // Methods of the class...
   public String toString() {
      return "I am " + name + ", my age is " + age + " and I have a flea called " + dogsFlea.name;
   }

}

class DogOwner {
   
   // Properties of the class
   private String name;
   private int    salary;
   protected Dog    ownersDog;
   
   // Constructor of the class
   public DogOwner(String aName, int aSalary, Dog aDog) {
      name = aName;
      salary = aSalary;
      ownersDog = aDog;
   }
   
   // Methods of the class
   public String toString() {
      return "I am " + name + ", my salary is " + salary + " and I have a dog called " + ownersDog.name;
   }
}

class DogTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {
      Flea pop = new Flea("Pop");
      Flea squeak = new Flea("Squeak");
      Flea zip = new Flea("Zip");
      
      Dog rex = new Dog("Rex", 5, pop);
      Dog jimbo = new Dog("Jimbo", 1, squeak);
      Dog fido = new Dog("Fido", 9, zip);
      
      DogOwner angus = new DogOwner("Angus", 30000, rex);
      DogOwner brian = new DogOwner("Brian", 40000, jimbo);
      DogOwner charles = new DogOwner("Charles", 100000, fido);
      
      System.out.println(rex.toString());
      System.out.println(jimbo.toString());
      System.out.println(fido.toString() + "\n");
      
      System.out.println(angus.toString());
      System.out.println(brian.toString());
      System.out.println(charles.toString() + "\n");
      
      // This prints the flea of the dog owned by angus
      System.out.println(angus.ownersDog.dogsFlea.toString());
   }
}
