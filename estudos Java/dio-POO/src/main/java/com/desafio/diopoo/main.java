package com.desafio.diopoo;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("Descrição bootcamp Java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Camila");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Camila: " + dev.getConteudosInscritos());

        dev.progredir();
        dev.progredir();

        System.out.println("Conteúdos inscritos Camila: " + dev.getConteudosInscritos());

        System.out.println("Conteúdos concluídos Camila: " + dev.getConteudosConcluidos());

        System.out.println("XP Camila: " + dev.calcularTotalXp());

        System.out.println("------------------------------------");

        Dev dev2 = new Dev();
        dev2.setNome("João");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João: " + dev2.getConteudosInscritos());

        dev2.progredir();
        dev2.progredir();
        dev2.progredir();

        System.out.println("Conteúdos inscritos João: " + dev.getConteudosInscritos());

        System.out.println("Conteúdos Concluídos João: " + dev2.getConteudosConcluidos());

        System.out.println("XP João: " + dev.calcularTotalXp());



    }

}
