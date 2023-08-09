package homework17;

/**
 * Task 1 Повторить код класса Dog, написанного на уроке.
 * Создать массив из 10 препятствий. Попросить объект класса собака
 * перепрыгнуть все препятствия в массиве.

 * Опционально Посчитать сколько препятствий из массива собака смогла преодолеть.
 */
public class Task1 {
       public static void main(String[] args) {
        int successBarrierCounter = 0;
        Dog dog1 = new Dog("Джек", 40);
        dog1.whoAmI();
        dog1.jump();  // Прыжок на первоначальную высоту (40 см)

       System.out.println("++++++++++++++++++ Now barriers ");


       int[] barriers = {60, 70, 70, 80, 90, 50, 90, 100, 110};
       for (int barrier : barriers) {
            if (dog1.getBarrier(barrier)) {
                successBarrierCounter++;
            }
        }
       System.out.println("++++++++++++++++++ Success jump through barrier counter");
       System.out.println("Удачно преодолено " + successBarrierCounter + " барьеров.");
    }
}

