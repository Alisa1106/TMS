public class Number {
    public static void main(String[] args){
        int number = -109;
        if (number >= 0) {
            if (number < 10) {
                System.out.println ("Это однозначное положительное число");
            } else if (number >= 10 && number < 100) {
                System.out.println ("Это двухзначное положительное число");
            } else if (number >= 100) {
                System.out.println ("Это число положительное и состоит из трёх или более цифр");
            }
        } else {
            if (number > -10) {
                System.out.println("Это однозначное отрицательное число");
            } else if (number <= -10 && number > -100) {
                System.out.println("Это двухзначное отрицательное число");
            } else if (number <= -100) {
                System.out.println("Это число отрицательное и состоит из трёх или более цифр");
            }
        }
    }
}