import org.junit.Assert;
import org.junit.Test;

public class TesteCalculadora {

    @Test
    public void CalculadoraAlcanceTest(){
        //Scenery
        double valor = 10.0;

        //Action
        int result = Calculadora.calcularAlcance(valor);

        //Assertion
        Assert.assertEquals(740, result);
    }
}
