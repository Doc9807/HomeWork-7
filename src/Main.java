public class Main {
    public static void main(String[] args) {
        System.out.println("\nTask 1");
        double money = 0;
        int month = 1;
        while (money <= 2_459_000) {
            money = ((money * 1.01) + 15000);
            System.out.printf("«Месяц %s, сумма накоплений равна %.2f рублей».%n", month, money);
            month++;
        }

        System.out.println("\nTask 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\nTask 3");
        int peopleAmount = 12_000_000;
        int increase;
        int decrease;
        for (int j = 1; j <= 10; j++) {
            increase = peopleAmount / 1000 * 17;
            decrease = peopleAmount / 1000 * 8;
            peopleAmount = peopleAmount + increase - decrease;
            System.out.printf("«Год %s, численность населения составляет %s».%n", j, peopleAmount);
        }

        System.out.println("\nTask 4");
        double vasyaMoney = 15000;
        System.out.printf("«Месяц 1, Вася накопил %.2f»%n",vasyaMoney);
        for (int r = 2; vasyaMoney <= 12_000_000; r++) {
            vasyaMoney *= 1.07;
            System.out.printf("«Месяц %s, Вася накопил %.2f»%n", r, vasyaMoney);
        }

        System.out.println("\nTask 5");
        double vasyaFifeTaskMoney = 15000;
        for (i = 1; vasyaFifeTaskMoney < 12_000_000; i++) {
            vasyaFifeTaskMoney *= 1.07;
            if (i % 6 == 0) {
                System.out.printf("«Месяц %s, Вася накопил %.2f»%n", i, vasyaFifeTaskMoney);
            }
        }

        System.out.println("\nTask 6");
        double vasyaSixTaskMoney = 15000;
        int nineYearsMonths = 9 * 12;
        for (i = 1; i <= nineYearsMonths; i++) {
            vasyaSixTaskMoney *= 1.07;
            if (i % 6 == 0) {
                System.out.printf("«Месяц %s, Вася накопил %.2f»%n", i, vasyaSixTaskMoney);
            }
        }

        System.out.println("\nTask 7");
        int firstFriday = 3;
        for (int g = firstFriday; g <= 31; g += 7) {
            System.out.printf("«Сегодня пятница, %s-е число. Необходимо подготовить отчет».%n", g);
        }

        System.out.println("\nTask 8");
        int currentYear = 2024;
        int begin = currentYear - 200;
        int end = currentYear + 100;

        for (int h = 0; h < end; h+= 79) {
            if (h >= begin) {
                System.out.println(h);
            }
        }
    }
}
