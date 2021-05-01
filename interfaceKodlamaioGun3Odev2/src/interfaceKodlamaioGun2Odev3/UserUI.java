package interfaceKodlamaioGun2Odev3;

public class UserUI {
	User user;
	UserManager userManager;
	public UserUI(User user,UserManager userManager) {
	
		this.user = user;
		this.userManager=userManager;
	}

	public void add() {
		userManager.add();
	}
}
