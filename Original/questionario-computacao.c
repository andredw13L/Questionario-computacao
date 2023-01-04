
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

int main(void) {
int resposta, pontuação=0, escolha, bonus;
char nome[12];

system("clear");
printf("Digite o seu nome: ");
scanf("%s", nome);


do{

printf("\nPergunta 1 – Qual desses cientistas da computação são considerados o pai da computação?\n\n");
printf("1)Charles Babbage\n");
printf("2)John William Mauchly\n");
printf("3)Alan Turing\n");
printf("4)Tom Killburn\n");
printf("5)Konrad Zuse\n\n");
printf("Resposta: ");
scanf("%d",&resposta);

if(resposta == 3){
	printf("acertou!\n\n");
	pontuação = pontuação+1;
}else{
	printf("errou!\n\n");
}
sleep(2);
system("clear");


printf("\nPergunta 2 – Quem foi o(a) primeiro programador(a) da história?\n\n");
printf("1)Almirante Grace Hopper\n");
printf("2)Al-Khwarizmi\n");
printf("3)Blaise Pascal\n");
printf("4)Ada Lovelace\n");
printf("5)Charles Babbage\n\n");
printf("Resposta: ");
scanf("%d",&resposta);

if(resposta == 4){
	printf("acertou!\n\n");
	pontuação = pontuação+1;
}else{
	printf("errou!\n\n");
}
sleep(2);
system("clear");

printf("Pergunta 3 – Qual foi a primeira linguagem de programação?\n\n");
printf("1)Linguagem em C\n");
printf("2)COBOL\n");
printf("3)ADA\n");
printf("4)Fortran\n");
printf("5)Plankakül\n\n");
printf("Resposta: ");
scanf("%d",&resposta);

if(resposta == 3){
	printf("acertou!\n\n");
	pontuação = pontuação+1;
}else{
	printf("errou!\n\n");
}
sleep(2);
system("clear");

printf("Pergunta 4 – Qual era o nome da máquina de criptografia alemã utilizada na segunda guerra mundial?\n\n");
printf("1)Pompeius\n");
printf("2)Enigma\n");
printf("3)Code incognitum\n");
printf("4)Hutmacher schach\n");
printf("5)Criptomaquina 3000\n\n");
printf("Resposta: ");
scanf("%d",&resposta);

if(resposta == 2){
	printf("acertou!\n\n");
	pontuação = pontuação+1;
}else{
	printf("errou!\n\n");
}
sleep(2);
system("clear");

printf("Pergunta 5 – Sobre ciência da computação responda quais das afirmações estão corretas.\n\n");
printf("I – Ciência da computação não pode ser classificada na área ciências exatas e sim na área de ciências contábeis.\n\n");
printf("II – As ciências da computação estuda as técnicas, metodologias, instrumentos computacionais e aplicações tecnológicas, que informatizem os processos e desenvolvam soluções de processamento de dados de entrada e saída pautados no computador, de forma que se transforme em informação.\n\n");
printf("III – A primeira ferramenta conhecida para a computação foi o ábaco.\n\n");
printf("IV – Os estudos originados da ciência da computação podem ser aplicados em qualquer área do conhecimento humano em que seja possível definir métodos de resolução de problemas baseados em repetições previamente observadas.\n\n");
printf("1)II e III\n");
printf("2)I, III e IV\n");
printf("3)I e IV\n");
printf("4)II, III e IV\n");
printf("5)Todas as afirmações estão corretas\n\n");
printf("Resposta: ");
scanf("%d",&resposta);

if(resposta == 4){
	printf("acertou!\n\n");
	pontuação = pontuação+1;
}else{
	printf("errou!\n\n");
}
sleep(2);
system("clear");

printf("Pergunta 6 – Quem criou a linguagem de programação C?\n\n");
printf("1)André Ribeiro\n");
printf("2)Dennis Ritchie\n");
printf("3)James Gosling\n");
printf("4)Guido van Rossum\n");
printf("5)Rasmus Lerdorf\n\n");
printf("Resposta: ");
scanf("%d",&resposta);

if(resposta == 2){
	printf("acertou!\n\n");
	pontuação = pontuação+1;
}else{
	printf("errou!\n\n");

}
sleep(2);
system("clear");

printf("Pergunta 7 – complete o texto");
printf("Java é uma linguagem de programação orientada a objetos que começou a ser criada em ____, na Sun Microsystems. Teve início com o Green Project, no qual os mentores foram Patrick Naughton, Mike Sheridan, e James Gosling.\n\n");
printf("1)1991\n");
printf("2)1989\n");
printf("3)1992\n");
printf("4)1999\n");
printf("5)1995\n\n");
printf("Resposta: ");
scanf("%d",&resposta);

if(resposta == 1){
	printf("acertou!\n\n");
	pontuação = pontuação+1;
}else{
	printf("errou!\n\n");

}
sleep(2);
system("clear");

printf("Pergunta 8 – Qual o nome da criadora da linguagem COBOL?\n\n");
printf("1)Almirante Grace Hopper\n");
printf("2)Ada Lovelace\n");
printf("3)Jean Jennings Bartik\n");
printf("4)Hedy Lamarr\n");
printf("5)Karen Spärck Jones\n\n");
printf("Resposta: ");
scanf("%d",&resposta);

if(resposta == 1){
	printf("acertou!\n\n");
	pontuação = pontuação+1;
}else{
	printf("errou!\n\n");
	
}
sleep(2);
system("clear");

printf("Pergunta 9 – Qual desses NÃO é uma linguagem de programação.\n");
printf("1)Ruby\n");
printf("2)C#\n");
printf("3)Python\n");
printf("4)Java\n");
printf("5)Https\n\n");
printf("Resposta: ");
scanf("%d",&resposta);

if(resposta == 5){
	printf("acertou!\n\n");
	pontuação = pontuação+1;
}else{
	printf("errou!\n\n");

}
sleep(2);
system("clear");

printf("Pergunta 10 – Quem é o pai da lógica de programação?\n\n");
printf("1)George Boole\n");
printf("2)Charles Babbage\n");
printf("3)Daniel Ferreira\n");
printf("4)Blaise Pascal\n");
printf("5)Maurice Vicent Wilkes\n\n");
printf("Resposta: ");
scanf("%d",&resposta);

if(resposta == 1){
	printf("acertou!\n\n");
	pontuação = pontuação+1;
}else{
	printf("errou!\n\n");
	
}
sleep(2);
system("clear");

if (resposta ==1){
bonus = bonus = printf("\nPergunta bonus – O que é o software?\n\n");
printf("1)Conjunto de programas que permite o funcionamento e utilização da máquina.\n");
printf("2)Conjunto de componente que permite o funcionamento e utilização do sistema operacional.\n");
printf("3)Conjunto de programas que permite o funcionamento e utilização do navegador.\n");
printf("4)Conjunto de componentes que formam a parte física do computador.\n");
printf("5)Conjunto de componentes que permitem o acesso à internet.\n\n");
printf("Resposta: ");
scanf("%d",&resposta);;
}else{
printf("Parabéns! %s\n", nome);
printf("Sua pontuação final foi de %d", pontuação);
}
printf("\nDigite 1 caso não queira refazer o Quiz: ");
scanf("%d", &escolha);

}while(escolha != 1);

printf("Obrigado por jogar o quiz!!! \n");

  return 0;
} 
