package linearSearch;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int arr[][]={
                {34,67,9,14,3},
                {23,4,5,100},
                {1,41,15,6}
        };
        System.out.println(maximumWealth(arr));
    }
    public static int maximumWealth(int[][] accounts) {
        int maxWealth=Integer.MIN_VALUE;

        for(int row=0;row<accounts.length;row++){
            int sum=0;
            for(int col=0;col<accounts[row].length;col++){
                sum+=accounts[row][col];
            }
            if(maxWealth<sum) maxWealth=sum;
        }
        return maxWealth;

    }
}
