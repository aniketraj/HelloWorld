class Dog
    {
        static int noOfLegs=4;
        static void display()
        {
          System.out.println("Dog is running" );
     }
           

    }

class DogTest
   { 
       public static void main(String args[]) throws Exception
          { 
             //byte b=10

            // Dog d1= new Dog();

            // Dog raga = new Dog();
            // System.out.println(d1.noOfLegs);                     
            // System.out.println(raga.noOfLegs); 
             //raga.noOfLegs-=1;
            // System.out.println(raga.noOfLegs);

             //System.out.println(d1.noOfLegs);
             
               Class.forName("Dog");                        

           }
    }