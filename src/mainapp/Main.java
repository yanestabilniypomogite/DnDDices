package mainapp;

import GameUtils.*;

public class Main {
    public static void main(String[] args) {
        boolean retry = true;
        int choice;
        while (retry) {
            System.out.println("Выберите кубик, который хотите кинуть:\n 1. Четырехгранный\n 2. Шестигранный\n 3. Восьмигранный\n 4. Двенадцатигранный\n 5. Десятигранный со значениями от 0 до 9 \n 6. Десятигранный со значениями от 00 до 90\n 7. Выход");
            choice = makeAChoice.inputCheck();
            if (choice > 0 & choice < 8) {
                if (choice == 1) {
                    System.out.println("Выпало значение: " + rollTheDice.fourFaces() + "\n");
                    choice = 0;
                } else if (choice == 2) {
                    System.out.println("Выпало значение: " + rollTheDice.sixFaces()+ "\n");
                    choice = 0;
                } else if (choice == 3) {
                    System.out.println("Выпало значение: " + rollTheDice.eightFaces()+ "\n");
                    choice = 0;
                } else if (choice == 4) {
                    System.out.println("Выпало значение: " + rollTheDice.twelveFaces()+ "\n");
                    choice = 0;
                } else if (choice == 5) {
                    System.out.println("Выпало значение: " + rollTheDice.smallTenFaces()+ "\n");
                    choice = 0;
                } else if (choice == 6) {
                    System.out.println("Выпало значение: " + rollTheDice.bigTenFaces()+ "\n");
                    choice = 0;
                } else if (choice == 7) {
                    retry = makeAChoice.exit();
                }
            }  else {
                System.out.println("Введите значение от 1 до 7!");
            }
        }
    }
}