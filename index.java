public static boolean esPrimo(int n)
{
    int i=1;
    while(n<2){
        return false;
    }
    while (n<i){
        if(n%i==0) {
            return false;
        }    
        i++;    
    }
    return true;
}