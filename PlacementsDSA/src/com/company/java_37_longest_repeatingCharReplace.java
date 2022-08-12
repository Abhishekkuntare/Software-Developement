package com.company;

public class java_37_longest_repeatingCharReplace {
    // Java program to find maximum length equal
// character string with k changes
        static int findLen(String A, int n, int k, char ch)
        {
            int maxlen = 1;
            int count = 0;
            int l = 0, r = 0;

            while (r < n) {
                if (A.charAt(r) != ch)
                    ++count;

                while (count > k) {
                    if (A.charAt(l) != ch)
                        --count;
                    ++l;
                }
                maxlen = Math.max(maxlen, r - l + 1);
                ++r;
            }
            return maxlen;
        }
        static int answer(String A, int n, int k)
        {
            int maxlen = 1;
            for (int i = 0; i < 26; ++i) {
                maxlen = Math.max(maxlen, findLen(A, n, k, (char) (i+'A')));
                maxlen = Math.max(maxlen, findLen(A, n, k, (char) (i+'a')));
            }
            return maxlen;
        }

        // Driver Method
        public static void main(String[] args)
        {
            int n = 5, k = 2;
            String A = "ABABA";
            System.out.println("Maximum length = " + answer(A, n, k));

            System.out.println(0+'A');
            char c = 0 + 'a';
            System.out.println(c);
        }
    }
