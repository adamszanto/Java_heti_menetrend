import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int fej = 0;
        int iras = 0;
        int maxfejSorozat = 0;
        int fejSorozat = 0;
        int fejIrasFej = 0;
        int irasIrasIras = 0;

        int elozo1 = -1;
        int elozo2 = -1;

        for(int i = 1; i < 100; i++) {
            Random random = new Random();
            int eredmeny = random.nextInt(2);

            if(eredmeny == 0) {
                System.out.println("Fej!");
                fej++;
                fejSorozat++;
                if(fejSorozat > maxfejSorozat) {
                    maxfejSorozat = fejSorozat;
                }
            } else {
                System.out.println("Írás!");
                iras++;
                fejSorozat = 0;
            }
            if(i >= 2) {
                if(elozo1 == 0 && elozo2 == 1 && eredmeny == 0) {
                    fejIrasFej++;
                } else if(elozo1 != 0 && elozo2 != 0 && eredmeny != 0) {
                    irasIrasIras++;
                }
            }
            elozo2 = elozo1;
            elozo1 = eredmeny;
        }
        System.out.println("Hany fej: " + fej);
        System.out.println("Hany iras: " + iras);
        System.out.println("Fej-iras-fej kombinacio: " + fejIrasFej);
        System.out.println("Iras-iras-iras kombinacio: " + irasIrasIras);
        System.out.println("Leghosszabb dobassorozat fej: " + maxfejSorozat);
    }
}