package test1;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test3 {
	
	public static void main(String[] args) {
		
	// Khởi tạo trình duyệt Firefox
	WebDriver driver = new FirefoxDriver();

	// Mở website
	driver.get("https://daominhdam.wordpress.com");

	// Mở rộng cửa sổ trình duyệt lớn nhất
	driver.manage().window().maximize();

	// In ra thông báo theo mong muốn
	System.out.println("Mở website thành công!");

	// Đóng trình duyệt
	driver.quit();
	}

}
