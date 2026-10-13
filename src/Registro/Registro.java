package Registro;

public class Registro {
    //atributos privados
    private String direccionIP;
    private String horaAcceso;
    private boolean permitida;

    //constructor


    public void setDireccionIP(String direccionIP) {
        this.direccionIP = direccionIP;
    }
    public String getDireccionIP() {
        return direccionIP;
    }

    public void setHoraAcceso(String horaAcceso) {
        this.horaAcceso = horaAcceso;
    }

    public String getHoraAcceso() {
        return horaAcceso;
    }

    public void setPermitida(boolean permitida) {
        this.permitida = permitida;
    }

    public boolean isPermitida() {
        return permitida;
    }
//Metodo utilitariado
    public void mostrarestado(){
        System.out.println("DireccionIP: "+direccionIP);
        System.out.println("Hora de acceso: "+ horaAcceso);

        if (permitida) {
            System.out.println("Estado: Acceso PERMITIDO ");
        } else {
            System.out.println("Estado: Acceso DENEGADO ");
        }
    }

}
