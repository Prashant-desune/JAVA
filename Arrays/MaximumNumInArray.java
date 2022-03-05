public class MaximumNumInArray {
    public static void main(String[] args) {
        int num = 0;
        int values[] = {1,23,45,56,654,87,8,98,74,32,772,88};
        for(int i = 0 ; i < values.length;i++){
            if(values[i]>num){
                num = values[i];
            }
        }
        System.out.println(num);
    }
}
