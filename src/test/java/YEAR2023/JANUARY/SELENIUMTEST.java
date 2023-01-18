package YEAR2023.JANUARY;

import org.testng.annotations.Test;

public class SELENIUMTEST {

@Test
public void weblogin()
{
	System.out.println("login with web");
	}
@Test
public void phonelogin()
{
	System.out.println("login with phone");
}
@Test(groups= {"sanity"})
public void applogin()
{
	System.out.println("login with application");
}
@Test
public void branchlogin()
{
	System.out.println("login in Branch");
}
}
