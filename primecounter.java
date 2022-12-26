public class Main {
public static void main(String[]args){
    //number between 1 and 100 inclusive
    int lowest_number=1,highest_number=100;
   for(int i=lowest_number;i<=highest_number;i++){
       if(CheckPrime(i)){
           System.out.print(i+",");
       }
    }
    
}
public static boolean CheckPrime(int num){
    if (num<2){
        return false;
    }
    else{
        int x=num/2;
        for(int i=2;i<x;i++){
            if(num%i==0){
                return false;
            }
        }
            
    }
    return true;
}
}
