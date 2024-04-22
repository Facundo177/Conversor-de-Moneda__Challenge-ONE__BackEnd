import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ConsultaAPI consulta = new ConsultaAPI();
        Conversor conversor = new Conversor();
        GeneradorDeLogs escritura = new GeneradorDeLogs();
        
        while (true){

            System.out.println("""
                    ***************************************
                    Sea bienvenido/a al Conversor de Moneda
                    
                    1) Dólar --> Peso argentino
                    2) Peso argentino --> Dólar
                    3) Dólar --> Real brasileño
                    4) Real brasileño --> Dólar
                    5) Dólar --> Peso colombiano
                    6) Peso colombiano --> Dólar
                    7) Conversión manual (ISO 4217 -> código de tres letras para las monedas)
                    8) Salir
                    
                    ***************************************
                    Elija una opción:""");

            try {
                var opcion = Integer.valueOf(scanner.nextLine());
                if (opcion == 8){
                    break;
                } else if (opcion > 8 || opcion < 1) {
                    System.out.println("Opción inválida.\n");
                    continue;
                }

                System.out.println("Ingrese el valor que desea convertir: ");
                var valor = Double.valueOf(scanner.nextLine());

                String monedaQueTengo = null;
                String monedaAConvertir = null;
                switch (opcion){
                    case 1:
                        monedaQueTengo = "USD";
                        monedaAConvertir = "ARS";
                        break;
                    case 2:
                        monedaQueTengo = "ARS";
                        monedaAConvertir = "USD";
                        break;
                    case 3:
                        monedaQueTengo = "USD";
                        monedaAConvertir = "BRL";
                        break;
                    case 4:
                        monedaQueTengo = "BRL";
                        monedaAConvertir = "USD";
                        break;
                    case 5:
                        monedaQueTengo = "USD";
                        monedaAConvertir = "COP";
                        break;
                    case 6:
                        monedaQueTengo = "COP";
                        monedaAConvertir = "USD";
                        break;
                    case 7:
                        System.out.println("¿En qué moneda se encuentra ese valor?: ");
                        monedaQueTengo = scanner.nextLine().toUpperCase();
                        System.out.println("¿A qué moneda desea convertirlo?: ");
                        monedaAConvertir = scanner.nextLine().toUpperCase();
                        break;
                }

                Moneda moneda = consulta.datosMoneda(monedaQueTengo);

                double dineroConvertido = conversor.convertirMoneda(moneda, monedaAConvertir, valor);

                String correlacionMonedas = String.format("El valor %.2f [%s] corresponde a %.2f [%s]", valor, monedaQueTengo, dineroConvertido, monedaAConvertir);
                System.out.printf(correlacionMonedas + "\n\n");
                escritura.guardarConversion(correlacionMonedas);

            } catch (NumberFormatException e){
                System.out.println("El valor debe ser un número.\n");
            } catch (NullPointerException e){
                System.out.println("Código de moneda erróneo.\n");
            } catch (Exception e){
                System.out.println(e);
            }

        }
        System.out.println("Fin del programa");


    }
}

