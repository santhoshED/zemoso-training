public class LoginFactory{
	public LoginPage login(String social_network){
		String toGo;
		switch(social_network){
			case "facebook":
				toGo = "facebook";
				break;
			case "gmail":
				toGo = "gmail";
				break;
			case "linkedin":
				toGo = "linkedin";
				break;
			default:
				toGo = "gmail";
				break;
		}
		return  new LoginPage(toGo);
	}

}