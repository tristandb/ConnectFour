package ConnectFour;

public class Board {
	public static final int HEIGHT = 6;
	public static final int WIDTH = 7;
	private Mark[] fields;
	
	public Board(){
		fields = new Mark[HEIGHT * WIDTH];
		for(int i = 0; i < HEIGHT * WIDTH; i++){
			fields[i] = Mark.E;
		}
	}
}
