#include <iostream>
using namespace std;
int main() {
double suhu;
int pilihan;
cout << "=== program konversi suhu ===" << endl;
cout << "pilih satuan asal:" << endl;
cout << "1. celsius" << endl;
cout << "2. fahrenheit" << endl;
cout << "3. kelvin" << endl; 
cout << "masukkan pilihan (1-3): ";
cin >> pilihan;
cout << "masukkan nilai suhu: ";
cin >> suhu; cout << fixed;
cout.precision(2);
switch (pilihan) {
    case 1: // celsius
      cout << "\ndari celsius:" << endl;
      cout << "fahrenheit: " << (suhu * 9/5) + 32 << endl;
      cout << "kelvin: " << suhu + 273.15 << endl;
      break;
    case 2: // fahrenheit
      cout << "\ndari fahrenheit: " << endl;
      cout << "celsius: " << (suhu - 32) * 5/9 << endl;
      cout << "kelvin: " << (suhu - 32) * 5/9 + 273.15 << endl;
      break;
    case 3: // kelvin
      cout << "\ndari kelvin:" << endl;
      cout << "celsius: " << suhu - 273.15 << endl;
      cout << "fahrenheit: " << (suhu - 273.15) * 9/5 + 32 << endl;
      break;
default:
cout << "pilihan tidak valid!" << endl;
}
return 0;
}
