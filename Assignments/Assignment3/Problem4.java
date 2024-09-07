package Assignments.Assignment3;
public class Problem4 {
    
    public static void main(String[] args) {
        double [] A1 = new double[25];
        double [] A2 = new double[25];
        double [] A3 = new double[25];

        int index = 0;

        while (index < A1.length) {
            A1[index] = index;
            A2[index] = index * index;
            A3[index] = (index * index) + index;

            index = index + 1;
        }

        for (int i = 1; i <= A1.length; i++) {
            System.err.println("for " + i + "; " + A1[i-1] + " + " + A2[i-1] + " = " + A3[i-1]);
        }
    }
}
