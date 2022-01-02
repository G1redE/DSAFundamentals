package com.dsa.hw20211231;

import java.util.Stack;

public class BasicCalculator {
        public static int calculate(String s) {
            int res = 0;
            int num = 0;
            int sign = 1;
            int n = s.length();

            Stack<Integer> sk = new Stack<>();

            for (int i = 0; i < n; ++i) {
                char c = s.charAt(i);
                if (c >= '0') {
                    num = 10 * num + (c - '0');
                } else if (c == '+' || c == '-') {
                    res += sign * num;
                    num = 0;
                    sign = (c == '+') ? 1 : -1;
                } else if (c == '(') {
                    sk.push(res);
                    sk.push(sign);
                    res = 0;
                    sign = 1;
                } else if (c == ')') {
                    res += sign * num;
                    num = 0;
                    res *= sk.peek(); sk.pop(); 
                    res += sk.peek(); sk.pop(); 
                }
            }
            res += sign * num; 
            return res;
        }

        public static void main( String args[] ) {
	        String exp = "(1+2)-(-1)";
	        System.out.println(calculate(exp));
	        }

}
