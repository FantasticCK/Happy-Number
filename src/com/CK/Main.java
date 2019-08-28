package com.CK;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        while(set.isEmpty() || n != 1 && !set.contains(n)){
            set.add(n);
            n =transform(n);
        }

        if (n == 1)
            return true;
        else
            return false;
    }

    private int transform(int n){
        int res = 0;
        while(n / 10 > 0){
            int temp = n % 10;
            n = n / 10;
            res += temp*temp;
        }

        res += n*n;
        return res;
    }
}