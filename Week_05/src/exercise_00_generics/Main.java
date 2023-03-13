package exercise_00_generics;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

class A {

}

class B extends A {

}

class C extends B {

}

public class Main {


    public static void main(String[] args) {
        // Why do we have generics in Java?
        // A Java 5 előtti kollekciók legnagyobb hátránya az volt, hogy elfelejtették a típust.
        // Ha bármilyen típusú elemet tettünk bele, az Objectként volt eltárolva.
        // Ahhoz hogy az eredeti elemet visszakapjuk, ahhoz downcastolni kellett a megfelelő típusra.
        // Ezzel szemben generikus kollekció osztályokat használva adott kollekcióba csak meghatározott típusú elemek kerülhetnek be.
        // Amikor azokat kivesszük a tárolóból, konvertálni már nem szükséges őket a megfelelő típusra.
        // Az objekt tömb az őse minden olyan tömbbnek, ami a javaban előforduló referencia típusból származik.
        // ArrayStoreException: A tömbnek muszáj hasonló típusú elemeket tárolnia. String típusú tömbben csak Stringek, stb...

        /*
        Object[] o = new Object[2];
        o[0] = 6;
        o[1] = new String("A");

        Object[] o2 = new String[1];
        o2[0] = 6;

        */

        // Generikusok: Java 5-el jelentek meg.

    //    List<Object> o = new ArrayList<Object>();
    //    o.add("A");
    //    o.add(3);


        // Míg az Object arraynek oda tudjuk adni a new String tömböt (mert az Object tömb őse a String tömbnek)
        // De a generikusokkal ezt nem tudjuk eljátszani. A List őse az ArrayListnek. Öröklés szempontjából rendben van.
        // Típus paraméterek viszont nagyon fontosak a generikusok tekintetében. Típus paraméterek között az öröklési láncnak nincs semmi értelme
        // List<Object> o = new ArrayList<String>(); tehát nem jó.

        // A generikusokat úgy találták ki, hogy a típus paraméter a baloldalon és a jobboldalon is ugyan az. Nem lehet más. Ezért lehet elhagyni a jobb oldalról.
        // A változó statikus részét tudja a fordító hogy ugyan az lesz.
        // List<String> o = new ArrayList<String>(); ez jó.
        // Generikusoknál ugyan annak a típusparaméternek kell megjelennie a baloldalon és a jobboldalon.

    //    List<A> a  = new ArrayList<>();
    //    a.add(new A());
    //    a.add(new B());
    //    a.add(new C());

        // Wildcard karakter: Kérdőjel. A statikus részben nem adjuk meg a típust, bármilyen típus lehet.
        // A dinamikus rész dönti majd el, hogy milyen típusú elemeket tárolhatok.
        List<?> q1 = new ArrayList<B>();
        // Ha kérdőjel önállóan áll ott, akkor az azt jelenti hogy: <? extends Object>
        // Ez általában túl megengedő azért hogy használjuk.
        // Tudjuk szűkíteni a scope-ot:
     //   List<? extends B> b1 = new ArrayList<B>();
        // A dinamikus rész típusparamétere a B:
        // Minden olyat tudunk használni, ami B-t tárol, vagy B leszármazottját. Alulról "jövünk".
       // List<? extends B> b2 = new ArrayList<C>();
        //List<? extends B> b3 = new ArrayList<A>();

        // Super kulcsszó: B vagy bármi, ami B-nek az őse. Felülről jövünk.
     //   List<? super B> a1 = new ArrayList<Object>();
     //   List<? super B> a2 = new ArrayList<A>();
     //   List<? super B> a3 = new ArrayList<B>();


        // Kérdőjel csak a statikus részben lehet.
        // Ha kérdőjel van a statikus részben, akkor a dinamikus részben bármilyen referencia típust elfogadunk.
        // A generikusok csak referencia típusokra működnek.
        // Primitívet nem fogadunk el, max wrapper classban a referencia típusú párjait.
        // ? tudjuk módosítani: Bármi, ami bizonyos típus vagy annak leszármazottja = extend
        // Bármi, ami a bizonyos típus vagy annak őse = super
        // Ha nem adunk meg típusparamétert egy generikusnak, akkor az az Object lesz neki.

        Storage<Integer> intStorage = new Storage<>(5);
        Storage<String> sStorage = new Storage<>("Hello");
        System.out.println(intStorage);
        System.out.println(sStorage);

        class AB implements Comparable<A> {

            @Override
            public int compareTo(A o) {
                return 0;
            }
        }

        class B extends A {

        }
    }


}
