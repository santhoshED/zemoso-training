
public class LoginPage{
	String social_network;
	
	public LoginPage(String social_network){
		this.social_network = social_network;
	}

    public void goToLoginPage(){
        System.out.println("you are being redirected to "+ social_network + " loginpage");

       	String url ="http://www."+social_network+".com";
       	try{Runtime.getRuntime().exec("cmd.exe /c start chrome \"" + url + "\"");}catch(Exception e){
       		System.out.println(e);
       	}	
    }
}