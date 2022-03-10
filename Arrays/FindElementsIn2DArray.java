import java.util.*;
public class FindElementsIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num of rows : ");
        int row = sc.nextInt();
        System.out.print("Enter the num of col : ");
        int col = sc.nextInt();
        int A[][] = new int[row][col];
        System.out.println("Enter the elements : ");
        for(int i = 0 ; i<row;i++){
            for(int j = 0; j < col; j++){
                A[i][j]=sc.nextInt(); //it will take the elements of rows and col
            }
        }
        System.out.print("Enter the Array Element you want to found : ");
        int B = sc.nextInt();
        for(int i = 0; i<row;i++){
            for(int j = 0 ; j<col;j++){
                if(B==A[i][j]){
                    System.out.println("At Index The Elements Are Founded : " +"("+ i+","+j+")");
                }
            }
        }

    }
}
