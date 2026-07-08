import models.Atleta;
import models.Ciclista;
import models.Corredor;

public class App {
    public static void main(String[] args) throws Exception {
        Atleta atletaGenerico = new Atleta("João", 25, 75.5, 1.78);
        Corredor corredor = new Corredor("Maria", 22, 60.0, 1.65);
        Ciclista ciclista = new Ciclista("Carlos", 28, 80.2, 1.82);

        atletaGenerico.fazerAtividade();
        corredor.fazerAtividade();
        ciclista.fazerAtividade();
    }
}