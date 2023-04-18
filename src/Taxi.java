public class Taxi extends Automovil{
    private int pasajeros;
    private double tarifa;
    private int horasTrabajo;

    public Taxi() {

    }

    public Taxi(String tipo, String velocidad, String tamanio, String potencia, int puertas, String marca, String color, int pasajeros, double tarifa, int horasTrabajo) {
        super(tipo, velocidad, tamanio, potencia, puertas, marca, color);
        this.pasajeros = pasajeros;
        this.tarifa = tarifa;
        this.horasTrabajo = horasTrabajo;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public int getHorasTrabajo() {
        return horasTrabajo;
    }

    public void setHorasTrabajo(int horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "pasajeros=" + pasajeros +
                ", tarifa=" + tarifa +
                ", horasTrabajo=" + horasTrabajo +
                ", potencia='" + potencia + '\'' +
                ", puertas=" + puertas +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", tipo='" + tipo + '\'' +
                ", velocidad='" + velocidad + '\'' +
                ", tamanio='" + tamanio + '\'' +
                '}';
    }
    public void cobrar(){
        System.out.println("Le cobra pero no tiene cambio xd");

    }
    public void llevarDestino(){
        System.out.println("Llevando al pasaje a su destino...");
    }

}
