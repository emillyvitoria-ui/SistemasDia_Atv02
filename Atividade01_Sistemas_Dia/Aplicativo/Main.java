package Atividade01_Sistemas_Dia.Aplicativo;

import Atividade01_Sistemas_Dia.Entidade.Biblioteca;
import Atividade01_Sistemas_Dia.Entidade.Matricula;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matricula matricula = new Matricula();
        Biblioteca biblioteca = new Biblioteca();
        System.out.println("Digite o número da sua matricula");
        matricula.numeroMatricula = sc.nextLine();
        if (matricula.numeroMatricula != null) {
            if (matricula.multas == 0) {
                System.out.println("Não há multas pendentes.");
            } else {
                System.out.println("Você tem " + matricula.multas + "multas pendentes.");
                System.out.println("Empréstimo bloqueado por multas.");
            }
            if (biblioteca.livros >= 3) {
                System.out.println("Limite de empréstimo atingido");
            } else {
                System.out.println("Você está liberado para escolher seu livro.");
            }
            if (matricula.multas == 0 && biblioteca.livros <= 3) {
                System.out.println("Digite o codigo do livro");
                biblioteca.Cod_livro = sc.nextLine();

                if (biblioteca.Cod_livro != null) {
                    System.out.println("Livro disponível.");
                    System.out.println("Deseja concluir o empréstimo?");
                    biblioteca.emprestimo = sc.nextLine();
                    if (biblioteca.emprestimo.equalsIgnoreCase("Sim")) {
                        System.out.println("Empréstimo realizado com sucesso.");
                    } else if (biblioteca.emprestimo.equalsIgnoreCase("Não")) {
                        System.out.println("Empréstimo inválido.");
                    } else {
                        System.out.println("ERRO");
                    }
                } else {
                    System.out.println("Livro indisponível");
                }
            }
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }
}