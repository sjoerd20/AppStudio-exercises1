class Person {

   // Properties of the class...
   public String name;
   public int    age;
   private String gender;
    
   // Constructor of the class...
   //public Person(String aName, int anAge, String aGender) {
      //name = aName;
      //age  = anAge;
      //gender = aGender;
   //}

   // Methods of the class...
   public void talk() {
      System.out.println("Hi, my name's " + name + ", ");
      System.out.println("my age is " + age);
      System.out.println("and my gender is " + gender);
      System.out.println();
   }
   public void commentAboutAge() {
      if (age < 5) {
         System.out.println("baby");
      }
      else if (age == 5) {
         System.out.println("time to start school");
      }
      else if (age > 60) {
         System.out.println("old person");
      }
      
   }
   public void growOlder() {
      age++;
   }
   public void giveKnighthood() {
      name = "Sir " + name;
   }
   public void growOlderBy(int yearsolder) {
      age += yearsolder;
   }
}

class PersonTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {

      Person ls = new Person();
      Person wp = new Person();
      System.out.println("my age is " + ls.age);
      ls.growOlderBy(10);
      if (ls.name == "Luke Skywalker") {
         System.out.println("you're " + ls.age);
      }
      ls.talk();
      wp.talk();
      wp.growOlder();
      wp.giveKnighthood();
      wp.talk();
   }

}