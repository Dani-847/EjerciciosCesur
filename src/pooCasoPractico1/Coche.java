package pooCasoPractico1;

public class Coche {
    private String modelo;
    private String color;
    private Boolean pintMetalizada;
    private String matricula;
    private int aFabricacion;
    private Boolean segTerceros;
    private Boolean segTodoRiesgo;
    public Coche(){
    }
    public Coche(String modelo, String color, Boolean pintMetalizada, String matricula, int aFabricacion, Boolean segTerceros, Boolean segTodoRiesgo) {
        this.modelo = modelo;
        this.color = color;
        this.pintMetalizada = pintMetalizada;
        this.matricula = matricula;
        this.aFabricacion = aFabricacion;
        this.segTerceros = segTerceros;
        this.segTodoRiesgo = segTodoRiesgo;
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getPintMetalizada() {
        return pintMetalizada;
    }

    public void setPintMetalizada(Boolean pintMetalizada) {
        this.pintMetalizada = pintMetalizada;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getaFabricacion() {
        return aFabricacion;
    }

    public void setaFabricacion(int aFabricacion) {
        this.aFabricacion = aFabricacion;
    }

    public Boolean getSegTerceros() {
        return segTerceros;
    }

    public void setSegTerceros(Boolean segTerceros) {
        this.segTerceros = segTerceros;
    }

    public Boolean getSegTodoRiesgo() {
        return segTodoRiesgo;
    }

    public void setSegTodoRiesgo(Boolean segTodoRiesgo) {
        this.segTodoRiesgo = segTodoRiesgo;
    }
}
