package h2;

public class H2_main {
    public static void main(String[] args) {

        int i=8, j=20, k=9, min=1, max=10;
        // kleinesten Wert finden
        if (i<j) {
            if (j < k) {
                min = i;
            } else if (i < k) {
                if (k < j)
                    min = i;
            }
        } else if (j<i) {
            if (i < k) {
                min = j;
            } else if (j < k) {
                if (k < i)
                    min = j;
            }
        }
        if (k<i) {
            if(i<j) {
                min=k;
            } else if (k<j) {
                if(j<i)
                    min=k;
            }
        }

        // größten Wert finden
        if (i>j) {
            if (j > k) {
                max = i;
            } else if (i > k) {
                if (k > j)
                    max = i;
            }
        }
        else if (j>i) {
            if (i > k) {
                max = j;
            } else if (j > k) {
                if (k > i)
                    max = j;
            }
        }
        if (k>i) {
            if (i > j) {
                max = k;
            } else if (k > j) {
                if (j > i)
                    max = k;
            }
        }
        System.out.println("min="+min); // min ausgeben
        System.out.println("max="+max); // max ausgeben
    }
}