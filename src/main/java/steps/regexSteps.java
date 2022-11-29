package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class regexSteps {

    Date entrega = new Date();


    @Dado("que prazo e dia {int}\\/{int}\\/{int}")
    public void que_prazo_e_dia(Integer dia, Integer mes, Integer ano) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, dia);
        calendar.set(Calendar.MONTH, mes-1);
        calendar.set(Calendar.YEAR, ano);
        entrega = calendar.getTime();
    }
    @Quando("^a entregar atrasar (\\d+) (dia|dias|mes|meses)$")
    public void a_entregar_atrasar_dias(Integer int1, String tempo) {
       Calendar calendar= Calendar.getInstance();
       calendar.setTime(entrega);
       if (tempo.equals("dias")){
           calendar.add(Calendar.DAY_OF_MONTH, int1);
       }if (tempo.equals("meses")) {
           calendar.add(Calendar.MONTH, int1);
       }

       entrega = calendar.getTime();
    }

    @Entao("^o prazo da entrega sera efetuada em (\\d{2}\\/\\d{2}\\/\\d{4})$")
    public void o_prazo_da_entrega_sera_efetuada_em(String data) {
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = format.format(entrega);
        Assert.assertEquals(data, dataFormatada);
        System.out.println(data);
    }

}
