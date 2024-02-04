package org.Pagemanager;

import org.Base.BaseClass;
import org.pages.BookHotelPage;
import org.pages.BookingConfirmPage;
import org.pages.CancelBookingPage;
import org.pages.LoginPage;
import org.pages.SearchHotelPage;
import org.pages.SelectHotelPage;

public class PageObjectManager extends BaseClass {
	private LoginPage loginPage;
	private SearchHotelPage searchHotelPage;
	private SelectHotelPage selectHotelPage;
	private BookHotelPage bookHotelPage;
	private BookingConfirmPage bookingConfirmPage;
	private CancelBookingPage cancelBookingPage;


//	 Using Singleton Pattern class 
//   PageObjectMananger         => Create a Class private
//	 LoginPage loginPage;       =>Object of the Class public 
//	 LoginPage getLoginPage()   =>It returns the Instance of the class to the outside world

//			class PageObjectMananger
//			private LoginPage loginPage;
//			public LoginPage getLoginPage() {
//	 		if(loginPage ==null){
//			loginPage=new LoginPage();
//					}
//			return loginPage;

//	 We are using Ternary Operator.
//	variable = (condition) ? expressionTrue :  expressionFalse;  	
	
	
	
		public LoginPage getLoginPage() {
			return (loginPage == null) ? loginPage = new LoginPage() : loginPage;
		}

		public SearchHotelPage getSearchHotelPage() {
			return (searchHotelPage == null) ? searchHotelPage = new SearchHotelPage() : searchHotelPage;
		}

		public SelectHotelPage getSelectHotelPage() {
			return (selectHotelPage == null) ? selectHotelPage = new SelectHotelPage() : selectHotelPage;
		}

		public BookHotelPage getBookHotelPage() {
			return (bookHotelPage == null) ? bookHotelPage = new BookHotelPage() : bookHotelPage;
		}

		public BookingConfirmPage getBookingConfirmPage() {
			return (bookingConfirmPage == null) ? bookingConfirmPage = new BookingConfirmPage() : bookingConfirmPage;
		}

		public CancelBookingPage getCancelBookingPage() {
			return (cancelBookingPage == null) ? cancelBookingPage = new CancelBookingPage() : cancelBookingPage;
		}

}
