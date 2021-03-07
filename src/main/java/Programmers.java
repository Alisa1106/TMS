public class Programmers {
    public static void main(String[] args) {
        int amountOfProgrammers = 181;
        int caseNumber = 0;
        if (amountOfProgrammers % 10 == 1 & amountOfProgrammers % 100 != 11) {
            caseNumber = 1;
        } else if (amountOfProgrammers % 10 >= 2 & amountOfProgrammers % 10 <= 4
                & (amountOfProgrammers % 100 < 10 | amountOfProgrammers % 100 > 20)) {
            caseNumber = 2;
        }
        switch (caseNumber) {
            case 1:
                System.out.println("Программист");
                break;
            case 2:
                System.out.println("Программиста");
                break;
            default:
                System.out.println("Программистов");
                break;
        }
    }
}
