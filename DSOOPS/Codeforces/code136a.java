import java.util.Scanner;
class code136a{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // logic 1
        int gifted[] = new int[n];
        for(int i=0;i<n;i++){
            gifted[i] = sc.nextInt();
        }
        int received[] = new int[n+1];
        for(int i=0;i<n;i++){
            received[gifted[i]] = i+1;
        }
        for(int i =1;i<=n;i++){
            System.out.print(received[i]+" ");
        }
        

        // logic 2
        int output[] =new int[n];
        for(int i=0;i<n;i++){
            output[sc.nextInt()-1] = i+1;
        }
        for(int friend:output){
            System.out.print(friend+" ");
        }

    }
}