package Random;

public class Bowling {
public static void main(String[] args) {
	int throwsPerFrame = 2;
	int frames = 10;
	int pins = 10;
	int firstFrame;
	int secondFrame;
	int secondPins;
	int totalFrame = 0;
	
	int frameTotal = 0;
	for(int i = 1; i <= frames; i++  ){
//		while(i != 11){
			 firstFrame = (int) (Math.random() * pins) + 1;
				if(firstFrame != 10 ){
					secondPins = 10 - firstFrame;
					
					secondFrame = (int) (Math.random() * secondPins) + 1;
					
					totalFrame = firstFrame + secondFrame;
					if(totalFrame != pins){
					System.out.print("First Frame");
					System.out.println("  Second Frame");
					
					System.out.print("    " + firstFrame);
					System.out.println("              " + secondFrame);
					
					System.out.println(totalFrame);
					System.out.println();
				
					
				
							
					frameTotal = frameTotal + totalFrame;
												
					
					System.out.println(frameTotal);
				}else{
						System.out.print("First Frame");
						System.out.println("  Second Frame");
						
						System.out.print("    " + firstFrame);
						System.out.println("              " + secondFrame);
						
						System.out.println(totalFrame);
						System.out.println();
						
						frameTotal = frameTotal + (totalFrame);
						
						System.out.println("Spare!!!!!!");
						System.out.println(frameTotal);
						
						
					}
				}else{
					
				//	totalFrame = totalFrame + 10;
					System.out.println("First Throw");
					System.out.println("Strike");
					
					
					frameTotal = frameTotal + totalFrame;
					
					
					System.out.println(frameTotal);
				}
		//		int lastFrame;
		//		frameTotal = frameTotal + totalFrame;
		}
	}
}

	