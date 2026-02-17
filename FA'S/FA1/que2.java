//kth set bit 
class solution{
    public static boolean KthBit(int n,int k){
        return (n &(1<<(k-1)))!=0;
    }
    public static void main(String[] args){
        int k =10;
        int n =2;
        if(KthBit(n,k)){
            System.out.println("Set");
        }
        else{
            System.out.println("Not Set");
        }
    }
}