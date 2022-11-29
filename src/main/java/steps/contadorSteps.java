package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.util.Optional;

public class contadorSteps {

    private int contador = 0;
    @Dado("que o valor do e {int}")
    public void que_o_valor_do_e(Integer int1) {
        contador =int1;
    }
    @Quando("eu incrementar em {int}")
    public void eu_incrementar_em(Integer int1) {
            contador = contador + int1;
    }

    @Entao("o valor do contador sera {int}")
    public void o_valor_do_contador_sera(Integer int1) {
        System.out.println(int1);
        System.out.println(contador);
        //Assert.assertTrue(int1 == contador);
       Assert.assertEquals(Optional.ofNullable(int1),Optional.ofNullable( contador));
      
    }

}
