package hkTest1;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import javax.swing.plaf.synth.Region;

import org.openqa.selenium.html5.Location;
import org.sikuli.natives.FindInput;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Finder;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.tigervnc.rfb.fenceTypes;

public class hkSikuliTest1 {

	public static void main(String[] args) throws FindFailed {
		// TODO Auto-generated method stub
		
		Desktop desktop = Desktop.getDesktop();
		File dirOpen = null;
		
		try {
			dirOpen = new File("C:\\Users\\hkapalavai\\AppData\\Local\\BST Global\\Enterprise\\SmartClient.exe");
			desktop.open(dirOpen);
			Thread.sleep(60000);
			}
		catch ( Exception e) {
			// TODO: handle exception
			System.out.println("File cannot be found");
		}

		
		Screen screen = new Screen();
		
		iconsSmartClient scobjects = new iconsSmartClient();
		
		screen.click(scobjects.helpToolbar);
		
		//Pattern accountMap = new Pattern("C:\\Users\\hkapalavai\\Documents\\HariTraining\\SikuliImages\\Report.PNG");
		//Pattern account = new Pattern("C:\\Users\\hkapalavai\\Documents\\HariTraining\\SikuliImages\\Account.PNG"); 
		//screen.click(accountMap);
		screen.click(scobjects.helpToolbarAbout);
		
		screen.click(scobjects.closeHelpVersion);

Boolean x = screen.equals(scobjects.WelcomePage);
			
		System.out.println(x);
		
		
//screen.selectRegion();
		

        // screen.doubleClick(account);
         //screen.click(WelcomePage);
       
	}

}
