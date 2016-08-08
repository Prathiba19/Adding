# Adding

public class Addup{

	public static void main(String[] args) {
		int num1=1234;
		String a=String.valueOf(num1);
		StringBuffer sb=new StringBuffer(a);
		String n1=sb.reverse().toString();
		int num=Integer.parseInt(n1);
		int mod=0;
		int sum=0;
		String b=String.valueOf(num);
		int count=b.length();
		while(num!=0)
		{
			mod=num%10;
			num=num/10;
			sum=sum+(mod*count);
			count--;
		}
		System.out.println(sum);
	}}
