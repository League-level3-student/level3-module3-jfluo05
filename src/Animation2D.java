interface Drawable {
abstract void draw();

}
abstract class Animation{
	
	int getFramerate() {
		return 24;
		
	}
	
}

public class Animation2D {
	public static void main(String[] args) {
		Animation2D
	}
	
	public class Animation2D extends Animation implements Drawable{

		@Override
		public void draw() {
			// TODO Auto-generated method stub
			System.out.println("drawing");
			getFramerate();
		}

		int getFramerate() {
			System.out.println("hi");
			return 0;
		}
	}

}
