import java.util.*;

public class LoginFactoryDemo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String site = sc.next();

		LoginFactory lf = new LoginFactory();

		LoginPage page = lf.login(site);
		page.goToLoginPage();
	}
}