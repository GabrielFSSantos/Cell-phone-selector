package Algoritimos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Controle {

    public static ArrayList<Celular> celulares = new ArrayList<Celular>();
    public static ArrayList<Celular> celFiltro = new ArrayList<Celular>();
    public static int indices[] = new int[3];
    public static String analise;

    //Realiza a Leitura do Arquivo
    public void fileRead() throws IOException {

        celulares.clear();
        Path arquivo = Paths.get("src\\Algoritimos\\dados.dat");
        byte[] linha = Files.readAllBytes(arquivo);
        String coluna = new String(linha);
        Scanner imput = new Scanner(arquivo);

        for (int i = 0; i < 40; i++) {

            Celular aux = new Celular();

            aux.codigo = imput.nextInt();
            aux.nome = imput.next();
            aux.preco = imput.nextFloat();
            aux.hardware = imput.nextFloat();
            aux.tela = imput.nextFloat();
            aux.camera = imput.nextFloat();
            aux.custoBe = imput.nextFloat();
            aux.desempenho = imput.nextFloat();

            celulares.add(aux);
        }
    }

    //Aplica as Notas do Usuário nos Celulares
    public void aplicaNota(Celular aux) {

        celFiltro.clear();
        for (int i = 0; i < celulares.size(); i++) {

            celFiltro.add(i, celulares.get(i));

            celFiltro.get(i).camera = celFiltro.get(i).camera * aux.camera;
            celFiltro.get(i).hardware = celFiltro.get(i).hardware * aux.hardware;
            celFiltro.get(i).custoBe = celFiltro.get(i).custoBe * aux.custoBe;
            celFiltro.get(i).desempenho = celFiltro.get(i).desempenho * aux.desempenho;
            celFiltro.get(i).tela = celFiltro.get(i).tela * aux.tela;

            celFiltro.get(i).nota = celFiltro.get(i).camera + celFiltro.get(i).hardware + celFiltro.get(i).custoBe + celFiltro.get(i).desempenho + celFiltro.get(i).tela;
        }
        perfil(aux);
        filtro(aux);
    }

    //Realiza a Filtragem dos Celulares
    public void filtro(Celular aux) {

        indices[0] = 13;
        indices[1] = 13;
        indices[2] = 13;

        double maior = (double) celFiltro.get(13).nota;

        //captura o maior indicie
        for (int i = 0; i < celFiltro.size(); i++) {

            //a maior soma so é capturada se o preço estiver dentro do preço maximo
            if ((double) celFiltro.get(i).nota >= maior && celFiltro.get(i).preco <= aux.preco) {

                maior = (double) celFiltro.get(i).nota;
                indices[0] = i;//captura o indicie do maior
            }
        }

        maior = (double) celFiltro.get(13).nota;

        //captura o segundo maior indicie
        for (int i = 0; i < 20; i++) {

            //a maior soma so é capturada se o preço estiver dentro do preço maximo
            if ((double) celFiltro.get(i).nota >= maior && celFiltro.get(i).preco <= aux.preco && i != indices[0]) {

                maior = (double) celFiltro.get(i).nota;
                indices[1] = i;//captura o indicie do maior
            }
        }

        maior = (double) celFiltro.get(13).nota;

        //captura o terceiro maior indicie
        for (int i = 0; i < celFiltro.size(); i++) {

            //a maior soma so é capturada se o preço estiver dentro do preço maximo
            if ((double) celFiltro.get(i).nota >= maior && celFiltro.get(i).preco <= aux.preco && i != indices[0] && i != indices[1]) {

                maior = (double) celFiltro.get(i).nota;
                indices[2] = i;//captura o indicie do maior
            }
        }
    }

    //Realiza a Analise do Perfil do Usuario
    public void perfil(Celular aux) {

        analise = "     A partir das analises realizadas, ";

        if (aux.hardware >= 3.0 && aux.desempenho >= 3.0) {

            analise = analise + "Voce é um usuario "
                    + "que se importa muito com aplicações que exigem bom poder "
                    + "de processamento, como jogos por exemplo. Leva em consideração "
                    + "uma boa combinação entre hardware e desempenho. ";
        }

        if (aux.hardware < 3.0 && aux.desempenho < 3.0) {

            analise = analise + "Voce e um usuario que não exige muito de desempenho "
                    + "do smartphone, apenas uso casual. ";
        }

        if (aux.hardware < 3.0 && aux.desempenho >= 3.0) {

            analise = analise + "Voce e um usuario que não exige muito hardware do seu "
                    + "aprelho, entretanto exige um sitema que funcione bem, "
                    + "que utilize o hardware da melhor forma possivel. ";
        }

        if (aux.hardware >= 3.0 && aux.desempenho < 3.0) {

            analise = analise + "Voce e um usuario que exige muito hardware do seu aprelho, "
                    + "entretanto não se importa muito com sistemas atualizados "
                    + "por exemplo, acredita que um hardware potente consegue de "
                    + "certa forma compensar sistemas lentos , ou antigos. ";
        }

        if (aux.custoBe <= 2.0) {

            analise = analise + "Porem esta disposto a pagar por suas necessidades, dentro "
                    + "do seus limites é claro. ";
        }

        if (aux.custoBe >= 3.0) {

            analise = analise + "E leva muito em consideração o valor atribuido a esse "
                    + "produto. ";
        }

        if (aux.camera <= 2.0) {

            analise = analise + "Enxerga a camera apenas com uma ferramenta necessaria, "
                    + "nada demais. ";
        }

        if (aux.camera >= 3.0) {

            analise = analise + "Não abre mão de uma boa camera para registrar seus momentos. ";
        }

        if (aux.tela <= 2.0) {

            analise = analise + "Para economizar um pouco não da aquela importancia pra tela, "
                    + "não enxerga esse fato como diferencial. ";
        }

        if (aux.tela >= 3.0 && aux.camera >= 3.0 && aux.hardware >= 3.0 && aux.desempenho >= 3.0) {

            analise = analise + "Da impotancia para tela, afinal ela te ajuda muito em "
                    + "determinados jogos por exemplo, voce tambem da impotancia "
                    + "a suas fotos, então uma tela te auxilia para vizuali-lás. ";
        }

        if (aux.tela >= 3.0 && aux.camera >= 3.0 && aux.hardware < 3.0 && aux.desempenho < 3.0) {

            analise = analise + "Da impotancia para tela, afinal ela é importante para "
                    + "vizualizar suas fotos por exemplo. ";
        }

        if (aux.tela >= 3 && aux.camera < 3 && aux.hardware >= 3 || aux.desempenho >= 3) {

            analise = analise + "Da impotancia para tela, afinal ela te ajuda muito em "
                    + "determinados jogos por exemplo. ";
        }

        analise = analise + "Estes são os possíveis Smartphones que lhe atendem: ";

    }

}
