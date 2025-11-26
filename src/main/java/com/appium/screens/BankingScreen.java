package com.appium.screens;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.ParseException;
import java.time.Duration;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.appium.utils.WaitUtil;
import io.appium.java_client.*;
import com.appium.utils.CommonUtils;

import com.appium.utils.requestUtil.*;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.Assert;


public class BankingScreen extends BaseScreen {
	MarketPlaceHomeScreen mp = new MarketPlaceHomeScreen(appDriver);
	private RestUtil restUtil = new RestUtil();
	private HeaderUtil headerUtil = new HeaderUtil();
//	private BodyBuilder bodyBuilder = new BodyBuilder();
	CommonUtils utils = new CommonUtils();
	private int pOCLimit = 0;
	private int onlineLimit = 0;
	private int aTMLimit = 0;
	private BigDecimal pocLimitIos = new BigDecimal(0.00);
	private BigDecimal onlineLimitIos = new BigDecimal(0.00);
	private BigDecimal aTMLimitIos = new BigDecimal(0.00);

	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc='Banking']/android.widget.ImageView")
	private MobileElement bankingTab;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Time to top up\"])[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Time to top up']")
	private MobileElement topUpBanner;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"Add money now\"])[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Add money now']")
	private MobileElement topUpButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Top up\"]")
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@resource-id='ae.ahb.digital.sit:id/qac_topup']")
	private MobileElement topUpQuickLinks;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeButton")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Debit card']")
	private MobileElement topUpDebitCrad;

	@AndroidFindBy(xpath = "(//android.view.ViewGroup)[1]")
	private MobileElement topUpTransferScreen;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeTextField")
	@AndroidFindBy(xpath = "(//android.widget.EditText)[1]")
	private MobileElement topUpEditAccount;

	@AndroidFindBy(xpath = "(//android.view.ViewGroup)[2]")
	private MobileElement topUpCardField;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[8]/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeTextField")
	@AndroidFindBy(xpath = "(//android.widget.EditText)[2]")
	private MobileElement topUpEditCard;

	@AndroidFindBy(xpath = "(//android.view.ViewGroup)[3]")
	private MobileElement topUpCardName;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'iv_back_arrow')]")
	private MobileElement btnBackBanking;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[8]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeTextField")
	@AndroidFindBy(xpath = "(//android.widget.EditText)[3]")
	private MobileElement topUpEditCardName;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[8]/XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeTextField")
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='MM/YY']")
	private MobileElement topUpCardExp;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[8]/XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeSecureTextField")
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='***']")
	private MobileElement topUpCvv;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Top up my account\"]")
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Top up my account']")
	private MobileElement topUpConfirmBtn;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Authentication\"]/XCUIElementTypeOther[19]/XCUIElementTypeSecureTextField")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='password']")
	private MobileElement topUpOTP;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Submit']")
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Submit']")
	private MobileElement topUpPaybtn;


	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText")
	@AndroidFindBy(className = "android.widget.TextView")
	private List<MobileElement> bannerList;

	//Cards Tab elements

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Debit cards\"]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Debit cards']")
	private MobileElement cardTab;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Cards\"]")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'cards')]")
	private List<MobileElement> cardTab_General;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Accounts\"]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Accounts']")
	private MobileElement accountsTab;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"All transactions\"])[1]")
	private List<MobileElement> cardsNotPresent;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Show details\"]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Show details']")
	private MobileElement showDetails;

	@iOSXCUITFindBy(xpath = "//*[contains(@name , '*') and contains(@name , '5')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'tv_card_number')]")
	private MobileElement cardNumber;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id ='ae.ahb.digital.sit:id/tv_card_cvv']")
	private MobileElement cardCVV;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Change\"]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Change']")
	private MobileElement changeCardLink;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name, 'Savings Account')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Savings Account']")
	private MobileElement changeCardAcnt;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name, 'Savings Account')]")
	private List<MobileElement> changeCardAcntIos;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name, 'Current Account')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Current Account']")
	private MobileElement changeToSvnAct;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Current Account\"]")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Current Account')]")
	private List<MobileElement> checkAccount;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Change linked account\"]")
	@AndroidFindBy(xpath = "//android.widget.Button[@text = 'Change linked account']")
	private MobileElement confirmCardLink;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name, 'Current Account')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Current Account']")
	private List<MobileElement> changeToSvnActIos;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Your linked account was successfully updated']")
	private MobileElement cardAccountChngNtfn;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id = 'ae.ahb.digital.cit:id/tv_card_expiry']")
	private MobileElement cardExpiry;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Freeze card']")
	@AndroidFindBy(xpath = "//*[contains(@resource-id,'qac_freeze_card')]/*[contains(@resource-id,'tv_actionTitle')]")
	private MobileElement freezeCard;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Temporarily freeze card\"]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Temporarily freeze card']")
	private MobileElement freezeCardText;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[contains(@resource-id,'ae.ahb.digital.sit:id/ll_quick_actions')]//android.widget.TextView[contains(@resource-id,'ae.ahb.digital.sit:id/tv_actionTitle')]")
	private List<MobileElement> quickActionExploreTab;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar[@name=\"Transfer money\"]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Transfer money']")
	private MobileElement transferMonetScreenTitle;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Confirm']")
	@AndroidFindBy(xpath = "//android.widget.Button[@text = 'Confirm']")
	private MobileElement confirmFreeze;

	@AndroidFindBy(xpath = "//android.widget.Button[@text = 'Confirm']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Confirm']")
	private MobileElement confirmUnfreeze;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Your card was frozen']")
	@iOSXCUITFindBy(xpath = "//*[@name='Your card was frozen']")
	private MobileElement cardFrozenNtfn;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Unfreeze card'])[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Unfreeze card']")
	private MobileElement unFreezeCard;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Card no longer frozen']")
	@iOSXCUITFindBy(xpath = "//*[@name='Card no longer frozen']")
	private MobileElement nolongercardFrozenNtfn;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'qac_change_pin')]/*[contains(@resource-id,'tv_actionTitle')]")
	private MobileElement changePINbtn;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'qac_change_pin')]")
	private MobileElement changePINFrame;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"icRightArrow\"]")
	@AndroidFindBy(xpath = "//android.widget.ImageButton[contains(@resource-id,'next_button')]")
	private MobileElement pinBtn;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'PIN code changed']")
	private MobileElement pinChangeNotification;

	@AndroidFindBy(xpath = "//android.widget.Switch[contains(@resource-id, 'sc_online_payment')]")
	private MobileElement onlinePayment;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Online payments disabled']")
	private MobileElement onlinePdisabledNotification;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Online payments enabled']")
	private MobileElement onlinePayenabledNotification;

	@AndroidFindBy(xpath = "//android.widget.Switch[contains(@resource-id, 'sc_international_payment')]")
	private MobileElement internationalPayment;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'International payments disabled']")
	private MobileElement internatnlPymntdisabledNotification;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'International payments enabled']")
	private MobileElement iPayenabledNotification;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Set your daily transaction limits\"]")
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'iv_arrow')]")
	private MobileElement limitBtn;

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'iv_next')]")
	private MobileElement nxtBtn;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"Change limit\"])[1]")
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='Change limit'])[1]")
	private MobileElement pocChangeLimit;

	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='Change limit'])[1]")
	private MobileElement pocLimitNotification;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Save\"]")
	@AndroidFindBy(className = "android.widget.Button")
	private MobileElement saveBtn;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[3]")
	@AndroidFindBy(xpath = "(//android.widget.TextView[contains(@resource-id,'tv_description')])[1]")
	private MobileElement pocCheckLimitChange;


	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeTextField")
	@AndroidFindBy(className = "android.widget.EditText")
	private MobileElement changeLimit;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Change limit\"])[2]")
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='Change limit'])[2]")
	private MobileElement oPaymentChangeLimit;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[3]")
	@AndroidFindBy(xpath = "(//android.widget.TextView[contains(@resource-id,'tv_description')])[2]")
	private MobileElement onlinePaymentLimitChange;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"Change limit\"])[3]")
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='Change limit'])[3]")
	private MobileElement atmChangeLimit;

	@iOSXCUITFindBy(xpath = "///XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[3]")
	@AndroidFindBy(xpath = "(//android.widget.TextView[contains(@resource-id,'tv_description')])[3]")
	private MobileElement atmWithdrawalsLimitChange;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[contains(@name, 'account creation' )]")
	@AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@resource-id, 'account_status_card')]")
	private MobileElement clickAcntVrfctnSuccessful;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Success!\"]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Success!']")
	private MobileElement verifySuccessScreen;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Let's get your debit card ready\"]")
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'btnGetDebitCardReady')]")
	private MobileElement debitCardDelvBtn;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[8]/XCUIElementTypeButton[2]")
	@AndroidFindBy(xpath = "(//android.widget.ImageView[contains(@resource-id,'iv_selector')])[3]")
	private MobileElement cardSelect;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Schedule debit card delivery\"]")
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'btn_schedule_delivery')]")
	private MobileElement schdlCardDelivery;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"icons/icArrowsRightArrow\"]")
	@AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@resource-id,'item_shipping_address')]")
	private MobileElement locationCardDelivery;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name=\"images/icChoicesActiveRadioOff\"])[1]")
	@AndroidFindBy(xpath = "(//android.widget.ImageView[contains(@resource-id,'iv_radio')])[1]")
	private MobileElement selectTimeSlot;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Next\"]")
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'bv_next')]")
	private MobileElement selectTimeSlotNext;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Confirm\"]")
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'bv_confirm')]")
	private MobileElement selectAddressConfirm;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Track my card\"]")
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'bv_track_my_card')]")
	private MobileElement selectTrackCardBtn;

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'survey_partial_close_btn')]")
	private MobileElement survey;


	//XCUIElementTypeButton[@name="Activate your card"]

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"Activate your card\"])[2]")
	private MobileElement clickActivateCardBtn2;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[contains(@name, 'Activate your card')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'tv_button')]")
	private MobileElement clickActivateCardBtn;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'tv_button')]")
	private MobileElement clickActivateCardBtn1;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name, 'Tracking number:')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'tv_value')]")
	private MobileElement getTrackingId;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name, 'Virtual debit card')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'tv_title')]")
	private MobileElement checkDebitCardDlvrd;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'tv_account_number')]")
	private MobileElement accountButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Accounts\"]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Accounts']")
	private MobileElement clickAccountsTab;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"icGeneralFilter\"])[1]")
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'iv_filter')]")
	private MobileElement filterIcon;

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'iv_filter')]")
	private List<MobileElement> filterIconList;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Online payments enabled']")
	private List<MobileElement> onlinePayenabledNotificationList;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[2]")
	@AndroidFindBy(xpath = "(//android.widget.TextView[contains(@resource-id,'tv_transaction_date')])[1]")
	private MobileElement childScrollFilter;

	@AndroidFindBy(xpath = "(//android.widget.TextView[contains(@resource-id,'tv_transaction_date')])[1]")
	private List<MobileElement> filterList;

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'iv_kids_illustration')]")
	private MobileElement startScroll;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Last 3 months\"]")
	@AndroidFindBy(xpath = "//android.widget.RadioButton[contains(@resource-id,'rb_last_month')]")
	private MobileElement filterLastMnth;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Apply\"]")
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'bt_apply')]")
	private MobileElement applyBtn;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"ic general close\"])[1]")
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'iv_clear_filter')]")
	private MobileElement clearFilterIcon;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[2]/XCUIElementTypeButton[1]")
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[contains(@resource-id,'id/rl_row')]")
	private List<MobileElement> txnsMonthList;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'tv_description')]")
	private List<MobileElement> unfreezeList;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Select date range\"]")
	@AndroidFindBy(xpath = "//android.widget.RadioButton[contains(@resource-id,'cl_select_date_range')]")
	private MobileElement dateRange;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"DD/MM/YYYY\"])[1]")
	@AndroidFindBy(xpath = "(//android.widget.EditText[contains(@text,'DD/MM/YYYY')])[1]")
	private MobileElement toDate;


	@AndroidFindBy(xpath = "(//android.widget.EditText[contains(@text,'DD/MM/YYYY')])[1]")
	private MobileElement fromDate;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[contains(@resource-id,'prev')]")
	private MobileElement prevBtn;

	@AndroidFindBy(xpath = "//android.widget.Button[@text ='OK']")
	private MobileElement calOkBtn;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Apply\"]")
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'bt_apply')]")
	private MobileElement aplyBtn;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"ic general close\"])[1]")
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'iv_clear_filter')]")
	private MobileElement checkFilter;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[10]/XCUIElementTypeTextField[2]")
	@AndroidFindBy(xpath = "(//android.widget.EditText[contains(@resource-id,'ti_value')])[1]")
	private MobileElement minAmount;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[10]/XCUIElementTypeTextField[1]")
	@AndroidFindBy(xpath = "(//android.widget.EditText[contains(@resource-id,'ti_value')])[2]")
	private MobileElement maxAmount;


	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Done\"]")
	private MobileElement keyboardDone;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Credited\"]")
	@AndroidFindBy(xpath = "//android.widget.CheckBox[contains(@resource-id,'cb_credit')]")
	private MobileElement creditCheckBox;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[contains(@name, '+')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'+')]")
	private List<MobileElement> txnsCreditList;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[contains(@name, '-')]")
	@AndroidFindBy(xpath = "(//android.widget.TextView[contains(@text,'-')])[1]")
	private MobileElement waitSpent;


	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[contains(@name, '+')]")
	@AndroidFindBy(xpath = "(//android.widget.TextView[contains(@text,'+')])[1]")
	private MobileElement waitReceived;


	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='All transactions'])[1]")
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'iv_arrow')]")
	private MobileElement txnArrowFilIcon;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Debited\"]")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'tv_expenses')]")
	private MobileElement spentTransaction;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[contains(@name, '-')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'-')]")
	private List<MobileElement> txnsSpentList;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Credited\"]")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'tv_earnings')]")
	private MobileElement receiveTransaction;

	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[contains(@resource-id,'banner_open_account')]")
	private MobileElement bankAccount;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'btn_continue')]")
	private MobileElement ctnBtn;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'bv_button')]")
	private MobileElement childUnfreezeOkBtn;


	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Continue with UAE PASS']")
	private MobileElement withUP;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'document_name')]")
	private List<MobileElement> mandetoryDocs;

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'iv_clear_filter')]")
	private MobileElement checkFilterList;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Request for sharing']")
	private MobileElement uaePassApp;

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'toggle')]")
	private MobileElement uaePassTgl;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'allow_button')]")
	private MobileElement uaePassAllowBtn;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'title')]")
	private MobileElement uaePassAppAuth;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout[contains(@resource-id,'key_1')]")
	private MobileElement uaePassAppAuth1;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout[contains(@resource-id,'key_2')]")
	private MobileElement uaePassAppAuth2;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout[contains(@resource-id,'key_3')]")
	private MobileElement uaePassAppAuth3;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout[contains(@resource-id,'key_4')]")
	private MobileElement uaePassAppAuth4;

	@AndroidFindBy(xpath = "//android.widget.TextView")
	private List<MobileElement> uaePassEnv;

	@AndroidFindBy(xpath = "//android.widget.Button[@text = 'Just once']")
	private MobileElement justOnce;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.EditText[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeSecureTextField[4]")
	public MobileElement pinDetail_1;

	//To enter pin
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.EditText[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeSecureTextField[1]")
	public MobileElement pinDetail_2;

	//To enter pin
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.EditText[3]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeSecureTextField[2]")
	public MobileElement pinDetail_3;

	//To enter pin
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.EditText[4]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeSecureTextField[3]")
	public MobileElement pinDetail_4;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[contains(@resource-id,'ae.ahb.digital.sit:id/ll_quick_actions')]//android.widget.TextView[contains(@resource-id,'ae.ahb.digital.sit:id/tv_actionTitle')]")
	private List<MobileElement> quickActionExploreTabCit;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar[@name=\"Request a cheque book\"]")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_title')]")
	private MobileElement chequeBookHeader;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"icChoicesActiveCheckOff\"]")
	@AndroidFindBy(xpath = "//android.widget.CheckBox")
	private MobileElement chequeBookChkBox;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Request a cheque book\"]")
	@AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@resource-id, 'id/qac_chequebook')]")
	private MobileElement chequeBookClk;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Confirm\"]")
	@AndroidFindBy(xpath = "//android.widget.Button[@text = 'Confirm']")
	private MobileElement cntn;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Your are eligible for an Al Hilal cheque book!\"]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Your are eligible for an Al Hilal cheque book!']")
	private MobileElement egSuccess;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Next\"]")
	@AndroidFindBy(xpath = "//android.widget.Button[@text = 'Next']")
	private MobileElement egSuccesNxn;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeAlert[@name=\"Error\"]")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'id/alertTitle')]")
	private MobileElement error;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Ok\"]")
	@AndroidFindBy(xpath = "//android.widget.Button[@text = 'OK']")
	private MobileElement errorOK;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"icRightArrow\"]")
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id, 'id/iv_next_button')]")
	private MobileElement pinNxt;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Savings Account\"]")
	@AndroidFindBy(xpath = "(//android.widget.ImageView[contains(@resource-id, 'id/dot')])[2]")
	private MobileElement savingActn;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"Banking/Cards/icGeneralChat\"]")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'id/menu_item_chat')]")
	private MobileElement chatBtn;

	@AndroidFindBy(xpath = "//android.webkit.WebView[@text = 'Chat']")
	private MobileElement chatScreen;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"closeRound\"]")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'id/menu_item_chat_close')]")
	private MobileElement chatClose;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Back\"]")
	@AndroidFindBy(xpath = "//android.widget.ImageButton")
	private MobileElement backBtn;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_title')]")
	private List<MobileElement> chequeBookHeaderList;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Send to my work address\"]")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'id/tvButtonText')]")
	private MobileElement selectOfcAdd;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeTextField")
	@AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Emirate\"]")
	private MobileElement selectEmirate;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Done\"]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Abu Dhabi']")
	private MobileElement selectEmirateVal;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeTextField")
	@AndroidFindBy(xpath = "//android.widget.EditText[@text=\"City\"]")
	private MobileElement selectCity;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Done\"]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Abu Dhabi City\"]")
	private MobileElement selectCityVal;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[8]/XCUIElementTypeTextField")
	@AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Street or area\"]")
	private MobileElement selectStreet;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Confirm address\"]")
	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"Confirm address\"]")
	private MobileElement confirmAddress;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Savings Account\"]")
	@AndroidFindBy(xpath = "(//android.widget.ImageView[contains(@resource-id, 'id/dot')])[1]")
	private MobileElement exploreSavingActn;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Home address\"]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Home address\"]")
	private MobileElement homeAdd;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Work address\"]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Work address\"]")
	private MobileElement officeAddress;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Order review\"]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Order review\"]")
	private MobileElement orderReviewScreen;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Confirm order\"]")
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Confirm order']")
	private MobileElement orderConfirmBtn;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Order successful']")
	@iOSXCUITFindBy(xpath = "//*[@name='Order successful']")
	private MobileElement orderSuccessNtfn;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Something went wrong']")
	@iOSXCUITFindBy(xpath = "//*[@name='Something went wrong']")
	private MobileElement orderUnSuccessNtfn;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Confirm your signature\"]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Confirm your signature\"]")
	private MobileElement confirmSignature;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Confirm & continue\"]")
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Confirm & continue']")
	private MobileElement confirmContinue;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Home address\"]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Home address\"]")
	private MobileElement ofcAdd;

	// CONSTRUCTOR
	public BankingScreen(AppiumDriver<MobileElement> appDriver) {

		super(appDriver);
	}

	// Tap functionality
	TouchAction touch = new TouchAction(CommonUtils.appDriver);

	// ------------------------METHODS TO ACCESS LOCATORS-------------------------------

	public void bankingTab() {
		bankingTab.click();
	}

	//verify top up banner
	public void isTopUpBannerDisplayed() throws InterruptedException {
		utils.waitUntilVisible(topUpBanner, 50);
		topUpBanner.isDisplayed();
	}

	public void topUPAccount() throws InterruptedException {
		utils.waitUntilVisible(topUpBanner, 50);
		topUpButton.click();
	}

	public void topUPDebitCard() throws InterruptedException {
		utils.waitUntilVisible(topUpDebitCrad, 50);
		topUpDebitCrad.click();
	}

	public void topUpButtonfromQuickLinks() {
		utils.waitUntilVisible(topUpQuickLinks, 50);
		topUpQuickLinks.click();
	}

	public void topupTransferScreen(String amount, String card, String name, String expirydate, String cvv) throws InterruptedException {
		utils.waitUntilVisible(topUpTransferScreen, 50);
		topUpTransferScreen.click();
		utils.waitUntilVisible(topUpEditAccount, 50);
		topUpEditAccount.sendKeys(amount);
		utils.waitUntilVisible(topUpCardField, 50);
		topUpCardField.click();
		utils.waitUntilVisible(topUpEditCard, 50);
		topUpEditCard.sendKeys(card);
		utils.waitUntilVisible(topUpCardName, 50);
		topUpCardName.click();
		utils.waitUntilVisible(topUpEditCardName, 50);
		topUpEditCardName.sendKeys(name);
		utils.scrollTo("MM/YY");
		utils.waitUntilVisible(topUpCardExp, 50);
		topUpCardExp.click();
		utils.waitUntilVisible(topUpCardExp, 50);
		topUpCardExp.sendKeys(expirydate);
		utils.waitUntilVisible(topUpCvv, 50);
		topUpCvv.click();
		utils.waitUntilVisible(topUpCvv, 50);
		topUpCvv.sendKeys(cvv);
		utils.waitUntilVisible(topUpConfirmBtn, 50);
		topUpConfirmBtn.click();
		utils.waitUntilVisible(topUpOTP, 50);
		topUpOTP.click();
		topUpOTP.sendKeys("1234");
		utils.waitUntilVisible(topUpPaybtn, 50);
		topUpPaybtn.click();
	}

	public void bannerRemoved() {
		int count = bannerList.size();
		for (int i = 0; i < count; i++) {
			String text = bannerList.get(i).getText();
			if (text.equals("Time to top up")) {
				Assert.assertFalse(text.equals("Time to top up"));
				break;
			}

		}
	}

	//Cards Tab

	public void clickCardsTab() throws InterruptedException {
		utils.waitUntilVisible(cardTab, 100);
		cardTab.click();
	}

	public void clickBackBankingTab() throws InterruptedException {
		utils.waitUntilVisible(btnBackBanking, 100);
		btnBackBanking.click();
	}

	//Select the type of card based on the parameter passed
	public void clickCardsTab(String cardType) {
		boolean tabFound = false;
		int count = 0;
		while(!tabFound && count <30){
			WaitUtil.pause();
			for(MobileElement mElement: cardTab_General){
				utils.waitUntilVisible(mElement,100);
				if(mElement.getText().toLowerCase().contains(cardType.toLowerCase())){
					utils.waitUntilClickable(mElement,30);
					mElement.click();
					tabFound=true;
					break;
				}
			}
			count++;
		}
		if(!tabFound) {
			Assert.assertTrue(tabFound, cardType+" Card tab is not displayed on Banking screen.");
		}
	}

	public void hiddenCardNumber() throws InterruptedException {
		boolean isCardDetailHidden = false;
		appDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if (cardNumber.getText().contains("*")) {
			isCardDetailHidden = true;
		}
		Assert.assertTrue(isCardDetailHidden, "No card exist");
	}

	public void hiddenCardNumberIos() throws InterruptedException {
		boolean isCardDetailHidden = false;
		appDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if (cardNumber.isDisplayed()) {
			isCardDetailHidden = true;
		}
		Assert.assertTrue(isCardDetailHidden, "No card exist");
	}

	public void hiddenCardCVV(String env) throws InterruptedException {
		boolean isCardCVVlHidden = false;
		MobileElement cardcvv = appDriver.findElementByXPath("//android.widget.TextView[@resource-id ='ae.ahb.digital." + env + ":id/tv_card_cvv']");
		if (cardcvv.getText().contains("*")) {
			isCardCVVlHidden = true;
		}
		Assert.assertTrue(isCardCVVlHidden, "No card exist");
	}

	public void hiddenCardExpiry(String env) throws InterruptedException {
		boolean isCardExpHidden = false;
		MobileElement cardcvv = appDriver.findElementByXPath("//android.widget.TextView[@resource-id = 'ae.ahb.digital." + env + ":id/tv_card_expiry']");
		String expText = cardcvv.getText();
		if (cardcvv.getText().contains("*")) {
			isCardExpHidden = true;
		}
		Assert.assertTrue(isCardExpHidden, "No card exist");
	}

	public void showDetails() {
		showDetails.click();
	}

	public void changeCardLink() throws InterruptedException {
		utils.waitUntilVisible(changeCardLink, 50);

		if (checkAccount.size() > 0) {
			changeCardLink.click();
			utils.waitUntilVisible(changeCardAcnt, 50);
			changeCardAcnt.click();
		} else {
			confirmCardLink.click();
			utils.waitUntilVisible(changeToSvnAct, 50);
			changeToSvnAct.click();
		}
		utils.waitUntilVisible(confirmCardLink, 50);
		confirmCardLink.click();
		utils.waitUntilVisible(cardAccountChngNtfn, 30);
		cardAccountChngNtfn.isDisplayed();

	}

	public void changeCardLinkIos(String oSType) throws InterruptedException {
		utils.waitUntilVisible(changeCardLink, 50);
		if (changeToSvnActIos.size() > 0) {
			changeCardLink.click();
			utils.waitUntilVisible(changeCardAcnt, 50);
			changeCardAcnt.click();
			utils.waitUntilVisible(confirmCardLink, 50);
			confirmCardLink.click();
		} else {
			changeCardLink.click();
			utils.waitUntilVisible(changeToSvnAct, 50);
			changeToSvnAct.click();
			utils.waitUntilVisible(confirmCardLink, 50);
			confirmCardLink.click();
		}
	}

	public void scrollFreezeCardSctn() {
		utils.scrollTo("Freeze card");
	}

	public void freezecard() throws InterruptedException {
		utils.waitUntilVisible(freezeCard, 30);
		freezeCard.click();
	}

	public void verifyFreezeText() throws InterruptedException {
		String freezeText = freezeCardText.getText();
		Assert.assertEquals(freezeText, "Temporarily freeze card");
		utils.waitUntilVisible(confirmFreeze, 30);
		confirmFreeze.click();
	}

	public void verifyCardFrozen() throws InterruptedException {
		utils.waitUntilVisible(cardFrozenNtfn, 30);
		cardFrozenNtfn.isDisplayed();
	}

	public void scrollUnfreezeCardSctn() {
		utils.scrollTo("Unfreeze card");
	}

	public void unFreezecard() throws InterruptedException {
		utils.waitUntilVisible(freezeCard, 30);
		freezeCard.click();
		//utils.waitUntilVisible(unFreezeCard, 30);
		//unFreezeCard.click();
	}

	public void verifyUnFreezeText() throws InterruptedException {
		String freezeText = unFreezeCard.getText();
		Assert.assertEquals(freezeText, "Unfreeze card");
		utils.waitUntilVisible(confirmFreeze, 30);
		confirmFreeze.click();
	}

	public void verifyUnFreezeTextIos() throws InterruptedException {
		utils.waitUntilVisible(unFreezeCard, 15);
		String freezeText = unFreezeCard.getText();
		Assert.assertEquals(freezeText, "Unfreeze card");
		utils.waitUntilVisible(confirmUnfreeze, 30);
		confirmUnfreeze.click();
	}

	public void verifyCardNoLongerFrozenNotification() throws InterruptedException {
		utils.waitUntilVisible(nolongercardFrozenNtfn, 30);
		nolongercardFrozenNtfn.isDisplayed();
	}

	public void scrollTooChnPIN() {
		utils.scrollTo("Change PIN");
	}

	public void clickChangePIN() throws InterruptedException {
		utils.waitUntilVisible(changePINbtn, 30);
		changePINbtn.click();
	}

	public void validateChangePinState(String strCardState) throws Throwable{
		boolean isChangePinEnabled = false;
		String expBehavior = "Change Pin button is "+strCardState;

		utils.waitUntilVisible(changePINFrame, 100);
		if(strCardState.equalsIgnoreCase("disabled")){
			isChangePinEnabled = !changePINFrame.isEnabled();
		}else{
			isChangePinEnabled = changePINFrame.isEnabled();
		}
		Assert.assertTrue(isChangePinEnabled,expBehavior);
	}


	public void enterPasscode(String text) throws InterruptedException {//
		utils.waitUntilVisible(pinDetail_1, 100);
		pinDetail_1.sendKeys("1");
		pinDetail_2.sendKeys("2");
		pinDetail_3.sendKeys("3");
		pinDetail_4.sendKeys("4");
	}

	public void enterDebitcode(String text) throws InterruptedException {//
		utils.waitUntilVisible(pinDetail_1, 100);
		char[] ch = new char[text.length()];
		for (int i = 0; i < text.length(); i++) {
			ch[i] = text.charAt(i);
		}
		pinDetail_1.sendKeys(Character.toString(ch[0]));
		pinDetail_2.sendKeys(Character.toString(ch[1]));
		pinDetail_3.sendKeys(Character.toString(ch[2]));
		pinDetail_4.sendKeys(Character.toString(ch[3]));
	}

	public void confirmPasscodeAndDebitPIN(String passcode, String debitcardpin, String confirmpin) throws InterruptedException {
		enterPasscode(passcode);
		enterDebitcode(debitcardpin);
		utils.waitUntilVisible(pinBtn, 30);
		pinBtn.click();
		enterDebitcode(confirmpin);
		utils.waitUntilVisible(pinBtn, 30);
		pinBtn.click();
	}

	public void verifyCardPINChngNotification() throws InterruptedException {
		utils.waitUntilVisible(pinChangeNotification, 30);
		pinChangeNotification.isDisplayed();
	}

	public void scrollToOP() {
		utils.scrollTo("Online payments");
	}

	public void clickToggleOnlinePayment() throws InterruptedException {
		utils.waitUntilVisible(onlinePayment, 30);
		onlinePayment.click();
	}

	public void verifyTOPNotification() throws InterruptedException {
		utils.waitUntilVisible(onlinePdisabledNotification, 30);
		onlinePdisabledNotification.isDisplayed();
	}

	public void verifyOPNotificationUP() throws InterruptedException {
		if (!(onlinePayenabledNotificationList.size() > 0)) {
			onlinePayment.click();
		}
		utils.waitUntilVisible(onlinePayenabledNotification, 30);
		onlinePayenabledNotification.isDisplayed();
	}

	//International Payments

	public void scrollToInternationalP() {
		utils.scrollTo("International payments");
	}

	public void clickToggleInternationalPayment() throws InterruptedException {
		utils.waitUntilVisible(internationalPayment, 50);
		internationalPayment.click();
	}

	public void verifyTIPNotification() throws InterruptedException {
		utils.waitUntilVisible(internatnlPymntdisabledNotification, 50);
		internatnlPymntdisabledNotification.isDisplayed();
	}

	public void verifyIPNotificationUP() throws InterruptedException {
		utils.waitUntilVisible(iPayenabledNotification, 80);
		iPayenabledNotification.isDisplayed();
	}

	//set limit change

	public void scrollToDebitCardLimits() {
		utils.scrollTo("Set debit card limits");
	}

	public void clickDebitCardLimits() throws InterruptedException {
		utils.waitUntilVisible(limitBtn, 80);
		limitBtn.click();
	}

	public void clickOnlinePLimits() throws InterruptedException, ParseException {
		utils.waitUntilVisible(oPaymentChangeLimit, 80);
		NumberFormat nf = NumberFormat.getInstance();
		String onlinepaymentlimit2 = onlinePaymentLimitChange.getText();
		onlineLimit = nf.parse(onlinepaymentlimit2).intValue();
		onlineLimit = onlineLimit + 5;
		oPaymentChangeLimit.click();
	}

	public void setPOCCardLimits() throws InterruptedException {
		utils.waitUntilVisible(changeLimit, 80);
		changeLimit.clear();
		changeLimit.sendKeys(String.valueOf(pOCLimit));
		utils.waitUntilVisible(saveBtn, 80);
		saveBtn.click();
	}

	public void verifyPOCLimitUpdate() throws InterruptedException, ParseException {
		utils.waitUntilVisible(pocCheckLimitChange, 200);
		NumberFormat nf = NumberFormat.getInstance();
		double val = nf.parse(pocCheckLimitChange.getText()).doubleValue();
		if (val == pOCLimit) {
			Assert.assertTrue(true);
		} else {
			Assert.assertFalse(true);

		}
	}

	//set online payment
	public void clickPOCCardLimits() throws InterruptedException, ParseException {
		utils.waitUntilVisible(pocChangeLimit, 80);
		NumberFormat nf = NumberFormat.getInstance();
		String pOCValue = pocCheckLimitChange.getText();
		pOCLimit = nf.parse(pOCValue).intValue();
		pOCLimit = pOCLimit + 5;
		pocChangeLimit.click();
	}

	public void setOnlinePaymentLimits() throws InterruptedException, ParseException {
		utils.waitUntilVisible(changeLimit, 80);
		changeLimit.clear();
		changeLimit.sendKeys(String.valueOf(onlineLimit));
		utils.waitUntilVisible(saveBtn, 80);
		saveBtn.click();
	}

	public void verifyOnlinePaymentLimitUpdate() throws InterruptedException, ParseException {
		utils.waitUntilVisible(onlinePaymentLimitChange, 100);
		NumberFormat nf = NumberFormat.getInstance();
		int val = nf.parse(onlinePaymentLimitChange.getText()).intValue();

		if (val == onlineLimit) {
			Assert.assertTrue(true);
		} else {
			Assert.assertFalse(true);
		}
	}

	//ATM withdrawals

	public void clickATMChangeLimits() throws InterruptedException, ParseException {
		utils.waitUntilVisible(atmChangeLimit, 80);
		NumberFormat nf = NumberFormat.getInstance();
		String atmLimit = atmWithdrawalsLimitChange.getText();
		aTMLimit = nf.parse(atmLimit).intValue();
		aTMLimit = aTMLimit + 100;
		atmChangeLimit.click();
	}

	public void setATMLimits() throws InterruptedException {
		utils.waitUntilVisible(changeLimit, 80);
		changeLimit.clear();
		changeLimit.sendKeys(String.valueOf(aTMLimit));
		utils.waitUntilVisible(saveBtn, 80);
		saveBtn.click();

	}

	public void verifyATMLimitUpdate() throws InterruptedException, ParseException {
		utils.waitUntilVisible(atmWithdrawalsLimitChange, 200);
		NumberFormat nf = NumberFormat.getInstance();
		double val = nf.parse(atmWithdrawalsLimitChange.getText()).doubleValue();

		if (val == aTMLimit) {
			Assert.assertTrue(true);
		} else {
			Assert.assertFalse(true);

		}

	}

	//Account completion

	public void clickActnVerfnBanner(String platform) throws InterruptedException {
		utils.waitUntilVisible(clickAcntVrfctnSuccessful, 50);
		clickAcntVrfctnSuccessful.click();
		utils.waitUntilVisible(verifySuccessScreen, 700);
		if("android".equalsIgnoreCase(platform)) {
			utils.scrollToAnElementByText("Let's get your debit card ready");
		} else if("ios".equalsIgnoreCase(platform)){
			scrollToAnElementByText("Let's get your debit card ready");
		}
		utils.waitUntilVisible(debitCardDelvBtn, 100);
		debitCardDelvBtn.click();
	}
	//cardSelect

	public void selectCardToDeliver(String platform) throws InterruptedException {
		utils.waitUntilVisible(cardSelect, 50);
		cardSelect.click();
		if("android".equalsIgnoreCase(platform)){
			utils.scrollToAnElementByText("Schedule debit card delivery");
		} else {
			HashMap<String, Object> scrollToEle = new HashMap<>();
			scrollToEle.put("direction", "down");
			appDriver.executeScript("mobile:scroll", scrollToEle);
		}
		utils.waitUntilVisible(schdlCardDelivery, 50);
		schdlCardDelivery.click();
	}

	public void selectLocationToDeliver() throws InterruptedException {
		utils.waitUntilVisible(locationCardDelivery, 50);
		locationCardDelivery.click();
		utils.waitUntilVisible(selectTimeSlot, 50);
		selectTimeSlot.click();
		utils.waitUntilVisible(selectTimeSlotNext, 50);
		selectTimeSlotNext.click();
		utils.waitUntilVisible(selectAddressConfirm, 50);
		selectAddressConfirm.click();
	}

	public void verifyTrackCardScreen(String platform) throws InterruptedException {
		utils.waitUntilVisible(selectTrackCardBtn, 100);
		selectTrackCardBtn.click();
		utils.waitUntilVisible(getTrackingId, 50);
		getTrackingId.isDisplayed();
	}

	public void isCardActivated(String platform) throws InterruptedException {
		if ("ios".equalsIgnoreCase(platform)) {
			utils.waitUntilVisible(clickActivateCardBtn2, 30);
			clickActivateCardBtn2.click();
		}
		else {
			utils.waitUntilVisible(clickActivateCardBtn, 50);
			clickActivateCardBtn.click();
		}
	}

	public void activateDebitPIN() throws InterruptedException {
		enterDebitcode("4321");
		utils.waitUntilVisible(pinBtn, 50);
		pinBtn.click();
		enterDebitcode("4321");
		utils.waitUntilVisible(pinBtn, 50);
		pinBtn.click();
		utils.waitUntilVisible(clickAccountsTab, 100);
		clickAccountsTab.click();
		utils.waitUntilVisible(cardTab, 20);
		cardTab.click();
		utils.waitUntilVisible(checkDebitCardDlvrd, 100);
	}

	public void isDateRangeDisplayedIos(String frommonth, String toMonth, String date) throws InterruptedException {

		utils.waitUntilVisible(dateRange, 50);
		dateRange.click();
		utils.waitUntilVisible(toDate, 50);
		toDate.click();
		for (int i = 0; i < 12; i++) {
			appDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			MobileElement datEle = appDriver.findElementByXPath("//android.view.View[contains(@content-desc,'" + date + "')]");

			if (appDriver.findElementsByXPath("//android.view.View[contains(@content-desc,'" + frommonth + "')]").size() > 0) {
				datEle.click();
				break;

			} else {
				prevBtn.click();

			}
		}
		calOkBtn.click();
		utils.waitUntilVisible(fromDate, 200);
		fromDate.click();
		for (int j = 0; j < 12; j++) {
			MobileElement datEle = appDriver.findElementByXPath("//android.view.View[contains(@content-desc,'" + date + "')]");

			if (appDriver.findElementsByXPath("//android.view.View[contains(@content-desc,'" + toMonth + "')]").size() > 0) {
				datEle.click();
				break;

			} else {
				prevBtn.click();

			}
		}
		calOkBtn.click();
		utils.scrollTo("Apply");
		utils.waitUntilVisible(aplyBtn, 50);
		aplyBtn.click();
	}
	//deliverCard

	public void selectAccount() {
		utils.waitUntilVisible(changeToSvnAct, 100);
		changeToSvnAct.click();
		utils.waitUntilVisible(txnArrowFilIcon,100);
	}

//	public void getTrackingId(String platform) throws InterruptedException {
//		utils.waitUntilVisible(getTrackingId, 50);
//		String trackingId = null;
//		if("ios".equalsIgnoreCase(platform)) {
//			trackingId = getTrackingId.getText() != null ?
//					getTrackingId.getText().split(": ")[1] : "";
//		} else {
//			trackingId = getTrackingId.getText();
//
//		}
//		Response response = restUtil.postRequest(EndPoints.getCardDeliveryEndpoint(), headerUtil.cardDeliveryHeader(), bodyBuilder.getCardDeliveryReqPayload("DELIVERED", trackingId, "2021-11-28"));
//		System.out.println(response.getBody().asString());
//		JsonPath fetchToken = response.jsonPath();
//		String result = fetchToken.get("status");
//		org.testng.Assert.assertEquals(restUtil.getStatusCode(response), 200);
//		org.testng.Assert.assertEquals(result, "Success");
//		if("android".equalsIgnoreCase(platform)) {
//			utils.waitUntilVisible(checkDebitCardDlvrd, 200);
//			checkDebitCardDlvrd.isDisplayed();
//		}
//	}


	public void scrollToFilter() {
		utils.waitUntilVisible(childScrollFilter, 100);
		utils.waitUntilVisible(filterIcon, 50);
		filterIcon.click();
	}


	public void scrollDown() {
		Dimension dimension = appDriver.manage().window().getSize();
		int scrollStart = (int) (dimension.getHeight() * 0.5);
		int scrollEnd = (int) (dimension.getHeight() * 0.10);

		new TouchAction((PerformsTouchActions) appDriver)
				.press(PointOption.point(0, scrollStart))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
				.moveTo(PointOption.point(0, scrollEnd))
				.release().perform();
	}


	public void scrollToChildFilter() {
		int count = 0;
		if (!(filterList.size() > 0)) {
			for (int i = 0; i <= count; i++) {
				utils.SwipeUpDown(1450, 600, 672);
				if (filterIcon.isDisplayed()) {
					filterIcon.click();
					break;
				} else {
					count++;

				}
			}
		}
	}

	public void isLastMonthDisplayed() throws InterruptedException {
		utils.waitUntilVisible(filterLastMnth, 50);
		filterLastMnth.click();
		utils.waitUntilVisible(applyBtn, 50);
		applyBtn.click();
	}

	public void isLastMonthTxnDisplayed() throws InterruptedException {

		utils.waitUntilVisible(childScrollFilter, 100);
		if (clearFilterIcon.isDisplayed() && txnsMonthList.size() > 0) {
			for (int i = 0; i < txnsMonthList.size(); i++) {
				String text = txnsMonthList.get(i).getText();
				if (text.contains("Transfer ")) {
					Assert.assertFalse(text.equals("Transfer "));
					break;
				}

			}

		} else {
			Assert.assertFalse(true);
		}

		clearFilterIcon.click();
	}

	public void childAmtTxnDisplayed() throws InterruptedException {

		utils.waitUntilVisible(childScrollFilter, 100);
		if (clearFilterIcon.isDisplayed() && txnsMonthList.size() > 0) {
			int count = txnsMonthList.size();
			for (int i = 0; i < count; i++) {
				String text = txnsMonthList.get(i).getText();
				if (text.contains("Transfer")) {
					Assert.assertFalse(text.equals("Transfer"));
					break;
				}

			}

		} else {
			Assert.assertFalse(true);
		}

		clearFilterIcon.click();
	}

	public void childLastMonthTxnDisplayed() throws InterruptedException {
		int scrollCount = 0;
		if (!(filterList.size() > 0)) {
			for (int i = 0; i <= scrollCount; i++) {
				utils.SwipeUpDown(1450, 600, 672);
				if (filterIconList.size() > 0) {
					utils.waitUntilVisible(childScrollFilter, 100);
					break;
				} else {
					scrollCount++;

				}
			}
		}
		int sizeTxn = txnsMonthList.size();
		if (clearFilterIcon.isDisplayed() && txnsMonthList.size() > 0) {
			int count = txnsMonthList.size();
			for (int i = 0; i < count; i++) {
				String text = txnsMonthList.get(i).getText();
				if (text.contains("Transfer To")) {
					Assert.assertFalse(text.equals("Transfer To"));
					break;
				}

			}

		} else {
			Assert.assertFalse(true);
		}

		clearFilterIcon.click();
	}

	public void isDateRangeDisplayed(String frommonth, String toMonth, String date) throws InterruptedException {

		utils.waitUntilVisible(dateRange, 50);
		dateRange.click();
		utils.waitUntilVisible(toDate, 50);
		toDate.click();
		for (int i = 0; i < 12; i++) {
			appDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			MobileElement datEle = appDriver.findElementByXPath("//android.view.View[contains(@content-desc,'" + date + "')]");

			if (appDriver.findElementsByXPath("//android.view.View[contains(@content-desc,'" + frommonth + "')]").size() > 0) {
				datEle.click();
				break;

			} else {
				prevBtn.click();

			}
		}
		calOkBtn.click();
		utils.waitUntilVisible(fromDate, 200);
		fromDate.click();
		for (int j = 0; j < 12; j++) {
			MobileElement datEle = appDriver.findElementByXPath("//android.view.View[contains(@content-desc,'" + date + "')]");

			if (appDriver.findElementsByXPath("//android.view.View[contains(@content-desc,'" + toMonth + "')]").size() > 0) {
				datEle.click();
				break;

			} else {
				prevBtn.click();

			}
		}
		calOkBtn.click();
		utils.scrollTo("Apply");
		utils.waitUntilVisible(aplyBtn, 50);
		aplyBtn.click();
	}

	public void childDateRangeDisplayed(String frommonth, String toMonth, String date) throws InterruptedException {

		utils.waitUntilVisible(dateRange, 50);
		dateRange.click();
		utils.waitUntilVisible(toDate, 50);
		toDate.click();
		for (int i = 0; i < 12; i++) {
			MobileElement datEle = appDriver.findElementByXPath("//android.view.View[contains(@content-desc,'" + date + "')]");

			if (appDriver.findElementsByXPath("//android.view.View[contains(@content-desc,'" + frommonth + "')]").size() > 0) {
				datEle.click();
				break;

			} else {
				prevBtn.click();

			}
		}
		calOkBtn.click();
		utils.waitUntilVisible(fromDate, 200);
		fromDate.click();
		for (int j = 0; j < 12; j++) {
			MobileElement datEle = appDriver.findElementByXPath("//android.view.View[contains(@content-desc,'" + date + "')]");

			if (appDriver.findElementsByXPath("//android.view.View[contains(@content-desc,'" + toMonth + "')]").size() > 0) {
				datEle.click();
				break;

			} else {
				prevBtn.click();

			}
		}
		calOkBtn.click();
		utils.scrollTo("Apply");
		utils.waitUntilVisible(aplyBtn, 50);
		aplyBtn.click();
	}

	public void isAmountRangeSelected(String min, String max) {

		utils.waitUntilVisible(minAmount, 50);
		minAmount.sendKeys(min);
		utils.waitUntilVisible(maxAmount, 50);
		maxAmount.sendKeys(max);
		utils.waitUntilVisible(aplyBtn, 50);
		utils.scrollTo("Apply");
		aplyBtn.click();
		utils.waitUntilVisible(checkFilter, 40);
	}

	public void childAmountRangeSelected(String min, String max) {
		utils.waitUntilVisible(minAmount, 50);
		minAmount.sendKeys(min);
		utils.waitUntilVisible(maxAmount, 50);
		maxAmount.sendKeys(max);
		utils.waitUntilVisible(aplyBtn, 50);
		utils.scrollTo("Apply");
		aplyBtn.click();
		int counter = 0;
		for (int i = 0; i <= counter; i++) {
			utils.SwipeUpDown(1450, 600, 672);
			if (filterList.size() > 0) {
				utils.waitUntilVisible(checkFilter, 100);
				break;
			} else {
				counter++;
			}
		}
	}

	public void isTransactionTypeSelected() {

		utils.waitUntilVisible(creditCheckBox, 50);
		creditCheckBox.click();
		utils.waitUntilVisible(aplyBtn, 50);
		aplyBtn.click();
	}

	public void isTxnTypeListDisplayed() throws InterruptedException {

		utils.waitUntilVisible(childScrollFilter, 100);
		if (clearFilterIcon.isDisplayed() && txnsCreditList.size() > 0) {
			for (int i = 0; i < txnsCreditList.size(); i++) {
				String text = txnsCreditList.get(i).getText();
				if (!text.contains("-")) {
					Assert.assertFalse(text.equals("+"));
				} else {
					Assert.assertFalse(true);
				}
			}

		} else {
			Assert.assertFalse(true);
		}

		clearFilterIcon.click();
	}

	public void childTxnTypeListDisplayed() throws InterruptedException {
		int counter = 0;
		if (!(filterList.size() > 0)) {
			for (int i = 0; i <= counter; i++) {
				utils.SwipeUpDown(1450, 600, 672);
				if (filterList.size() > 0) {
					utils.waitUntilVisible(childScrollFilter, 100);
					break;
				} else {
					counter++;

				}
			}
		}
		if (clearFilterIcon.isDisplayed() && txnsCreditList.size() > 0) {
			for (int i = 0; i < txnsCreditList.size(); i++) {
				String text = txnsCreditList.get(i).getText();
				if (!text.contains("-")) {
					Assert.assertFalse(text.equals("-"));
				} else {
					Assert.assertFalse(true);
				}
			}

		} else {
			Assert.assertFalse(true);
		}

		clearFilterIcon.click();
	}

	public void scrollToTxnArrow() {
		utils.waitUntilVisible(txnArrowFilIcon, 50);
		txnArrowFilIcon.click();

	}

	public void isSpentTransactionsDisplayed() {
		utils.waitUntilVisible(spentTransaction, 100);
		spentTransaction.click();
	}


	public void isSpentListDisplayed() throws InterruptedException {

		utils.waitUntilVisible(waitSpent, 100);
		if (txnsSpentList.size() > 0) {
			int count = txnsSpentList.size();
			for (int i = 0; i < count; i++) {
				String text = txnsSpentList.get(i).getText();
				if (!text.contains("+")) {
					Assert.assertFalse(text.equals("-"));
				} else {
					Assert.assertFalse(true);
				}
			}

		} else {
			Assert.assertFalse(true);
		}
	}

	public void isReceivedTxnTypeDisplayed() {
		utils.waitUntilVisible(receiveTransaction, 50);
		receiveTransaction.click();
	}

	public void isReceiveListDisplayed() throws InterruptedException {
		utils.waitUntilVisible(waitReceived, 100);
		if (txnsCreditList.size() > 0) {
			int count = txnsCreditList.size();
			for (int i = 0; i < count; i++) {
				String text = txnsCreditList.get(i).getText();
				if (!text.contains("-")) {
					Assert.assertFalse(text.equals("+"));
				} else {
					Assert.assertFalse(true);
				}
			}

		} else {
			Assert.assertFalse(true);
		}
	}

	public void clickBankAccount() {
		utils.waitUntilVisible(bankAccount, 50);
		bankAccount.click();
	}

	public void scrollToStart() {
		utils.scrollToAnElementByText("Let's get started!");
		utils.waitUntilVisible(nxtBtn, 10);
		nxtBtn.click();
	}

	public void selectBundledAccounts() {
		utils.waitUntilVisible(ctnBtn, 50);
		ctnBtn.click();
	}

	public void continueWithUAEPass() {
		utils.waitUntilVisible(withUP, 50);
		withUP.click();
	}

	public void uaePassDocs() {
		if (mandetoryDocs.contains("")) {

		}
	}

	public void validateDocuments() {
		utils.waitUntilVisible(uaePassApp, 400);
		if (mandetoryDocs.size() > 0) {
			List<MobileElement> documentList = mandetoryDocs.stream()
					.filter(mobileElement -> mobileElement.getText().contains("Emirates ID Card") || mobileElement.getText().contains("Passport"))
					.collect(Collectors.toList());
			if (documentList.size() == 2) {
				Assert.assertTrue(true);
			} else {
				Assert.assertFalse(true);

			}
		} else {
			Assert.assertFalse(true);
		}
	}

	public void allowDocumentsSharing() {
		utils.waitUntilVisible(uaePassTgl, 10);
		uaePassTgl.click();
		utils.waitUntilVisible(uaePassAllowBtn, 10);
		uaePassAllowBtn.click();
	}

	public void authUAEPass(String env) throws InterruptedException {
		utils.waitUntilVisible(uaePassAppAuth, 500);
		uaePassAppAuth1.click();
		uaePassAppAuth2.click();
		uaePassAppAuth3.click();
		uaePassAppAuth4.click();
		if (uaePassEnv.size() > 0) {
			int count = uaePassEnv.size();
			for (int i = 0; i < count; i++) {
				String text = uaePassEnv.get(i).getText();
				if (text.contains(env)) {
					if (i == 0) {
						justOnce.click();
						break;
					} else {
						uaePassEnv.get(i).click();
						break;
					}
				}
			}

		}
	}

	public void childUnfreezePermission() {
		utils.scrollTo("Unfreeze card");
		utils.waitUntilVisible(unFreezeCard, 20);
		unFreezeCard.click();
		if (unfreezeList.size() > 0) {
			childUnfreezeOkBtn.click();
		} else {
			Assert.assertFalse(true);
		}
	}

	public void isAmountRangeSelectedIos(String min, String max) {
		utils.waitUntilVisible(minAmount, 50);
		minAmount.sendKeys(min);
		utils.waitUntilVisible(maxAmount, 50);
		maxAmount.sendKeys(max);
		keyboardDone.click();
		utils.waitUntilVisible(aplyBtn, 50);
		aplyBtn.click();
		utils.waitUntilVisible(checkFilter, 40);
	}

	public void scrollToDebitCardLimitsIos() {
		HashMap<String, Object> scrollToEle = new HashMap<>();
		scrollToEle.put("direction", "down");
		scrollToEle.put("name", "Set debit card limits");
		appDriver.executeScript("mobile:scroll", scrollToEle);
	}

	public void clickPOCCardLimitsIos() throws InterruptedException, ParseException {
		utils.waitUntilVisible(pocChangeLimit, 80);
		String pOCValue = pocCheckLimitChange.getText();
		String removeAED = pOCValue.substring(0, pOCValue.length() - 3);
		BigDecimal bd = new BigDecimal(removeAED.replace(",", "")).setScale(0, RoundingMode.HALF_UP);
		pocLimitIos = bd.add(new BigDecimal(5));
		pocChangeLimit.click();
	}

	public void setPOCCardLimitsIos() throws InterruptedException {
		utils.waitUntilVisible(changeLimit, 80);
		changeLimit.clear();
		changeLimit.sendKeys(String.valueOf(pocLimitIos));
		utils.waitUntilVisible(saveBtn, 80);
		saveBtn.click();
	}

	public void verifyPOCLimitUpdateIos() throws InterruptedException, ParseException {
		utils.waitUntilVisible(pocCheckLimitChange, 200);
		String pVal = pocCheckLimitChange.getText();
		String removeAED = pVal.substring(0, pVal.length() - 3);
		BigDecimal val = new BigDecimal(removeAED.replace(",", ""));
		if (val.doubleValue() == pocLimitIos.doubleValue()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertFalse(true);

		}
	}

	public void clickOnlinePLimitsIos() throws InterruptedException, ParseException {
		utils.waitUntilVisible(oPaymentChangeLimit, 80);
		String onlinepaymentlimit2 = onlinePaymentLimitChange.getText();
		String removeAED = onlinepaymentlimit2.substring(0, onlinepaymentlimit2.length() - 3);
		BigDecimal bd = new BigDecimal(removeAED.replace(",", "")).setScale(0, RoundingMode.HALF_UP);
		onlineLimitIos = bd.add(new BigDecimal(5));
		oPaymentChangeLimit.click();
	}

	public void setOnlinePaymentLimitsIos() throws InterruptedException, ParseException {
		utils.waitUntilVisible(changeLimit, 80);
		changeLimit.clear();
		changeLimit.sendKeys(String.valueOf(onlineLimitIos));
		utils.waitUntilVisible(saveBtn, 80);
		saveBtn.click();
	}

	public void verifyOnlinePaymentLimitUpdateIos() throws InterruptedException, ParseException {
		utils.waitUntilVisible(onlinePaymentLimitChange, 100);
		String pVal = onlinePaymentLimitChange.getText();
		String removeAED = pVal.substring(0, pVal.length() - 3);
		BigDecimal val = new BigDecimal(removeAED.replace(",", ""));
		if (val.doubleValue() == onlineLimitIos.doubleValue()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertFalse(true);
		}
	}

	public void clickATMChangeLimitsIos() throws InterruptedException, ParseException {
		utils.waitUntilVisible(atmChangeLimit, 80);
		String atmLimit = atmWithdrawalsLimitChange.getText();
		String removeAED = atmLimit.substring(0, atmLimit.length() - 3);
		BigDecimal bd = new BigDecimal(removeAED.replace(",", "")).setScale(0, RoundingMode.HALF_UP);
		aTMLimitIos = bd.add(new BigDecimal(100));
		atmChangeLimit.click();
	}

	public void setATMLimitsIos() throws InterruptedException {
		utils.waitUntilVisible(changeLimit, 80);
		changeLimit.clear();
		changeLimit.sendKeys(String.valueOf(aTMLimitIos));
		utils.waitUntilVisible(saveBtn, 80);
		saveBtn.click();
	}

	public void verifyATMLimitUpdateIos() throws InterruptedException, ParseException {
		utils.waitUntilVisible(atmWithdrawalsLimitChange, 200);
		String pVal = atmWithdrawalsLimitChange.getText();
		String removeAED = pVal.substring(0, pVal.length() - 3);
		BigDecimal val = new BigDecimal(removeAED.replace(",", ""));
		if (val.doubleValue() == aTMLimitIos.doubleValue()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertFalse(true);

		}

	}

	public void validateQuickActionsLink(String transferMoney, String myCard, String accountDetails) throws InterruptedException {
		utils.waitUntilVisible(changeToSvnAct, 100);
		Set<String> transferMoneySet = quickActionExploreTab.stream().map(val -> val.getText()).collect(Collectors.toSet());
		if (transferMoneySet.containsAll(Stream.of(transferMoney, myCard, accountDetails).collect(Collectors.toSet()))) {
			Assert.assertTrue(true);
		} else {
			Assert.fail("error");
		}

	}
	public void navigateToCardsScreen(String actionLink) throws InterruptedException {
		int i = IntStream.range(0, quickActionExploreTab.size())
				.filter(userInd-> quickActionExploreTab.get(userInd).getText().equals(actionLink))
				.findFirst()
				.orElse(-1);
		if (i != -1) {
			quickActionExploreTab.get(i).click();
		} else {
			Assert.fail("error");
		}
	}

	public void validateScreenTMTitle(){
		if(transferMonetScreenTitle.isDisplayed()){
			Assert.assertTrue(true);
		}else {
			Assert.assertFalse(true);
		}
	}

	public void navigateToTransferMoneyScreen() throws InterruptedException {
		int i = IntStream.range(0, quickActionExploreTab.size())
				.filter(userInd-> quickActionExploreTab.get(userInd).getText().equals("Transfer money"))
				.findFirst()
				.orElse(-1);
		if (i != -1) {
			quickActionExploreTab.get(i).click();
		} else {
			Assert.fail("error");
		}
	}

	public void validateCardScreenTitle(String cardScreenTitle, String platform){
		if ("android".equalsIgnoreCase(platform)) {
			MobileElement androidScreenTitle = appDriver.findElementByXPath("//android.widget.TextView[@text = '" + cardScreenTitle + "']");
		if(androidScreenTitle.isDisplayed()){
			Assert.assertTrue(true);
		}else {
			Assert.assertFalse(true);
		}
	}
		else if ("ios".equalsIgnoreCase(platform)) {
			MobileElement screenTitle = appDriver.findElementByXPath("//XCUIElementTypeNavigationBar[@name='"+cardScreenTitle+"']");
		}
	}
	public void clickActnVerfnBannerIos() throws InterruptedException {
		utils.waitUntilVisible(clickAcntVrfctnSuccessful, 50);
		clickAcntVrfctnSuccessful.click();
		utils.waitUntilVisible(verifySuccessScreen, 700);
		scrollToAnElementByText("Let's get your debit card ready");
		utils.waitUntilVisible(debitCardDelvBtn, 100);
		debitCardDelvBtn.click();
	}

	public void scrollToAnElementByText(String text) {
		HashMap<String, Object> scrollToEle = new HashMap<>();
		scrollToEle.put("direction", "down");
		scrollToEle.put("name", text);
		appDriver.executeScript("mobile:scroll", scrollToEle);
	}

	public void topupTransferScreenIOS(String amount, String card, String name, String expirydate, String cvv) throws InterruptedException {
		utils.waitUntilVisible(topUpEditAccount, 50);
		topUpEditAccount.sendKeys(amount);
		utils.waitUntilVisible(topUpEditCard, 50);
		topUpEditCard.sendKeys(card);
		utils.waitUntilVisible(topUpEditCardName, 50);
		topUpEditCardName.sendKeys(name);
		keyboardDone.click();
		utils.waitUntilVisible(topUpCardExp, 50);
		topUpCardExp.sendKeys(expirydate);
		utils.waitUntilVisible(topUpCvv, 50);
		topUpCvv.sendKeys(cvv);
		keyboardDone.click();
		utils.waitUntilVisible(topUpConfirmBtn, 50);
		topUpConfirmBtn.click();
		utils.waitUntilVisible(topUpOTP, 50);
		topUpOTP.click();
		topUpOTP.sendKeys("1234"+"\n");
		utils.waitUntilVisible(changeToSvnAct, 100);
	}

	public void creditDebit(){
		int counter = 0;
		if (!(filterList.size() > 0)) {
			for (int i = 0; i <= counter; i++) {
				utils.SwipeUpDown(1450, 600, 672);
				if (filterList.size() > 0) {
					utils.waitUntilVisible(childScrollFilter, 100);
					break;
				} else {
					counter++;

				}
			}
		}
	}

	public void childTxnTypeListDisplayedCredited() throws InterruptedException {
		creditDebit();
		if (txnsCreditList.size() > 0) {
			int count = txnsCreditList.size();
			for (int i = 0; i < count; i++) {
				String text = txnsCreditList.get(i).getText();
				if (!text.contains("-")) {
					Assert.assertFalse(text.equals("+"));
				} else {
					Assert.assertFalse(true);
				}
			}

		} else {
			Assert.assertFalse(true);
		}
	}

	public void childTxnTypeListDisplayedDebited() throws InterruptedException {
		creditDebit();
		if (txnsSpentList.size() > 0) {
			int count = txnsSpentList.size();
			for (int i = 0; i < count; i++) {
				String text = txnsSpentList.get(i).getText();
				if (!text.contains("+")) {
					Assert.assertFalse(text.equals("-"));
				} else {
					Assert.assertFalse(true);
				}
			}

		} else {
			Assert.assertFalse(true);
		}
	}

	public void confirmPasscode() throws InterruptedException {
		passcode();
	}

	public void navigateToSavingsExploreTab(){
		utils.scrollTo("Top up");
		exploreSavingActn.click();
		Set<String> transferMoneySet = quickActionExploreTabCit.stream().map(val -> val.getText()).collect(Collectors.toSet());
		System.out.println(transferMoneySet);
		if (transferMoneySet.contains("Cheque\n" +
				"book")) {
			Assert.assertTrue(true);
		}
		else{
			Assert.fail("error");
		}
	}

	public void passcode() throws InterruptedException {//
		utils.waitUntilVisible(pinDetail_1, 100);
		pinDetail_1.sendKeys("1");
		pinDetail_2.sendKeys("2");
		pinDetail_3.sendKeys("3");
		pinDetail_4.sendKeys("4");
	}

	public void validateQuickActionsLinks(String platform) throws InterruptedException {
		utils.waitUntilVisible(changeToSvnAct, 20);
		if("ios".equalsIgnoreCase(platform)) {
			scrollToAnElementByText("Request a cheque book");
		}else if("android".equalsIgnoreCase(platform)) {
			utils.scrollTo("Top up");
		}
		/*Set<String> transferMoneySet = quickActionExploreTabCit.stream().map(val -> val.getText()).collect(Collectors.toSet());
		if (transferMoneySet.containsAll(Stream.of("Top up", "Cheque\n" +
				"book", "Debit card").collect(Collectors.toSet()))) {
			Assert.assertTrue(true);
		} else {
			Assert.fail("error");
		}*/
	}

	public void valiadateChequeBookPage(){
		chequeBookClk.click();
		utils.waitUntilVisible(chequeBookHeader, 20);
		if(!(chequeBookHeaderList.size()>0)){
			chequeBookClk.click();
			utils.waitUntilVisible(chequeBookHeader, 20);
		}

	}

	public void clickContinue(String platform) throws InterruptedException {
		if("ios".equalsIgnoreCase(platform)) {
			scrollToAnElementByText("Confirm");
		}else if("android".equalsIgnoreCase(platform)) {
			utils.scrollTo("Confirm");
		}
		chequeBookChkBox.click();
		cntn.click();
	}

	public void confirmDebitPin(String pinOne, String pinTwo, String pinThree, String pinFour){
		utils.waitUntilVisible(pinDetail_1, 10);
		pinDetail_1.sendKeys(pinOne);
		pinDetail_2.sendKeys(pinTwo);
		pinDetail_3.sendKeys(pinThree);
		pinDetail_4.sendKeys(pinFour);
		pinNxt.isEnabled();
		pinNxt.click();
	}

	public void verifyEligibilitySucesScrn(){
		utils.waitUntilVisible(egSuccess, 5);
		egSuccess.isDisplayed();
		egSuccesNxn.click();
	}

	public void popUpError(){
		error.isDisplayed();
	}

	public void clickOK(){
		errorOK.click();
	}

	public void scrollTillCheqbook(){
		utils.scrollTo("Top up");
	}

	public void navigateToSavingsActn(){
		savingActn.click();
		Set<String> transferMoneySet = quickActionExploreTabCit.stream().map(val -> val.getText()).collect(Collectors.toSet());
		if (!transferMoneySet.contains("Cheque\n" +
				"book")) {
			Assert.assertTrue(true);
		}
		else{
			Assert.fail("error");
		}
	}

	public void clickOnChatIcon(){
		utils.waitUntilVisible(chatBtn,15);
		chatBtn.click();
		utils.waitUntilVisible(chatClose, 15);
		chatClose.click();
		utils.waitUntilVisible(errorOK, 5);
		errorOK.click();
		utils.waitUntilVisible(chatBtn, 5);
	}

	public void clickOnBckBtn(){
		utils.waitUntilVisible(backBtn,10);
		backBtn.click();
		utils.waitUntilVisible(egSuccesNxn, 10);
	}

	public void selectOfcAdd(String area, String platform){
		utils.waitUntilVisible(selectOfcAdd, 5);
		selectOfcAdd.click();
		utils.waitUntilVisible(selectEmirate, 2);
		selectEmirate.click();
		utils.waitUntilVisible(selectEmirateVal, 2);
		selectEmirateVal.click();
		utils.waitUntilVisible(selectCity, 2);
		selectCity.click();
		utils.waitUntilVisible(selectCityVal, 2);
		selectCityVal.click();
		utils.waitUntilVisible(selectStreet, 2);
		selectStreet.click();
		selectStreet.sendKeys(area+"\n");
		if("ios".equalsIgnoreCase(platform)){
			selectStreet.click();
		}
		confirmAddress.click();
	}

	public void selectHomeAddress(){
		utils.waitUntilVisible(homeAdd, 5);
		homeAdd.click();
	}

	public void selectOfficeAddress(){
		utils.waitUntilVisible(officeAddress, 5);
		officeAddress.click();
	}

	public void validateOrderReviewScreen(String platform){
		utils.waitUntilVisible(orderReviewScreen, 5);
		if("android".equalsIgnoreCase(platform)) {
			utils.scrollTo("Confirm order");
		}
		else if("ios".equalsIgnoreCase(platform)){
			scrollToAnElementByText("Confirm order");
		}
		orderConfirmBtn.click();
	}

	public void validateSuccessMsg(){
		utils.waitUntilVisible(orderSuccessNtfn, 30);
		orderSuccessNtfn.isDisplayed();
	}

	public void validateUnSuccessfulMsg(){
		utils.waitUntilVisible(orderUnSuccessNtfn, 30);
		orderUnSuccessNtfn.isDisplayed();
	}

	public void confirmSignature(){
		utils.waitUntilVisible(cntn, 5);
		cntn.click();
	}

	public void validateConsentScreen(String platform){
		utils.waitUntilVisible(confirmSignature, 5);
		if("android".equalsIgnoreCase(platform)) {
			utils.scrollTo("Confirm & continue");
		}
		else if("ios".equalsIgnoreCase(platform)){
			scrollToAnElementByText("Confirm & continue");
		}
		chequeBookChkBox.click();
		confirmContinue.click();
	}

	public void selectAccountBT() {
		utils.waitUntilVisible(changeToSvnAct, 100);
		changeToSvnAct.click();
	}

}