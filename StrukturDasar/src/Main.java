import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;
import com.dicoding.javafundamental.basic.kendaraan.*;
import com.dicoding.javafundamental.basic.music.Gitar;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world");

        Gitar.bunyi();

        Motor.JumlahBan();
        Mobil.JumlahBan();
        Kereta.JumlahBan();

        System.out.println("---------------------------------------");
        Date today = new Date();
        System.out.println("Hari ini = " + today);
        Date tomorrow = DateUtils.addDays(today, 1);
        System.out.println("Besok = " + tomorrow);
        System.out.println("---------------------------------------");
    }    
}