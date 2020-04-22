import java.io.*;
import java.util.*;

public class Main {

    public static void main(java.lang.String[] args) {
        FastReader rv = new FastReader();
        int n;
        n=rv.nextInt();
        int a[]=new int[n];
        int i;
        for(i=0;i<n;i=i+1)
            a[i]=rv.nextInt();
        int rn;
        rn=Math.sqrt(n);
        int blocks=new int[rn+1];
        int block_id=-1;
        for(i=0;i<n;i=i+1)
        {
            if(i%rn==0)
                block_id+=1;
            blocks[block_id]+=a[i];
        }
        

    }

    int query(int blocks, int arr, int l, intt r, int rn)
    {
        int ans=0;
        //left part
        while(l%rn!=0&&l<r&&l!=0)
        {
            ans+=arr[l];
            l++;
        }
        //middle part
        while(l+rn<=r)
        {
            int block_id=l/rn;
            ans+=blocks[block_id];
            l+=rn;
        }
        //right part
        while(l<=r)
        {
            ans+=arr[l];
            l++;
        }
        return ans;
    }

    static class FastReader {
        java.io.BufferedReader br;
        java.util.StringTokenizer st;

        public FastReader() {
            br = new java.io.BufferedReader(new
                    java.io.InputStreamReader(java.lang.System.in));
        }

        java.lang.String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new java.util.StringTokenizer(br.readLine());
                } catch (java.io.IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return java.lang.Integer.parseInt(next());
        }

        long nextLong() {
            return java.lang.Long.parseLong(next());
        }

        double nextDouble() {
            return java.lang.Double.parseDouble(next());
        }

        java.lang.String nextLine() {
            java.lang.String str = "";
            try {
                str = br.readLine();
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}