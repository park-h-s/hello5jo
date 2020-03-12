
public class Main07 {

	public static void main(String[] args) {
		for ( int i =0; i<10; i++) {
			System.out.println();
			for(int j=1; j<10; j++) {
				
				if (i==0) {
					System.out.print("[" + j + "단]" + "\t");
				} else {
					int z = i*j;
					
					System.out.print(j + "x" + i + "=" + z + "\t");
				}
			}
		}

	}

}
