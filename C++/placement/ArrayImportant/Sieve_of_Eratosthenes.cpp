// #include <bits/stdc++.h>
// using namespace std;

// void prime_sieve_eratosthenes(int n)
// {

//     // initializing the 100  size of  empty  array
//     int prime[100] = {0};

//     // check if array element is 0 then mark that i'th index with there multiple
//     for (int i = 2; i <= n; i++)
//     {
//         if (prime[i] == 0)
//         {
//             for (int j = i * i; j <= n; j += i)
//             {
//                 prime[j] = 1;
//             }
//         }
//     }

//     // if the prime is 1 then we print the unmarked elements
//     for (int i = 2; i <= n; i++)
//     {
//         if (prime[i] == 0)
//         {
//             cout << i << " ";
//         }
//     }
// }

// int main()
// {
//     int n;
//     cout << "Enter the number: " << endl;
//     cin >> n;

//     prime_sieve_eratosthenes(n);
//     return 0;
// }

#include <bits/stdc++.h>
using namespace std;

const int N = 1e7 + 10; // 10 to the power 7
vector<bool> isPrime(N, 1);

int main()
{
    for (int i = 2; i < N; i++)
    {
        if (isPrime[i] == true)
        {
            for (int j = 2 * i; j < N; j += i)
            {
                isPrime[j] = false;
            }
        }
    }
    int n = 10;
    for (int i = 2; i < n; i++)
    {
        if (isPrime[i] == true)
        {
            cout << i << " ";
        }
    }

    return 0;
}