import java.io.*;
import java.util.*;

class Java_Template {
	public static void main(String args[])throws IOException {
		IO io = new IO();
		StringBuilder out = new StringBuilder("");

		int t = io.nextInt();

		while(t-->0) {
			out = out.append("\n");
		}

		System.out.print(out);
	}

	static long P = (long)1e9 + 7;

	static long power(long x, long y) 
	{ 
			long res = 1;      
			x = x % P;  
			while (y > 0) 
			{ 
					if((y & 1)==1) 
							res = (res * x) % P; 
					y = y >> 1;  
					x = (x * x) % P;  
			} 
			return res; 
	} 

	static long modProduct(long... a) {
		long sum = 1;
		for(long x : a) 
			sum = ( (sum%P) * (x%P) )%P;
		
		return sum;
	}


	static long modAdd(long... a) {
		long sum = 0;
		for(long x : a) {
			sum = ( (sum%P) + (x%P) )%P;
		}
		
		return sum;
	}

	static int min(int a, int b) { return a<b ? a : b; }
	static long min(long a, long b) { return a<b ? a : b; }
	static double min(double a, double b) { return a<b ? a : b; }

	static int max(int a, int b) { return a>b ? a : b; }
	static long max(long a, long b) { return a>b ? a : b; }
	static double max(double a, double b) { return a>b ? a : b; }
}

class IO {
	private BufferedReader br;
	private StringTokenizer st;

	IO()throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine());
	}

	String next()throws IOException {
		if(st.hasMoreTokens())
			return st.nextToken();

		st = new StringTokenizer(br.readLine());
		return st.nextToken();
	}

	int nextInt()throws IOException { return Integer.parseInt(next()); }
	double nextDouble()throws IOException { return Double.parseDouble(next()); }
	long nextLong()throws IOException { return Long.parseLong(next()); }

	int[] nextIntArray(int n)throws IOException { 
		int[] a = new int[n];
		for(int i=0;i<n;i++) a[i] = nextInt();
		return a;
	}

	long[] nextLongArray(int n)throws IOException {
		long[] a = new long[n];
		for(int i=0;i<n;i++) a[i] = nextLong();
		return a;
	}

	double[] nextDoubleArray(int n)throws IOException {
		double[] a = new double[n];
		for(int i=0;i<n;i++) a[i] = nextDouble();
		return a;
	}
}

