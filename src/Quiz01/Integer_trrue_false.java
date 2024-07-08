package Quiz01;

public class Integer_trrue_false {

    public static void main(String[] args) {

        Integer num1 = 100;
        Integer num2 = 100;

        Integer num3 = 500;
        Integer num4 = 500;


        System.out.println(num1==num2); // true
        System.out.println(num3==num4); // false

   }
}

    /*
    Erklärung
    Integer Caching: In Java gibt es einen speziellen Mechanismus für das Caching von Integer-Objekten für Werte im Bereich von -128 bis 127. Das bedeutet, dass Integer-Objekte innerhalb dieses Bereichs nicht jedes Mal neu erstellt werden, sondern auf bereits vorhandene Instanzen zurückgegriffen wird.

    Beispiel mit == Operator:

    Integer num1 = 100;
    Integer num2 = 100;
    Da 100 im Caching-Bereich liegt, zeigen beide Referenzen (num1 und num2) auf dasselbe Objekt im Cache. Daher ist num1 == num2 true.
    Beispiel außerhalb des Caching-Bereichs:

    Integer num3 = 1000;
    Integer num4 = 1000;
    Da 1000 außerhalb des Caching-Bereichs liegt, werden zwei verschiedene Integer-Objekte erstellt. Daher zeigen num3 und num4 auf unterschiedliche Objekte, und num3 == num4 ist false.

    Zusammengefasst:

    num1 == num2 ist true, weil beide auf dasselbe Objekt im Integer-Cache zeigen.
    num3 == num4 ist false, weil sie auf verschiedene Objekte außerhalb des Caching-Bereichs zeigen.
    num3.equals(num4) ist true, weil die Werte der Integer-Objekte gleich sind.




     */





