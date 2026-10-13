package Registro;

public class MainRegistro {
    static void main() {
        Registro r1=new Registro();
        Registro r2=new Registro();

        r1.setDireccionIP("192.168.1.50");
        r1.setHoraAcceso("3:06");
        r1.setPermitida(false);

        r2.setDireccionIP("192.167.1.50");
        r2.setHoraAcceso("8:45");
        r2.setPermitida(true);

        System.out.println("Reporte De Registro");
        r1.mostrarestado();
        r2.mostrarestado();
    }
}
