package matriculauniversidad;

public class valorapagar {
    public static double ValorPago(double Patrimonio,Double Estrato,double Matricula){
        Matricula = 50000;
        if ((Patrimonio > 2000000) && (Estrato > 3)) {
        Matricula = Matricula + (0.03 * Patrimonio);
        }
        return Matricula;

    }
}

    



