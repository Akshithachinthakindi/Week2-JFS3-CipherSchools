class father {
    public final String lastName = "Chinthakindi";

// here we used the keyword called 'final' so whatever data we stored in
// 'lastName' is constant and cannot be changed.

    public void FoodHabit() { // if we use 'final' keyword here 
    // the function 'FoodHabit' cannot be overridden
        System.out.println("I like spicy food!!");
    }
}

class daugther extends father {
    public void FoodHabit() {
        System.out.println("I like sweet and spicy food !!"); 
    }
    // here we are using same function twice the 'FoodHabit' one
    // and this is called overriding
    // lastName = manchikatla;  // here we tried to change the lastName but we couldn't cuz it's constant
}
public class Test3 {
    public static void main(String[] args) {
        father obj = new father();
        obj.FoodHabit();
        daugther clsobj = new daugther();
        clsobj.FoodHabit();
    }
}
