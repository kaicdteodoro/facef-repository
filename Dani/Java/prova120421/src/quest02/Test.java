package quest02;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

    public static void main(String[] args) throws ParseException {
        DateFormat strDf = new SimpleDateFormat("dd/MM/yyyy");
        Date data = strDf.parse("25/01/2002");
        Date dataRegistro = new Date();
        FormMatricula matricula = new FormMatricula("Kaic", "Rua Irineu asdkaksd", 23123131, 222222, data);
        FormRegistro registro = new FormRegistro(1231, dataRegistro, matricula);
        System.out.println(registro.Mostra());
    }
}
