public class Celular {
    public String nombre;
    public String modelo;
    public double almacenamiento;
    public double RAM;
    public String OS;
    public String marca;

    public Celular() {
    }

    public Celular(String nombre, String modelo, double almacenamiento, double RAM, String OS, String marca) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.almacenamiento = almacenamiento;
        this.RAM = RAM;
        this.OS = OS;
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(double almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public double getRAM() {
        return RAM;
    }

    public void setRAM(double RAM) {
        this.RAM = RAM;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "nombre='" + nombre + '\'' +
                ", modelo='" + modelo + '\'' +
                ", almacenamiento=" + almacenamiento +
                ", RAM=" + RAM +
                ", OS='" + OS + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
    public void jugar(){
        System.out.println("Jugando en el celular marca " + marca);
    }
    public void llamar(){
        System.out.println("Hablando en cel celular marca " + marca);
    }
    public void foto(){
        System.out.println("Tomando fotos en cel celular marca " + marca);
    }


}

