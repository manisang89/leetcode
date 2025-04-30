class Solution {
    public String reverseVowels(String s) {
        Set<Character>c=Set.of('a','e','i','o','u','A','E','I','O','U');
        char cc[]=s.toCharArray();
        int p1=0, p2=s.length()-1;
        while(p1<p2)
        {
            while(p1<p2&&!c.contains(cc[p1]))
            {
               p1++;
            }
            while(p1<p2&&!c.contains(cc[p2]))
            {
               p2--;
            }
            char t=cc[p1];
            cc[p1]=cc[p2];
            cc[p2]=t;
            p1++;
            p2--;
        }
        return new String(cc);
    }
}