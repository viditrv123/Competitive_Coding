import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Prime_Factor {

    public static void main(String[] args) {
        FastReader rv = new FastReader();
        int n;
        n=rv.nextInt();
        int a[]=new int[n+1];
        int i;
        for(i=0;i<=n;i=i+1)
        {
            a[i]=1;
        }
        for(i=2;i<=n;i=i+2)
        {
            a[i]=0;
        }
        for(i=3;i<=n;i=i+2)
        {
            if(a[i]==1)
            {
                for(int j=i*i;j<=n;j=j+i)
                    a[j]=0;
            }
        }
        a[0]=a[1]=0;
        a[2]=1;
        ArrayList arr1=new ArrayList<Integer>();
        ArrayList arr2=new ArrayList<Integer>();
        for(i=0;i<=n;i=i+1)
        {
            if(a[i]==1)
                arr1.add(i);
        }
        int l=arr1.size();
        int b[]=new int[l];
        Iterator it=arr1.iterator();
        while(it.hasNext()&&n!=1)
        {
            int x=(int)it.next();
            if(n%x==0)
            {

                while(n%x==0)
                {
                    arr2.add(x);
                    n=n/x;
                }
            }
        }
        Iterator it2=arr2.iterator();
        while(it2.hasNext())
        {
            System.out.print(it2.next()+" ");
        }


    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}