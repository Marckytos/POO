public class MonitorPersonaDriver {
    public static void main(String[] args) {
        Monitor mon = new Monitor(27.4,"Samsung","UR55","IPS",3700.00);
        System.out.println(mon);
        mon.encender();
        mon.proyectar();


        Persona per = new Persona(20,"Erick",1.65,63.6,"M");
        System.out.println(per);
        per.baniar();
        per.comer();
    }
}
