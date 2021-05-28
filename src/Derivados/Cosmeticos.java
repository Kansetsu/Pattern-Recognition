package Derivados;

import java.util.Arrays;
import java.util.Random;

public class Cosmeticos {

    //Parâmetros para preenchimento das listas. Limites máximos e minímos para preenchimento

    double minCor = 3.4;
    double maxCor = 4.9;
    double minForma = 2;
    double maxForma = 3.1;

    //Listas com as bases de dados
    public Double[] corTreinamento = new Double[1000];
    public Double[] corTeste = new Double[1000];

    public Double[] formaTreinamento = new Double[1000];
    public Double[] formaTeste = new Double[1000];

    //Função que gera um número aleatório e formata ele para poder ser preenchido pela lista
    public double gerarNumeroAleatorio(double max, double min) {
        Random random = new Random();
        double numeroAleatorio = min + (max - min) * random.nextDouble();
        String numeroFormatado = String.format("%.2f", numeroAleatorio);
        return Double.parseDouble(numeroFormatado.replace(",", "."));
    }

    //Função que gera a base de dados, preenchendo as listas, respectivamente, com números aleatórios dentro do range pré-estabelecido
    public void gerarBaseDeDados() {
        for (int i = 0; i < corTreinamento.length; i++) {
            corTreinamento[i] = gerarNumeroAleatorio(maxCor, minCor);
        }
        for (int i = 0; i < corTeste.length; i++) {
            corTeste[i] = gerarNumeroAleatorio(maxCor, minCor);
        }
        for (int i = 0; i < formaTreinamento.length; i++) {
            formaTreinamento[i] = gerarNumeroAleatorio(maxForma, minForma);
        }
        for (int i = 0; i < formaTeste.length; i++) {
            formaTeste[i] = gerarNumeroAleatorio(maxForma, minForma);
        }
    }


    //Função que retorna a base de dados separada para teste/treinamento de cor
    public double separarBaseDeDadosCor(){
        double somaCor = 0;
        for (int i = 0; i<1000; i++){
            somaCor += corTreinamento[i];
        }
        return somaCor / corTreinamento.length;
    }

    public double separarBaseDeDadosForma(){
        double somaForma = 0;
        for (int i = 0; i<1000; i++){
            somaForma += formaTreinamento[i];
        }
        return somaForma / formaTreinamento.length;
    }


    //Função que retornará uma String com as listas e seus respectivos conteúdos
    @Override
    public String toString() {
        return "Cosméticos: " +
                "\nCor Treinamento = " + Arrays.toString(corTreinamento) +
                "\n\nCor Teste = " + Arrays.toString(corTeste) +
                "\n\nForma Treinamento = " + Arrays.toString(formaTreinamento) +
                "\n\nForma Teste = " + Arrays.toString(formaTeste);
    }

}


