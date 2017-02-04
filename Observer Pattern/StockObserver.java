/**
 * Created by jcala on 03/02/2017.
 */
public class StockObserver implements Observer{

    private double aaplPrice = 0;
    private double googPrice = 0;
    private double IBMPrice = 0;

    private static int ID = 0;
    private int uniqID = 0;

    private Subject sujeto;

    public StockObserver(Subject s){
        uniqID = ++ID;
        sujeto = s;
        sujeto.addObserver(this);
        System.out.println("Creado Obsevador "+uniqID);
    }

    @Override
    public void update(double aaplPrice, double IBMPrice, double googPrice) {
        this.aaplPrice = aaplPrice;
        this.googPrice = googPrice;
        this.IBMPrice = IBMPrice;
        printPrices();
    }
    private void printPrices(){
        System.out.println(uniqID+"\nApple "+aaplPrice+" \nGoogle "+googPrice+" \nIBM "+IBMPrice);
    }
}
