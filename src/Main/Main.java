package Main;

import Derivados.*;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


        while (true) {
            Scanner input = new Scanner(System.in);
            Oleos oleos = new Oleos();
            Farinha farinha = new Farinha();
            Cosmeticos cosmeticos = new Cosmeticos();
            Solventes solventes = new Solventes();
            Biodiesel biodiesel = new Biodiesel();



            oleos.gerarBaseDeDados();
            farinha.gerarBaseDeDados();
            cosmeticos.gerarBaseDeDados();
            solventes.gerarBaseDeDados();
            biodiesel.gerarBaseDeDados();


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

            System.out.println("\n=========Base de Dados: Soja=========\n" +
                    "Selecione uma das opções: " +
                    "\n1 - Exibir Acertos e Erros do derivado Óleo" +
                    "\n2 - Exibir Acertos e Erros do derivado Farinha" +
                    "\n3 - Exibir Acertos e Erros do derivado Cosmético" +
                    "\n4 - Exibir Acertos e Erros do derivado Solvente" +
                    "\n5 - Exibir Acertos e Erros do derivado Biodiesel" +
                    "\n6 - Exibir visão geral de Erros e Acertos" +
                    "\n7 - Exibir as Bases de Dados" +
                    "\n0 - Sair do programa");

            int entrada = input.nextInt();

            switch (entrada) {
                case 1:
                    //Acertos Oleos
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

                case 2:
                    //AcertosFarinha
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

                case 3:

                    //AcertosCosmeticos
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

                case 4:
                    //AcertosSolventes
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
                            "\nAcertos Cosmeticos: " + acertosGeralCosmeticos +
                            "\nErros Cosmeticos: " + errosGeralCosmeticos);
                    break;


                case 5:
                    //AcertosBiodiesel
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
                    System.out.println("O resultado de Cosmeticos é:" +
                            "\nAcertos Cosmeticos: " + acertosGeralCosmeticos +
                            "\nErros Cosmeticos: " + errosGeralCosmeticos);
                    break;

                case 6:
                    System.out.println("Visão geral com todos os produtos derivados da soja: " +
                            "\nAcertos Óleo: " + acertoGeralOleos +
                            "\nErros Óleo: " + errosGeralOleos +
                            "\nAcertos Farinha: " + acertosGeralFarinha +
                            "\nErros Farinha: " + errosGeralFarinha +
                            "\nAcertos Cosmeticos: " + acertosGeralCosmeticos +
                            "\nErros Cosmeticos: " + errosGeralCosmeticos +
                            "\nAcertos Solventes: " + acertosGeralSolventes +
                            "\nErros Solventes: " + errosGeralSolventes +
                            "\nAcertos Biodiesel: " + acertosGeralBiodiesel +
                            "\nErros Biodiesel: " + errosGeralBiodiesel);
                    break;

                case 7:
                    System.out.println(oleos);
                    System.out.println(farinha);
                    System.out.println(cosmeticos);
                    System.out.println(solventes);
                    System.out.println(biodiesel);

                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    System.exit(0);
            }

        }
    }
}
