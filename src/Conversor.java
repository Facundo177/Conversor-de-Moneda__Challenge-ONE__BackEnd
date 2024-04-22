public class Conversor {

    public double convertirMoneda (Moneda monedaInicial, String monedaObjetivo, double valorACambiar){
        double valorDeCambio = monedaInicial.conversion_rates().get(monedaObjetivo);

        return valorACambiar * valorDeCambio;
    }
}
