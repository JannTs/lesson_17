package homework17;
/**
 * Создайте класс Phone, который содержит поля number, model и weight.
 * Создайте три экземпляра этого класса. Выведите на консоль значения их полей.
 * Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
 * Выводит на консоль сообщение “Звонит {name}”.
 * Метод getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
 * Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации полей класса
 * - number, model и weight.
 * Добавить конструктор, который принимает на вход два параметра для инициализации полей класса - number, model.
 * Добавить конструктор без параметров.
 * Вызвать из конструктора с тремя параметрами конструктор с двумя.
 * Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего
 * и номер телефона звонящего.
 * Вызвать этот метод.
 */

public class Phone {
    String number;
    String model;
    double weight;
    Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    Phone() {
        this("", "");
    }
    Phone(String number, String model) {
        this(number, model, 0.0); // Вызвать из конструктора с тремя параметрами конструктор с двумя (?)
    }
    void receiveCall(String callerName) {
        System.out.println("Caller " + callerName);
    }
    void receiveCall(String callerName, String callerID) {
        System.out.println("Call " + callerName + " from number " + callerID);
    }
    String getNumber() {
        return number;
    }
}
