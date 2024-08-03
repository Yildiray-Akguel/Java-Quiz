package Quiz01;

public class Array_Multiline {
    public static void main(String[] args) {

        int a [][] = new int[3][]; //Deklariert ein zweidimensionales Array namens a mit dem Datentyp int.
        a[1] = new int[]{1,2,3};  //
        a[2] = new int[]{4,5};
        System.out.println(a[1][1]);
        //System.out.println(a.length);


    }
}

/*
Zeile 1: int a [][] = new int[3][];
Deklariert ein zweidimensionales Array namens a mit dem Datentyp int.
Die erste Dimension des Arrays hat eine Länge von 3, d.h. es kann 3 Zeilen enthalten.
Die zweite Dimension ist noch nicht festgelegt, d.h. die Länge der einzelnen Zeilen wird später bestimmt.

Zeile 2: a[1] = new int[]{1,2,3};
Erstellt ein neues eindimensionales Array mit den Werten 1, 2 und 3.
Weist dieses Array der zweiten Zeile von a zu (Index 1, da Arrays null-basiert sind).

Zeile 3: a[2] = new int[]{4,5};
Erstellt ein neues eindimensionales Array mit den Werten 4 und 5.
Weist dieses Array der dritten Zeile von a zu (Index 2).
Zeile 4: System.out.println(a[1][1]);

Greift auf das Element an der ersten Position (Index 1) der zweiten Zeile (Index 1) des Arrays a zu.
Dieser Wert ist 2 und wird auf der Konsole ausgegeben.
Zusammenfassung:
Der Code erstellt ein zweidimensionales Array mit drei Zeilen. Die zweite Zeile enthält die Werte 1, 2 und 3, die dritte Zeile die Werte 4 und 5. Der Code gibt schließlich den Wert an der zweiten Position der zweiten Zeile aus, also die Zahl 2.

Wichtig:

Die erste Zeile des Arrays a bleibt leer, da sie nicht initialisiert wurde.
Die zweite und dritte Zeile haben unterschiedliche Längen. Dies ist möglich bei zweidimensionalen Arrays in Java.
Visuelle Darstellung:

a[0] = null
a[1] = [1, 2, 3]
a[2] = [4, 5]
Durch a[1][1] wird auf das zweite Element der zweiten Zeile zugegriffen, also die Zahl 2.
 */

