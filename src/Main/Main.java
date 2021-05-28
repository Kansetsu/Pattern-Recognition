package Main;

import Derivados.*;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

//Codicional que irá manter o sistema rodando até o usuário decidir encerrá-lo
        while (true) {

            //Objeto de entrada das condições do usuário
            Scanner input = new Scanner(System.in);

            //Objetos das classes derivadas da soja
            Oleos oleos = new Oleos();
            Farinha farinha = new Farinha();
            Cosmeticos cosmeticos = new Cosmeticos();
            Solventes solventes = new Solventes();
            Biodiesel biodiesel = new Biodiesel();


            //Função que vai gerar as bases de dados e preencher as listas com seus determinados parâmetros
            oleos.gerarBaseDeDados();
            farinha.gerarBaseDeDados();
            cosmeticos.gerarBaseDeDados();
            solventes.gerarBaseDeDados();
            biodiesel.gerarBaseDeDados();

            //Variáveis que irão armazenar a validação dos Derivados da soja
            int acertoGeralOleos = 0;
            int errosGeralOleos = 0;

            int acertosGeralFarinha = 0;
            int errosGeralFarinha = 0;

            int acertosGeralCosmeticos = 0;
            int errosGeralCosmeticos = 0;

            int acertosGeralSolventes = 0;
            int errosGeralSolventes = 0;

            int acertosGeralBiodiesel = 0;
            int errosGeralBiodiesel = 0;

            //Exibição do menu interativo onde o usuário escolhe o que será exibido
            System.out.println("\n=========Base de Dados: Soja=========\n" +
                    "Selecione uma das opções: " +
                    "\n1 - Exibir Acertos e Erros do derivado Óleo" +
                    "\n2 - Exibir Acertos e Erros do derivado Farinha" +
                    "\n3 - Exibir Acertos e Erros do derivado Cosmético" +
                    "\n4 - Exibir Acertos e Erros do derivado Solvente" +
                    "\n5 - Exibir Acertos e Erros do derivado Biodiesel" +
                    "\n6 - Exibir as Bases de Dados" +
                    "\n0 - Sair do programa");

            //Varíavel que irá receber a escolha do usuário
            int entrada = input.nextInt();

            //Condicional de casos onde será encaminhada a escolha do usuário ao processo escolhido
            switch (entrada) {


                //Faz os cálculos usando o Cityblocks e exibirá o resultado esperado para o derivado Oleos
                case 1:
                    for (int i = 0; i < 1000; i++) {
                        double acertoOleos = Math.abs((oleos.corTreinamento[i] - oleos.separarBaseDeDadosCor()) + (oleos.formaTreinamento[i] - oleos.separarBaseDeDadosForma()));
                        double erroFarinha = Math.abs((farinha.corTreinamento[i] - farinha.separarBaseDeDadosCor()) + (farinha.formaTreinamento[i] - farinha.separarBaseDeDadosForma()));
                        double erroCosmetico = Math.abs((cosmeticos.corTreinamento[i] - cosmeticos.separarBaseDeDadosCor()) + (cosmeticos.formaTreinamento[i] - cosmeticos.separarBaseDeDadosForma()));
                        double erroSolventes = Math.abs((solventes.corTreinamento[i] - solventes.separarBaseDeDadosCor()) + (solventes.formaTreinamento[i] - solventes.separarBaseDeDadosForma()));
                        double erroBiodiesel = Math.abs((biodiesel.corTreinamento[i] - biodiesel.separarBaseDeDadosCor()) + (biodiesel.formaTreinamento[i] - biodiesel.separarBaseDeDadosForma()));

                        if (acertoOleos < erroFarinha && acertoOleos < erroCosmetico && acertoOleos < erroSolventes && acertoOleos < erroBiodiesel) {
                            acertoGeralOleos += 1;
                        } else {
                            errosGeralOleos += 1;
                        }

                    }
                    System.out.println("O resultado de Oleo é:" +
                            "\nAcertos Oleos: " + acertoGeralOleos +
                            "\nErros Oleos: " + errosGeralOleos);
                    break;

                //Faz os cálculos usando o Cityblocks e exibirá o resultado esperado para o derivado Farinha
                case 2:
                    for (int i = 0; i < 1000; i++) {
                        double acertoFarinha = Math.abs((farinha.corTreinamento[i] - farinha.separarBaseDeDadosCor()) + (farinha.formaTreinamento[i] - farinha.separarBaseDeDadosForma()));
                        double erroOleos = Math.abs((oleos.corTreinamento[i] - oleos.separarBaseDeDadosCor()) + (oleos.formaTreinamento[i] - oleos.separarBaseDeDadosForma()));
                        double erroCosmetico = Math.abs((cosmeticos.corTreinamento[i] - cosmeticos.separarBaseDeDadosCor()) + (cosmeticos.formaTreinamento[i] - cosmeticos.separarBaseDeDadosForma()));
                        double erroSolventes = Math.abs((solventes.corTreinamento[i] - solventes.separarBaseDeDadosCor()) + (solventes.formaTreinamento[i] - solventes.separarBaseDeDadosForma()));
                        double erroBiodiesel = Math.abs((biodiesel.corTreinamento[i] - biodiesel.separarBaseDeDadosCor()) + (biodiesel.formaTreinamento[i] - biodiesel.separarBaseDeDadosForma()));

                        if (acertoFarinha < erroOleos && acertoFarinha < erroCosmetico && acertoFarinha < erroSolventes && acertoFarinha < erroBiodiesel) {
                            acertosGeralFarinha += 1;
                        } else {
                            errosGeralFarinha += 1;
                        }


                    }
                    System.out.println("O resultado de Farinha é:" +
                            "\nAcertos Farinha: " + acertosGeralFarinha +
                            "\nErros Farinha: " + errosGeralFarinha);
                    break;

                //Faz os cálculos usando o Cityblocks e exibirá o resultado esperado para o derivado Cosmeticos
                case 3:
                    for (int i = 0; i < 1000; i++) {
                        double acertoCosmetico = Math.abs((cosmeticos.corTreinamento[i] - cosmeticos.separarBaseDeDadosCor()) + (cosmeticos.formaTreinamento[i] - cosmeticos.separarBaseDeDadosForma()));
                        double erroOleos = Math.abs((oleos.corTreinamento[i] - oleos.separarBaseDeDadosCor()) + (oleos.formaTreinamento[i] - oleos.separarBaseDeDadosForma()));
                        double erroFarinha = Math.abs((farinha.corTreinamento[i] - farinha.separarBaseDeDadosCor()) + (farinha.formaTreinamento[i] - farinha.separarBaseDeDadosForma()));
                        double erroSolventes = Math.abs((solventes.corTreinamento[i] - solventes.separarBaseDeDadosCor()) + (solventes.formaTreinamento[i] - solventes.separarBaseDeDadosForma()));
                        double erroBiodiesel = Math.abs((biodiesel.corTreinamento[i] - biodiesel.separarBaseDeDadosCor()) + (biodiesel.formaTreinamento[i] - biodiesel.separarBaseDeDadosForma()));

                        if (acertoCosmetico < erroFarinha && acertoCosmetico < erroOleos && acertoCosmetico < erroSolventes && acertoCosmetico < erroBiodiesel) {
                            acertosGeralCosmeticos += 1;
                        } else {
                            errosGeralCosmeticos += 1;
                        }

                    }
                    System.out.println("O resultado de Cosmeticos é:" +
                            "\nAcertos Cosmeticos: " + acertosGeralCosmeticos +
                            "\nErros Cosmeticos: " + errosGeralCosmeticos);
                    break;

                //Faz os cálculos usando o Cityblocks e exibirá o resultado esperado para o derivado Solventes
                case 4:
                    for (int i = 0; i < 1000; i++) {
                        double acertoSolventes = Math.abs((solventes.corTreinamento[i] - solventes.separarBaseDeDadosCor()) + (solventes.formaTreinamento[i] - solventes.separarBaseDeDadosForma()));
                        double erroOleos = Math.abs((oleos.corTreinamento[i] - oleos.separarBaseDeDadosCor()) + (oleos.formaTreinamento[i] - oleos.separarBaseDeDadosForma()));
                        double erroFarinha = Math.abs((farinha.corTreinamento[i] - farinha.separarBaseDeDadosCor()) + (farinha.formaTreinamento[i] - farinha.separarBaseDeDadosForma()));
                        double erroCosmetico = Math.abs((cosmeticos.corTreinamento[i] - cosmeticos.separarBaseDeDadosCor()) + (cosmeticos.formaTreinamento[i] - cosmeticos.separarBaseDeDadosForma()));
                        double erroBiodiesel = Math.abs((biodiesel.corTreinamento[i] - biodiesel.separarBaseDeDadosCor()) + (biodiesel.formaTreinamento[i] - biodiesel.separarBaseDeDadosForma()));

                        if (acertoSolventes < erroFarinha && acertoSolventes < erroCosmetico && acertoSolventes < erroOleos && acertoSolventes < erroBiodiesel) {
                            acertosGeralSolventes += 1;
                        } else {
                            errosGeralSolventes += 1;
                        }


                    }
                    System.out.println("O resultado de Cosmeticos é:" +
                            "\nAcertos Solventes: " + acertosGeralSolventes +
                            "\nErros Solventes: " + errosGeralSolventes);
                    break;


                //Faz os cálculos usando o Cityblocks e exibirá o resultado esperado para o derivado Biodiesel
                case 5:
                    for (int i = 0; i < 1000; i++) {
                        double acertosBiodiesel = Math.abs((biodiesel.corTreinamento[i] - biodiesel.separarBaseDeDadosCor()) + (biodiesel.formaTreinamento[i] - biodiesel.separarBaseDeDadosForma()));
                        double erroOleos = Math.abs((oleos.corTreinamento[i] - oleos.separarBaseDeDadosCor()) + (oleos.formaTreinamento[i] - oleos.separarBaseDeDadosForma()));
                        double erroFarinha = Math.abs((farinha.corTreinamento[i] - farinha.separarBaseDeDadosCor()) + (farinha.formaTreinamento[i] - farinha.separarBaseDeDadosForma()));
                        double erroCosmetico = Math.abs((cosmeticos.corTreinamento[i] - cosmeticos.separarBaseDeDadosCor()) + (cosmeticos.formaTreinamento[i] - cosmeticos.separarBaseDeDadosForma()));
                        double erroSolventes = Math.abs((solventes.corTreinamento[i] - solventes.separarBaseDeDadosCor()) + (solventes.formaTreinamento[i] - solventes.separarBaseDeDadosForma()));

                        if (acertosBiodiesel < erroFarinha && acertosBiodiesel < erroCosmetico && acertosBiodiesel < erroSolventes && acertosBiodiesel < erroOleos) {
                            acertosGeralBiodiesel += 1;
                        } else {
                            errosGeralBiodiesel += 1;
                        }


                    }
                    System.out.println("O resultado de Biodiesel é:" +
                            "\nAcertos Biodiesel: " + acertosGeralBiodiesel +
                            "\nErros Biodiesel: " + errosGeralBiodiesel);
                    break;

                    //Exibirá todas as bases de dados com as listas preenchidas
                case 6:
                    System.out.println(oleos);
                    System.out.println(farinha);
                    System.out.println(cosmeticos);
                    System.out.println(solventes);
                    System.out.println(biodiesel);

                    break;

                    //Encerrará o programa
                case 0:
                    System.out.println("Saindo do programa...");
                    System.exit(0);
            }

        }
    }
}
