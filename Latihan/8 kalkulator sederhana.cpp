#include <iostream>
using namespace std; 

int main() {
  char op;
  double num1, num2;

  cout << "masukkan operator (+, -, *, /): ";
  cin >> op;

  cout << "masukkan dua bilangan: ";
  cin >> num1 >> num2;

  switch(op) {
case '+':
   cout << num1 << " + " << num2 << " = " << num1 + num2;
   break;
case '-':
   cout << num1 << " - " << num2 << " = " << num1 - num2;
case '*':
   cout << num1 << " * " << num2 << " = " << num1 * num2;
   break;
case '/':
    if (num2 != 0)
      cout << num1 << " / " << num2 << " = " << num1 / num2;
    else
      cout << "error! pembagian dengan nol tidak diperbolehkan.";
    break;
default:
    cout << "operator tidak valid!";
  }

return 0;
}
