package GameUtils;

import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class makeAChoice {

    //Проверка числа при вводе
    public static int inputCheck() {
        Scanner in = new Scanner(System.in);
        int num;
            try {
                num = parseInt(in.nextLine().replaceAll(" ", ""));
            } catch (Exception e) {
                System.out.println("Некорректные данные. На ввод разрешены только цифры!");
                num = 0;
            }
        return num;
    }

    //Завершения программы
    public static boolean exit () {
        System.out.println("До свидания!");
        return false;
    }
}