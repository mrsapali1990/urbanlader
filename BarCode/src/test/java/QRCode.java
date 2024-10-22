import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class QRCode {
	@Test
	public void testQRCode() throws IOException, Exception
	{
	
		System.setProperty("webdriver.chrome.driver", "E:\\software\\ChromeDriver100\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qrcode.meetheed.com/qrcode_examples.php");
		driver.manage().window().maximize();
		String qrCodeURL=driver.findElement(By.xpath("//img[@src='images/qr_code_con.png']")).getAttribute("src");
		//Create an object of URL Class
		URL url=new URL(qrCodeURL);
		//Pass the URL class object to store the file as image
		BufferedImage bufferedimage=ImageIO.read(url);
		// Process the image
		LuminanceSource luminanceSource=new BufferedImageLuminanceSource(bufferedimage);
		BinaryBitmap binaryBitmap=new BinaryBitmap(new HybridBinarizer(luminanceSource));
		//To Capture details of QR code
		Result result =new MultiFormatReader().decode(binaryBitmap);
		System.out.println(result.getText());
		driver.close();
		
	}

}
