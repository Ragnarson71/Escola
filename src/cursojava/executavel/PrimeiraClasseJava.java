package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

    public static void main(String[] args) {
        /* new Aluno() e' uma instancia - criacao de objeto*/
        /* aluno1 e' uma referencias para o objeto*/

        Aluno aluno1 = new Aluno();

        aluno1.setNome("Jurumelo A. da S. Junior");
        aluno1.setIdade(42);
        aluno1.setDataNascimento("10/05/1971");
        aluno1.setRegistroGeral("676763662299010");
        aluno1.setNumeroCPF("25.0071.66936-78");
        aluno1.setNomeMae("Jumbraina Zozima da silva");
        aluno1.setNomePai("Jurumelo Altenistoncley da Silva");
        aluno1.setDataMatricula("01/02/2018");
        aluno1.setNomeEscola("EEPSG Zetembrina Pafuncia");
        aluno1.setSerieMatriculado("8");


        System.out.println("O nome do aluno e': " + aluno1.getNome());
        System.out.println("A idade do aluno e': " + aluno1.getIdade());
        System.out.println("A data de nascimento do aluno e': " + aluno1.getDataNascimento());
        System.out.println("O RG do aluno e': " + aluno1.getRegistroGeral());
        System.out.println("O CPF do aluno e': " + aluno1.getNumeroCPF());
        System.out.println("O nome da mae e': " + aluno1.getNomeMae());
        System.out.println("O nome do pai e': " + aluno1.getNomePai());
        System.out.println("A data da matricula e': " + aluno1.getDataMatricula());
        System.out.println("O nome da escola e': " + aluno1.getNomeEscola());
        System.out.println("A serie da matricula e': " + aluno1.getSerieMatriculado());

        System.out.println("____________________________________________________________________________");

        Aluno aluno2 = new Aluno();

        aluno2.setNome("Genovevo Escarlate");
        aluno2.setIdade(30);
        aluno2.setDataNascimento("10/05/1990");
        aluno2.setRegistroGeral("6727752912856610");
        aluno2.setNumeroCPF("25.2291.776223-99");
        aluno2.setNomeMae("Zetembrina de Oliveira");
        aluno2.setNomePai("Darci Junqueira");
        aluno2.setDataMatricula("01/02/2019");
        aluno2.setNomeEscola("English school vai tomar no cool");
        aluno2.setSerieMatriculado("1");


        System.out.println("O nome do aluno e': " + aluno2.getNome());
        System.out.println("A idade do aluno e': " + aluno2.getIdade());
        System.out.println("A data de nascimento do aluno e': " + aluno2.getDataNascimento());
        System.out.println("O RG do aluno e': " + aluno2.getRegistroGeral());
        System.out.println("O CPF do aluno e': " + aluno2.getNumeroCPF());
        System.out.println("O nome da mae e': " + aluno2.getNomeMae());
        System.out.println("O nome do pai e': " + aluno2.getNomePai());
        System.out.println("A data da matricula e': " + aluno2.getDataMatricula());
        System.out.println("O nome da escola e': " + aluno2.getNomeEscola());
        System.out.println("A serie da matricula e': " + aluno2.getSerieMatriculado());

        System.out.println("____________________________________________________________________________");

        Aluno aluno3 = new Aluno();

        aluno3.setNome("Agnarcia Jurema");
        aluno3.setIdade(50);
        aluno3.setDataNascimento("10/05/1971");
        aluno3.setRegistroGeral("01928374656");
        aluno3.setNumeroCPF("12.3344.203947-88");
        aluno3.setNomeMae("Esteleomar Cardoso");
        aluno3.setNomePai("Xerxes Malbaio");
        aluno3.setDataMatricula("11/02/2020");
        aluno3.setNomeEscola("English school vai tomar no cool");
        aluno3.setSerieMatriculado("1");


        System.out.println("O nome do aluno e': " + aluno3.getNome());
        System.out.println("A idade do aluno e': " + aluno3.getIdade());
        System.out.println("A data de nascimento do aluno e': " + aluno3.getDataNascimento());
        System.out.println("O RG do aluno e': " + aluno3.getRegistroGeral());
        System.out.println("O CPF do aluno e': " + aluno3.getNumeroCPF());
        System.out.println("O nome da mae e': " + aluno3.getNomeMae());
        System.out.println("O nome do pai e': " + aluno3.getNomePai());
        System.out.println("A data da matricula e': " + aluno3.getDataMatricula());
        System.out.println("O nome da escola e': " + aluno3.getNomeEscola());
        System.out.println("A serie da matricula e': " + aluno3.getSerieMatriculado());







    }


}
