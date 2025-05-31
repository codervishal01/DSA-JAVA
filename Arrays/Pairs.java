public class Pairs {

    public static int getPairs(int numbers[]){
        int tp=0;
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("(" + numbers[i] + ", " + numbers[j] + ")");
                tp++;
            }
            System.out.println(); 
        }
        System.out.print("total pairs : " + tp);
        return 0;
    }


    public static void main(String args[]) {
        int numbers[] = {2,4,6,8,10};
        System.out.println("All pairs in the array:");
        getPairs(numbers);

    }
}
