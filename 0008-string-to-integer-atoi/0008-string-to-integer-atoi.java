class Solution {
    public int myAtoi(String s) {
       int i=0;
       int sign=1;
       long num=0;
      while(i<s.length() && s.charAt(i)==' '){
        i++;
      }
      if(i>=s.length()){
        return 0;
      }
      if(s.charAt(i)=='-'){
        sign= -1;
        i++;
      }
      else if ( s.charAt(i)=='+'){
        sign=1;
        i++;
      }
      long limit = (sign == 1)
        ? Integer.MAX_VALUE
        : 2147483648L;
      while(i<s.length() && s.charAt(i) >='0' && s.charAt(i)<='9'){
        char ch=s.charAt(i);
        int digit =ch-'0';
      
      if(num>(limit-digit)/10){
        return (sign==1)
        ?Integer.MAX_VALUE
        :Integer.MIN_VALUE;
      }
        num=num*10 +digit;
        i++;
          }

    
    return (int)(num*sign);
    }
}