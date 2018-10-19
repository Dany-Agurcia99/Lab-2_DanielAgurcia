package Clases;

public class Aviones {

    //Atributos
    String modelo;
    String codigo;
    String fechafabri;
    String ingreso;
    int capacidad;
    int pesoT;
    int cantidadVuelo;
    int motores;
    String estado = "Estacionado";
    String nombreIng;

    //constructores
    public Aviones(String modelo, String codigo, String fechafabri, String ingreso, int capacidad, int pesoT, int cantidadVuelo, int motores, String nombreIng) {
        this.modelo = modelo;
        this.codigo = codigo;
        this.fechafabri = fechafabri;
        this.ingreso = ingreso;
        this.capacidad = capacidad;
        this.pesoT = pesoT;
        this.cantidadVuelo = cantidadVuelo;
        this.motores = motores;
        this.nombreIng = nombreIng;
    }
    
    //mutadores
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFechafabri() {
        return fechafabri;
    }

    public void setFechafabri(String fechafabri) {
        this.fechafabri = fechafabri;
    }

    public String getIngreso() {
        return ingreso;
    }

    public void setIngreso(String ingreso) {
        this.ingreso = ingreso;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getPesoT() {
        return pesoT;
    }

    public void setPesoT(int pesoT) {
        this.pesoT = pesoT;
    }

    public int getCantidadVuelo() {
        return cantidadVuelo;
    }

    public void setCantidadVuelo(int cantidadVuelo) {
        this.cantidadVuelo = cantidadVuelo;
    }

    public int getMotores() {
        return motores;
    }

    public void setMotores(int motores) {
        this.motores = motores;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombreIng() {
        return nombreIng;
    }

    public void setNombreIng(String nombreIng) {
        this.nombreIng = nombreIng;
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo + "\n" + "Codigo del Avion: " + codigo + "\n" + "Fecha de fabricacion: " + fechafabri
                + "\n" + "Ingresado el: " + ingreso + "\n" + "Capacidad de pasajeros: " + capacidad + "\n" + "Capacidad de Peso: "
                + pesoT + "\n" + "Cantidad de horas de vuelo: " + cantidadVuelo + "\n" + "Numero de motores: " + motores + "\n" + "Estado de vuelo: "
                + estado + "\n" + "Ingeniero a cargo: " + nombreIng + "\n";
    }
}
