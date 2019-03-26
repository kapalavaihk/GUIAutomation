package hkTest1;

import java.awt.Desktop;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import javax.swing.plaf.synth.Region;

import org.openqa.selenium.html5.Location;
import org.sikuli.natives.FindInput;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Finder;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.ScreenImage;

import com.tigervnc.rfb.ScreenSet;
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
		
			
		//Pattern accountMap = new Pattern("C:\\Users\\hkapalavai\\Documents\\HariTraining\\SikuliImages\\Report.PNG");
		Pattern account = new Pattern("C:\\Users\\hkapalavai\\Documents\\HariTraining\\SikuliImages\\Account.PNG"); 
		screen.click(account);
		screen.click(scobjects.helpToolbar);
		screen.click(scobjects.helpToolbarAbout);
		
		screen.click(scobjects.closeHelpVersion);

		for (int i = 0; i < 5; i++) 
		{
			screen.click(scobjects.WelcomePageScreenMinimize);
		}
		
	//	screen.doubleClick(scobjects.WelcomePageScreenMinimize);
	
		
Boolean x = screen.equals(scobjects.WelcomePage);
			
		System.out.printf("yes Welcome Page is seen", x);
		
		
		//Opening Dashboard's
		
		iconsDashboard dashboardObjects = new iconsDashboard();
		
		Pattern [] dashboardItems = {dashboardObjects.ORMDashboard,dashboardObjects.PMDashboard,
				dashboardObjects.BusinessDevelopmentDashboard, dashboardObjects.PRMDashboard,dashboardObjects.OMDashboard,
				dashboardObjects.StaffDashboard,dashboardObjects.PMDashboard};
		
		for (Pattern items: dashboardItems)
		{
			screen.click(dashboardObjects.OpenDashboardsIconToolbar);
			screen.click(items);
			screen.click(dashboardObjects.OpenButton);
			try {
				Thread.sleep(30000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			screen.click(dashboardObjects.NextTabIcon);
			}
				
		//Thread.sleep(1000);  //need to give some wait time for the dashboard's to open
	    ScreenImage file = screen.capture(screen.getBounds());  //need to give the location for the capture file on local drive 
	    System.out.println("saved screen as " +file);
	    
	    for (int i = 0; i < 5; i++) {
	    	
	    	screen.click(scobjects.WelcomePageScreenMaximize);
	    	
	    }
	    
	    	   	for (int j = 0; j < dashboardItems.length; j++) {
	    		screen.click(dashboardObjects.DashboardClose);
							}
	    
	    System.out.println("all dashboard items closed sucessfully");
	    
	    screen.click(scobjects.homeToolbar);
	    
	    // Opening Inquiries
	    
	    iconsInquiries inquiriesItems = new iconsInquiries();
	    
	    screen.click(inquiriesItems.OpenInquiriesToolbar);
	    
	    Pattern [] inquiries = {inquiriesItems.ClientsInquiry,inquiriesItems.ContactsInquiry };
		
		for (Pattern items: inquiries)
		{
			screen.click(inquiriesItems.OpenInquiriesToolbar);
			screen.click(items);
			screen.click(inquiriesItems.OpenButtonInquiriesBox);
			screen.click(inquiriesItems.inquiriesRunningMan);
			try {
				Thread.sleep(30000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			screen.click(dashboardObjects.NextTabIcon);
			}
				
		//Thread.sleep(1000);  //need to give some wait time for the dashboard's to open
	    ScreenImage file1 = screen.capture(screen.getBounds());  //need to give the location for the capture file on local drive 
	    System.out.println("saved screen as " +file1);
	    
	    
	    
	    
	    
	    
	    
	   // screen.getScreen().capture(500, 500, 500, 500);
	    
	//screen.selectRegion().findText("Welcome").getScreen;
		
//screen.selectRegion();
	    
	  /* Settings.MinSimilarity = 0.95
	    		Reg = Region(582,404,214,187)
	    		img = capture(Reg)
	    		search = True
	    		Settings.MoveMouseDelay = 0
	    		while search :
	    		    if  Reg.exists("12.png") or Reg.exists("13.png") or Reg.exists("14.png")or Reg.exists("15.png")or Reg.exists("28.png"):
	    		        click(Reg.getLastMatch())
	    		        search = False */
		

        // screen.doubleClick(account);
         //screen.click(WelcomePage);
       
	}

}
