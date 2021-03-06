public class ProgrammersVersionTwo {
    public static void main(String[] args) {
        int amountOfProgrammers = 1;
        if (amountOfProgrammers % 10 == 1) {
            System.out.println("Программист");
        } else if (amountOfProgrammers > 1 & amountOfProgrammers < 5){
            System.out.println("Программиста");
        } else {
            System.out.println("Программистов");
        }
    }
}
