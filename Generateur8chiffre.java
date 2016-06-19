package thetheos;

public class Generateur8chiffre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		while(x != 100000000)
		{
			while(x<10)
			{
				String n1 = ""+x;
				String n2 = "0000000";
				String t1 = n2+n1;
				System.out.print(t1);
				x++;
			}
			while(x<100)
			{
				String n1 = ""+x;
				String n2 = "000000";
				String t1 = n2+n1;
				System.out.println(t1);
				x++;
			}
			while(x<1000)
			{
				String n1 = ""+x;
				String n2 = "00000";
				String t1 = n2+n1;
				System.out.println(t1);
				x++;
			}
			while(x<10000)
			{
				String n1 = ""+x;
				String n2 = "0000";
				String t1 = n2+n1;
				System.out.println(t1);
				x++;
			}
			while(x<100000)
			{
				String n1 = ""+x;
				String n2 = "000";
				String t1 = n2+n1;
				System.out.println(t1);
				x++;
			}
			while(x<1000000)
			{
				String n1 = ""+x;
				String n2 = "00";
				String t1 = n2+n1;
				System.out.println(t1);
				x++;
			}
			while(x<10000000)
			{
				String n1 = ""+x;
				String n2 = "0";
				String t1 = n2+n1;
				System.out.println(t1);
				x++;
			}
			System.out.println(x);
			x++;
		}
	}

}
