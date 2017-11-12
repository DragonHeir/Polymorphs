import java.awt.Color;
import java.awt.Graphics;

public class MovingPolymorph extends Polymorph {

	MovingPolymorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		
	}
	public void update() {
		setX(++x);
		setY(++y);
	}
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(x, y, width, height);		
		
	}

}
