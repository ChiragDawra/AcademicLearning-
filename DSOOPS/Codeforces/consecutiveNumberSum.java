class consecutiveNumberSum{
    public int consecutiveNumberSum(int n){
        int count , res = 1;
        while(n%2==0) n/=2;
        for(int i=3;i*i<=n;i+=2){
            count =0;
            while(n%i==0){
                n/=i;
                count++;
            }
            res *=count+1;
        }
        return n==1 ? res:res*2;
    }
}