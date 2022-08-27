package com.company;

public class Main {

    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int camera = 5;
        byte notebook = 2;
        short smartphone = 8;
        long book = 1000_000_025L;
        float lengthSofa = 2.6f;
        double lengthCable = 5.9;
        System.out.println(camera + ", " + notebook + ", " + smartphone + ", " + book + ", " + lengthSofa + ", " + lengthCable);
        System.out.println();

        // Задача 2
        byte by = 67;
        short s = 569;
        int i = -159;
        long l = 987_678_965_549L;
        boolean b = false;
        float f = 27.12f;
        double d = 2.786;
        var v = 27897;

        // Задача 3
        System.out.println("Задача 3");
        int teacher1 = 23;
        int teacher2 = 27;
        int teacher3 = 30;
        int paper = 480;
        System.out.println("На каждого ученика рассчитано " + paper / (teacher1 + teacher2 + teacher3) + " листов бумаги");
        System.out.println();

        // Задача 4
        System.out.println("Задача 4");

        // Задача 5
        System.out.println("Задача 5");

        // Задача 6
        System.out.println("Задача 6");
        int banana = 5 * 80;
        int milk = 2 * 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        int totalWeight = banana + milk + iceCream + eggs;
        System.out.println("Общий вес в граммах: " + totalWeight + "грамм");
        System.out.println("Общий вес в кг: " + totalWeight / 1000 + " кг " + totalWeight % 1000 + " грамм");
        System.out.println();

        // Задача 7
        System.out.println("Задача 7");
        int kgWeight = 1000;
        int overWeight = 7 * kgWeight;
        int firstWeight = 250;
        int secondWeight = 500;
        int variant250 = overWeight / firstWeight;
        int variant500 = overWeight / secondWeight;
        System.out.println("На похудение по " + firstWeight + " грамм уйдёт " + variant250 + " дней");
        System.out.println("На похудение по " + secondWeight + " грамм уйдёт " + variant500 + " дней");
        System.out.println("В среднем понадобиться дней для похудения: " + (variant500 + variant250) / 2);
        System.out.println();

        // Задача 8
        System.out.println("Задача 8");
        int salaryMashaMonth = 67_760;
        int salaryDenisMonth = 83_690;
        int salaryKristinaMonth = 76_230;

        int newSalaryMashaMonth = (int) (salaryMashaMonth * 0.1 + salaryMashaMonth);
        int newSalaryDenisMonth = (int) (salaryDenisMonth * 0.1 + salaryDenisMonth);
        int newSalaryKristinaMonth = (int) (salaryKristinaMonth * 0.1 + salaryKristinaMonth);

        int incomeGrowthMashaYear = newSalaryMashaMonth * 12 - salaryMashaMonth * 12;
        int incomeGrowthDenisYear = newSalaryDenisMonth * 12 - salaryDenisMonth * 12;
        int incomeGrowthKristinaYear = newSalaryKristinaMonth * 12 - salaryKristinaMonth * 12;

        System.out.println("Маша теперь получает " + newSalaryMashaMonth + " рублей. Годовой доход вырос на " + incomeGrowthMashaYear + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenisMonth + " рублей. Годовой доход вырос на " + incomeGrowthDenisYear + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristinaMonth + " рублей. Годовой доход вырос на " + incomeGrowthKristinaYear + " рублей");
    }
}
