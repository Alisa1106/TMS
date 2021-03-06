public class Programmers {
    public static void main(String[] args) {
        int amountOfProgrammers = 301;
        switch (amountOfProgrammers) {
            case 2: case 3: case 4:
                System.out.println("Программиста");
                break;
            default:
                if (amountOfProgrammers % 10 == 1){
                    System.out.println("Программист");
                } else {
                    System.out.println("Программистов");
                }
                break;
        }
    }
}
