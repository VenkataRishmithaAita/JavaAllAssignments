package com.company;
public class CountArray {
    public void checkAllAlphabets(String input_str) {
        int[] count_alpha = new int[26];
        int length = input_str.length();
        for (int i = 0; i < length; i++) {
            if (input_str.charAt(i) >= 'A' && input_str.charAt(i) <= 'Z')
                count_alpha[input_str.charAt(i) - 'A'] += 1;//converting Captial alphabet to index
            else if (input_str.charAt(i) >= 'a' && input_str.charAt(i) <= 'z')
                count_alpha[input_str.charAt(i) - 'a'] += 1;

        }
        int flag = 0;
        for (int i = 0; i < 26; i++) {
            if (count_alpha[i] < 1) {
                System.out.print("Given " + input_str + " doesn't contain all alphabets");
                flag = 1;
                break;
            }
        }
        if (flag == 0)
            System.out.print("Given " + input_str + " contain all alphabets");
    }
}

/* Time Complexity:O(n)
   Space Complexity:O(1)
 */
