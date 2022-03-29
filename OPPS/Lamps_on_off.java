//Using Classes and objects Find the lamp is on or off
class Lamp{
boolean ison;

//method to check is the lamp is on or not 
void turnon(){
    ison = true;
    System.out.println("Lamp LED is ture '(turn On)' ans False for '(turn Off)': " +ison);
}
 void trunoff(){
     ison = false;
     System.out.println("Lamp Halogen is ture '(turn On)' ans False for '(turn Off)': " +ison);
 }

}

public class Lamps_on_off {

    public static void main(String[] args) {

        // now here I have create two objects of the lamp class led and halogen and called the methods 
        Lamp led = new Lamp();
        Lamp halogen = new Lamp();
        led.turnon();
        halogen.trunoff();
    }
}

//! <----------------------------- Output is ------------------------------------------->

/*
Lamp LED is ture '(turn On)' ans False for '(turn Off)': true
Lamp Halogen is ture '(turn On)' ans False for '(turn Off)': false
*/