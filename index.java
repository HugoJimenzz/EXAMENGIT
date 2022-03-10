public static boolean esPrimo(int n)
{
    int i=2;
    while(n<5){
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