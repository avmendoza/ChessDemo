/**
* This is a global comment for the class. 
*
*/
public class ChessPiece {

	/*
	 * adding a comment for gitdemo, note change aColore
	 */
	String color;
	String type;
	
	//constructor
	public ChessPiece(String aColore, String aType) {
		color = aColore;
		type = aType;
	}
    
    public  void changeColor(String anewColor){
        color = anewColor;
    }

    public void movePiece(){
    	System.out.println("The Piece has been moved");
    }
	
	
}
