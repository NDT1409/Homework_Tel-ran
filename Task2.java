package home;

public class Task2 {

    public static void main(String[] args) {

//        Дано трехзначное число. Вывести на экран все цифры этого числа

//        e = n % 10;  операция n % 10   - вычисляет последнюю цифру числа n (то есть единицы
//        числа)  365 % 10 = 5
//
//        d = n / 10 % 10; операция n / 10 - сокращает число в 10 раз, то есть отбрасывает у числа
//        последнюю цифру (365 / 10 = 36),
//        теперь мы можем вычислить число десятков, применив к результату знакомую операцию - вычислить
//        остаток от деления на число 10, 36 % 10 = 6
//
//        s = n / 100;  чтобы получить сотни, достаточно у числа отбросить справа две цифры, то
//        есть дважды разделить на 10  (n / 10 /10 или тоже самое, что n / 100) 365 / 100 = 3


        int n = 365;
        int e = n % 10;
        int d = n / 10 % 10;
        int s = n / 100;

        System.out.println(e);
        System.out.println(d);
        System.out.println(s);

//        Коментарий: Я не уверен что понял суть задачи, но надеюсь что понял ее правильно.
    }

}
