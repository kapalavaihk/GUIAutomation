package hkTest1;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;

public class iconsInquiries {
	
	//Opening inquiry from Toolbar
	Pattern OpenInquiriesToolbar= new Pattern("C:\\Users\\hkapalavai\\Documents\\HariTraining\\SikuliImages\\Inquiries\\OpenInquiriesToolbar.png");
	Pattern OpenButtonInquiriesBox= new Pattern("C:\\Users\\hkapalavai\\Documents\\HariTraining\\SikuliImages\\Inquiries\\OpenButtonInquiriesBox.png");
	Pattern inquiriesRunningMan= new Pattern("C:\\Users\\hkapalavai\\Documents\\HariTraining\\SikuliImages\\Inquiries\\inquiriesRunningMan.png");

	
	// Opening All Inquiries on SmartClient
	Pattern ClientsInquiry = new Pattern("C:\\Users\\hkapalavai\\Documents\\HariTraining\\SikuliImages\\Inquiries\\ClientsInquiry.png");
	Pattern ContactsInquiry = new Pattern("C:\\Users\\hkapalavai\\Documents\\HariTraining\\SikuliImages\\Inquiries\\ContactsInquiry.png");
}
