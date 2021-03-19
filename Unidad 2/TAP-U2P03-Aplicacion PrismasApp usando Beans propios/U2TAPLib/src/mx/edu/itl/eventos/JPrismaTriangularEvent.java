package mx.edu.itl.eventos;

public class JPrismaTriangularEvent {
    private float nuevoCatetoA, nuevoCatetoB, nuevaAltura;
    private float anteriorCatetoA, anteriorCatetoB, anteriorAltura;
    
    public JPrismaTriangularEvent() {
        this.nuevoCatetoA = 0;
        this.nuevoCatetoB = 0;
        this.nuevaAltura = 0;
        this.anteriorCatetoA = 0;
        this.anteriorCatetoB = 0;
        this.anteriorAltura = 0;
    }

    public JPrismaTriangularEvent(float nuevoCatetoA, float nuevoCatetoB, float nuevaAltura, float anteriorCatetoA, float anteriorCatetoB, float anteriorAltura) {
        this.nuevoCatetoA = nuevoCatetoA;
        this.nuevoCatetoB = nuevoCatetoB;
        this.nuevaAltura = nuevaAltura;
        this.anteriorCatetoA = anteriorCatetoA;
        this.anteriorCatetoB = anteriorCatetoB;
        this.anteriorAltura = anteriorAltura;
    }

    public float getNuevoCatetoA() {
        return nuevoCatetoA;
    }

    public void setNuevoCatetoA(float nuevoCatetoA) {
        this.nuevoCatetoA = nuevoCatetoA;
    }

    public float getNuevoCatetoB() {
        return nuevoCatetoB;
    }

    public void setNuevoCatetoB(float nuevoCatetoB) {
        this.nuevoCatetoB = nuevoCatetoB;
    }

    public float getNuevaAltura() {
        return nuevaAltura;
    }

    public void setNuevaAltura(float nuevaAltura) {
        this.nuevaAltura = nuevaAltura;
    }

    public float getAnteriorCatetoA() {
        return anteriorCatetoA;
    }

    public void setAnteriorCatetoA(float anteriorCatetoA) {
        this.anteriorCatetoA = anteriorCatetoA;
    }

    public float getAnteriorCatetoB() {
        return anteriorCatetoB;
    }

    public void setAnteriorCatetoB(float anteriorCatetoB) {
        this.anteriorCatetoB = anteriorCatetoB;
    }

    public float getAnteriorAltura() {
        return anteriorAltura;
    }

    public void setAnteriorAltura(float anteriorAltura) {
        this.anteriorAltura = anteriorAltura;
    } 
}
