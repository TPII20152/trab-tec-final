/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
import java.util.InputMismatchException;
/**
 *
 * @author cesar.nascimento
 */
public class ValidadorCPF {
    public static boolean TestaCPF(String CPF) {

        // Considerar como erro CPFs com apenas números iguais.
        if (CPF.equals("00000000000") || CPF.equals("11111111111")
                || CPF.equals("22222222222") || CPF.equals("33333333333")
                || CPF.equals("44444444444") || CPF.equals("55555555555")
                || CPF.equals("66666666666") || CPF.equals("77777777777")
                || CPF.equals("88888888888") || CPF.equals("99999999999")
                || (CPF.length() != 11)) {
            return (false);
        }
        // Declaração das variaveis.
        char Digito1, Digito2;
        int Soma, i, r, Numero, Peso;

        // Try para caso dê algum erro.
        try {
            // Calcular primeiro dígito.
            Soma = 0;
            Peso = 10;
            for (i = 0; i < 9; i++) {
                // Converter caractere na posição "i"  para número inteiro.
                // 48 é a posição de '0' na tabela ASCII.
                Numero = (int) (CPF.charAt(i) - 48);
                Soma = Soma + (Numero * Peso);
                Peso = Peso - 1;
            }
            // Depois da soma feita, calcular o dígito.
            r = 11 - (Soma % 11);
            if ((r == 10) || (r == 11)) {   // Se o resultado do cálculo for 10 ou
                Digito1 = '0';              // 11, o valor do dígito será zero.
            } else {
                Digito1 = (char) (r + 48);  // Converte o inteiro em char
            }                               // de acordo com a tabela ASCII


            // Calcular segundo dígito.
            Soma = 0;
            Peso = 11;
            for (i = 0; i < 10; i++) {
                // Converter caractere na posição "i"  para número inteiro.
                // 48 é a posição de '0' na tabela ASCII.
                Numero = (int) (CPF.charAt(i) - 48);
                Soma = Soma + (Numero * Peso);
                Peso = Peso - 1;
            }
            // Depois da soma feita, calcular o dígito.    
            r = 11 - (Soma % 11);
            if ((r == 10) || (r == 11)) {   // Se o resultado do cálculo for 10 ou
                Digito2 = '0';              // 11, o valor do dígito será zero.
            } else {
                Digito2 = (char) (r + 48);  // Converte o inteiro em char
            }                               // de acordo com a tabela ASCII



            // Verificar se os dígitos estão corretos.
            if ((Digito1 == CPF.charAt(9)) && (Digito2 == CPF.charAt(10))) {
                return (true);  // Se os dígitos calculados forem iguais aos
            } else {            // da string informada, torna "verdadeiro",
                return (false); // caso contrário, retorna "falso".
            }
        } catch (InputMismatchException erro) { // Catch para caso dê algum erro
            return (false);                     // de conversão.
        }
    }
}
