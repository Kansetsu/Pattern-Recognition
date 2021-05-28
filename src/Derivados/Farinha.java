package Derivados;

import java.util.Arrays;
import java.util.Random;

public class Farinha {

    double minCor = 3;
    double maxCor = 5.6;
    double minForma = 0.7;
    double maxForma = 1.2;

    public Double[] corTreinamento = new Double[1000];
    public Double[] corTeste = new Double[1000];

    public Double[] formaTreinamento = new Double[1000];
    public Double[] formaTeste = new Double[1000];


    public double gerarNumeroAleatorio(double max, double min) {
        Random random = new Random();
        double numeroAleatorio = min + (max - min) * random.nextDouble();
        String numeroFormatado = String.format("%.2f", numeroAleatorio);
        return Double.parseDouble(numeroFormatado.replace(",", "."));
    }

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


    @Override
    public String toString() {
        return "Farinha: " +
                "\nCor Treinamento = " + Arrays.toString(corTreinamento) +
                "\n\nCor Teste = " + Arrays.toString(corTeste) +
                "\n\nForma Treinamento = " + Arrays.toString(formaTreinamento) +
                "\n\nForma Teste = " + Arrays.toString(formaTeste);
    }

}
