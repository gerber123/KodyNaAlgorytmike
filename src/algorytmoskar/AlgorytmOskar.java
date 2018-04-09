
package algorytmoskar;

import static java.util.Collections.swap;


public class AlgorytmOskar {

   
    public static void main(String[] args)
    {
        int[] tab = new int[]{3,2,1};
        
        
        System.out.println(Zwierzęc.liczbaLustrzana(12));
        System.out.println(Zwierzęc.schematHornererna(3, 2, tab));
         
    }
    
}
 class Zwierzęc {
     public static int sumaLiczbReKURENCYJNIE(int n)
     {
         if(n>0)
             return n%10+sumaLiczbReKURENCYJNIE(n/10);
         return 0;
     }

     public static int CzescCalkowitaPierwiastka(int n)
     {
         int i=1;
         while(n>i*i)
         {
             i++;
         }
         return --i;
     }
     public static int LustrzaneOdbicie(int n)
     {
        int x=0;
        int c;
        while(n!=0)
        {
            c=n%10;
            x=x*10+c;
            n=n/10;
        }
        return x;
     }
     public static float horenr(int n,float x,float a[])
     {
         if(n==0)
             return a[0];
         else
             return horenr(n-1,x,a)*x+a[n];
     }
     public static float hornerIteracyjnie(int n,float x,float a[])
     {
         float W=a[0];
         for(int i=1;i<=n;i++)
         {
             W=W*x+a[i];
         }
         return W;
     }
     public static int sumaWszystkichLiczb1_2_3_4_etc(int n)
     {
         int s =1;
         for(int i=2;i<=n;i++)
         {
             s+=i;
             
         }
         return s;
     }
     public static int FiboIteracyjnie(int n)
     {
         int a=0;
         int b=1;
         for(int i=0;i<n;i++)
         {
             b+=a;
             a=b-a;
             System.out.print(a);
         }
         return a;
     }
     public static int suamRzeczywista(int a, int b)
     {
         if(b==0)return a;
         else
             return suamRzeczywista(++a,--b);
        
     }
     public static int FibonaciRekurencyjnie(int n)
     {
         if(n==1||n==2)
         {
             return 1;
         }
         else
             return FibonaciRekurencyjnie(n-1)+FibonaciRekurencyjnie(n-2);
     }
     
     public static String LiczbaDoskonala(int n)
     {
         int suma =0;
         for(int i=1;i<n;i++)
         {
             if(n%i==0)
                 suma+=i;      
         }
      
         if(n==suma)
         {
                return suma+" zajebiscie doskonala";
         }
         else
         {
             return "nie doskonała";
         }
         
     }
     public static int NWD(int a, int b)
     {
         if(b==0)return a;
          return NWD(b,a%b);
        
     }
     public static int czyPodzielna(int n)
     {
         int suma =0;
         int c;
         while(n>0)
         {
             c=n%10;
             suma+=c;
             
             n=n/10;
         }
         if(n%suma==0&&n>0)
         {
             return 1;
         }
         else
             return 2;
        
     }
     
  public static int fun(int n) 
  {
     
    for(int i=2;i*i<=n;i++)
    {
        if(n%i==0)
            return 2;
        
            
    }
    return 1;
           
     
  }
  public static int sumaCyfr(int n)
  {
      int suma=0;
      while(n!=0)
      {
          int c=n%10;
           n=n/10;
          suma+=c;
      }
      return suma;
  }
  public static int sumaBinarna(int n)
  {
      int suma=0;
      while(n!=0)
      {
          if(n%2!=0)
          {
              suma+=1;
              
          }
          n=n/2;
      }
      return suma;
  }
  public static int blizniacze(int a,int b)    
  {
      if(Math.abs(a-b)==2)
      {
          if(fun(a)==1&&fun(b)==1)
          {
              return 1;
          }
      }
      return 2;
      
  }
  public static int OdwracanieTablicy(int t[],int lewy, int prawy)
  {
      if(lewy<prawy)
      {
          swap(t[lewy],t[prawy]);
          OdwracanieTablicy(t,lewy+1,prawy-1);
      }
  }

  public static long silnia(int n)
  {
      if(n==0)
          return 1;
      else
          return n*silnia(n-1);
  }
  public static long silniaIteracyjnie(int n)
  {
      int i=n-1;
     while(i!=0)
     {
         n*=i;
         i--;
     }
      return n;
  }
  public static int potegowanie(int p,int w)
  {
      if(w==0)
      {
          return 1;
      }
      else
          return p*potegowanie(p,w-1);
  }
  public static int potegowanieIteracyjnie(int p,int w)
  {
      int wynik =1;
      while(w>0)
      {
          wynik*=p;
          w--;
      }
      return wynik;
  }
  public static int resztazDzielenia(int a, int b)
  {
      int c=a%b;
      return c;
  }

}