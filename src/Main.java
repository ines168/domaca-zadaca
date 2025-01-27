//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //zbroj brojeva
        int x = 4;
        int y = 2;
        int zbroj = x + y;
        System.out.printf("1.Zbroj brojeva %d + %d = %d\n", x, y, zbroj);
        //ili
        float m = 3.2F;
        double n = 6.8;
        double zbroj2 = m + n;
        System.out.printf("1.Zbroj brojeva %f + %f = %f\n", m, n, zbroj2);

        //ime prezime grad
        System.out.println("2.Ines Cvek\n\nPula");
        //ili
        System.out.println("Ines Cvek");
        System.out.println();
        System.out.println("\tPula\n");

        //Pitagora
        double a = 1;
        double b = 2;
        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.printf("3.Duljina hipotenuze nad katetama %f i %f = %f\n", a, b, c);
    }
}