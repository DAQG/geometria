import javax.swing.plaf.metal.MetalButtonUI;

public class geom {
    int nLados;
    double lado,altura, base,radio, NPi;
    private int valorSecreto; //HACE QUE LA VARIABLE SOLO SE UTILICE EN ESTA CLASE --> PRIVATE
    //NPi = 3.141516;


    public geom(int nLados, double lado, double altura, double base, double radio, double NPi) {
        this.nLados = nLados;
        this.lado = lado;
        this.altura = altura;
        this.base = base;
        this.radio = radio;
        this.NPi = NPi;
    }

    public geom(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public void setnLados(int nLados) {
        this.nLados = nLados;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setNPi(double NPi) {
        this.NPi = NPi;
    }

    public int getnLados() {
        return nLados;
    }

    public double getLado() {
        return lado;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public double getRadio() {
        return radio;
    }

    public double getNPi() {
        return NPi;
    }

    private double calculoArea(){ // ES PRIVADA Y SOLO SE PUEDE UTILIZAR EN ESTA CLASE
        return 3*6;
    }

    /*public double calculoArea(){ // ES UNA CLASE PUBLICA
        return 3*6;
    }*/
}
