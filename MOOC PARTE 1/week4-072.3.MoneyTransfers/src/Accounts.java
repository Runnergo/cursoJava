
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account matt = new Account("Matt's account", 100);
        Account juan = new Account("Juan", 0);
        Account pepe = new Account("pepe", 0);
        transfer(matt,juan,50);
        transfer(juan,pepe,25);

    }
    // transfereix un valor de un compte a un altre amb un return de //l’operació

    public static void transfer(Account accountOne, Account accountTwo, double quantity) {

        accountOne.withdrawal(quantity);
        accountTwo.deposit(quantity);
        accountOne.toString();

    }

}
