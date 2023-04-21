import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

import java.lang.String;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Básico Java");
        curso1.setDescricao("Descrição Curso Básico Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição Curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria de Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGutyere = new Dev();
        devGutyere.setNome("Gutyere");
        devGutyere.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Instritos Gutyere" + devGutyere.getConteudosInscritos());

        devGutyere.progredir();
        devGutyere.progredir();
        System.out.println("-");

        System.out.println("Conteúdos Instritos Gutyere" + devGutyere.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Gutyere" + devGutyere.getConteudosConcluidos());
        System.out.println("XP: " + devGutyere.calcularTotalXp());

        System.out.println(".......");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Instritos Camila" + devCamila.getConteudosInscritos());

        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");

        System.out.println("Conteúdos Instritos Camila" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Camila" + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

    }
}