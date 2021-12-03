package core.loops.while_loops;

public class WhileExamples {

    public static void printNum(int printUpTo){
        int count = printUpTo;

        while (count != 0){
            System.out.println(count);
            count --;
        }

    }

    // Do while will run once
    public static void doWhile(int printUpTo){
        int count = printUpTo;

        do {
            System.out.println(count);
            count --;
        } while (count != 0);
    }


    public static void main(String[] args) {
        WhileExamples.doWhile(10);
    }
}
