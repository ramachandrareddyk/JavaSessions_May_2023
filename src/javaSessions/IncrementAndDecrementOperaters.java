package javaSessions;

public class IncrementAndDecrementOperaters {
	
	int z=1000;
	static int x=100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Increment Operatres
		
			//1. Post incrment
			//2. Pre increment
		
		/*int a=2;
		 a=a+1;
		 a=a+1;
		System.out.println(a);*/
		
		System.out.println(IncrementAndDecrementOperaters.x);
		
		System.out.println("---------------Post incrment-----------------");
		
		int a=1;
		int b=a++;
		
		System.out.println(a);//2
		System.out.println(b);//1
		
		int c=-99;//-99+1=98
		int d=c++;
		
		System.out.println(c);//98
		System.out.println(d);//-99
		
		int e=999;
		int f=e++;
		
		System.out.println(e);//1000
		System.out.println(f);//999
		
		int g=10;
		int h=g++;
		
		System.out.println(g);//11
		System.out.println(h);//10
		
		System.out.println("---------------Pre incrment-----------------");
		
		
		int j=100;//100+1
		int k=++j;
		System.out.println(j);//101
		System.out.println(k);//101
		
		int l=-99;//-99+1=-98
		int m=++l;
		
		System.out.println(l);//-98
		System.out.println(m);//-98
		
		int n=10;//10
		int o=n+2;//12
		
		System.out.println(n);
		System.out.println(o);
		
		int r=0;//0+1=1
		int p=++r;
		System.out.println(r);
		System.out.println(p);
		
		System.out.println("---------------Post Decrement-----------------");
		
	int x=2;
	int y=x--;
	
	System.out.println(x);//1
	System.out.println(y);//2
	
	int x1=-9;
	int y1=x1--;
	
	System.out.println(x1);//-9-1=-10
	System.out.println(y1);//-9
	
	int x2=99;
	int y2=x--;
	
	System.out.println(x2);//98
	System.out.println(y2);//99
	
	System.out.println("---------------Pre Decrement-----------------");

	int u=2;//-1=1
	int v=--u;
	
	System.out.println(u);//1
	System.out.println(v);//1
	
	int w=-99;//-99-1=-100
	int z=--w;
	
	System.out.println(w);//-100
	System.out.println(z);//-100
	System.out.println("------------------------------------------------");
	
	int total=100;
	System.out.println(total++);//101  100
	
	System.out.println(total);//100  101
	
	int bal=999;//+1
	System.out.println(++bal);//1000
	System.out.println(bal);//1000
	
	
	
		

	}

}
