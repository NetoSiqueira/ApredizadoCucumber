package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class passagemSteps {
    @Dado("^que o ticket( especial)? é (A.\\d{3})$")
    public void que_o_ticket_é_(String tipo, String arg1) {

    }
    @Dado("^que o valor da passagem é R\\$ (.*)$")
    public void que_o_valor_da_passagem_é_r$(Double numero) {
        System.out.println(numero);
    }
    @Dado("^que o nome do passageiro é \"(.{5,20})\"$")
    public void que_o_nome_do_passageiro_é(String string) {

    }
    @Dado("^que o telefone do passageiro é (9\\d{3}-\\d{4})$")
    public void que_o_telefone_do_passageiro_é(String telefone) {

    }
    @Quando("criar os steps")
    public void criar_os_steps() {

    }
    @Então("o teste vai funcionar")
    public void o_teste_vai_funcionar() {

    }

}
