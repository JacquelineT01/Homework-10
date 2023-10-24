// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Client Firstclient = new Client("Jackie", 3500.55, 990236);
        Client Secondclient = new Client("Tim", 1200.0, 489015);
        Client Thirdclient = new Client("Nancy", 5499.20, 598234);

        System.out.println(Firstclient.greet());
        System.out.println(Secondclient.greet());
        System.out.println(Thirdclient.greet());

        double diff1 = Firstclient.calculateDifference(200.0,50.0);
        double diff2 = Secondclient.calculateDifference(50.0, 5.0);
        double diff3 = Thirdclient.calculateDifference(150.0, 30.0);

        System.out.println("Difference Firstclient: " + diff1);
        System.out.println("Difference Secondclient: " + diff2);
        System.out.println("Difference Thirdclient: " + diff3);
      }

}
