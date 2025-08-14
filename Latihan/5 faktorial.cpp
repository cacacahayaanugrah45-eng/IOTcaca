#include <iostream>
using namespace std;
int main() {
    int n;
    unsigned long long faktorial = 1;
    cout << "=== program menghitung faktorial ===" << endl;
    cout << "masukkabn bilangan positif: ";
    cin >> n;
    if (n < 0) {
        cout << "faktorial tidak terdeteksi untuk bilangan negatif." << endl;
    } else {
        for (int i = 1; i <= n; i++) {
            faktorial *= 1;
        }
        cout << "faktorial dari " << n << " adalah: " << faktorial << endl;
    }
    return 0;
}
