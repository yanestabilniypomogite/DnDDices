package GameUtils;

import java.util.Random;

public class rollTheDice {

    public static Random random = new Random();

    //Бросок четырехгранного кубика
    public static byte fourFaces () {
        return (byte)(random.nextInt(4) + 1);
    }

    //Бросок шестигранного кубика
    public static byte sixFaces () {
        return (byte)(random.nextInt(6) + 1);
    }

    //Бросок восьмигранного кубика
    public static byte eightFaces () {
        return (byte)(random.nextInt(8) + 1);
    }

    //Бросок двенадцатигранного кубика
    public static byte twelveFaces () {
        return (byte)(random.nextInt(12) + 1);
    }

    //Бросок десятигранного кубика со значениями от 0 до 9
    public static byte smallTenFaces () {
        return (byte)(random.nextInt(10));
    }

    //Бросок десятигранного кубика со значениями от 00 до 90
    public static byte bigTenFaces () {
            return (byte)(random.nextInt(10) * 10);
    }
}