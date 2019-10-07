package firsttoonegame;

public class DieDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die dice=new Die(6);
		Players first = new Players("Tri",dice);
		Players second = new Players("Thuyen",dice);
		Players third = new Players("Khang",dice);
		 boolean test = false, test2 = false,test3 = false;
	        
	        do{
	            test = first.calculatePoints();
	            test2 = second.calculatePoints();
	            test2 = third.calculatePoints();
	            System.out.println(first+"\n"+second+"\n"+third);
	            if(test) {
	                System.out.println("The winner is "+first.getPlayersName());}
	            if(test2) {
	                System.out.println("The winner is "+second.getPlayersName());}
	            if(test3) {
	            	System.out.println("The winner is "+third.getPlayersName());
	            }
	        }while(!(test || test2|| test3));
		
		
	}

}
