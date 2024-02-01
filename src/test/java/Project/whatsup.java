package Project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class whatsup {

	
	public static void main(String[] args) throws InterruptedException, AWTException, FileNotFoundException 
	{
		//Step 1 : Open the Chrome Browser
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		//Step 2 : Open the Whatsapp using phone number - Selection
		driver.get("https://web.whatsapp.com/");
		Thread.sleep(10000);
		WebElement linkMoNum = driver.findElement(By.xpath("//*[text()='Link with phone number']"));
		Actions action = new Actions(driver);
		action.moveToElement(linkMoNum).click().perform();
		Thread.sleep(5000);
		
		WebElement phone = driver.findElement(By.xpath("//input[@value='+91 ']")); 
		phone.sendKeys("8300574079");
		WebElement next = driver.findElement(By.xpath("//*[text()='Next']"));
		next.click();		
		//Waiting Time - Enter the manual OTP code
		driver.manage().timeouts().pageLoadTimeout(200, TimeUnit.SECONDS); 
		driver.manage().timeouts().implicitlyWait(175, TimeUnit.SECONDS);
		
		
		//Step 3 : Selecting a number to send a message 
		WebElement search = driver.findElement(By.xpath("//p[@class='selectable-text copyable-text iq0m558w g0rxnol2']")); 
		Thread.sleep(10000);
		search.sendKeys("93452 09174");

		WebElement conOpen = driver.findElement(By.xpath("//span[@title='Bbbbb']"));
		conOpen.click();
		
		//Actions act=new Actions(driver);
		//act.doubleClick(conOpen).perform();
		
		//Step 4 : Sending a Text Message 
		WebElement textMessage = driver.findElement(By.xpath("(//p[@class='selectable-text copyable-text iq0m558w g0rxnol2'])[2]"));
		textMessage.sendKeys("hello bhuvanesh");
		WebElement send1 = driver.findElement(By.xpath("//div[@class='_2xy_p _3XKXx']"));
		send1.click();
		Thread.sleep(1000);
		WebElement textMessage1 = driver.findElement(By.xpath("(//p[@class='selectable-text copyable-text iq0m558w g0rxnol2'])[2]"));
		textMessage1.sendKeys("hi bhuvanesh1");
		WebElement send11 = driver.findElement(By.xpath("//div[@class='_2xy_p _3XKXx']"));
		send11.click();
		
		Thread.sleep(1000);
		
		WebElement textMessage12 = driver.findElement(By.xpath("(//p[@class='selectable-text copyable-text iq0m558w g0rxnol2'])[2]"));
		textMessage12.sendKeys("how bhuvanesh1");
		WebElement send12 = driver.findElement(By.xpath("//div[@class='_2xy_p _3XKXx']"));
		send12.click();
		System.out.println("hi2");
		Thread.sleep(1000);
		
		WebElement moveTo = driver.findElement(By.xpath("//div[@class='_1BOF7 _2AOIt']"));
		action.moveToElement(moveTo).perform();
		
		
		WebElement arrow = driver.findElement(By.xpath("//span[@data-icon='down-context']"));
	  arrow.click();
	  Thread.sleep(1000);
	  WebElement star1 = driver.findElement(By.xpath("//div[@aria-label='Star']"));
		star1.click();
		Thread.sleep(1000);
		System.out.println("hi2");
		WebElement achievemenu1111=driver.findElement(By.xpath("(//span[@data-icon='menu'])[2]"));
		achievemenu1111.click();
		Thread.sleep(2000);
		
		WebElement achieveclosed1=driver.findElement(By.xpath("//div[text()='Close chat']"));
		achieveclosed1.click();
		Thread.sleep(1000);
		/*	
		Actions act=new Actions(driver);
		act.moveByOffset(18,18).click().perform();
		System.out.println("hi2");
		
		WebElement star1 = driver.findElement(By.xpath("//div[@aria-label='Star']"));
		star1.click();
		
		System.out.println("hi2");
		WebElement achievemenu1111=driver.findElement(By.xpath("(//span[@data-icon='menu'])[2]"));
		achievemenu1111.click();
		Thread.sleep(2000);
		
		WebElement achieveclosed1=driver.findElement(By.xpath("//div[text()='Close chat']"));
		achieveclosed1.click();
		Thread.sleep(2000);
		
	/*
		//select for star
		WebElement star = driver.findElement(By.xpath("(//span[@data-icon='down-context'])[3]"));
		star.click();
		System.out.println("hi1");
		WebElement star1 = driver.findElement(By.xpath("//div[@aria-label='Star']"));
		star1.click();
		System.out.println("hi2");
		WebElement achievemenu1111=driver.findElement(By.xpath("(//span[@data-icon='menu'])[2]"));
		achievemenu1111.click();
		Thread.sleep(2000);
		
		WebElement achieveclosed1=driver.findElement(By.xpath("//div[text()='Close chat']"));
		achieveclosed1.click();
		Thread.sleep(2000);
		
		//Step 5 : Selecting a option for document
		Thread.sleep(3000);
		
		
		//WebElement deleteOption = driver.findElement(By.xpath("//*[text()='Delete']"));
		//deleteOption.click();
		//WebElement deleteOption1 = driver.findElement(By.xpath("//*[text()='Delete for me']"));
		//deleteOption1.click();
		
		
		//driver.navigate().back();
		
		/*		
		WebElement attach = driver.findElement(By.xpath("//span[@data-icon='attach-menu-plus']")); 
		attach.click();

		//Step 6 : Sending a Document - Pdf Document
		WebElement document =driver.findElement(By.xpath("//div[@class='tvf2evcx m0h2a7mj lb5m6g5c j7l1k36l ktfrpxia nu7pwgvd p357zi0d dnb887gk gjuq5ydh i2cterl7 fhf7t426 sap93d0t gndfcl4n ajgl1lbb lniyxyh2 fooq7fky bcfko8ch']")); 
		document.click();
		
		Thread.sleep(3000);
		Robot key = new Robot();
		String file = "C:\\Users\\Balaji\\Downloads\\MISSION I'MPOSSIBLE _TNPSC_Group 4 Schedule & Topics__.pdf"; 
		StringSelection imagePath = new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(imagePath, null);
		key.keyPress(KeyEvent.VK_CONTROL);
		key.keyPress(KeyEvent.VK_V);
		
		key.keyRelease(KeyEvent.VK_V);
		key.keyRelease(KeyEvent.VK_CONTROL);
		
		key.keyPress(KeyEvent.VK_ENTER);
		key.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
		
		key.keyPress(KeyEvent.VK_ENTER);
		key.keyRelease(KeyEvent.VK_ENTER);	
		
		
		Thread.sleep(3000);
		
		//Step 8 : Selecting a option for document
				WebElement attachword = driver.findElement(By.xpath("//span[@data-icon='attach-menu-plus']")); 
				attachword.click();
				
		//Step 9 : Sending a Document - Word Document 
				WebElement documentword =driver.findElement(By.xpath("//div[@class='tvf2evcx m0h2a7mj lb5m6g5c j7l1k36l ktfrpxia nu7pwgvd p357zi0d dnb887gk gjuq5ydh i2cterl7 fhf7t426 sap93d0t gndfcl4n ajgl1lbb lniyxyh2 fooq7fky bcfko8ch']")); 
				documentword.click();
				
				Thread.sleep(3000);
				Robot key1 = new Robot();
				String file1 = "C:\\Users\\Balaji\\Downloads\\Selenium Q&A.docx"; 
				StringSelection imagePath1 = new StringSelection(file1);
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(imagePath1, null);
				key1.keyPress(KeyEvent.VK_CONTROL);
				key1.keyPress(KeyEvent.VK_V);
				
				key1.keyRelease(KeyEvent.VK_V);
				key1.keyRelease(KeyEvent.VK_CONTROL);
				
				key1.keyPress(KeyEvent.VK_ENTER);
				key1.keyRelease(KeyEvent.VK_ENTER);
				
				Thread.sleep(5000);
				
				key1.keyPress(KeyEvent.VK_ENTER);
				key1.keyRelease(KeyEvent.VK_ENTER);
	
				Thread.sleep(3000);
				
				//Step 10 : Selecting a option for Photo and video
						
						WebElement attachimage = driver.findElement(By.xpath("//span[@data-icon='attach-menu-plus']")); 
						attachimage.click();
				//Step 11 : Sending a Document - image Document 
						WebElement documentimage =driver.findElement(By.xpath("(//li[@class='jScby Iaqxu FCS6Q _2UNQo'])[2]")); 
						documentimage.click();
						
						Thread.sleep(3000);
						Robot key2 = new Robot();
						String fileimage = "C:\\Users\\Balaji\\Downloads\\lord-venkateswara-on-red-curtain-5jbb59cgqn9ripg4.jpg"; 
						StringSelection imagePath2 = new StringSelection(fileimage);
						Toolkit.getDefaultToolkit().getSystemClipboard().setContents(imagePath2, null);
						key2.keyPress(KeyEvent.VK_CONTROL);
						key2.keyPress(KeyEvent.VK_V);
						
						key2.keyRelease(KeyEvent.VK_V);
						key2.keyRelease(KeyEvent.VK_CONTROL);
						
						key2.keyPress(KeyEvent.VK_ENTER);
						key2.keyRelease(KeyEvent.VK_ENTER);
						
						Thread.sleep(5000);
						
						key2.keyPress(KeyEvent.VK_ENTER);
						key2.keyRelease(KeyEvent.VK_ENTER);
						
						//Step 12 : Selecting a option for Photo and video
						
						WebElement attachVideo = driver.findElement(By.xpath("//span[@data-icon='attach-menu-plus']")); 
						attachVideo.click();
						//Step 13 : Sending a Document - video Document 
						WebElement documentvideo =driver.findElement(By.xpath("(//li[@class='jScby Iaqxu FCS6Q _2UNQo'])[2]")); 
						documentvideo.click();
						
						Thread.sleep(3000);
						Robot key3 = new Robot();
						String filevideo = "C:\\Users\\Balaji\\Downloads\\Coffee Container Kiosk 10ft 3D Model Preview.mp4"; 
						StringSelection videoPath2 = new StringSelection(filevideo);
						Toolkit.getDefaultToolkit().getSystemClipboard().setContents(videoPath2, null);
						key3.keyPress(KeyEvent.VK_CONTROL);
						key3.keyPress(KeyEvent.VK_V);
						
						key3.keyRelease(KeyEvent.VK_V);
						key3.keyRelease(KeyEvent.VK_CONTROL);
						
						key3.keyPress(KeyEvent.VK_ENTER);
						key3.keyRelease(KeyEvent.VK_ENTER);
						
						Thread.sleep(5000);
						
						key3.keyPress(KeyEvent.VK_ENTER);
						key3.keyRelease(KeyEvent.VK_ENTER);

						Thread.sleep(3000);				
						//Camera
						//Step 14 : Selecting a option for Camera
						 
						WebElement attachCamera = driver.findElement(By.xpath("//span[@data-icon='attach-menu-plus']")); 
						attachCamera.click();
						
						WebElement documentCamera =driver.findElement(By.xpath("(//li[@class='jScby Iaqxu FCS6Q _2UNQo'])[3]")); 
						documentCamera.click();
						
						Thread.sleep(3000);
						//Step 15 : Selecting a option for popup - manually and automation both
						WebElement allow = driver.findElement(By.xpath("//*[text()='OK, got it']"));
						allow.click();
						
						//Step 16 : Taken a Picture using Camera
						WebElement cameraButton = driver.findElement(By.xpath("//span[@data-icon='camera']"));
						cameraButton.click();
						Thread.sleep(2000);
						//Step 17 : send a hint of picture and emji
						WebElement messagenoteimage = driver.findElement(By.xpath("(//div[@class='lhggkp7q qq0sjtgm jxacihee c3x5l3r8 b9fczbqn t35qvd06 m62443ks rkxvyd19 c5h0bzs2 fe5nidar kao4egtt']"));
				
						messagenoteimage.sendKeys("Captured image");
						Thread.sleep(2000);
						WebElement emog = driver.findElement(By.xpath("//Span[@data-icon='emoji-input']"));
						emog.click();
						Thread.sleep(2000);
						WebElement emogclick = driver.findElement(By.xpath("//Span[@aria-label='😁']"));
						emogclick.click();
						Thread.sleep(2000);
						WebElement sendcamera = driver.findElement(By.xpath("//div[@class='g0rxnol2']"));
						sendcamera.click();
						Thread.sleep(3000);
						
						//Contact
						//Step 14 : Selecting a option for Contact
						 
						WebElement attachContact = driver.findElement(By.xpath("//span[@data-icon='attach-menu-plus']")); 
						attachContact.click();
						
						WebElement contact =driver.findElement(By.xpath("(//li[@class='jScby Iaqxu FCS6Q _2UNQo'])[4]")); 
						contact.click();
						
						WebElement selectContact = driver.findElement(By.xpath("//*[text()='1 unknown11']"));
						selectContact.click();
						Thread.sleep(3000);
						WebElement sendContact = driver.findElement(By.xpath("//span[@aria-label='Send']"));
						sendContact.click();
						WebElement sendContact1 = driver.findElement(By.xpath("//*[@data-icon='send']"));
						sendContact1.click();
						Thread.sleep(2000);
						
		//Emoji
		WebElement emoji = driver.findElement(By.xpath("//span[@data-icon='smiley']"));
		emoji.click();
		WebElement selectEmoji = driver.findElement(By.xpath("//span[@data-emoji-index='3']"));
		selectEmoji.click();
		WebElement sendEmoji = driver.findElement(By.xpath("//*[@data-icon='send']"));
		sendEmoji.click();
		
		Thread.sleep(2000);
		//Voice Message
		WebElement voice = driver.findElement(By.xpath("//span[@data-icon='ptt']"));
		voice.click();
		Thread.sleep(8000);
		WebElement sendVoice = driver.findElement(By.xpath("//button[@aria-label='Send']"));
		sendVoice.click();
		/*
		//Delete 
		WebElement delete = driver.findElement(By.xpath("//span[@data-icon='down-context']"));
		delete.click();
		WebElement deleteOption = driver.findElement(By.xpath("//*[text()='Delete']"));
		deleteOption.click();
		WebElement deleteOption1 = driver.findElement(By.xpath("//*[text()='Delete for me']"));
		deleteOption1.click();
		
		
		//poll
		WebElement attachpoll = driver.findElement(By.xpath("//span[@data-icon='attach-menu-plus']")); 
		attachpoll.click();
		//Step 13 : Sending a Document - video Document 
		WebElement poll =driver.findElement(By.xpath("(//li[@class='jScby Iaqxu FCS6Q _2UNQo'])[5]")); 
		poll.click();
		Thread.sleep(2000);
		
		WebElement polltext =driver.findElement(By.xpath("(//p[@class='selectable-text copyable-text iq0m558w g0rxnol2'])[1]")); 
		polltext.sendKeys("who are you");
		Thread.sleep(2000);
		
		WebElement pollquestion3 =driver.findElement(By.xpath("(//span[@data-icon='emoji-input'])[1]")); 
		pollquestion3.click();
		Thread.sleep(2000);
		
		WebElement emoji7 =driver.findElement(By.xpath("//span[@aria-label='😄']")); 
		emoji7.click();
		Thread.sleep(2000);
		
		WebElement polltext1 =driver.findElement(By.xpath("(//p[@class='selectable-text copyable-text iq0m558w g0rxnol2'])[2]")); 
		polltext1.sendKeys("Vignesh");
		Thread.sleep(2000);
		
		WebElement pollquestion1 =driver.findElement(By.xpath("(//span[@data-icon='emoji-input'])[2]")); 
		pollquestion1.click();
		Thread.sleep(2000);
		
		WebElement emoji1 =driver.findElement(By.xpath("//span[@aria-label='😄']")); 
		emoji1.click();
		Thread.sleep(2000);
		
		WebElement polltext2 =driver.findElement(By.xpath("(//p[@class='selectable-text copyable-text iq0m558w g0rxnol2'])[3]")); 
		polltext2.sendKeys("rajesh");
		Thread.sleep(2000);
		
		WebElement pollquestion2 =driver.findElement(By.xpath("(//span[@data-icon='emoji-input'])[3]")); 
		pollquestion2.click();
		
		WebElement emoji2 =driver.findElement(By.xpath("//span[@aria-label='😄']")); 
		emoji2.click();
		Thread.sleep(2000);
		
		WebElement polltext3 =driver.findElement(By.xpath("(//p[@class='selectable-text copyable-text iq0m558w g0rxnol2'])[4]")); 
		polltext3.sendKeys("bhuvanesh");
		Thread.sleep(2000);
		
		WebElement pollquestion4 =driver.findElement(By.xpath("(//span[@data-icon='emoji-input'])[4]")); 
		pollquestion4.click();
		
		WebElement emoji4 =driver.findElement(By.xpath("//span[@aria-label='😄']")); 
		emoji4.click();
		Thread.sleep(2000);
		
		//Drag and drop
		//WebElement drag = driver.findElement(By.xpath("(//div[@class='g9zvcdbd j8fxo1e4'])[2]"));
		//WebElement drop = driver.findElement(By.xpath("(//div[@class='g9zvcdbd j8fxo1e4'])[3]"));
				
		
		//Actions act = new Actions(driver);
		//act.dragAndDrop(drag, drop).perform();
		//Thread.sleep(2000);
		//System.out.println("drag and drop");
		
		
		WebElement pollsend =driver.findElement(By.xpath("//span[@data-icon='send']")); 
		pollsend.click();
		
		
		//New Stickers
		
		WebElement option = driver.findElement(By.xpath("//span[@data-icon='attach-menu-plus']")); 
		option.click();
		//Step 13 : Sending a Document - video Document 
		WebElement newSticker =driver.findElement(By.xpath("(//li[@class='jScby Iaqxu FCS6Q _2UNQo'])[6]")); 
		newSticker.click();
		Thread.sleep(2000);
		
		Robot key9 = new Robot();
		String image = "C:\\Users\\Balaji\\Downloads\\lord-venkateswara-on-red-curtain-5jbb59cgqn9ripg4.jpg"; 
		
		StringSelection newsticker = new StringSelection(image);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(newsticker, null);
		key9.keyPress(KeyEvent.VK_CONTROL);
		key9.keyPress(KeyEvent.VK_V);
		
		key9.keyRelease(KeyEvent.VK_V);
		key9.keyRelease(KeyEvent.VK_CONTROL);
		
		key9.keyPress(KeyEvent.VK_ENTER);
		key9.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
		
		key9.keyPress(KeyEvent.VK_ENTER);
		key9.keyRelease(KeyEvent.VK_ENTER);
		
	
	//menu
	 
	//new group
		WebElement menu=driver.findElement(By.xpath("(//div[@class='_3ndVb fbgy3m38 ft2m32mm oq31bsqd nu34rnf1'])[5]"));
		menu.click();
		
		WebElement newGroup=driver.findElement(By.xpath("//div[@aria-label='New group']"));
		newGroup.click();
		Thread.sleep(2000);
		WebElement addcon=driver.findElement(By.xpath("//input[@placeholder='Search name or number']"));
		addcon.sendKeys("8825698484");

		Thread.sleep(2000);
		WebElement selectcontact=driver.findElement(By.xpath("(//div[@class='_8nE1Y'])[1]"));
		selectcontact.click();

		WebElement addcontact1=driver.findElement(By.xpath("//input[@placeholder=' ']"));
		addcontact1.sendKeys("9345209174");
		
		Thread.sleep(1000);
		WebElement selectcontact1=driver.findElement(By.xpath("(//div[@class='_8nE1Y'])[1]"));
		selectcontact1.click();

		Thread.sleep(1000);
		WebElement movetocreate=driver.findElement(By.xpath("//span[@data-icon='arrow-forward']"));
		movetocreate.click();
		
		System.out.println("hi");
		
		WebElement nameofnewgroup=driver.findElement(By.xpath("//div[@class='_1N-sl']/child::div/child::div/child::p"));
		nameofnewgroup.sendKeys("bhuvi1");
		
		//Taking a image
		WebElement imagecreate=driver.findElement(By.xpath("//div[text()='Add group icon']"));
		imagecreate.click();
		
		//emoji
		WebElement emoji=driver.findElement(By.xpath("//div[text()='Emoji & sticker']"));
		emoji.click();
		
		//selecting colour of dp
		
		WebElement colour=driver.findElement(By.xpath("//button[@style='background-color: rgb(172, 252, 172);']"));
		colour.click();
		
		//selecting emji
		WebElement colouremoji=driver.findElement(By.xpath("//button[@aria-label='Emojis selector']"));
		colouremoji.click();
		
		WebElement colouremoji1=driver.findElement(By.xpath("//span[@data-emoji='😄']"));
		colouremoji1.click();
		
		//save
		WebElement save=driver.findElement(By.xpath("//span[@data-icon='checkmark-large']"));
		save.click();
		

		WebElement rightmenu = driver.findElement(By.xpath("//span[@class='kiiy14zj']"));
		rightmenu.click();
		
		WebElement closeChat = driver.findElement(By.xpath("//*[text()='Close chat']"));
		closeChat.click();
			
		
		//	New community
		WebElement menu=driver.findElement(By.xpath("(//div[@class='_3ndVb fbgy3m38 ft2m32mm oq31bsqd nu34rnf1'])[5]"));
		menu.click();
		
		//selecting new community
		WebElement newGroup=driver.findElement(By.xpath("//div[text()='New community']"));
		newGroup.click();
		Thread.sleep(2000);
		
		//selecting arrow
		WebElement arrownext=driver.findElement(By.xpath("//div[@aria-label='Continue new community creation']"));
		arrownext.click();
		
		Thread.sleep(2000);
		
		
		//Community name
		WebElement nameofnewcomm=driver.findElement(By.xpath("//div[@class='_1N-sl']/child::div/child::div/child::p"));
		nameofnewcomm.sendKeys("bhuvi1");
		
		Thread.sleep(2000);
		
		//Taking a add community icon image
		WebElement comdp=driver.findElement(By.xpath("//div[text()='Add community icon']"));
		comdp.click();
		
		Thread.sleep(2000);
		
		//emoji
		WebElement emoji=driver.findElement(By.xpath("//div[text()='Emoji & sticker']"));
		emoji.click();
		
		Thread.sleep(2000);
		
		//selecting colour of dp
		
		WebElement colour=driver.findElement(By.xpath("//button[@style='background-color: rgb(172, 252, 172);']"));
		colour.click();
		
		Thread.sleep(2000);
		
		//selecting emji
		WebElement colouremoji=driver.findElement(By.xpath("//span[@data-icon='media-editor-emoji']"));
		colouremoji.click();
		
		Thread.sleep(2000);
		
		WebElement colouremoji1=driver.findElement(By.xpath("//span[@data-emoji='😄']"));
		colouremoji1.click();
		
		Thread.sleep(2000);
		
		WebElement dpsave=driver.findElement(By.xpath("//span[@data-icon='checkmark-large']"));
		dpsave.click();
		
		Thread.sleep(2000);
		
		//save
		WebElement commsave=driver.findElement(By.xpath("//div[@aria-label='Create community']"));
		commsave.click();
	
		Thread.sleep(2000);
		
		
		WebElement back=driver.findElement(By.xpath("//span[@data-icon='back']"));
		back.click();
		
		
		//exit the community and achieve again
		

		WebElement achievemenu=driver.findElement(By.xpath("(//div[@class='_3ndVb fbgy3m38 ft2m32mm oq31bsqd nu34rnf1'])[5]"));
		achievemenu.click();
		
		WebElement newachieve=driver.findElement(By.xpath("//div[text()='Archived']"));
		newachieve.click();
		Thread.sleep(2000);
		
		//selectarch
		WebElement selachieve=driver.findElement(By.xpath("(//div[@class='_8nE1Y'])[3]"));
		selachieve.click();
		Thread.sleep(2000);
		
		WebElement achievemenu1=driver.findElement(By.xpath("(//span[@data-icon='menu'])[2]"));
		achievemenu1.click();
		Thread.sleep(2000);
		
		WebElement achieveclosed=driver.findElement(By.xpath("//div[text()='Close chat']"));
		achieveclosed.click();
		Thread.sleep(2000);
		
	
		//Select chat
		
		WebElement selemessmenu=driver.findElement(By.xpath("(//div[@class='_3ndVb fbgy3m38 ft2m32mm oq31bsqd nu34rnf1'])[5]"));
		selemessmenu.click();
		
		WebElement selemess=driver.findElement(By.xpath("//div[text()='Select chats']"));
		selemess.click();
		
		WebElement select1=driver.findElement(By.xpath("(//div[@class='g0rxnol2 l7jjieqr dh5rsm73 hpdpob1j neme6l2y ajgl1lbb dntxsmpk ixn6u0rb s2vc4xk1 o0wkt7aw cgi16xlc'])[1]"));
		select1.click();
		
		WebElement optionmuteornonmute=driver.findElement(By.xpath("//span[@data-icon='call-menu']"));
		optionmuteornonmute.click();
		
		//mark as read
		WebElement makeread=driver.findElement(By.xpath("//div[@aria-label='Mark as unread']"));
		makeread.click();
		
		
		//Star messages
		//Step 3 : Selecting a number to send a message 
								
		WebElement achievemenu=driver.findElement(By.xpath("(//div[@class='_3ndVb fbgy3m38 ft2m32mm oq31bsqd nu34rnf1'])[5]"));
		achievemenu.click();
		Thread.sleep(2000);
		WebElement newachieve=driver.findElement(By.xpath("//div[text()='Starred messages']"));
		newachieve.click();
		Thread.sleep(2000);
		
		WebElement back=driver.findElement(By.xpath("//span[@data-icon='back']"));
		back.click();
		Thread.sleep(2000);
		//whatsapp window
		WebElement whatsappwindow=driver.findElement(By.xpath("(//div[@class='_3ndVb fbgy3m38 ft2m32mm oq31bsqd nu34rnf1'])[5]"));
		whatsappwindow.click();
		Thread.sleep(2000);
		WebElement whatsappwindow1=driver.findElement(By.xpath("//div[text()='Get WhatsApp for Windows']"));
		whatsappwindow1.click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		
		//logout
		WebElement logout=driver.findElement(By.xpath("(//div[@class='_3ndVb fbgy3m38 ft2m32mm oq31bsqd nu34rnf1'])[5]"));
		logout.click();
		
		WebElement logout1=driver.findElement(By.xpath("//div[text()='Log out']"));
		logout1.click();
		
		WebElement logout12=driver.findElement(By.xpath("//div[text()='Log out']"));
		logout12.click();
		*/
		System.out.println("drag and drop");
		//community
		Thread.sleep(3000);
		WebElement community=driver.findElement(By.xpath("//div[@title='Communities']"));
		community.click();
		
		//WebElement communitygroup=driver.findElement(By.xpath("//span[@data-icon='community-group']"));
		//communitygroup.click();
		
		//WebElement back2=driver.findElement(By.xpath("//span[@data-icon='back']"));
		//back2.click();
		Thread.sleep(2000);
		WebElement back3=driver.findElement(By.xpath("//span[@data-icon='back']"));
		back3.click();
		
		//status
		Thread.sleep(3000);
		WebElement status=driver.findElement(By.xpath("//span[@data-icon='status-outline']"));
		status.click();
		
		Thread.sleep(2000);
		WebElement back4=driver.findElement(By.xpath("//span[@data-icon='back']"));
		back4.click();
		
		//newsreader
		Thread.sleep(3000);
		WebElement newsreader=driver.findElement(By.xpath("//span[@data-icon='newsletter-unread-outline']"));
		newsreader.click();
		Thread.sleep(2000);
		WebElement back5=driver.findElement(By.xpath("//span[@data-icon='back']"));
		back5.click();
		
		
		//new-chat-outline
		Thread.sleep(3000);
		WebElement outline=driver.findElement(By.xpath("//span[@data-icon='new-chat-outline']"));
		outline.click();
		Thread.sleep(2000);
		WebElement back6=driver.findElement(By.xpath("//span[@data-icon='back']"));
		back6.click();
		
	}
	}