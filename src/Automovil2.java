public class Automovil extends Vehiculo{
    protected String potencia;
    protected int puertas;
    protected String marca;
    protected String color;

    public Automovil() {

    }

    public Automovil(String tipo, String velocidad, String tamanio, String potencia, int puertas, String marca, String color) {
        super(tipo, velocidad, tamanio);
        this.potencia = potencia;
        this.puertas = puertas;
        this.marca = marca;
        this.color = color;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "potencia='" + potencia + '\'' +
                ", puertas=" + puertas +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", tipo='" + tipo + '\'' +
                ", velocidad='" + velocidad + '\'' +
                ", tamanio='" + tamanio + '\'' +
                '}';
    }
    public void chocar(){
        System.out.println("El vehículo ha chocado");
    }
    public void abrirPuerta(){
        System.out.println("Abriendo la puerta del vehículo...");
    }
}
