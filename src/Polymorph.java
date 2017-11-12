import java.awt.Graphics;

public abstract class Polymorph {
    protected int x;
    protected int y;
    protected int width;
    protected int height;
    
    Polymorph(int x, int y, int width, int height){
   	 this.x = x;
   	 this.y = y;
   	 this.width = width;
   	 this.height = height;
    }
    
    public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);
    
    int getX() {
    	return x;
    }
    void setX(int x) {
    	if (x > PolymorphWindow.WIDTH) {
    		this.x = PolymorphWindow.WIDTH;
    	}
    	else if (x < 0) {
    		this.x = 0;
    	}
    	else {
    		this.x = x;
    	}
    }
    int getY() {
    	return y;
    }
    void setY(int y) {
    	if (y > PolymorphWindow.WIDTH) {
    		this.y = PolymorphWindow.WIDTH;
    	}
    	else if (y < 0) {
    		this.y = 0;
    	}
    	else {
    		this.y = y;
    	}
    }
    int getWidth() {
    	return width;
    }
    int getHeight() {
    	return height;
    }
    void setWidth(int width) {
    	if (width < 0) {
    		this.width = 0;
    	}
    	else {
    		this.width = width;
    	}
    }
    void setHeight(int height) {
    	if (height < 0) {
    		this.height = 0;
    	}
    	else {
    		this.height = height;
    	}
    }
}
