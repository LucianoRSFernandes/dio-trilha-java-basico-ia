public class SomarMultiplicar {
    public int somarMultiplicar(int n, int x, String m) {
        int r;
        if (m.equals("M")) {
            r = n * x;
        } else {
            r = n + x;
        }
        return r;
    }

    public static void main(String[] args) {
        SomarMultiplicar sm = new SomarMultiplicar();
        int resultado = sm.somarMultiplicar(2, 3, "M");
        System.out.println("O resultado é: " + resultado);
    }
}

