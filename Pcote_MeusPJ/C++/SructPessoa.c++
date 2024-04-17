#include<bits/stdc++.h>

using namespace std;
struct Pessoa {

  string nom;
  int idad;
  
};

int main(){
  int quant,i;

  cout << "Digite a quantidade: ";
  cin >> quant;

  Pessoa ps[quant];

  for (i = 0;i < quant;i++){
    cout << "Digite o nome da pessoa numero " << i + 1 << ": ";
    cin >> ps[i].nom;
    
    
    cout << "Digite a idade da pessoa numero " << i + 1 << ": ";
    cin >> ps[i].idad;
    
    
  }

  double med;
  int soma = 0;
  for (i = 0;i < quant; i++){
    med = (soma += ps[i].idad) / quant;
  }
  

  cout << fixed << setprecision(2) << endl;
  cout << "A media: " << med << endl;
  for (i = 0; i < quant; i++){
  cout << "O nomes: " << ps[i].nom << endl;
  cout << "Idades: " << ps[i].idad << endl;

  }
    return 0;
}