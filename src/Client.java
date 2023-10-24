public class Client {
    String name;
    double accountBalance;
    int personalCode;

    public Client(String name, double accountBalance, int personalCode) {
        this.name = name;
        this.accountBalance = accountBalance;
        this.personalCode = personalCode;
    }
    public String greet(){
        return "Tere";
    }
    public double calculateDifference(double a, double b) {
        return a-b;
    }
}
