public class ThreeNumberFibbonacci {
    public static int RecursionFib(int n){
        
        if(n <= 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }

        return RecursionFib(n-1) + RecursionFib(n-2) + RecursionFib(n-3) ;

    }   
    public static void main(String[] args) {
        System.out.println(RecursionFib(1));
    } 
}
