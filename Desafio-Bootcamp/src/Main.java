import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
   public static void main(String[] args) {
        Curso curso1 = new Curso("Java", "Descrição do curso", 20);
        Curso curso2 = new Curso("POO", "descrição do curso", 30);
        //System.out.println(curso1);

        Mentoria mentoria = new Mentoria("Mentoria de Java", "Descrição da mentoria", LocalDate.now()); 
        //System.out.println(mentoria);

        //Conteudo conteudo = new Curso("Javascript", "descrição curso", 40);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devThiago = new Dev();
        devThiago.setNome("Thiago");
        devThiago.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + devThiago.getConteudosInscritos());
        devThiago.progredir();
        devThiago.progredir();
        System.out.println("Conteúdos Inscritos: " + devThiago.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + devThiago.getConteudosConcluidos());
        System.out.println("XP: " + devThiago.calcularTotalXp());

        System.out.println("-------------------");
        Dev devCarol = new Dev();
        devCarol.setNome("Carol");
        devCarol.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + devCarol.getConteudosInscritos());
        devCarol.progredir();
        System.out.println("Conteúdos Inscritos: " + devCarol.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + devCarol.getConteudosConcluidos());
        System.out.println("XP: " + devCarol.calcularTotalXp());
        
   } 
}

