import org.junit.Assert;
import org.junit.Test;

public class TesteCalculadoraDeAlcance {

    @Test
    public void CalculadoraAlcanceTest(){
        //Scenery
        double valor = 10.0;

        //Action
        int result = CalculadoraDeAlcance.calcularAlcance(valor);

        //Assertion
        Assert.assertEquals(740, result);
    }
}
