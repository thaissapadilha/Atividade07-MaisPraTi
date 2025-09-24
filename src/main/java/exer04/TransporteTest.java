package exer04;
import java.util.ArrayList;
import java.util.List;

public class TransporteTest {
    public static void main(String[] args) {
        List<IMeioTransporte> transportes = new ArrayList<>();
        transportes.add(new Carro());
        transportes.add(new Bicicleta());
        transportes.add(new Trem());

        for (IMeioTransporte t : transportes) {
            System.out.println("Inicial: " + t);

            try {
                t.acelerar(30);
                System.out.println("Após acelerar: " + t);

                t.frear(15);
                System.out.println("Após frear: " + t);
                t.frear(1000);
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }

            System.out.println("-----------------------");
        }
    }
}
