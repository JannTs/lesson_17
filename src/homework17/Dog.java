package homework17;
/**
 * Task 1 Повторить код класса Dog, написанного на уроке.
 * Создать массив из 10 препятствий. Попросить объект класса собака
 * перепрыгнуть все препятствия в массиве.
 *
 * Опционально Посчитать сколько препятствий из массива собака смогла преодолеть.
 */
public class Dog {
    String name;
    int initJumpHeight;
    int currJumpHeight;
    int maxJumpHeight;

    public Dog(String name, int initJumpHeight) {
        this.name = name;
        this.initJumpHeight = initJumpHeight;
        this.maxJumpHeight = initJumpHeight * 2;
        this.currJumpHeight = initJumpHeight;
    }

    void whoAmI() {
        System.out.println("Я собака " + name + ", и я умею прыгать на " + initJumpHeight + " см");
    }
    public void jump() {
        System.out.println(name + ": я прыгаю на высоту " + currJumpHeight + " см!");
    }
    public void jump(int height) {
        System.out.println(name + ": я могу прыгать только на высоту " + height + " см!");
    }

    public void training() {
        if (currJumpHeight < maxJumpHeight) {
            currJumpHeight += 10;
            System.out.println(name + ": я тренируюсь и теперь могу прыгать на высоту " + currJumpHeight + " см!");
        } else {
            System.out.println(name + ": я уже достиг максимальной возможной высоты прыжка!");
        }
    }

    public boolean getBarrier(int barrierHeight){ // {60, 70, 70, 80, 90, 50, 90, 100, 110};
        if (barrierHeight <= maxJumpHeight && currJumpHeight < barrierHeight) {
            while (currJumpHeight < barrierHeight){
                training();
            }
        }

        if (currJumpHeight >= barrierHeight) {
            jump(barrierHeight);
            System.out.println( name +": Я \'взял\' барьер высотой: " + barrierHeight);
            return true;
        } else {
            System.out.println( name +": Я не могу перепрыгнуть барьер высотой: " + barrierHeight);
            return false;

        }
    }
}
