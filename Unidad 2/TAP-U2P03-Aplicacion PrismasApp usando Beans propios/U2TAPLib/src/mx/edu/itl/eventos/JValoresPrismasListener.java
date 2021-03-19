package mx.edu.itl.eventos;

public interface JValoresPrismasListener {
    public void valoresCilindro( JCilindroEvent evento );
    
    public void valoresPrismaRectangular( JPrismaRectangularEvent evento );
    
    public void valoresPrismaTriangular ( JPrismaTriangularEvent evento );
}
