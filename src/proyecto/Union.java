
package proyecto;

/**
 *
 * @author Sebastian Cordero Mora
 */
public class Union 
{
    public void intercalar()
    {
        int[] conjunto1={45,78,34,12,63,92};
        int[] conjunto2={11,49,74,59,63,34};
        int[] intercalado=new int[conjunto1.length+conjunto2.length];
        
        for(byte i=0;i<conjunto1.length;i++)
        {
            if(i==0)
            {
                intercalado[i]=conjunto1[i];
                intercalado[i+1]=conjunto2[i];
            }
            else if(i==conjunto1.length)
            {
                intercalado[conjunto1.length+conjunto2.length]=conjunto2[conjunto2.length];
            }
            else
            {
                intercalado[2*i-1]=conjunto2[i-1];
                System.out.println(intercalado[i]);
                intercalado[2*i]=conjunto1[i];
                System.out.println(intercalado[i]);    
            }
        }
        
        System.out.println("Conjuntos intercalados: ");
        for(byte i=0;i<conjunto1.length+conjunto2.length;i++)
        {
            System.out.println(intercalado[i]);
        } 
            
    } 
}
