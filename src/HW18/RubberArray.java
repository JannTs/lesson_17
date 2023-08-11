package HW18;

import java.util.Arrays;

public class RubberArray {

    int[] array;

    public RubberArray() { // конструктор
        this.array = new int[0];
    }

    public void add(int value) { //добавление 1 элемента
        expandArray();
        array[array.length - 1] = value;
    }

    public void add(int... ints) { // принимает произвольное количество аргументов типа int
        for (int value : ints) {
            add(value);
        }
    }


    public void expandArray() { // расширение массива на 1 ячейку
        array = Arrays.copyOf(array, array.length + 1);
    }

    public void printArray() { // вывести в консоль массив
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print("; ");
            }
        }
        System.out.println("]");
        System.out.println();
    }

    public int getSize() { // количество элементов в массиве
        return array.length;
    }

    public int sumOfValues() { //сумма значений в массиве
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    public int min() { // возвращаем мин значение из массива
        if (array.length == 0) return Integer.MIN_VALUE;

        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public int max() { // возвращаем максимальное значение из массива
        if (array.length == 0) return Integer.MAX_VALUE;

        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public int[] toArray() { // нужно создать КОПИЮ нашего массива и ее вернуть
        int[] result = new int[array.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = array[i];
        }

        return result;
        // return Arrays.copyOf(array, array.length);
    }

    public void deleteByIndex(int index) {
        if (array.length >= 1 && index >=0 && index < array.length) {

            int[] result = new int[array.length - 1];

            for (int i = 0; i < result.length; i++) {

                if (i < index) {
                    result[i] = array[i];
                } else { // if (i >= index) {
                    result[i] = array[i + 1];
                }
            }
//            System.out.println("Result " + Arrays.toString(result));
            array = result;
        }
    }

    /**
     * В резиновом массиве должны быть реализованы методы:
     *
     * Добавление элемента *
     * Вывести все значения в массиве в консоль *
     * Поиск элемента по значению
     * Возвращение значения по индексу
     * Текущее количество элементов в массиве
     * Удаление элемента по индексу
     * Добавление нескольких элементов (в качестве аргументов передает последовательность значений)
     * Конструктор, принимающий в себя обычный массив и создающий RubberArray с такими де значениями
     * Удаление элемента по значению
     * Замена значения по индексу (есть индекс и новое значение)
     * Замена значения по значению (есть старое и новое значение)
     */

    public int findIndexOfVal(int value) { // Поиск индекса по значению
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1; // Такого значения  нет в массиве  ту ду  расш. из перечня...
    }

    public int getValueByIndex(int index) { // Возвращение значения по индексу
            if (index >= 0 && index < array.length) {
                return array[index];
            } else {
                return Integer.MAX_VALUE;  // Компилятор требует возвратить возвращаем пока MAX_VALUE;
            }
        }
    public void deleteValue(int value) { // Удаление элемента по значению
        int index = findIndexOfVal(value);
        if (index != -1) {
            deleteByIndex(index);
        }
    }
    public void replaceValueByIndex(int index, int newValue) { // Замена значения по индексу
        if (index >= 0 && index < array.length) {
            array[index] = newValue;
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }
  /*  public void replaceValue(int oldVal, int newVal) { // Замена значения на другое
        int index = getValueByIndex(oldVal);
        if (index != -1) {
            array[index] = newVal;
        }
    }
*/

    }


