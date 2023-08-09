package homework17;

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
        System.out.println(name + ": я прыгаю на высоту " + height + " см!");
    }

    public void training() {
        if (currJumpHeight < maxJumpHeight) {
            currJumpHeight += 10;
            System.out.println(name + ": я тренируюсь и теперь могу прыгать на высоту " + currJumpHeight + " см!");
        } else {
            System.out.println(name + ": я уже достиг максимальной возможной высоты прыжка!");
        }
    }

    public boolean getBarrier(int barrierHeight){ // 100, 200, 150
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

       // System.out.println("End get barrier. Текущий прыжок " + currJumpHeight);
    }


}
