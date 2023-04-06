//yousef yasser
//20216049

#include <iostream>
using namespace std;
 
int main() {
    int x, y, z;
    cin >> x >> y >> z;
 
    int m_num = x;
    if (y < m_num) {
        m_num = y;
    }
    if (z < m_num) {
        m_num = z;
    }
 
    int max_num = x;
    if (y > max_num) {
        max_num = y;
    }
    if (z > max_num) {
        max_num = z;
    }
 
    int mid_num = x + y + z - m_num - max_num;
 
    cout << m_num <<endl;
    cout << mid_num <<endl;
    cout << max_num << endl;
    cout<<endl; 
    cout << x <<endl; 
    cout<< y <<endl; 
    cout<<z << endl;
 
    return 0;
}
