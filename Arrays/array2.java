//! Java Program to find the frequency of each element in the array
public class array2 {
    public static void main(String[] args) {
        int arr[] ={1, 2, 8, 3, 2, 2, 2, 5, 1 };
        int fr[] = new int [9];
        
        int visited = -1;
        for(int i = 1 ; i<arr.length;i++){
            int count = 1;
            for(int j = i+1;i<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    fr[i] = visited;
                }
            }
            if(fr[i] != visited)  
                fr[i] = count;  
        }
        for(int i = 0 ; i<arr.length;i++){
            if(fr[i] != visited)  
            System.out.println("    " + arr[i] + "    |    " + fr[i]);  
        }
        System.out.println("");
    }
}
