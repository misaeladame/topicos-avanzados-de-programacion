package examen;


public class Hexagono {
    
    private float lado, apotema;
    
    public Hexagono() {
        lado = 0;
        apotema = 0;
    }

    public Hexagono(float lado, float apotema) {
        this.lado = lado;
        this.apotema = apotema;
    }

    
    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getApotema() {
        return apotema;
    }

    public void setApotema(float apotema) {
        this.apotema = apotema;
    }
    
    public float perimetro() {
        return 6 * lado;
    }
    
    public float area() {
        return ( perimetro() * apotema ) / 2;
    }
}
