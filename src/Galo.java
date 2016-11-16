import java.util.Random;

public class Galo {

	Random r = new Random();
	static int[][] tab = new int[3][3];
	
	public Galo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		zerar();
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(tab[i][j] == 0){
					if(j==0){
						System.out.printf(i + "\t ? | ");
					}
					else if(j>1){
						System.out.printf("?");
					}
					else{
						System.out.printf("? | ");
					}
				}
				System.out.println("");
			}
		}

	}
	
	public int single(){
		
		return r.nextInt(3);
	}

	public static void zerar(){
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				tab[i][j] = 0;
			}
		}
	}
}
