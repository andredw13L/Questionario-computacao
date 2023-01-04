import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int resposta , pontuação = 0, escolha, bonus = -1, sleep = 2000;
        String nome;


        // Limpar o terminal
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.print("Digite o seu nome: ");
        Scanner sc = new Scanner(System.in);
        nome = sc.nextLine();

        System.out.println("\nOlá, " + nome);

        // Sleep
        Thread.sleep(sleep);

        // Limpar o terminal
        System.out.print("\033[H\033[2J");
        System.out.flush();

        do {
            
            // Pergunta 1
            System.out.println("Pergunta 1 – Qual desses cientistas da computação é considerado o pai da computação?\n\n");
            System.out.println("1)Charles Babbage");
            System.out.println("2)John William Mauchly");
            System.out.println("3)Alan Turing");
            System.out.println("4)Tom Killburn");
            System.out.println("5)Konrad Zuse");

            System.out.print("\nResposta: ");
            resposta = sc.nextInt();

            if(resposta == 3){
                System.out.println("acertou!");
                pontuação++;
            }else{
                System.out.println("errou!");
            }

            // Sleep
            Thread.sleep(sleep);

            // Limpar o terminal
            System.out.print("\033[H\033[2J");
            System.out.flush();


            // Pergunta 2
            System.out.println("Pergunta 2 – Quem foi o(a) primeiro programador(a) da história?\n\n");
            System.out.println("1)Almirante Grace Hopper");
            System.out.println("2)Al-Khwarizmi");
            System.out.println("3)Blaise Pascal");
            System.out.println("4)Ada Lovelace");
            System.out.println("5)Charles Babbage");

            System.out.print("\nResposta: ");
            resposta = sc.nextInt();

            if(resposta == 4){
                System.out.println("acertou!");
                pontuação++;
            }else{
                System.out.println("errou!");
            }

            // Sleep
            Thread.sleep(sleep);

            // Limpar o terminal
            System.out.print("\033[H\033[2J");
            System.out.flush();

            // Pergunta 3
            System.out.println("Pergunta 3 – Qual foi a primeira linguagem de programação?\n\n");
            System.out.println("1)Linguagem C");
            System.out.println("2)COBOL");
            System.out.println("3)ADA");
            System.out.println("4)Fortran");
            System.out.println("5)Plankakül");

            System.out.print("\nResposta: ");
            resposta = sc.nextInt();

            if(resposta == 3){
                System.out.println("acertou!");
                pontuação++;
            }else{
                System.out.println("errou!");
            }

            // Sleep
            Thread.sleep(sleep);

            // Limpar o terminal
            System.out.print("\033[H\033[2J");
            System.out.flush();

            // Pergunta 4
            System.out.println("Pergunta 4 – Qual era o nome da máquina de criptografia alemã utilizada na segunda guerra mundial?\n\n");
            System.out.println("1)Pompeius");
            System.out.println("2)Enigma");
            System.out.println("3)Code incognitum");
            System.out.println("4)Hutmacher schach");
            System.out.println("5)Criptomaquina 3000");


            System.out.print("\nResposta: ");
            resposta = sc.nextInt();

            if(resposta == 2){
                System.out.println("acertou!");
                pontuação++;
            }else{
                System.out.println("errou!");
            }

            // Sleep
            Thread.sleep(sleep);

            // Limpar o terminal
            System.out.print("\033[H\033[2J");
            System.out.flush();

            // Pergunta 5
            System.out.println("Pergunta 5 – Sobre ciência da computação responda quais das afirmações estão corretas.\n\n");
            System.out.println("I – Ciência da computação não pode ser classificada na área ciências exatas e sim na área de ciências contábeis.");
            System.out.println("II – As ciências da computação estuda as técnicas, metodologias, instrumentos computacionais e aplicações tecnológicas, que informatizem os processos e desenvolvam soluções de processamento de dados de entrada e saída pautados no computador, de forma que se transforme em informação.");
            System.out.println("III – A primeira ferramenta conhecida para a computação foi o ábaco.");
            System.out.println("IV – Os estudos originados da ciência da computação podem ser aplicados em qualquer área do conhecimento humano em que seja possível definir métodos de resolução de problemas baseados em repetições previamente observadas.\n\n");
            System.out.println("1)II e III");
            System.out.println("2)I, III e IV");
            System.out.println("3)I e IV");
            System.out.println("4)II, III e IV");
            System.out.println("5)Todas as afirmações estão corretas");

            System.out.print("\nResposta: ");
            resposta = sc.nextInt();

            if(resposta == 4){
                System.out.println("acertou!");
                pontuação++;
            }else{
                System.out.println("errou!");
            }

            // Sleep
            Thread.sleep(sleep);

            // Limpar o terminal
            System.out.print("\033[H\033[2J");
            System.out.flush();


            // Pergunta 5
            System.out.println("Pergunta 6 – Quem criou a linguagem de programação C?\n\n");
            System.out.println("1)André Ribeiro");
            System.out.println("2)Dennis Ritchie");
            System.out.println("3)James Gosling");
            System.out.println("4)Guido van Rossum");
            System.out.println("5)Rasmus Lerdorf");

            System.out.print("\nResposta: ");
            resposta = sc.nextInt();

            if(resposta == 2){
                System.out.println("acertou!");
                pontuação++;
            }else{
                System.out.println("errou!");
            }

            // Sleep
            Thread.sleep(sleep);

            // Limpar o terminal
            System.out.print("\033[H\033[2J");
            System.out.flush();


            // Pergunta 7
            System.out.println("Pergunta 7 – complete o texto");
            System.out.println("Java é uma linguagem de programação orientada a objetos que começou a ser criada em ____, na Sun Microsystems. Teve início com o Green Project, no qual os mentores foram Patrick Naughton, Mike Sheridan, e James Gosling.\n\n");
            System.out.println("1)1991");
            System.out.println("2)1989");
            System.out.println("3)1992");
            System.out.println("4)1999");
            System.out.println("5)1995");

            System.out.print("\nResposta: ");
            resposta = sc.nextInt();

            if(resposta == 1){
                System.out.println("acertou!");
                pontuação++;
            }else{
                System.out.println("errou!");
            }

            // Sleep
            Thread.sleep(sleep);

            // Limpar o terminal
            System.out.print("\033[H\033[2J");
            System.out.flush();
            


            // Pergunta 8
            System.out.println("Pergunta 8 – Qual o nome da criadora da linguagem COBOL?\n\n");
            System.out.println("1)Almirante Grace Hopper");
            System.out.println("2)Ada Lovelace");
            System.out.println("3)Jean Jennings Bartik");
            System.out.println("4)Hedy Lamarr");
            System.out.println("5)Karen Spärck Jones");

            System.out.print("\nResposta: ");
            resposta = sc.nextInt();

            if(resposta == 1){
                System.out.println("acertou!");
                pontuação++;
            }else{
                System.out.println("errou!");
            }

            // Sleep
            Thread.sleep(sleep);

            // Limpar o terminal
            System.out.print("\033[H\033[2J");
            System.out.flush();


            // Pergunta 9
            System.out.println("Pergunta 9 – Qual desses NÃO é uma linguagem de programação.\n");
            System.out.println("1)Ruby");
            System.out.println("2)C#");
            System.out.println("3)Python");
            System.out.println("4)Java");
            System.out.println("5)Https");

            System.out.print("\nResposta: ");
            resposta = sc.nextInt();

            if(resposta == 5){
                System.out.println("acertou!");
                pontuação++;
            }else{
                System.out.println("errou!");
            }

            // Sleep
            Thread.sleep(sleep);

            // Limpar o terminal
            System.out.print("\033[H\033[2J");
            System.out.flush();

            // Pergunta 10
            System.out.println("Pergunta 10 – Quem é o pai da lógica de programação?\n\n");
            System.out.println("1)George Boole");
            System.out.println("2)Charles Babbage");
            System.out.println("3)Daniel Ferreira");
            System.out.println("4)Blaise Pascal");
            System.out.println("5)Maurice Vicent Wilkes");

            System.out.print("\nResposta: ");
            resposta = sc.nextInt();

            if(resposta == 1){
                System.out.println("acertou!");
                pontuação++;
            }else{
                System.out.println("errou!");
            }

            // Sleep
            Thread.sleep(sleep);

            // Limpar o terminal
            System.out.print("\033[H\033[2J");
            System.out.flush();

            if(pontuação == 10) {

                // Pergunta bônus
                System.out.println("Pergunta bonus – O que é o software?\n\n");
                System.out.println("1)Conjunto de programas que permite o funcionamento e utilização da máquina.");
                System.out.println("2)Conjunto de componente que permite o funcionamento e utilização do sistema operacional.");
                System.out.println("3)Conjunto de programas que permite o funcionamento e utilização do navegador.");
                System.out.println("4)Conjunto de componentes que formam a parte física do computador.");
                System.out.println("5)Conjunto de componentes que permitem o acesso à internet.");

                System.out.print("\nResposta: ");
                resposta = sc.nextInt();

                if(resposta == 1){
                    System.out.println("acertou!");
                    bonus = 1;
                }else{
                    System.out.println("errou!");
                    bonus = 0;
                }
    
                // Sleep
                Thread.sleep(sleep);
    
                // Limpar o terminal
                System.out.print("\033[H\033[2J");
                System.out.flush();
                
            }


            // Encerrar o quiz
            System.out.print("Digite 1 caso não queira refazer o Quiz: ");
            escolha = sc.nextInt();

            if (escolha == 1) {
                System.out.println("\nParabéns! " + nome);
                System.out.println("Sua pontuação final foi de: " + pontuação + "\n");

                if (bonus == 1) {
                   System.out.println("Seu bônus foi de: " + bonus+ "\n"); 
                } else if (bonus == 0){
                    System.out.println("Seu bônus foi de: " + bonus+ "\n");   
                }
                
            }
            
            sc.close();
            
        } while (escolha != 1);   
    }
}
