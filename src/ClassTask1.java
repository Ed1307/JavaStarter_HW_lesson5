import java.util.Scanner;

public class ClassTask1 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if ((number&(number-1))==0){
            System.out.println("Является степенью двойки");
        }
        else {
            System.out.println("Не является степенью двойки");
    }}}