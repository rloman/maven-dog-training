package nl.itacademy.ocp.recursion.fac;

public final class Wiskunde {

    public static int fac(int n) {

        if (n == 0) {
            return 1;
        } else {
            return n * fac(n - 1);
        }

    }

    public static int ggd(int n, int m) {

        if (n % m == 0) {
            return m;
        } else {
            return ggd(m, n % m);
        }

    }

    public static int kgv(int n, int m) {
        return (n*m)/ggd(n,m);
    }

    private Wiskunde() {

    }
}
