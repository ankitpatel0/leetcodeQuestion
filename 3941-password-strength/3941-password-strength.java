class Solution {
    public int passwordStrength(String password) {
        String vx = password;

        HashSet<Character> set=new HashSet<>();

        int str=0;

        for(int i =0;i<vx.length();i++){
            char ch = vx.charAt(i);

            if(!set.contains(ch)){
                set.add(ch);

                if(ch>= 'a' && ch <= 'z'){
                    str +=1;
                }
                else if(ch >= 'A' && ch <= 'Z'){
                    str +=2;
                }

                else if(ch>= '0' && ch <= '9'){
                    str += 3;
                }

                else if(ch == '!' || ch == '@' || ch == '#' || ch == '$'){
                    str += 5;
                }
            }
        }
        return str;
        
    }
}