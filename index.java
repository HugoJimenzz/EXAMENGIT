public static boolean esPrimo(int n)
{
    int i=2;
    while(n<1){
        return false;
    }
    while (i<n){
        if(n%i==0) {
            return false;
        }    
        i++;    
    }
    return true;
}