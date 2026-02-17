//sum of first and last digit
class solution{
    public static void main(String[] args){
        n = 10;
        int last = n%10;
        while(n>=10){
            n/=10;
        }
        int first = n;
        System.out.println(first+last);
    }
}