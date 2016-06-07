package thetheos;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		while(x != 100)
		{
			while(x<10)
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
