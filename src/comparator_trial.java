import java.io.*;
        import java.util.*;

class comparator_trial {

    public static void main(String[] args) {
        FastReader rv=new FastReader();
        int n;
        n=rv.nextInt();
        names1 a[]=new names1[n];
        int i;
        for(i=0;i<n;i=i+1)
        {
            String x=rv.nextLine();

            a[i]=new names1(x);
        }
        Arrays.sort(a,new sorting1());
        for(i=0;i<n;i=i+1)
        {
            System.out.print(a[i].n+" ");
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
class names1
{
    String n;
    names1(){
        n="";
    }
    names1(String a){
        n=a;
    }
}
class sorting1 implements Comparator<names1>
{
    public int compare(names1 a, names1 b){
        if(a.n.indexOf(b.n)!=-1)
            return -1;
        else if(b.n.indexOf(a.n)!=-1)
            return 1;
        else
            return a.n.compareTo(b.n);
    }

}