#include <iostream>
#include <cmath>
using namespace std;
int main() {
  double jari_jari, luas;
  cout << "masukkan jari-jari lingkaran: ";
  cin  >> jari_jari;
  luas = M_PI * pow(jari_jari, 2);
  cout << "luas lingkaran dengan jari-jari " << jari_jari
       << " adalah " << luas << endl;
return 0;
}
