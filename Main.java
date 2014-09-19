package org.rupps;

public class Main {

    public static final String MESSAGE = "Your ticket #%s is ";

    public static void main(String[] args) {
        String ticketNumber = "010001"; // номер билета
        int part1 = 0, part2 = 0;
        // первая половина
        for (int i = 0; i < 3; i++) {
            part1 += Character.getNumericValue(ticketNumber.charAt(i));
        }
        // вторая половина
        for (int i = 3; i < 6; i++) {
            part2 += Character.getNumericValue(ticketNumber.charAt(i));
        }

        // если сумма цифр первой половины равна сумме цифр второй, билет счастливый
        if (part1 == part2) {
            System.out.print(MESSAGE.replaceFirst("%s", ticketNumber) + "lucky");
        } else {
            System.out.print(MESSAGE.replaceFirst("%s", ticketNumber) + "not lucky");
        }
    }
}
