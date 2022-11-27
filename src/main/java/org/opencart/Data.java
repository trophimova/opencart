package org.opencart;

import java.util.Random;

public class Data {

    public static String getRandomEmail() {
        String simbols = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder mail = new StringBuilder();
        Random rnd = new Random();
        while (mail.length() < 5) {
            int index = (int) (rnd.nextFloat() * simbols.length());
            mail.append(simbols.charAt(index));
        }
        String mailStr = mail.toString();

        return mailStr + "@mail.ru";
    }

    public static String getRandomPassword() {
        String simbols = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890~`!@#$%^&*()-_=+[{]}|;:'<.>/?";
        StringBuilder password = new StringBuilder();
        Random rnd = new Random();
        while (password.length() < 8) {
            int index = (int) (rnd.nextFloat() * simbols.length());
            password.append(simbols.charAt(index));
        }
        String passwordStr = password.toString();

        return passwordStr;
    }

    public static String getRandomTelephone() {
        String simbols = "1234567890";
        StringBuilder telephone = new StringBuilder();
        Random rnd = new Random();
        while (telephone.length() < 10) {
            int index = (int) (rnd.nextFloat() * simbols.length());
            telephone.append(simbols.charAt(index));
        }
        String telephoneStr = telephone.toString();

        return "+7" + telephoneStr;
    }

    public static String firstname = "Тимофей";
    public static String lastname = "Скорик";

    public static String password = getRandomPassword();

    public static String url = "https://learn-qa.ru/index.php?route=common/home";
    public static String successRegMessage = "Ваша учетная запись создана!";

}
