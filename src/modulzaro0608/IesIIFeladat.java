
package modulzaro0608;

import java.util.Random;

public class IesIIFeladat {

    public static int[] tomb;
    
    public static void main(String[] args) {

        ProgramozoiTetelekFeladat();
        System.out.println("");
        AdatszerkezetTombFeladat();
        
        
        
    }

    private static void ProgramozoiTetelekFeladat() {

        System.out.println("I. Programozói tételek feladat: ");
    // Tömb feltöltése véletlen számokkal
        tomb = feltolt(10);
        //tömb elemeinek kiírása
        kiir(4);
        
        //Véletlen szám visszaadása
        int also = 0;
        int felso = 20;
        int veletlenSzam = velSzam(also, felso);
        System.out.println("Véletlen szám: " + veletlenSzam);
        
        //Programozói tételek eredményeinek kiírása
        System.out.println("Összegzés: " + osszegzes());
        System.out.println("Megszámlálás: " + megszamlalas());
        System.out.println("Min hely: " + minHely());
        System.out.println("Max hely: " + maxHely());
        System.out.println("Kiválasztás: " + kivalasztas());
        System.out.println("Eldöntés (van tökéletes szám): " + eldontesEgy());
        System.out.println("Eldöntés (minden elem növekvő sorrendben van): " + eldontesMind());
        System.out.println("Lineáris keresés (13): " + linKer(13));

    }
    
    //egy darab véletlenszám alsó, felső határ
    public static int velSzam(int also, int felso) {
        Random rnd = new Random();
        return rnd.nextInt(felso - also + 1) + also;
    }

    //a paraméterében megadott számú egészek tömbje
    public static int[] feltolt(int db) {
        int[] tomb = new int[db];
        for (int i = 0; i < db; i++) {
            tomb[i] = velSzam(0, 20);
        }
        return tomb;
    }

    //tömb elemeit táblázatos formába
    public static void kiir(int oszlop) {
        for (int i = 0; i < tomb.length; i++) {
            System.out.print(tomb[i] + "\t");
            if ((i + 1) % oszlop == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    //tömb elemeinek összege
    public static int osszegzes() {
        int osszeg = 0;
        for (int elem : tomb) {
            osszeg += elem;
        }
        return osszeg;
    }

    //a tömbben lévő nullák száma
    public static int megszamlalas() {
        int szamol = 0;
        for (int elem : tomb) {
            if (elem == 0) {
                szamol++;
            }
        }
        return szamol;
    }

    //a legkisebb érték helye
    public static int minHely() {
        int minHely = 0;
        for (int i = 1; i < tomb.length; i++) {
            if (tomb[i] < tomb[minHely]) {
                minHely = i;
            }
        }
        return minHely;
    }

    //a legnagyobb érték helye
    public static int maxHely() {
        int maxHely = 0;
        for (int i = 1; i < tomb.length; i++) {
            if (tomb[i] > tomb[maxHely]) {
                maxHely = i;
            }
        }
        return maxHely;
    }

    //az első 5-tel osztható szám helye
    public static int kivalasztas() {
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] % 5 == 0) {
                return i;
            }
        }
        return -1;  // ha nincs 5-tel osztható szám, írjon -1-et
    }

    //van tökéletes szám a tömbben?
    public static boolean eldontesEgy() {
        for (int elem : tomb) {
            if (tokeletesSzam(elem)) {
                return true;
            }
        }
        return false;
    }
    //metódus a metódusban, tökéletes szám e az adott szám
    public static boolean tokeletesSzam(int szam) {
        int osszeg = 0;
        for (int i = 1; i <= szam / 2; i++) {
            if (szam % i == 0) {
                osszeg += i;
            }
        }
        return osszeg == szam;
    }

    //a tömb elemei növekvő sorrendben követik egymást?
    public static boolean eldontesMind() {
        for (int i = 1; i < tomb.length; i++) {
            if (tomb[i] < tomb[i - 1]) {
                return false;
            }
        }
        return true;
    }

    //ha van a tömbben 13-as érték, adja meg a helyét, -1-et írjon, ha nincs 13 a tömbben
    public static int linKer(int keresettElem) {
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] == keresettElem) {
                return i;
            }
        }
        return -1;
    }

    private static void AdatszerkezetTombFeladat() {

        System.out.println("II. Adatszerkezet: tömb feladat:");
        
        
    }
    
    
    
}
