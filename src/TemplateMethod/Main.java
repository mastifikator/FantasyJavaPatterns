package TemplateMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ScoutAction scoutAction = null;

        System.out.println("Укажите расу вашего разведчика?");
        System.out.println("1 - Орк");
        System.out.println("2 - Человек");
        System.out.println("3 - Ночной эльф");

        int choice = 0;

        while (choice <= 0 || choice > 3) {
            try {
                System.out.println("Введите цифру от 1 до 3");
                choice = Integer.parseInt(reader.readLine());
            } catch (Exception e) {
            }
        }

        System.out.println("Выберите имя персонажа");
        String name = "";
        try {
            name = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        switch (choice) {
            case (1): scoutAction = new OrcScout(name); break;
            case (2): scoutAction = new HumanScout(name); break;
            case (3): scoutAction = new NightElfScout(name); break;
        }

        scoutAction.goScouting();

    }
}
