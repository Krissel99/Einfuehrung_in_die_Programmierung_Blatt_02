package h3;

public class H3_main {
    public static void main(String[] args) {

        int i=100, j=99, k=-10;
        boolean ausdruck1 = i > j;
        boolean ausdruck2 = i > 200;
        boolean ausdruck3 = j > 100;

        if (ausdruck1 == true) {
            if (ausdruck2 == false) {
                if (ausdruck3 == false) {
                    k = 1;
                }
            }
        }
        if (ausdruck1 == true) {
            if (ausdruck2 == true) {
                if (ausdruck3 == false) {
                    k = 2;
                }
            }
        }
        if (ausdruck1 == true) {
            if (ausdruck2 == true) {
                if (ausdruck3 == true) {
                    k = 3;
                }
            }
        }
        if (ausdruck1 == false) {
            if (ausdruck2 == false) {
                if (ausdruck3 == false) {
                    k = 4;
                }
            }
        }
        System.out.println("k="+k);
    }
}