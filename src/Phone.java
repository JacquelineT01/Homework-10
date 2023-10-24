public class Phone {
    String number;
    String model;
    double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public void  displayPhoneModel () {
        System.out.println("Phone Model:" + model);
    }

    public void call (String phoneNumber) {
        System.out.println("Call to" + phoneNumber);
    }
}
