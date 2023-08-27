package LearnBasicRecursion;

public class PrintNameNTimes {
    public static void main(String[] args) {
        int n=5;
        int i=0;
        rec(n,i);
        //Simple Recursion (Less code)
        simpleRecursion(n);

    }
    public static void rec(int n,int i){
        if(i==n){
            return;
        }
        System.out.print("Coding Ninjas ");
        i++;
        rec(n,i);
    }

    /*

        Simplified recursion without extra variable.

     */
    public static void simpleRecursion(int n){
        System.out.print("Coding Ninjas ");
        if (n>1){
            simpleRecursion(n-1);
        }
    }

}
