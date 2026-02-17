//base 6 
class solution{
    public int solve(int[] arr){
        int n = arr.length;
        int[] derived = new int[n];
        for (int i=0;i<n;i++){
            int num = arr[i];
            int sum = 0;
            while(num>0){
                sum+=num%6;
                num/=6;
            }
            derived[i]=sum;
        }
        int inversion = 0;
        for (int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(derived[i]>derived[j]){
                    inversion++;
                }
            }
        }
        return inversion;
    }
}