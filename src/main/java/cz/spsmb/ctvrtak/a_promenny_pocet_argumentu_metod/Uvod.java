package cz.spsmb.ctvrtak.a_promenny_pocet_argumentu_metod;

import java.util.Arrays;

/***
 * Java umožňuje definovat metody, které můžeme pokaždé volat s jiným počtem argumentů, přestože
 * se počet jejich parametrů nezmění.
 * Chceme-li definovat metodu s proměnným počtem argumentů, je potřeba definovat společný typ argumentů,
 * jejichž počet předem neznáme. V seznamu parametrů tento typ uvádíme jako poslední a připíšeme za něj
 * tzv. výpostku v podobě tří teček.
 * Tento proměnný počet argumentů je reprezentován obyčejným jednorozměrným polem.
 *
 */
public class Uvod {
    public static void variant(String title, int... args) {
        int count = args.length;
        System.out.println(count + " volitelných argumentů pro " + title);
        System.out.println("Argumenty: " + Arrays.toString(args));
    }

    public static void main(String[] args) {
        variant("Nic");
        variant("pět", 1, 2, 3, 4, 5);
    }
}
