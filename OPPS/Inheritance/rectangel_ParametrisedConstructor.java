class Rectangle{
    int length;
    int breath;

    public Rectangle(){
        length=breath=1;
    }
    public Rectangle(int l , int b){
        length = l;
        breath = b;
    }
}

class Cubiod extends Rectangle{
    int height;
    public Cubiod(){
        height = 1;
    }
    public Cubiod(int h){
        height = h;
    }
    //I have used here A Super() keyword by this it will take the value from Rectangle class of length and breath ;
    public Cubiod(int l, int b, int h){
        super(l,b);
        height = h;
    }

    public int volume(){
        return length*breath*height;
    }
}
public class rectangel_ParametrisedConstructor {
    public static void main(String[] args) {
        Cubiod C = new Cubiod(10,13,15);
        System.out.println("Volume of the Cubiod is "+C.volume());
    }
}

/* The Output : -  */
// Volume of the Cubiod is 1950