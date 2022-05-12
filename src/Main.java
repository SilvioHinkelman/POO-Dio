import br.com.br.desafio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        Mentoria mentoria= new Mentoria();
        mentoria.setTitulo("mentoria Java");
        mentoria.setDescricao("descricao Java");
        mentoria.setData(LocalDate.now());

        /*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
        */
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Dev");
        bootcamp.setDecricao("Descrição Bootcamp Java Dev");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos Camila" +devCamila.getConteudosInscritos());

        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Incritos Camila" +devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Camila" +devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("------------------------------------------------------------");

        Dev devSilvio = new Dev();
        devSilvio.setNome("Silvio");
        devSilvio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos Silvio" +devSilvio.getConteudosInscritos());

        devSilvio.progredir();
        devSilvio.progredir();
        devSilvio.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Incritos Silvio" +devSilvio.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Camila" +devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devSilvio.calcularTotalXp());
    }
}
