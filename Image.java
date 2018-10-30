
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Image {
	
	private int w ;
	private int h;
	public byte[]data;
	private String matrix="";
	
public Image(int width, int height) {
		this.w = width;
		this.h =height;
		data = new byte[width*height*3];
		int numberOfPixel = w*h;
		int numberOfBytes = numberOfPixel*3;
		this.data = new byte[numberOfBytes];
		
	}
//set single pixel to index value of RGB
public void set(int x, int y, int val) {

	int r = (val & 0xFF0000)>>4*4;
	int g = (val & 0x00FF00)>>2*4;
        int b = (val& 0x0000FF);
       
        System.out.println("r: " + r + ", g: " + g + ", b: " + b);
			int pos = (x+ y*w)*3;
			data[pos] = (byte) r;
			data[pos+1] = (byte)g;
			data[pos+2] = (byte)b;
			
			
		}
public void write(String filename) throws FileNotFoundException {
	// TODO Auto-generated method stub
	FileOutputStream fos = new FileOutputStream(filename);
	 try {
	
	 fos.write(new String(matrix).getBytes());
	 fos.close();
		
} catch (IOException e) {
	
	e.printStackTrace();
	}
}
}



 

