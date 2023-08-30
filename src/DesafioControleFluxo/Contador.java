package DesafioControleFluxo;

import java.util.Scanner;
import DesafioControleFluxo.ContadorModel;
import DesafioControleFluxo.ParametrosInvalidosException;


public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro parâmetro: ");
            int parametroUm = scanner.nextInt();

            System.out.print("Digite o segundo parâmetro: ");
            int parametroDois = scanner.nextInt();

            ContadorModel model = new ContadorModel();
            model.setParametros(parametroUm, parametroDois);
            model.contar();
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}