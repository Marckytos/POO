public class Vehiculo {
    protected String tipo;
    protected String velocidad;
    protected String tamanio;

    public Vehiculo() {

    }

    public Vehiculo(String tipo, String velocidad, String tamanio) {
        this.tipo = tipo;
        this.velocidad = velocidad;
        this.tamanio = tamanio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "tipo='" + tipo + '\'' +
                ", velocidad='" + velocidad + '\'' +
                ", tamanio='" + tamanio + '\'' +
                '}';
    }
    public void acelerar(){
        System.out.println("El vehículo está acelerando");

    }
    public void frenar(){
        System.out.println("El vehículo está frenando");
    }
}
