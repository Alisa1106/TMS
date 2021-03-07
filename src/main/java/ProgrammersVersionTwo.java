public class ProgrammersVersionTwo {
    public static void main(String[] args) {
        int amountOfProgrammers = 214;
        if (amountOfProgrammers % 10 == 1 && amountOfProgrammers % 100 != 11) {
            System.out.println("Программист");
        } else if (amountOfProgrammers % 10 >= 2 && amountOfProgrammers % 10 <= 4
                && (amountOfProgrammers % 100 < 10 || amountOfProgrammers % 100 > 20)) {
            System.out.println("Программиста");
        } else {
            System.out.println("Программистов");
        }
    }
}
