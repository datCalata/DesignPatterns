/**
 * Created by jcala on 03/02/2017.
 */
public class Grabstocks {

    public static void main(String[] args){
        //Creamos el Sujeto
        StockGrabber stockGrabber = new StockGrabber();
        //Creamos un observador
        StockObserver observer1 = new StockObserver(stockGrabber);
        stockGrabber.setAaplPrice(500.5);
        stockGrabber.setGoogPrice(500.5);
        stockGrabber.setIBMPrice(500.5);
        //Deberia imprimir por pantalla que se actualiza;
        //Creamos un segundo Observador
        StockObserver observer2 = new StockObserver(stockGrabber);
        stockGrabber.setAaplPrice(800.5);
        stockGrabber.setGoogPrice(800.5);
        stockGrabber.setIBMPrice(800.5);
        //Deberial salir las 2 actualizaciones
        //Eliminamos uno de los observadores

        stockGrabber.removeObserver(observer2);
        stockGrabber.setAaplPrice(500.5);
        stockGrabber.setGoogPrice(500.5);
        stockGrabber.setIBMPrice(500.5);


    }
}
