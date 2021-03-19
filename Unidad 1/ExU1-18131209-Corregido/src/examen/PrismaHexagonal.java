package examen;

public class PrismaHexagonal {
    
    private float lado, apotema, altura;
    private Hexagono baseInf, baseSup;
    private Rectangulo cara_1;
    private Rectangulo cara_2;
    private Rectangulo cara_3;
    private Rectangulo cara_4;
    private Rectangulo cara_5;
    private Rectangulo cara_6;
    
    public PrismaHexagonal () {
        lado = 0;
        apotema = 0;
        altura = 0;
        baseInf = new Hexagono ();
        baseSup = new Hexagono ();
        cara_1 = new Rectangulo ();       
        cara_2 = new Rectangulo ();
        cara_3 = new Rectangulo ();
        cara_4 = new Rectangulo ();
        cara_5 = new Rectangulo ();
        cara_6 = new Rectangulo ();
    }
    
    public PrismaHexagonal( float lado, float apotema, float altura ) {
        this.lado = lado;
        this.apotema = apotema;
        this.altura = altura;
        baseInf = new Hexagono ( lado, apotema );
        baseSup = new Hexagono ( lado, apotema );
        cara_1 = new Rectangulo ( lado, altura );       
        cara_2 = new Rectangulo ( lado, altura );
        cara_3 = new Rectangulo ( lado, altura );
        cara_4 = new Rectangulo ( lado, altura );
        cara_5 = new Rectangulo ( lado, altura );
        cara_6 = new Rectangulo ( lado, altura );
    }

    public float areaBase () {
        return baseInf.area();
    }
    
    public float areaLateral() {
        return 6 * ( cara_1.area() );
    }
    
    public float areaTotal() {
        return 2 * areaBase () + areaLateral() ;
    }
    
    public float volumen() {
        return baseInf.area() * altura;
    }
    
    public float getLado () {
        return lado;
    }
    
    public void setLado ( float lado ) {
        this.lado = lado;
        baseInf.setLado( lado );
        baseSup.setLado( lado );
        cara_1.setLargo( lado );
        cara_2.setLargo( lado );
        cara_3.setLargo( lado );
        cara_4.setLargo( lado );
        cara_5.setLargo( lado );
        cara_6.setLargo( lado );
        
    }
    
    public float getApotema () {
        return apotema;
    }

    
    public void setApotema ( float apotema ) {
        this.apotema = apotema;
        baseInf.setApotema ( apotema );
        baseSup.setApotema ( apotema );    
    }
    
    public float getAltura () {
        return altura;
    }
    
    
    public void setAltura ( float altura ) {
        this.altura = altura;
        cara_1.setAncho ( altura );
        cara_2.setAncho ( altura );
        cara_3.setAncho ( altura );
        cara_4.setAncho ( altura );
        cara_5.setAncho ( altura );
        cara_6.setAncho ( altura );
    }        
}

    
    
