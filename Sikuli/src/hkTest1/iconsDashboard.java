package hkTest1;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;

public class iconsDashboard {

//Opening Dashboard's from Toolbar
Pattern OpenDashboardsIconToolbar = new Pattern("C:\\Users\\hkapalavai\\Documents\\HariTraining\\SikuliImages\\Dashboards\\OpenDashboardsIconToolbar.png");

//Dashboard's window buttons
Pattern OpenDashboardsWindowBox = new Pattern("C:\\Users\\hkapalavai\\Documents\\HariTraining\\SikuliImages\\Dashboards\\OpenDashboardsWindowBox.png");
Pattern OpenButton = new Pattern("C:\\Users\\hkapalavai\\Documents\\HariTraining\\SikuliImages\\Dashboards\\OpenButton.png");
Pattern CancelButton = new Pattern("C:\\Users\\hkapalavai\\Documents\\HariTraining\\SikuliImages\\Dashboards\\CancelButton.png");
Pattern CloseIcon = new Pattern("C:\\Users\\hkapalavai\\Documents\\HariTraining\\SikuliImages\\Dashboards\\CloseIcon.png");

// All Dashboard's on SmartClient
Pattern BusinessDevelopmentDashboard = new Pattern("C:\\Users\\hkapalavai\\Documents\\HariTraining\\SikuliImages\\Dashboards\\BusinessDevelopmentDashboard.png");
Pattern OMDashboard = new Pattern("C:\\Users\\hkapalavai\\Documents\\HariTraining\\SikuliImages\\Dashboards\\OMDashboard.png");
Pattern ORMDashboard = new Pattern("C:\\Users\\hkapalavai\\Documents\\HariTraining\\SikuliImages\\Dashboards\\ORMDashboard.png");
Pattern PMDashboard = new Pattern("C:\\Users\\hkapalavai\\Documents\\HariTraining\\SikuliImages\\Dashboards\\PMDashboard.png");
Pattern PRMDashboard = new Pattern("C:\\Users\\hkapalavai\\Documents\\HariTraining\\SikuliImages\\Dashboards\\PRMDashboard.png");
Pattern StaffAndSchedule = new Pattern("C:\\Users\\hkapalavai\\Documents\\HariTraining\\SikuliImages\\Dashboards\\StaffAndSchedule.png");
Pattern StaffDashboard = new Pattern("C:\\Users\\hkapalavai\\Documents\\HariTraining\\SikuliImages\\Dashboards\\StaffDashboard.png");

// Closing the Dashoard's icon after it is opened successfully
Pattern DashboardClose = new Pattern("C:\\Users\\hkapalavai\\Documents\\HariTraining\\SikuliImages\\Dashboards\\DashboardClose.png");

//Going to the next Tab
Pattern NextTabIcon = new Pattern("C:\\Users\\hkapalavai\\Documents\\HariTraining\\SikuliImages\\Dashboards\\NextTabIcon.png");

}
