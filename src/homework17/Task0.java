package homework17;
public class Task0 {
    public static void main(String[] args) {

            Phone phone1 = new Phone("243456767", "Google Pixel", 0.2);
            Phone phone2 = new Phone("787867676", "Motorola");
            Phone phone3 = new Phone();
            System.out.println("Телефон первый: ");
            phone1.receiveCall("Kateryna");
            System.out.println("Телефон второй: ");
            phone2.receiveCall("Evgenii", "243-456-767");
            System.out.println("Телефон третий: ");
            phone3.receiveCall("Ivan");

            System.out.println("Номер первого телефона: " + phone1.getNumber());
            System.out.println("Номер второго телефона: " + phone2.getNumber());
            System.out.println("Номер третьего телефона: " + phone3.getNumber());
            }

}

