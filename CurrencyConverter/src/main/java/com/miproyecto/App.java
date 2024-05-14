package com.miproyecto;

import java.io.IOException;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        // Añadiendo más divisas al arreglo
        String[] currencies = {"EUR", "JPY", "GBP", "MXN", "ARS", "BRL"}; // Ahora incluye pesos mexicanos, argentinos y reales brasileños

        try {
            // Obtención de las tasas de cambio para las divisas especificadas
            Map<String, Double> rates = CurrencyApi.getExchangeRates("USD", currencies);

            // Impresión de las tasas de cambio de USD a cada divisa en la lista
            rates.forEach((currency, rate) -> System.out.println("USD to " + currency + ": " + rate));
        } catch (IOException | InterruptedException e) {
            // Manejo de posibles errores durante la recuperación de las tasas de cambio
            System.out.println("Error al recuperar las tasas de cambio: " + e.getMessage());
        }
    }
}
