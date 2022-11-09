package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int count = cathetusLength;
        for (int i = 0; i < cathetusLength; i++) {
            int len = cathetusLength + i;
            for (int j = 0; j < len; j++) {
                if (j < cathetusLength - 1 - i) {
                    System.out.print(" ");
                } else {
                    System.out.print(count);
                }
                if (j < cathetusLength - 1) count--;
                else count++;
            }
            System.out.println();
            count = cathetusLength;
        }
    }


    public static void main(String[] args) {
        new Pyramid().printPyramid(3);
    }
}
