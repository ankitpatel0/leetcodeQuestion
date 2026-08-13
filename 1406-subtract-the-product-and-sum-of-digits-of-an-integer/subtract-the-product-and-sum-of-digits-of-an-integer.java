class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int product =1;
        int count=0;
        
        while(n!=0){
            int digits= n%10;
            n= n/10;
            sum = sum + digits;
            product = product*digits;
            count++;
        }
        int result = product- sum;
        return result;

        
    }
}