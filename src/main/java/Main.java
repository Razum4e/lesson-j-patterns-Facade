public class Main {
    public static void main(String[] args) {
        BinOps binOps = new BinOps();
        String a = "1111"; //15
        String b = "11"; //3
        String c = binOps.sum(a, b); //15 + 3 = 18 (10010)
        String d = binOps.mult(a, b); //15 * 3 = 45 (101101)
        System.out.println("Сложили: " + c
                + "\nПеремножили: " + d);
    }
}
