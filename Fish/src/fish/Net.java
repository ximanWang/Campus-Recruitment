package fish;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Net {
	private int x;//涓績鐐�	
	private int y;
	private int width;
	private int height;
	private int index;
	private BufferedImage image;
	private boolean show;
	public boolean isShow() {
		return show;
	}
	public void setShow(boolean show) {
		this.show = show;
	}
	public Net(String img) throws Exception{
		//鏂囦欢绯荤粺鍔犺浇鍥剧墖
		image = ImageIO.read(new File(img));
		width = image.getWidth();
		height = image.getHeight();
		
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public BufferedImage getImage() {
		return image;
	}
	public void setImage(BufferedImage image) {
		this.image = image;
	}
}
