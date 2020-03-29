import acm.program.ConsoleProgram;

/** PROGRAM TO PRINT OUT FIRST 10000 FIBONACCI SEQUENCE **/

public class Fibonacci extends ConsoleProgram {
    private static final int MAX_TERM_VALUE = 10000;

    public void run(){
        println("Program prints Fibonacci sequence: ");
        fibonnaci();
    }


    private void fibonnaci(){

        int a = 0, b = 1;

        while(a <= MAX_TERM_VALUE){
            println(a);

            int answer = a + b;
            a = b;
            b = answer;
        }

    }

}
