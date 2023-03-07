public class CelularDriver {
    public static void main(String[] args) {
        Celular cel = new Celular("11T Pro", "2107113SG",256.00,8.00,"MIUI 14","XIAOMI");
        System.out.println(cel);
        cel.jugar();
        cel.foto();
        cel.llamar();
    }
}
