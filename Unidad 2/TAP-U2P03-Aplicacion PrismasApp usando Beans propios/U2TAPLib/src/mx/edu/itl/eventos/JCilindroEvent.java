package mx.edu.itl.eventos;

public class JCilindroEvent {
    private float nuevoRadio, nuevaAltura, anteriorRadio, anteriorAltura;

    public JCilindroEvent() {
        this.nuevoRadio = 0;
        this.nuevaAltura = 0;
        this.anteriorRadio = 0;
        this.anteriorAltura = 0;
    }

    public JCilindroEvent ( float nuevoRadio, float nuevaAltura, float anteriorRadio, float anteriorAltura) {
        this.nuevoRadio = nuevoRadio;
        this.nuevaAltura = nuevaAltura;
        this.anteriorRadio = anteriorRadio;
        this.anteriorAltura = anteriorAltura;
    }

    public float getNuevoRadio() {
        return nuevoRadio;
    }

    public void setNuevoRadio(float nuevoRadio) {
        this.nuevoRadio = nuevoRadio;
    }

    public float getNuevaAltura() {
        return nuevaAltura;
    }

    public void setNuevaAltura(float nuevaAltura) {
        this.nuevaAltura = nuevaAltura;
    }

    public float getAnteriorRadio() {
        return anteriorRadio;
    }

    public void setAnteriorRadio(float anteriorRadio) {
        this.anteriorRadio = anteriorRadio;
    }

    public float getAnteriorAltura() {
        return anteriorAltura;
    }

    public void setAnteriorAltura(float anteriorAltura) {
        this.anteriorAltura = anteriorAltura;
    }  
}
