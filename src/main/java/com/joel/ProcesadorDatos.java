package com.joel;

public class ProcesadorDatos {

    public void ejecutarConversiones(String edadTexto, String salarioTexto, String activoTexto) {
        System.out.println("\n=== 1. CONVERSION DE STRING A PRIMITIVOS ===");
        int edad = Integer.parseInt(edadTexto);
        double salario = Double.parseDouble(salarioTexto);
        boolean activo = Boolean.parseBoolean(activoTexto);

        System.out.println("Edad (int): " + edad);
        System.out.println("Salario (double): " + salario);
        System.out.println("Estado activo (boolean): " + activo);

        System.out.println("\n=== 2. CASTING IMPLICITO (AMPLIACION AUTOMATICA) ===");
        double edadEnDouble = edad;
        long salarioEnLong = (long) salario;
        float notaEntera = 9;
        double notaDecimal = notaEntera;

        System.out.println("int (" + edad + ") -> double: " + edadEnDouble);
        System.out.println("float (" + notaEntera + ") -> double: " + notaDecimal);

        System.out.println("\n=== 3. CASTING EXPLICITO (REDUCCION MANUAL) ===");
        int salarioSinCentavos = (int) salario;
        byte edadCompacta = (byte) edad;
        int letraAscii = 65;
        char caracter = (char) letraAscii;

        System.out.println("double (" + salario + ") -> int (pierde decimales): " + salarioSinCentavos);
        System.out.println("int (" + edad + ") -> byte: " + edadCompacta);
        System.out.println("int (" + letraAscii + ") -> char: " + caracter);

        System.out.println("\n=== 4. CONVERSION DE PRIMITIVOS A STRING ===");
        String edadComoTexto = String.valueOf(edad);
        String salarioComoTexto = Double.toString(salario);
        String activoComoTexto = Boolean.toString(activo);
        String codigoGenerado = "USR-" + edadComoTexto + "-" + caracter;

        System.out.println("int a String (String.valueOf): \"" + edadComoTexto + "\"");
        System.out.println("double a String (Double.toString): \"" + salarioComoTexto + "\"");
        System.out.println("boolean a String (Boolean.toString): \"" + activoComoTexto + "\"");
        System.out.println("Concatenacion final: " + codigoGenerado);
    }
}
