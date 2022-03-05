import java.util.*;
public class SearchingTheElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Num : ");
        int FindNum = sc.nextInt();
        int index = -1;
        int num [] = {1,12,33,44,52,6,7,8,10,12,45,2};
        for(int i = 0;i<num.length;i++){
            index = i;
            if(FindNum==num[i]){
                System.out.println("Yes I got it : - "+num[i]+" "+" At the Position : - "+index);
                System.exit(0);
            }
        }
        System.out.println("Num Not In The List");
    }
}
