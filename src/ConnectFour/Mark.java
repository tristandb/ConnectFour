package ConnectFour;

public enum Mark {
	X, O, E;
	/*@
	   ensures this == Mark.XX ==> \result == Mark.OO;
	   ensures this == Mark.OO ==> \result == Mark.XX;
	   ensures this == Mark.EMPTY ==> \result == Mark.EMPTY;
	 */
	/**
	 * Returns the other mark. 
	 * @return the other mark is this mark is not EMPTY or EMPTY
	 */
	public Mark other(){
		if(this == X){
			return X;
		}else if(this == O){
			return O;
		}else{
			return E;
		}
	}
}
