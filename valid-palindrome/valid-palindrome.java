class Solution {
        public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder reverseSB = new StringBuilder();
        for (int idx=0; idx < s.length() ; idx++){
            if (Character.isLetterOrDigit(s.charAt(idx))){
                reverseSB.append(s.charAt(idx));
            }
        }
        String str = reverseSB.reverse().toString();
        reverseSB.reverse();
        return str.equals(reverseSB.toString());
    }

    }
