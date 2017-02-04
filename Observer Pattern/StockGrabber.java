import java.util.ArrayList;

/**
 * Created by jcala on 02/02/2017.
 */
public class StockGrabber implements Subject{

    private ArrayList<Observer> observers;
    private double googPrice;
    private double aaplPrice;
    private double IBMPrice;



    public StockGrabber(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void removeObserver(Observer o) {
        int pos = observers.indexOf(o);
        System.out.println("Observador Eliminado");
        observers.remove(pos);
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
        System.out.println("Observador Añadido");
    }

    @Override
    public void notifyObserver(){
        for(Observer observer: observers){
            observer.update(aaplPrice,IBMPrice,googPrice);
        }
    }

    public void setGoogPrice(double googPrice) {
        this.googPrice = googPrice;
        notifyObserver();
    }

    public void setAaplPrice(double aaplPrice) {
        this.aaplPrice = aaplPrice;
        notifyObserver();
    }

    public void setIBMPrice(double IBMPrice) {
        this.IBMPrice = IBMPrice;
        notifyObserver();
    }
}
