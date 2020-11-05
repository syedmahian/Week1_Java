
public class Coins {

	public static void main(String[] args) {
		
			
			float cost = 4.58f;
			float pay = 20f;
			int count10= 0;
			int count5 = 0; 
			int count20= 0;
			int count2 = 0;
			
			float rest = pay - cost; 
			
			do {
				if(rest - 10f >= 0) {
					rest = rest- 10f;
					count10++;
				}
				else if (rest-5f >= 0) {
					rest = rest -5f;
					count5++;
				}
				else if (rest - 0.2f>=0) {
					rest = rest -0.2f;
					count20++;
				}
				else if (rest -0.02f >= 0) {
					rest = rest - 0.02f;
					count2++;
				}
				
				
			
		} while(rest > 0);
			System.out.println(count10 + " " + count5 + " "+ count20 + "" + count2);
		}
}

