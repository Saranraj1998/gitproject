package kohli.s;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PomProgram extends Reusable {
	@FindBy(id="username")
	private WebElement txtUserName;
	
	@FindBy(id="password")
	private WebElement txtPsaaword;
	
	@FindBy(id="login")
	private WebElement btnLogin;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPsaaword() {
		return txtPsaaword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	public void login(String userName, String password ) {
		sendkeys(getTxtUserName(), userName);
		sendkeys(getTxtPsaaword(), password);
		sendkeys(getBtnLogin(),null  );
		
		
	}



}
