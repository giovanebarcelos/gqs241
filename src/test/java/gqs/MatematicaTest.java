package gqs;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MatematicaTest {
    Matematica matematica;

    @Before
    public void setUp(){
        // 3A
        // Arrange - Cenário
        matematica = new Matematica();
    }

    @Test
    public void deveSomar(){
        // Action - Ação 
        int resultado = 
            matematica.somar(8, 5);            

        // Assert - Asserção
        assertEquals(13, resultado);
    }

    @Test
    public void deveSubtrair(){
        // Action - Ação 
        int resultado = 
            matematica.subtrair(8, 5);            

        // Assert - Asserção
        assertEquals(3, resultado);
    }

    @Test
    public void deveMultiplicar(){
        // Action - Ação 
        int resultado = 
            matematica.multiplicar(8, 5);            

        // Assert - Asserção
        assertEquals(40, resultado);
    }

    @Test
    public void deveDividir() throws DivisionByZeroException{
        // Action - Ação 
        int resultado = 
            matematica.dividir(9, 3);            

        // Assert - Asserção
        assertEquals(3, resultado);
    }

    @Test(expected = DivisionByZeroException.class)
    public void naoDeveDividirPorZero() throws DivisionByZeroException{
        // Action 
        int numero = matematica.dividir(3, 0);
    }
    
}
