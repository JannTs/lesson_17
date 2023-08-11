package HW18;

import java.util.Arrays;

public class Homework18 {
    public static void main(String[] args) {
        RubberArray ra = new RubberArray();


        ra.printArray(); // Вывести все значения в массиве в консоль
        System.out.println("Min " + ra.min()); //

        ra.add(10); //Добавление элемента
        ra.add(25);
        ra.add(-20);

        ra.printArray(); //Вывести все значения в массиве в консоль

        int reSize = ra.getSize();
        System.out.println("Сейчас в массиве " + reSize + " элементов");

        System.out.println("Сумма знаний элементов массива " + ra.sumOfValues());

        ra.add(7, 14, -21);

        ra.printArray();

        System.out.println("Min в массиве: " + ra.min());
        System.out.println("Max в массиве: " + ra.max());

        int[] newArray = ra.toArray();

        newArray[0] = 10_000;
        System.out.println(Arrays.toString(newArray));

        ra.printArray();

        ra.deleteByIndex(5);
        ra.printArray(); // Последнее зафиксированное значение массива
        // [10; 25; -20; 7; 14]
        System.out.println("* Поиск идекса по значению");
        System.out.println(ra.findIndexOfVal(-20)); //* Поиск элемента по значению возвр индекс 2
        //System.out.println(ra.getValByIndex(-1));
        System.out.println("* Поиск элемента по несуществующему индексу");
        System.out.println(ra.getValueByIndex(-1));
        System.out.println("Такого индекса не существует : Компилятор требует что-то  возвратить возвращаем пока MAX_VALUE;.");
        // Возможно, тут надо обрабатывать исключение :
        // или писать в лог, или возвращать какое-то значение по-умолчанию,
        // (в зависимости от "изящности" вызывающего приложения)
        System.out.println("* Поиск элемента по существующему индексу");
        System.out.println(ra.getValueByIndex(0));
        ra.printArray(); // Последнее зафиксированное значение массива
        // [10; 25; -20; 7; 14]
        ra.deleteValue(10);
        ra.printArray(); // Последнее зафиксированное значение массива (массив уменьшился в резмере)
        ra.replaceValueByIndex(1,-25);  //  замена
        ra.printArray(); // Последнее зафиксированное значение массива (было -20 - стало -25)

        ra.expandArray();
        ra.expandArray();
        ra.expandArray();
        ra.printArray(); // Последнее зафиксированное значение после увеличения трижды
//        System.out.println(ra.getValueByIndex(0));
//        ra.replaceValue(0, 5);
//        ra.printArray(); // Последнее зафиксированное значение



    }
}
/**
 * В резиновом массиве должны быть реализованы методы:
 *
 * Добавление элемента *
 * Вывести все значения в массиве в консоль *
 * Поиск элемента по значению *
 * Возвращение значения по индексу
 * Текущее количество элементов в массиве
 * Удаление элемента по индексу *
 * Добавление нескольких элементов (в качестве аргументов передает последовательность значений)
 * Конструктор, принимающий в себя обычный массив и создающий RubberArray с такими де значениями
 * Удаление элемента по значению
 * Замена значения по индексу (есть индекс и новое значение)
 * Замена значения по значению (есть старое и новое значение)
 */