package SrcumJava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ScrumBoard scrum = new ScrumBoard();
        Scanner input = new Scanner(System.in);
        int op;
        
        do {
            System.out.println("================================");
            System.out.println("Menu de Opções: ");
            System.out.println("1-Adicionar Tarefa");
            System.out.println("2-Visualizar Tarefas");
            System.out.println("3-Marcar Tarefa como Concluída");
            System.out.println("4-Sair");
            System.out.print("Escolha uma opção: ");
            op = input.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Digite a descrição da tarefa: ");
                    input.nextLine(); 
                    String description = input.nextLine();
                    Task task = new Task(description, false);
                    scrum.add_task(task);
                    break;
                case 2:
                    scrum.view_tasks();
                    break;
                case 3:
                    System.out.print("Digite o índice da tarefa a ser marcada como concluída: ");
                    int taskIndex = input.nextInt();
                    scrum.mark_task_completed(taskIndex);
                    System.out.println("Tarefa Concluida Com Sucesso!!");
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (op != 4);
        
        input.close();
    }
}

