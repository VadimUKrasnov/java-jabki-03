public class Main {
    public static void main(String[] args) {

        /**
         * Условный оператор if-else
         */
        boolean isRain = true;

        System.out.println("Надеть куртку");
        System.out.println("Надеть обувь");
        System.out.println("Взять сумку");

        if (isRain) {
            System.out.println("Взять зонт");
        }

        Long a = 1000L;
        Long b = 1000L;

        System.out.println(a.equals(b));

        String animal = "dog1";
        if (animal.equals("cat")) {
            System.out.println("Мяу");
        } else if (animal.equals("dog")) {
            System.out.println("Гав");
        } else {
            System.out.println("Хрю");
        }
        int floor = 1;
        double price = 3000;

        if (floor == 1 && price < 3000) {
            System.out.println("Подходит для аренды!");
        }

        // Тенарный оператор
        System.out.println(a > 0 ? "a положительное число" : "а неполжительное число");

        /**
         * Условный оператор switch
         */

        switch (animal) {
            case "cat":
                System.out.println("Мяу");
                break;
            case "dog":
                System.out.println("Гав");
                break;
            case "fish":
                System.out.println("Буль");
                break;
            case "bear":
                System.out.println("rrrr");
                break;
            default:
                System.out.println("Привет!");
        }

        /**
         * Циклы
         */

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        int x = 0;
        while (x < 10) {
            System.out.println(x);
            x++;
        }

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                // Выход из цикла
                break;
            }
            System.out.println(i);
        }

        for (int i = 1; i < 10; i++) {

            // проверка на четность
            if (i % 2 != 0) {
                // пропуск итерации
                continue;
            }
            System.out.println(i);
        }

        System.out.println();

        /**
         * ДЗ-3
         */
        // if-else
        // 1. Дано число. Напишите программу, которая определяет, является ли оно четным или нечетным
        int anyNumber = 8;
        if (anyNumber % 2 == 0) {
            System.out.println("Число чётное");
        } else {
            System.out.println("Число не чётное");
        }

        System.out.println();

        // 2. Даны два числа. Выведите «Первое больше», «Второе больше» или «Равны»
        int num1 = 5;
        int num2 = 5;
        if (num1 > num2) {
            System.out.println("Первое больше");
        } else if (num1 < num2) {
            System.out.println("Второе больше");
        } else{
            System.out.println("Равны");
        }

        System.out.println();

        // 3. Дано число. Выведите «Положительное», «Отрицательное» или «Равно нулю»
        int number = 0;
        if (number > 0) {
            System.out.println("Положительное");
        } else if (number < 0) {
            System.out.println("Отрицательное");
        } else if (number == 0) {
            System.out.println("Равно нулю");
        }

        System.out.println();

        // 4. Дано число (возраст). Если возраст >= 18, выведите «Доступ разрешен», иначе — «Доступ запрещен
        int age = 18;
        if (age >= 18) {
            System.out.println("Доступ разрешен");
        } else {
            System.out.println("Доступ запрещён");
        }

        System.out.println();

        // 5. Придумать задачу самим
        double bodyTemperature = 36.6;
        if (bodyTemperature != 36.6) {
            System.out.println("Обратитесь к врачу!");
        } else {
            System.out.println("Здоров!");
        }

        System.out.println();

        // Тернарный оператор
        // 1. Дано число. Используя тернарный оператор, определите, положительное, отрицательное или нулевое
        int numb = -1;
        System.out.println(numb > 0 ? "Положительное" : numb < 0 ? "Отрицательное" : "Нулевое");

        System.out.println();

        // 2. Дано число. С помощью тернарного оператора проверьте, делится ли оно на 3 и 5 одновременно. Выведите «Кратно» или «Не кратно»


    }
}
