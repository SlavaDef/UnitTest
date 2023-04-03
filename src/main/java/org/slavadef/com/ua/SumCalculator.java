package org.slavadef.com.ua;

public class SumCalculator {
   public int sum (int n) throws IllegalArgumentException {
        if (n==0) {
            throw new IllegalArgumentException();
        }
        int res = 0;
        for(int i=0; i<=n;i++){
            res+=i;
        }
        return res;
    }
}
