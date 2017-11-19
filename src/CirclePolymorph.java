import java.awt.Color;
import java.awt.Graphics;

public class CirclePolymorph extends Polymorph {

	CirclePolymorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		
	}
	float c = 0;
	public void update() {
		setX(x + (int)(Math.sin(c)*10));
		setY(y + (int)(Math.cos(c)*10));
		c+=.1;
	}
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.yellow);
		g.fillRect(x, y, width, height);	

	}

}
