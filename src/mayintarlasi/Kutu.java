package mayintarlasi;

import java.util.Random;

public class Kutu {
	
	static int ROW;
	static int COLUMN;
	public int zorlukSeviyesi;
	public int denemesayi;
	public int denemesayi2;
	String[][] myArray ;
	String[][] tempArray;
	
	
	public Kutu(int zorlukSeviyesi){
		
		this.zorlukSeviyesi = zorlukSeviyesi;
		myArray = new String [zorlukSeviyesi][zorlukSeviyesi];
		tempArray = new String [zorlukSeviyesi][zorlukSeviyesi];
		
	}
	
	
	public void olustur(){
		
		
		for (int i = 0; i < zorlukSeviyesi ; i++) {
			for (int j = 0; j < zorlukSeviyesi ; j++) {
				
				myArray[i][j] = "-";
				tempArray[i][j] = "-";
				}
		}
		for(int i = 0; i < zorlukSeviyesi ; i++){
			Random rand = new Random();
			Random rand2 = new Random();
			denemesayi = rand.nextInt(zorlukSeviyesi);
			denemesayi2 = rand2.nextInt(zorlukSeviyesi);
			//System.out.println(denemesayi);
			//System.out.println(denemesayi2);
			myArray[denemesayi][denemesayi2] = "*";
		
		}
		
		
		
		
		
		
	}
	
	public String mayinVarmi(){
		if(myArray[COLUMN][ROW].equals("*"))
		return "MAYÝN";
		else return "safe";
			
	}
	public void goster(){
		for (int i = 0; i < zorlukSeviyesi  ; i++) {
			for (int j = 0; j < zorlukSeviyesi  ; j++) {
				System.out.print(" "+tempArray[i][j]);
				
			}
				System.out.println("");
		}
		
				
		
		
	}
	
	public void mayinKontrol(){
		
		int j = 0;
		int i = 0;
		int counter = 0;
		
			
		
		while( true ){
			try {
			if(myArray[COLUMN - 1 + i][ROW - j].equals("*"))
				counter++;
			}
			catch (Exception e) {
				
			}
			if(i == 2 && j==0){
				j = 1;
				i = 0;
								
			}
			
			else if(i == 2 && j == 1){
				
				j = -1;
				i = 0;
			}
			
			else if (i == 2 && j == -1)
				break;
			i++;
			
		} 
			System.out.println("count degeri :"+counter);
			myArray[COLUMN][ROW] = ""+counter;
			
		    tempArray[COLUMN][ROW] = ""+counter;
			
			
		}
		
		
	}
	
	
	


