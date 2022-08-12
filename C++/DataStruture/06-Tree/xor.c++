// class Solution
// {
// public:
//     int maximumXOR(vector<int> &nums)
//     {
//         int res = 0;
//         for (auto i : nums)
//         {
//             res |= i;
//         }
//         return res;
//     }
// };
// class Solution
// {
// private:
//     long long dfs(int node, vector<int> adj[], vector<bool> &vis)
//     {
//         vis[node] = 1;
//         int len = 1;
//         for (auto itr : adj[node])
//         {
//             if (!vis[itr])
//             {
//                 len += dfs(itr, adj, vis);
//             }
//         }
//         return len;
//     }

// public:
//     long long countPairs(int n, vector<vector<int>> &edges)
//     {
//         vector<int> adj[n];
//         for (auto e : edges)
//         {
//             adj[e[0]].push_back(e[1]);
//             adj[e[1]].push_back(e[0]);
//         }
//         vector<int> cmp;
//         vector<bool> vis(n, 0);
//         for (int i = 0; i < n; i++)
//         {
//             if (!vis[i])
//             {
//                 long long len = dfs(i, adj, vis);
//                 cmp.push_back(len);
//             }
//         }
//         int m = cmp.size();
//         vector<int> suf(m, 0);
//         suf[m - 1] = 0;
//         for (int i = m - 2; i >= 0; i--)
//         {
//             suf[i] = suf[i + 1] + cmp[i + 1];
//         }
//         long long ans = 0;
//         for (int i = 0; i < m; i++)
//         {
//             ans += (cmp[i] * 1LL * suf[i]);
//         }
//         return ans;
//     }
// };

// class Solution {
//     public int countAsterisks(String s) {
//         int n=s.length();
//         int count=0;
//         for(int i=0;i<n;i++){
//             if(s.charAt(i)=='|'){
//                 for(int j=i+1;j<n;j++){
//                 if(s.charAt(j)=='|'){
//                     break;
//                 }
//                 }
//             }else{
//                 if(s.charAt(i)=='*'){
//                     count++;
//                 }
//         }
//         }
//         return count;
//     }
// }

// class Solution
// {
// public
//     int countAsterisks(String s)
//     {
//         int n = s.length();
//         int count = 0;
//         boolean sym = false;
//         for (int i = 0; i < n; i++)
//         {
//             char ch = s.charAt(i);
//             if (ch == '|')
//             {
//                 sym = !sym;
//             }
//             if (sym == false)
//             {
//                 if (ch == '*')
//                 {
//                     count++;
//                 }

//                 // sym=true;
//             }
//         }
//         return count;
//     }
// }