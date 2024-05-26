import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------");
        System.out.println("Task 1");
        int totalMoney = 0;
        int oneMonthMoney = 15000;
        int scoreMoney = 2459000;
        int month = 0;
        while (totalMoney <= scoreMoney) {
            month++;
            totalMoney += oneMonthMoney;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalMoney + " рублей");
        }
        System.out.println("---------------------");

        System.out.println("Task 2");
        int one = 1;
        while (one <= 10) {
            System.out.print(one++ + " ");
        }
        System.out.println();
        for (int two = 10; two >= 1; two--) {
            System.out.print(two + " ");
        }
        System.out.println("\n---------------------");

        System.out.println("Task 3");
        int peopleCountyY = 12_000_000;
        int birthRate = peopleCountyY / 1000 * 17;
        int deathRate = peopleCountyY / 1000 * 8;
        int year = 1;
        while (year <= 10){
            peopleCountyY += birthRate - deathRate;
            System.out.println("Год " + year++ + ", численность населения состовляет " + peopleCountyY + " человек");
        }
        System.out.println("---------------------");

        System.out.println("Task 4");
        float percentBank = 0.07f;
        float depositBank = 15000;
        int monthBank = 1;
        int scoreBank = 12_000_000;
        while (depositBank <= scoreBank) {
            depositBank = depositBank + depositBank * percentBank;
            System.out.println("Месяц " + monthBank++ + ", сумма накоплений равна " + (int)depositBank + " рублей");
        }
        System.out.println("---------------------");

        System.out.println("Task 5");
        depositBank = 15000;
        monthBank = 1;
        while (depositBank <= scoreBank) {
            depositBank = depositBank + depositBank * percentBank;
            if (monthBank % 6 == 0) {
                System.out.println("Месяц " + monthBank + ", сумма накоплений равна " + (int) depositBank + " рублей");
            }
            monthBank++;
        }
        System.out.println("---------------------");

        System.out.println("Task 6");
        depositBank = 15000;
        int yearVasiliyBank = 9;
        int monthVasiliyBank = yearVasiliyBank * 12;
        int mothDepositBank = 1;
        while (mothDepositBank <= monthVasiliyBank) {
            depositBank = depositBank + depositBank * percentBank;
            if (mothDepositBank % 6 == 0) {
                System.out.println("Месяц " + mothDepositBank + ", сумма накоплений равна " + (int) depositBank + " рублей");
            }
            mothDepositBank++;
        }
        System.out.println("---------------------");

        System.out.println("Task 7");
        int dayMonth = 31;
        int oneFridayMonth = 5;
        for (int i = oneFridayMonth; i <= dayMonth; i += 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
        }
        System.out.println("---------------------");

        System.out.println("Task 8");
        int period = 79;
        int currentYear = 2024;
        int lowerBorder = currentYear - 200;
        int upperBorder = currentYear + 100;
        for (int i = 0; i < upperBorder; i+= period) {
            if (i > lowerBorder) {
                System.out.println(i);
            }
        }
    }
}