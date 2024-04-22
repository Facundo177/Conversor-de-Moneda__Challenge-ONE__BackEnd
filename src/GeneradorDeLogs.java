import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class GeneradorDeLogs {

    public void guardarConversion(String conversion) throws IOException {
        FileWriter escritura = new FileWriter("conversiones.txt", true);
        escritura.write(LocalDateTime.now() + ": " + conversion + "\n");
        escritura.close();
    }
}
