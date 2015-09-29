/*
 Basic patterns using nested loops 
 
 1) Pattern 		|	3) Pattern
 					|
 ****				|	****
 ****				|   *  *
 ****				|	*  *
 ****				|	****
 
 2) Pattern 		|
 					|
 *					|
 **					|
 ***				|
 ****				|
 
 */

package MyPackage;
public class basicPrintPattern {

	public static void main(String[] args) {
		//1) Pattern
		String s = "*";
		int r,c;
		
		for(r=1; r<=4; r++){			
			for(c=1; c<=4 ;c++){
				System.out.print(s);
			}	
			System.out.println();
		}
		
		System.out.println();
		//2) Pattern	
			for(r=1; r<=4; r++){	
				for(c=1; c<=r ;c++){
						System.out.print(s);
					}	
					System.out.println();
				}
		System.out.println();
	    //3) Pattern	
		for(r=1; r<=4; r++){							
			for(c=1; c<=4 ;c++){
				if(r==1 || r==4 || c==1 || c==4){
					System.out.print(s);	
					} else {
					System.out.print(" ");
					}					
				}	
				System.out.println();
			}	
	}
}
