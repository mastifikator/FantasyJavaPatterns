package Strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.Buffer;

public class Main {
    public static void main(String[] args){
        NightElfBase nightElfBase = new NightElfBase("Лесная Чаща", 3000);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Укажите кто хочет напасть на базу?");
        System.out.println("1 - Орки");
        System.out.println("2 - Люди");
        System.out.println("3 - Нежить");

        int choice = 0;
        boolean next = false;

        while (!next) {
            try {
                choice = Integer.parseInt(reader.readLine());
                next = true;
            } catch (Exception e) {
                next = false;
                System.out.println("Введите цифру от 1 до 3");
            }
        }

        nightElfBase.enemyDetected(choice);

    }
}
