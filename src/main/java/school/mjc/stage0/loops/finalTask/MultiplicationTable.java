package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint) {
        for (int i = 1; i < 11; i++) {
            int result = i * numberTableToPrint;
            String a = String.format("%d x %d = %d",i,numberTableToPrint,result);
            System.out.println(a);
        }
    }
}

