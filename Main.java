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
        int d = 5;
        int e = 5;
        if (d > e) {
            System.out.println("Первое больше");
        } else if (d < e) {
            System.out.println("Второе больше");
        } else {
            System.out.println("Равны");
        }

        System.out.println();

        // 3. Дано число. Выведите «Положительное», «Отрицательное» или «Равно нулю»
        int c = 0;
        if (c > 0) {
            System.out.println("Положительное");
        } else if (c < 0) {
            System.out.println("Отрицательное");
        } else if (c == 0) {
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
        int f = -1;
        System.out.println(f > 0 ? "Положительное" : f < 0 ? "Отрицательное" : "Нулевое");

        System.out.println();

        // 2. Дано число. С помощью тернарного оператора проверьте, делится ли оно на 3 и 5 одновременно. Выведите «Кратно» или «Не кратно»
        int g = 45;
        System.out.println(g % 3 == 0 && g % 5 == 0 ? "Кратно" : "Не кратно");

        System.out.println();

        // 3. Для заданного числа верните строку «Четное» или «Нечетное», используя тернарный оператор.
        int h = 8;
        System.out.println(h % 2 == 0 ? "Чётное" : "Нечётное");

        System.out.println();

        // switch
        // 1. Дано число от 1 до 7. Выведите название дня недели. Если число вне диапазона, выведите «Ошибка»
        int day = 8;
        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Ошибка");
        }

        System.out.println();

        // 2. Дано число от 1 до 5. Выведите описание оценки (оцените свою работу)
        int grade = 3;
        switch (grade) {
            case 1:
                System.out.println("Отвратительно!");
                break;
            case 2:
                System.out.println("Никуда не годится!");
                break;
            case 3:
                System.out.println("Ну, так себе..");
                break;
            case 4:
                System.out.println("Слушай, норм!");
                break;
            case 5:
                System.out.println("Крассавчег!!!");
                break;
            default:
                System.out.println("Неоценимо");
        }

        System.out.println();

        // for
        // 1. Дан список чисел. Посчитайте сумму всех четных элементов.
        int[] listOfNum = {10, 1, 8, 7, 5, 14, 97, 108, 8, 2, 1, 12};
        int sum = 0;
        for (int i = 0; i < listOfNum.length; i++) {
            if (listOfNum[i] % 2 == 0) {
                sum += listOfNum[i];
            }
        }
        System.out.println(sum);

        System.out.println();

        // 2. Дан список чисел. Найдите максимальное значение
        int[] listOfNum1 = {32, 12, 5, -1, 0, 7};
        int max = listOfNum1[0];
        for (int i = 1; i < listOfNum1.length; i++) {
            if (listOfNum1[i] > max) {
                max = listOfNum1[i];
            }
        }
        System.out.println("Максимальное значение: " + max);

        System.out.println();

        // 3. Дано число n. Выведите таблицу умножения для n от 1 до 10
        int n = 2;
        for (int i = 1; i <= 10; i++) {

            System.out.printf("%s * %s = %s", n, i, n * i);
            System.out.println();
        }

        System.out.println();

        // 4. С помощью цикла for выведите числа от 10 до 1 в обратном порядке
        for (int j = 10; j >= 1; j--) {
            System.out.println(j);
        }

        System.out.println();

        // 5. Найдите количество четных чисел в диапазоне от 1 до 50
        int quantity = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                quantity++;
            }
        }
        System.out.printf("Количество чётных чисел- %s.", quantity);

        System.out.println();

        // while
        // 1. Найдите наименьшее число больше 100, которое делится на 7
        int v = 101;
        while (v % 7 != 0) {
            v++;
        }
        System.out.println("Наименьшее число больше 100, которое делится на 7: " + v);

        System.out.println();

        // 2. Дано число n. Вычислите его факториал через цикл while
        int p = 20;
        long factorialP = 1L;
        int r = 1;
        while (r <= p) {
            factorialP *= r;
            r++;
        }
        System.out.println("Факториал числа " + p + " = " + factorialP);

        System.out.println();

        //3. Дано число. Определите, является ли оно простым
        int k = 10;
        boolean isPrime = true;
        if (k <= 1) {
            isPrime = false;
        } else {
            int i = 2;
            while (i <= Math.sqrt(k)) {
                if (k % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
        }
        if (isPrime) {
            System.out.println(k + " является простым числом.");
        } else {
            System.out.println(k + " не является простым числом.");
        }

        System.out.println();

        // 4. Придумайте задачу сами.
        /* Задан массив содержащий положительные и отрицательные числа.
           Написать программу выводящюю количество отрицательных, положительных и нулевых значений.
           В случае отсутствия значений писать об их отсутствии.
         */
        int[] numbers = {3, -1, 0, 5, -2, 0, 7, -3};
        int positive = 0;
        int negative = 0;
        int zero = 0;
        int i = 0;
        while (i < numbers.length) {
            if (numbers[i] > 0) {
                positive++;
            } else if (numbers[i] < 0) {
                negative++;
            } else {
                zero++;
            }
            i++;
        }
        if (positive > 0) {
            System.out.println("Положительных чисел: " + positive);
        } else {
            System.out.println("Положительные числа отсутствуют.");
        }
        if (negative > 0) {
            System.out.println("Отрицательных чисел: " + negative);
        } else {
            System.out.println("Отрицательные числа отсутствуют.");
        }
        if (zero > 0) {
            System.out.println("Нулей: " + zero);
        } else {
            System.out.println("Нули отсутствуют.");
        }

        System.out.println();

        // break & continue
        // 1. Выведите все числа от 1 до 20, кроме тех, что делятся на 3
        for (int l = 0; l <= 20; l++) {
            if (l % 3 == 0) {
                continue;
            }
            System.out.println(l);
        }

        System.out.println();

        // 2. Дан список чисел. Суммируйте элементы, пока не встретите отрицательное число
        int[] numberList2 = {10, 20, 30, 40, -5, 10, 20};
        int res = 0;
        for (int j = 0; j < numberList2.length; j++) {
                if (numberList2[j] < 0) {
                    break;
                }
                res += numberList2[j];
        }
        System.out.println("Сумма: " + res);

        System.out.println();

        // 3. Дан список чисел. Суммируйте элементы, пока сумма не превысит 100
        int[] numberList3 = {15, 20, 30, 40, 50, 60, 70};
        int res1 = 0;
        for (int m = 0; m < numberList3.length; m++) {
            res1 += numberList3[m];
                if (res1 > 100) {
                    break;
                }
        }
        System.out.println("Сумма: " + res1);
    }
}