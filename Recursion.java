// write a program print pattent like 
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5

class Recursion{
    public static void Recursiveattern(int n) {
        if (n <= 0) {
            return;
        }
        Recursiveattern(n - 1);
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); 
        
    }
    
    public static void main(String[] args) {
        int n = 5;
        Recursiveattern(n);
    }

}
