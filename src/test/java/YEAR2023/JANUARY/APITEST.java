package YEAR2023.JANUARY;

import org.testng.annotations.Test;

		public class APITEST {
			@Test(groups= {"sanity"})
			public void APITESTLoanweblogin()
			{
				System.out.println("APILoan from web");
			}

			@Test(groups={"regression"})
			public void APITESTLoanapplogin()
			{
				System.out.println("APILoan from app");
			}

			@Test(groups={"regression"})
			public void APITESTLoanbranchlogin()
			{
				System.out.println("APILoan from branch");
			}
		}
