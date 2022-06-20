import javax.sound.midi.SysexMessage;
import java.util.Scanner;
public class Manav {
    public static void main(String[] args) {
        double armutkilo,elmakilo,domateskilo,muzkilo,patlıcankilo;
        double armutfiyat = 2.14, elmafiyat = 3.67, domatesfiyat = 1.11, muzfiyat = 0.95, patlıcanfiyat = 5.00;

        Scanner girdi = new Scanner(System.in);

        System.out.println("Kaç kilo armut? : ");
        armutkilo = girdi.nextDouble();

        System.out.println("Kaç kilo elma? : ");
        elmakilo = girdi.nextDouble();

        System.out.println("Kaç kilo domates? : ");
        domateskilo = girdi.nextDouble();

        System.out.println("Kaç kilo muz? : ");
        muzkilo = girdi.nextDouble();

        System.out.println("Kaç kilo patlıcan ? : ");
        patlıcankilo = girdi.nextDouble();

        double toplamfiyat;
        toplamfiyat = (armutfiyat * armutkilo) + (elmafiyat * elmakilo) + (domatesfiyat * domateskilo) + (muzfiyat * muzkilo) + (patlıcanfiyat * patlıcankilo);
        System.out.println(toplamfiyat);
    }
}
