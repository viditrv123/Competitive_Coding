import java.io.*;
import java.util.*;

public class prime_sieve {

    public static void main(String[] args) {
        FastReader rv = new FastReader();
        int n;
        n=rv.nextInt();
        int a[]=new int[n];
        int i,j;
        for(i=0;i<n;i=i+1)
        {
            a[i]=1;
        }
        for(i=2;i<n;i=i+2)
            a[i]=0;
        for(i=3;i<n;i=i+2)
        {
            for(j=i*i;j<n;j=j+i)
            {
                if(a[j]==1)
                a[j]=0;
            }
        }
        a[2]=1;
        a[0]=a[1]=0;
        for(i=0;i<n;i=i+1)
        {
            if(a[i]==1)
                System.out.print(i+" ");
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