package AulaRevisao1;

import java.util.Scanner;

public class ExemploRevisao {
    Scanner sc = new  Scanner(System.in);
    public void exemplo1(){
        //1.ler 1º nota
        System.out.println("Informe a primeira nota do aluno");
        int nota1 = sc.nextInt();
         //2.ler 2º nota
         System.out.println("Informe a segunda nota do aluno");
         int nota2 = sc.nextInt();
         //3. calcular média 
         double media = (nota1+nota2)/2;
         //4. mostrar a média 
         System.out.println("A média do aluno é "+media);
         //5. ler o total de aulas da disciplina 
         System.out.println("Informe o total de aulas da disciplina");
         int aulasDadas = sc.nextInt();
         //6. ler a quantidade de faltas do aluno
         System.out.println("Informe o total de faltas do aluno");
         int totalFaltas = sc.nextInt();
         //7. calcular a porcentagem de frequencia 
         double frequencia = (aulasDadas-totalFaltas)*100/aulasDadas;
         //8. mostrar a frequencia
         System.out.println("A frequencia do aluno é "+frequencia+"%");
         //9. se nota>=50 e frequencia>=75% entao aprovado
         if (media>=50 && frequencia>=75){
            System.out.println("Aluno Aprovado");
         }
         else if (media<50 && frequencia>=75){
            System.out.println("Aluno de recuperação");
         }

         //10. senão mostre reprovado
         else{
            System.out.println("Aluno Reprovado");
         }
    }
}