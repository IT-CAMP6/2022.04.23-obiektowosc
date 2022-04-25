public class Main3 {
    public static void main(String[] args) {
        Client client1 = new Client();

        client1.age = 10;

        int jakasLiczba1 = 5;
        int jakasZupelnieInnaLiczba = 10;

        System.out.println(client1.calculate(jakasLiczba1, jakasZupelnieInnaLiczba));

        Client client2 = new Client();

        client2.age = 36;

        System.out.println(client2.calculate(jakasLiczba1, jakasZupelnieInnaLiczba));

        System.out.println(client1.calculateDaysByAge(6, 7));
        System.out.println(client2.calculateDaysByAge());

        client2.surname = "Kowalski";
        client2.napiszJakMaszNaNazwisko();

        client1.surname = "Malinowski";
        client1.napiszJakMaszNaNazwisko();

        client1.name = "Janusz";
        client2.name = "Mateusz";

        String zmienna = client1.whoYouAre();
        System.out.println(client2.whoYouAre());

        client1.getOlder();
        client2.getOlder();

        client1.zrobKilkaRzeczy();

        client2.zrobKilkaRzeczy();
        zrobKilkaRzeczy();

        Main2 main2 = new Main2();
        main2.zrobKilkaRzeczy();

        System.out.println("kasdjhfgkasjhsd");

        Address address = new Address();

        Client client3 = new Client();
        client3.name = "Zbyszek";
        client3.surname = "Kowalski";
        client3.age = 50;
        client3.pesel = 3546456;

        String nameFromDB = "Karol";
        String surnameFromDB = "Kowalski";

        Client client4 = new Client(nameFromDB, surnameFromDB, 34, 32453);

        System.out.println(client4.name);
        System.out.println(client4.surname);

        client4.address = new Address();
        client4.name = "Zbyszek";
    }

    public static void zrobKilkaRzeczy() {
        //kod
        //kod
    }
}
