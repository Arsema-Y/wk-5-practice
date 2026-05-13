package Monday;

public class Animal {
   private String name;

   Animal(){
       System.out.println("In Animal Constructor");
   }

   public String getName(){return name;}

    public void setName(String name){this.name = name;}
}
