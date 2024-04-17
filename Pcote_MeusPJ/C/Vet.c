#include <stdio.h>
#include <string.h>



struct Pessoa {
    char nom[50];
    int idad;


};


int main(){
    int quant,i;
    
printf("Digite quantas vezes quer adicionar infor: \n");
scanf("%d",&quant);

getchar();

struct Pessoa ps[quant];


for ( i = 0; i < quant; i++){
    printf("Insira o nome da pessoa numero %d: \n",i+1);
    fgets(ps[i].nom,sizeof(ps[i].nom),stdin);
    ps[i].nom[strcspn(ps[i].nom, "\n")]= '0';
    printf("Insira a idade da pessoa numero %d: \n",i+1);
    scanf("%d",&ps[i].idad);
    getchar();

    }


    printf("\nInformações da pessoa:\n");
for ( i = 0;i < quant; i++){
    printf("Nome: %s\n",ps[i].nom);
    printf("Idade: %d\n",ps[i].idad);


    }
    
}

