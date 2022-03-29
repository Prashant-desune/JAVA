//Using Classes and objects Find the lamp is on or off
class Lamp{
boolean ison;

//method to check is the lamp is on or not 
public void turnon(){
    ison = true;
    System.out.println("Lamp LED is '(turn On)' if it is ture  and '(turn Off)' when  False : " +ison);
}
 public void trunoff(){
     ison = false;
     System.out.println("Lamp Halogen is '(turn On)' if it is ture  and '(turn Off)' when  False : " +ison);
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
Lamp LED is '(turn On)' if it is ture  and '(turn Off)' when  False : 
Lamp Halogen is '(turn On)' if it is ture  and '(turn Off)' when  False : 
*/
