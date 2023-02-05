public class Main {
    public static void main(String[] args) {
        int[] tomb = {-12,2,6,78,41,25,-126,-8,-7,-52,458,5};

        System.out.println("Számok átlaga: " + atlag(tomb));
        System.out.println("Legnagyobb elem: " + legnagyobb(tomb));
        System.out.println("Kisebb elem: " + legkisebb(tomb));
        System.out.println("Van-e háromjegyű: " + vanHaromJegyu(tomb));
    }

    public static int atlag(int[] tomb) {
        int sum = 0;
        for(int i = 0; i < tomb.length; i++) {
            sum+=tomb[i];
        }
        return sum;
    }

    public static int legnagyobb(int[] tomb) {
        int leg = tomb[0];
        for(int i = 0; i < tomb.length; i++) {
            if(tomb[i] > leg) {
                leg = tomb[i];
            }
        }
        return leg;
    }

    public static int legkisebb(int[] tomb) {
        int kis = tomb[0];
        for(int i = 0; i < tomb.length; i++) {
            if(tomb[i] < kis) {
                kis = tomb[i];
            }
        }
        return kis;
    }

    public static boolean vanHaromJegyu(int[] tomb) {
        for(int i = 0; i < tomb.length; i++) {
            if( (tomb[i]/100) > 1) {
                return true;
            }
        }
        return false;
    }
}