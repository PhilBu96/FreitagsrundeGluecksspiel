# FreitagsrundeGluecksspiel
A solution for a task on https://wiki.freitagsrunde.org/

Task: https://wiki.freitagsrunde.org/Javakurs/%C3%9Cbungsaufgaben/Gl%C3%BCcksspiel

# 42%
Tipp: Mit dem Javabefehl double randomValue = Math.random(); könnt ihr in der Variable randomValue einen zufälligen Fließkommawert zwischen 0 und 1 speichern.

Schreibt ein Programm welches mit einer Wahrscheinlichkeit von 42% "Gewonnen!" und ansonsten "Verloren!" ausgibt.
Kompiliert das Programm und führt es aus. Spielt ein wenig herum und ändert das Programm, indem ihr absichtlich Fehler einbaut, lest dann die Fehlermeldungen. Was für Informationen geben sie euch?

# Begrüßung
Schreibt ein Programm, welches drei Variablen kennt, die das Alter, den Namen und das Geschlecht einer Person speichern. Überlegt euch, von welchem Datentyp die drei Variablen sein müssen.
Fügt eurem Programm dann eine Fallunterscheidung hinzu, die eine Begrüßung für die genannte Person ausgibt. Der Begrüßungstext unterscheidet sich für Personen, die männlich oder weiblich sind und unterscheidet zwischen Erwachsenen und Kindern. Folgende Begrüßungen sollen ausgegeben werden:
"Guten Tag Herr <name>!" für erwachsene Männer
"Guten Tag Frau <name>!" für erwachsene Frauen
"Hallo <name>!" für Mädchen und Jungen unter 18 Jahren

# Glücksspiel
Erweitert das Programm von Aufgabe "42%" zu einem kleinen Glücksspiel. Zwei Spieler wählen jeweils einen Wert zwischen 1 und 100. Dann wird eine zufällige weitere Zahl zwischen 1 und 100 ermittelt (mit Math.random()). Der Spieler, dessen Nummer am nächsten an der zufälligen Zahl liegt, hat gewonnen. Liegen beide Spieler gleich weit entfernt, dann gibt es ein Unentschieden.
Hinweis: Es reicht aus, wenn die Zahlen, die die Spieler wählen, direkt im Quellcode verankert sind, ihr müsst diese nicht von der Konsole einlesen.
