public class SumofNumInArray {
    public static void main(String[] args) {
        int sum = 0;
        int num[] = {2,3,4,6,5,8,8,9,10,12};
        for(int i = 0;i<num.length;i++){
            sum += num[i]; 
        }
        System.out.println(sum);
    }
}
