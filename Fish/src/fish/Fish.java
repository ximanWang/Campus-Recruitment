package fish;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;

import javax.imageio.ImageIO;

public class Fish implements Runnable {
	private int x;
	private int y;
	private int width;
	private int height;
	private int index=0;
	private BufferedImage[] images;
	private BufferedImage image;
	private int step;//移动步伐
	public Fish(String perfix) throws Exception {
		//perfix = "fish02"
		// fish01_00.png ~ fish01_09.png -> images
		images = new BufferedImage[10];
		for(int i=0; i<10; i++){
			//i= 0 1 2 ... 9
			String file = perfix+"_0"+i+".png";
			images[i] = ImageIO.read(new File(file));
		}
		image = images[0];
		width = image.getWidth();
		height = image.getHeight();
		Random random = new Random();
		x = random.nextInt(800-width);
		y = random.nextInt(480-height);
		step = random.nextInt(4)+2;
	}
	/** 在Runnable 中定义的抽象方法 */
	public void run() {
		while(true){
			move();
			try {
				Thread.sleep(1000/10);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void move(){
		x-=step;
		if(x<-width){
			getOut();
		}
		//更换图片
		image = images[index++%images.length];
	}
	/** 滚蛋 */
	public void getOut(){ 
		Random random = new Random();
		x = 800;
		y = random.nextInt(480-height);
		step = random.nextInt(4)+2;
	}
	/** 检查当前鱼是否被网抓到 */
	public boolean catchBy(Net net){
		int dx = net.getX() - this.x;
		int dy = net.getY() - this.y;
		return dx>=0 && dx <width && dy>=0 && dy<height;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public BufferedImage getImage() {
		return image;
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}

	public BufferedImage[] getImages() {
		return images;
	}

	public void setImages(BufferedImage[] images) {
		this.images = images;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getStep() {
		return step;
	}

	public void setStep(int step) {
		this.step = step;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
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
	
	
}





