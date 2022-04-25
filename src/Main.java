public class Main {
    public static void main(String[] args) {
        String a = "Mateusz";
        String b = "Janusz";

        Client c1 = new Client();
        c1.name = "Mateusz";
        c1.surname = "Bereda";
        c1.age = 31;
        c1.pesel = 252345345;

        Client c2 = new Client();
        c2.name = "Janusz";
        c2.surname = "Kowalski";
        c2.age = 40;
        c2.pesel = 3456345;

        Client[] tab = new Client[10];

        int[] tab2 = new int[10];

        System.out.println(c2.name);
        System.out.println(c2.surname);
        System.out.println(c2.age);
        System.out.println(c2.pesel);

        Client c3 = new Client();
        c3.name = "Karol";
        c3.surname = "Krawczyk";
        c3.age = 50;
        c3.pesel = 3453445;

        Client c4 = c3;

        System.out.println(c3.name);
        System.out.println(c4.name);

        c3.name = "Pawel";

        System.out.println(c3.name);
        System.out.println(c4.name);

        int c = 5;
        String s = "Mateusz";

        int i1 = 5;
        int i2 = 5;

        System.out.println(i1 == i2);

        Client client1 = new Client();
        client1.name = "Mateusz";
        client1.surname = "Bereda";
        client1.age = 30;
        client1.pesel = 1234;

        Client client2 = new Client();
        client2.name = "Mateusz";
        client2.surname = "Bereda";
        client2.age = 30;
        client2.pesel = 1234;

        System.out.println(client1 == client2);

        System.out.println(c3 == c4);

        System.out.println(i1);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(client1);
        System.out.println(client2);

        int[] tab3 = new int[10];

        int i = tab3[5];

        Client[] clients = new Client[10];

        clients[0] = new Client();
        clients[0] = new Client();

        /*Client clientFromArray = clients[6];

        System.out.println(clientFromArray.name);*/

        System.out.println(clients[0]);
        System.out.println(clients[1]);
        System.out.println(clients[2]);

        System.out.println(clients[1] == null);

        String s1 = null;

        System.out.println(s1);
    }
}
