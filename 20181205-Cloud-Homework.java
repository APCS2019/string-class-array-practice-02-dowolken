public class Phrase
{
    private static String currentPhrase;

    /** Constructs a new Phrase object. */
    public Phrase(String p)
    {
         currentPhrase = p;
    }

    /** Returns the index of the nth occurrence of str in the current phrase;
     *  returns -1 if the nth occurrence does not exist.
     *  Precondition: str.length() > 0 and n > 0
     *  Postcondition: the current phrase is not modified.
     */
    public static int findNthOccurrence(String str, int n)
    {
        /* implementation not shown */
        String rstr=currentPhrase;
        int index=0;
        int i=str.length()-1;
       for(int m=0; m<n;m++)
        {index=rstr.indexOf(str);
         rstr=rstr.substring(index+i);
         if(i==str.length()-1&&index==-1)
         {return -1;}
         else
         {i=i+index;}
        }
        return index
            
            /*another*/
        int start=0;
        int loc=-1;
        int count=0;
        String c=currentPrase;
        while(c.substring(start).indexOf(str))
            {loc=c.indexOf(str);
            count++;
            if(count==n)
              {return loc;}
            start=loc+1;
             c=c.substring(strat);
            }
        return loc;
               
        /*another*/
        int count=0;
        int loc=-1;
        String c=currentPhrase;
        while(count==n)
          {loc=c.indexOf(str);
           if((index=-1)
             {return }
            count++;
           c=c.substring(loc+1);
           }
        return loc;
    }

    /** Modifies the current phrase by replacing the nth occurrence of str with repl.
     *  If the nth occurrence does not exist, the current phrase is unchanged.
     *  Precondition: str.length() > 0 and n > 0
     */
    public void replaceNthOccurrence(String str, int n, String repl)
    {
        /* to be implemented in part(a) */
        int index = currentPhrase.findNthOccurrence(str,n);
        if(index!=-1)
        {currentPhrase = currentPhrase.substring(0,index)+repl+currentPhrase.substring(index+str.length());}        
    }

    /** Return the index of the last occurrence of str in the current phrase;
     *  returns -1 if str is not found.
     *  Precondition: str.length() > 0
     *  Postcondition: the current phrase is not modified.
     */
    public int findLastOccurrence(String str)
    {
        /* to be implemented in part(b) */
        int index1=-1;
        int index2=0;
        int n=1;
        while(index2>=0)
        {if(currentPhrase.findNthOccurrence(str,i)>=0)
           {index1=index2;}
         n++;
        }
        return index1;   
    }
    /** Returns a string containing the current phrase */
    public String toString(){
        return currentPhrase;
    }
    public static void main(String[] args)
    {

    }
}
