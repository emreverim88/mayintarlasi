package mayintarlasi;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		String myArray[][];
		int COLUMN;
		int ROW;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("zorluk seviyesi : 1 , 2 , 3 \n");
	
		
		
		Kutu mykutu = new Kutu(scanner.nextInt());
		mykutu.olustur();
		mykutu.goster();
		while(true)  
		{
			System.out.println("koordinatlarý giriniz: C,R : \n\n");
			COLUMN = scanner.nextInt();
			ROW = scanner.nextInt();
			mykutu.COLUMN = COLUMN;
			mykutu.ROW = ROW;
			System.out.println( mykutu.mayinVarmi());
			if(mykutu.mayinVarmi().equals("MAYÝN")){
				System.out.println("GAME OVER");
				break;
				
			}
			mykutu.mayinKontrol();
			mykutu.goster();
			
	   
		}

	}

}
