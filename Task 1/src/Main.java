public class Main {
    public static void main(String[] args) {
        Phone nokia = new Phone("+7(916)-147-02-04","nokia",0.337);
        nokia.receiveCall("Андрей");

        Phone samsung = new Phone("+7(977)630-04-24","samsung",0.437);

        Phone.creatorCountry = "Страна: Китай";

        System.out.println(nokia.creatorCountry);
        System.out.println(samsung.creatorCountry);

    }
}
