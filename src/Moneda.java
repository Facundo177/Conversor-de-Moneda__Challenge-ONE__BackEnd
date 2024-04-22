import java.util.HashMap;

public record Moneda(String base_code, HashMap<String, Double> conversion_rates) {
}
