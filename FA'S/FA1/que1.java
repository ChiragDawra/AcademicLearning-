//print all substring of n bits with condition 
class solution {
    void generateAllStrings(int n,int i,int k , char currStr[],ArrayList<String>strs){
        if(i==n){
            strs.add(new String(currStr));
            return;
        }
        if(i==k){
            currStr[i]='1';
            generateAllStrings(n,i+1,k,currStr,strs);
        }
        else{
            currStr[i]='0';
            generateAllStrings(n,i+1,k,currStr,strs);
            currStr[i]='1';
            generateAllStrings(n,i+1,k,currStr,strs);
        }
    }
}