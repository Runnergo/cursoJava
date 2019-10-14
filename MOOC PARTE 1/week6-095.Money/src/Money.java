
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        int contEuros = euros + added.euros();
        int contCentimos = cents + added.cents();
        if (contCentimos > 100) {
            contEuros++;
            contCentimos -= 100;
        }
        Money suma = new Money(contEuros, contCentimos);
        return suma;
    }

    public boolean less(Money compared) {
        if ((euros < compared.euros) || (euros == compared.euros && cents < compared.cents)) {

            return true;

        }
        return false;
    }

    public Money minus(Money decremented) {
        int contEuros = euros - decremented.euros();
        int contCentimos = cents - decremented.cents();
        if (contCentimos<0){
            contEuros --;
            contCentimos +=100;
           
        }
        if (contEuros<0){
            contEuros =0;
            contCentimos=0;
        }
        Money resta= new Money(contEuros,contCentimos);
        return resta;
    }
    

}
