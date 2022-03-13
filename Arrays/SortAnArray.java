import org.w3c.dom.css.Counter;

public class SortAnArray {
    public static void main(String[] args) {
        String arr[] = {"Java","Python","Cpp","Swift","Ruby","C-Language","R-programming","Flutter"};
        //now We have to sort this arrays of arr in alphabetical ORDER
        java.util.Arrays.sort(arr);
         for(String X : arr){
            System.out.print( X + "   ");
            }
            System.out.println("");
    }
}

/*  
                <-------
C-Language   Cpp   Flutter   Java   Python   R-programming   Ruby   Swift   
                ------->            
*/