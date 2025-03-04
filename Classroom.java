public class Classroom {

    public static void main(String[] args) {

        Wilder riri = new Wilder("Riri", true);
        Wilder fifi = new Wilder("Fifi", false);
        Wilder loulou = new Wilder("Loulou", true);
        Wilder donald = new Wilder("Donald", false);
        Wilder daisy = new Wilder("Daisy", true);


        System.out.println(riri.whoAmI());
        System.out.println(fifi.whoAmI());
        System.out.println(loulou.whoAmI());
        System.out.println(donald.whoAmI());
        System.out.println(daisy.whoAmI());




        // // getters usage
        // System.out.println("1. Duck name is : " + riri.getName());
        // System.out.println("2. He was " + String.valueOf(riri.getAge()));
        
        // // setter usage
        // riri.setAge(9);
        // System.out.println("3. Now he is " + String.valueOf(riri.getAge()));

        // Duck fifi = new Duck("Fifi", 8);  
        // System.out.println("4. Fifi swimming state was : " + String.valueOf(fifi.isSwimming()));
        // fifi.setSwimming(true);
        // System.out.println("5. Now his swimming state is : " + String.valueOf(fifi.isSwimming()));

        // // instance method
        // Duck loulou = new Duck("Loulou", 8);   
        // System.out.println("6. " + loulou.nameAndAge());

        // // static method
        // System.out.println("7. What the duck says : " + Duck.quack());

        // // two references to the same object
        // Duck mysterMask = new Duck("Myster Mask");
        // Duck albertColvert = mysterMask;

        // // both aim at the same memory space
        // albertColvert.setName("Albert Colvert");
        // System.out.println("8. Myster Mask is : " + mysterMask.getName());
    }
}