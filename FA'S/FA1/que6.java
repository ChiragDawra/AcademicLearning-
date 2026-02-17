//implement reccurence relation
class solution{
    static int findtk(int k){
        if(k==0) return 0;
        return findtk(k-1)*3*k;
    }
}