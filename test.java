public class FindOneAndReturn{
    private static String currentPhrase;

    /** A refer to find index of str in the variable currentPhrase
     *  B refer to the nth occurrence of str in currentPhrase
     */

    /** while (A) 
     *  {if (B) return someValue}
     *  return otherValue;
     */
    public static int findNthOccurrenceVfArB(String str, int n){
        /* part(a) */
        String c=currentPhrase;
        int count=1;
        int loc=0;
        int index=-1;
        while(c.substring(start).indexOf(str))
             {index=c.indexOf(str);
              if(index==0)
                {start=index+1;}
              else
                {start=index;} 
              loc+=start;
              if(count==m)
                 return loc;
              c=c.substring(start);
              count++;
             }
        return index;
    }

    /** while (B) 
     *  {if (A) return someValue}
     *  return otherValue;
     */
    public static int findNthOccurrenceVfBrA(String str, int n){aa 3
        /* part(b) */
        String c=currentPhrase;aabaaa 4
        int count=0;
        int loc=c.indexOf(str); 0
        int index=-1;
        while(count!==n)
             {
                 
              count++; 1 2 3
    }  

    /** Use for loop write this solution 
     */
    public static int findNthOccurrenceVfor(String str, int n){
        /* part(c) */
    }
    
    //test
    public static void main(String[] args){
        String str = "aa";
        currentPhrase = "aabaaa";
        //               012345
        for (int n = 1; n < 5; n++){
            System.out.println("The value of n is " + n + ";");
            int index1= findNthOccurrenceVfArB(str, n);
            int index2= findNthOccurrenceVfBrA(str, n);
            int index3= findNthOccurrenceVfor(str, n);
            System.out.print("fArB return " + index1);
            System.out.print(" | ");
            System.out.print("fBrA return " + index2);
            System.out.print(" | ");
            System.out.println("forLoop return " + index3);
        }
    }
}
