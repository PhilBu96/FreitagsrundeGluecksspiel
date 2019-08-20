public class Main {

    public static String gluecksspiel(int player1Int, int player2Int){
        /*
        Erweitert das Programm von Aufgabe "42%" zu einem kleinen Glücksspiel.
        Zwei Spieler wählen jeweils einen Wert zwischen 1 und 100.
        Dann wird eine zufällige weitere Zahl zwischen 1 und 100 ermittelt (mit Math.random()).
        Der Spieler, dessen Nummer am nächsten an der zufälligen Zahl liegt, hat gewonnen.
        Liegen beide Spieler gleich weit entfernt, dann gibt es ein Unentschieden.
        Hinweis: Es reicht aus, wenn die Zahlen, die die Spieler wählen, direkt im Quellcode verankert sind,
        ihr müsst diese nicht von der Konsole einlesen.
         */
        String result = "";

        //Zufallszahl zwischen 0 und 1 mit 100 multipliziert, daher Zufallszahl zwischen 0 und 100
        int randomValue = (int) (100*Math.random());
        int absPlayer1 = Math.abs(player1Int - randomValue);
        int absPlayer2 = Math.abs(player2Int - randomValue);
        String winner;

        result += "Player 1: " + player1Int + "\n";
        result += "Player 2: " + player2Int + "\n";
        result += "RandomValue: " + randomValue + "\n";
        result += "Gewinner: ";

        if (absPlayer1 < absPlayer2){
            winner = "Player 1";
        } else if (absPlayer2 < absPlayer1){
            winner = "Player 2";
        } else {
            winner = "Unentschieden";
        }

        result += winner;

        return result;
    }

    public static String begruessung(int alter, String name, char geschlecht){
        /*
        Schreibt ein Programm, welches drei Variablen kennt, die das Alter, den Namen und das Geschlecht einer Person speichern.
        Überlegt euch, von welchem Datentyp die drei Variablen sein müssen.
        Fügt eurem Programm dann eine Fallunterscheidung hinzu, die eine Begrüßung für die genannte Person ausgibt.
        Der Begrüßungstext unterscheidet sich für Personen, die männlich oder weiblich sind und unterscheidet
        zwischen Erwachsenen und Kindern.
        Folgende Begrüßungen sollen ausgegeben werden: "Guten Tag Herr !" für erwachsene Männer "Guten Tag Frau !"
        für erwachsene Frauen "Hallo !" für Mädchen und Jungen unter 18 Jahren
         */
        String result = "";

        if (alter < 18){
            result += "Hallo " + name;
        } else {
            result += "Guten Tag ";

            if (geschlecht == 'm'){
                result += "Herr " + name;
            } else if (geschlecht == 'w'){
                result += "Frau " + name;
            }
        }
        result += "!";

        return result;
    }

    public static String fortyTwo(){
        /*
        42%
        Tipp: Mit dem Javabefehl double randomValue = Math.random(); könnt ihr in der Variable randomValue einen
        zufälligen Fließkommawert zwischen 0 und 1 speichern.
        Schreibt ein Programm welches mit einer Wahrscheinlichkeit von 42% "Gewonnen!" und ansonsten "Verloren!" ausgibt.
        Kompiliert das Programm und führt es aus. Spielt ein wenig herum und ändert das Programm,
        indem ihr absichtlich Fehler einbaut, lest dann die Fehlermeldungen. Was für Informationen geben sie euch?
         */
        String result = "";

        double randomValue = Math.random();

        if (randomValue <= 0.42){
            result = "Gewonnen!" + " Wert: " + randomValue;
        } else {
            result = "Verloren!" + " Wert: " + randomValue;
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(fortyTwo());
        System.out.println(fortyTwo());
        System.out.println(fortyTwo());
        System.out.println(fortyTwo());
        System.out.println();

        System.out.println(begruessung(15, "Pauline", 'w'));
        System.out.println(begruessung(22, "Philipp", 'm'));
        System.out.println(begruessung(5, "kleiner Arne", 'm'));
        System.out.println(begruessung(33, "alte Alina", 'w'));
        System.out.println(begruessung(60, "Annegret", 'w'));
        System.out.println();

        System.out.println(gluecksspiel(50, 51));
        System.out.println();
        System.out.println(gluecksspiel(22, 37));
        System.out.println();
        System.out.println(gluecksspiel(48, 65));
        System.out.println();
        System.out.println(gluecksspiel(32, 48));

    }

}
