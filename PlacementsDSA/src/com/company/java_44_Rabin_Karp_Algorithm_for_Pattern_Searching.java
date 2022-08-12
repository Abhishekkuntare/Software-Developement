package com.company;

public class java_44_Rabin_Karp_Algorithm_for_Pattern_Searching {
    static String rabin_karp(String s){
        int n =s.length();
        if(n==1){
            return  "";
        }
        long p =31; //take the prime value
        long mod=1000000007; //take the mod value 10^9+7
        long pow =1;//take the power

        long ph =0; //prefix hash
        long sh=0; //suffix hash
        int ans =0;
        for(int i =0;i<n-1;i++){
            ph= ((ph*p)+(s.charAt(i)-'a'+1))%mod;
            sh =(sh+((s.charAt(n-1-i)-'a'+1)*pow)%mod)%mod;

            pow=(pow*p)%mod;
            if(ph ==sh){
                ans =i+1;
            }
        }
        return s.substring(0,ans);
    }
    public static void main(String[] args) {
        String str ="pepcodingpepc";
        String ans = rabin_karp(str);
        System.out.println(ans);
    }
}
