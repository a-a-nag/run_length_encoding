/*
* The string "aaaabbсaa" is converted into "a4b2с1a2",
* that is, the groups of the same characters of the input string are replaced by the symbol and the number of its repetitions in this string.
*
* Write a program, which reads the string, encodes it by this algorithm and outputs the encoded sequence. The encoding must be case sensitive.
*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        
        String strNew = "";
        for (int i = 0; i < str.length(); i++) {
            
            int count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            
            strNew += "" + str.charAt(i) + count;
        }
        
        System.out.println(strNew);
    }
}
