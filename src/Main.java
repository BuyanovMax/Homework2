public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }
    public static void task1 () {
        System.out.println("Задача 1");
        int salt = 3;
        byte sugar = 5;
        short coffee = 3;
        float tea = 2.75f;
        double wallet = 2;
        System.out.println("Значение переменной salt с типом int равно " + salt);
        System.out.println("Значение переменной sugar с типом byte равно " + sugar);
        System.out.println("Значение переменной coffee с типом short равно " + coffee);
        System.out.println("Значение переменной tea с типом float равно " + tea);
        System.out.println("Значение переменной wallet с типом double равно " + wallet);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int salt = 27897;
        byte sugar = 67;
        short coffee = -159;
        long tickets = 987678965549L;
        float tea = 27.12f;
        double wallet = 2.786;
        int rubles = 569;
        System.out.println(salt);
        System.out.println(sugar);
        System.out.println(coffee);
        System.out.println(tickets);
        System.out.println(tea);
        System.out.println(wallet);
        System.out.println(rubles);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        short LudmilaPavlovna = 23;
        short AnnaSergeevna = 27;
        short EkaterinaAndreevna = 30;
        int allSheet = 480;
        int allChildren = LudmilaPavlovna + AnnaSergeevna + EkaterinaAndreevna;
        int sheetPerChildren = allSheet/allChildren;
        System.out.println("На каждого ученика рассчитано " + sheetPerChildren + " листов бумаги");
    }
    public static void task4() {
        System.out.println("Задача 4");
        byte bottles = 16;
        byte minutes = 2;
        byte hour = 60;
        byte twentyMinutes = 20;
        int day = hour * 24;
        int threeDays = hour * 24 * 3;
        int month = hour * 24 * 30;
        int performance = bottles / minutes;
        System.out.println("За " + twentyMinutes + " минут  машина произвела " + performance * twentyMinutes + " штук бутылок");
        System.out.println("За " + day + " минут  машина произвела " + performance * day + " штук бутылок");
        System.out.println("За " + threeDays + " минут  машина произвела " + performance * threeDays + " штук бутылок");
        System.out.println("За " + month + " минут  машина произвела " + performance * month + " штук бутылок");

    }
    public static void task5() {
        System.out.println("Задача 5");
        byte allJar = 120;
        byte whiteJar = 2;
        byte brownJar = 4;
        int jarPerClass = whiteJar + brownJar;
        int numberOfClasses = allJar / jarPerClass;
        int allWhiteJar = numberOfClasses * whiteJar;
        int allBrownJar = numberOfClasses * brownJar;
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + allWhiteJar + " банок белой краски и " + allBrownJar + " банок коричневой краски");
    }
    public static void task6() {
        System.out.println("Задача 6");
        byte bananas = 5;
        short weightBananas = 80;
        short milk = 2;
        short weightMilk = 105;
        byte iceCream = 2;
        short weightIceCream = 100;
        byte eggs = 4;
        short weightEggs = 70;
        int allWeight = bananas * weightBananas + milk * weightMilk + iceCream * weightIceCream + eggs * weightEggs;
        System.out.println("Общий вес спортзавтрака " + allWeight + " граммов");
        double allWeightKilo = allWeight / 1000D;
        System.out.println("Общий вес спортзавтрака " + allWeightKilo + " килограмма");

    }
    public static void task7() {
        System.out.println("Задача 7");
        byte needToLoseWeight = 7;
        int needToLoseWeightGram = needToLoseWeight * 1000;
        short losesPerDay1 = 250;
        short losesPerDay2 = 500;
        double losesPerDayAverage = (losesPerDay1 + losesPerDay2) / 2D;
        double minDays = (double) needToLoseWeightGram / losesPerDay2;
        double maxDays = (double) needToLoseWeightGram / losesPerDay1;
        System.out.println(minDays + " дней , чтобы добиться результата похудения. ");
        System.out.println(maxDays + " дней , чтобы добиться результата похудения. ");
        System.out.println(needToLoseWeightGram / losesPerDayAverage + " дней в среднем, чтобы добиться результата похудения. ");

    }
    public static void task8() {
        System.out.println("Задача 8");
        int masha = 67760;
        int denis = 83690;
        int cristina = 76230;
        double salaryIncreaseAYearMasha =(int) (masha * 1.1 * 12);
        double salaryIncreaseAYearDenis = (int) (denis * 1.1 * 12);
        double salaryIncreaseAYearCristina = (int) (cristina * 1.1 * 12);
        double salaryAYearMasha = masha * 12;
        double salaryAYearDenis = denis * 12;
        double salaryAYearCristina = cristina * 12;
        double differenceMasha = salaryIncreaseAYearMasha - salaryAYearMasha;
        double differenceDenis = salaryIncreaseAYearDenis - salaryAYearDenis;
        double differenceCristina = salaryIncreaseAYearCristina - salaryAYearCristina;
        System.out.println("Маша теперь получает " + salaryIncreaseAYearMasha + " рублей. Годовой доход вырос на " + differenceMasha + " рублей");
        System.out.println("Денис теперь получает " + salaryIncreaseAYearDenis + " рублей. Годовой доход вырос на " + differenceDenis + " рублей");
        System.out.println("Кристина теперь получает " + salaryIncreaseAYearCristina + " рублей. Годовой доход вырос на " + differenceCristina + " рублей");

    }
}
