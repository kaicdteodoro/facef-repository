package ex02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Testa_02 {

    public static void main(String[] args) throws ParseException {
        Passageiro pass01 = new Passageiro("Kaic Teodoro", "46033242866");
        Voo voo01 = new Voo(123, "Franca", "Cancum");
        SimpleDateFormat form = new SimpleDateFormat("dd/MM/yyyy");
        Date data = form.parse("25/01/2021");
        Reserva reserv01 = new Reserva(12364, data, pass01, voo01, 800);
        System.out.println(reserv01.Mostra());
    }

}
