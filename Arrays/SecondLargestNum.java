public class SecondLargestNum {
    public static void main(String[] args) {
        int values[] = {1,23,45,56,654,87,8,98,74,32,772,88};
        int max = values[0];
        int max1 = values[0];
        int i =0;
        for(i = 0; i<values.length;i++){
            if(values[i]>max){
                max1 = max;
                max = values[i];
            }
            else if(values[i]<max && values[i]>max1){
                max1= values[i];
            }
        }
        System.out.println("Max Value is : "+max);
        System.out.println("Second Max Value is : "+max1);
    }
}

/*  <-- Outcome is  --->
Max Value is : 772
Second Max Value is : 654
*/