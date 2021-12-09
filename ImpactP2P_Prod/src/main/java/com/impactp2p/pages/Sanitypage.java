package com.impactp2p.pages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.poifs.property.Child;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.impactp2p.base.TestBase;
import com.impactp2p.utilities.Testutilities;

public class Sanitypage extends TestBase 
{
	private static final String aa = null;

//XPaths

	@FindBy(xpath = "//*[text()='INVEST']")
	WebElement investbtn;
	@FindBy(xpath = "//*[@id='referCode']")
	WebElement Refercode;
	@FindBy(xpath = "//*[@id='lfname']")
	WebElement Fname;
	@FindBy(xpath = "//*[@id='llname']")
	WebElement Lname;
	@FindBy(xpath = "//*[@id='lemail']")
	WebElement Remail;
	@FindBy(xpath = "//*[@id='lphone']")
	WebElement PhoneNo;
	@FindBy(xpath = "//*[@id='lpassword']")
	WebElement Pwd;
	@FindBy(xpath = "//*[@id='lcpassword']")
	WebElement Cpwd;
	@FindBy(xpath = "//*[@id='lpan']")
	WebElement Pan;
	@FindBy(xpath = "//*[text()='You must be 18+']")
	WebElement ValidationMsg;
	@FindBy(xpath = "//*[@id='ldate']")
	WebElement dateOfBirth;
	@FindBy(xpath = "//*[contains(text(),'Registration Successful')]")
	WebElement RegisterSuccful;

	@FindBy(xpath = "//*[text()='SIGN IN']")
	WebElement signinBtn;
	@FindBy(xpath = "//*[@id='email']")
	WebElement email;
	@FindBy(xpath = "//*[@id='password']")
	WebElement password;
	@FindBy(xpath = "//*[@id='login']")
	WebElement login;
	@FindBy(xpath = "//*[text()='Wealth Manager Dashboard']")
	WebElement profileName;

	@FindBy(xpath = "//*[text()='On-Behalf Lender Login']")
	WebElement Onbehalflgn;
	@FindBy(xpath = "//*[@placeholder='Lender Name']")
	WebElement OnbehalflrNM;
	@FindBy(xpath = "//*[@placeholder='Pan Number']")
	WebElement OnbehalfPanNO;
	@FindBy(xpath = "//*[text()='Proceed']")
	WebElement proceedbtn;
	@FindBy(xpath = "//*[text()='Confirm and Login']")
	WebElement cnfrmlgn;
	@FindBy(xpath = "//*[text()='cancel']")
	WebElement cancelbtn;
	@FindBy(xpath = "//*[@class='Add-Funds-Button']//span[1]")
	WebElement WalletBalance;
	@FindBy(xpath = "//*[@class='count-style Number-of-Inv-count']")
	WebElement NoOfActiveInvstmntsAmnt;
	@FindBy(xpath = "//*[@class='count-style Amount-Added-count']")
	WebElement addedAmountCount;
	@FindBy(xpath = "//*[@class='count-style Net-Portfolio-Value-count']")
	WebElement activePortfolioValue;
	@FindBy(xpath = "//*[@class='count-style Total-Investments-count']")
	WebElement totalActiveInvestments;
	@FindBy(xpath = "//*[contains(@class,'Amount-Withdrawn-count')]")
	WebElement AmountWithdrawn;
	@FindBy(xpath = "//*[text()='Existing Investments']")
	WebElement ExistingInvestmts;
	@FindBy(xpath = "//*[@class='content'][1]")
	WebElement NoInvestmntsYet;
	@FindBy(xpath = "//*[text()='Closed Investments']")
	WebElement ClosedInvestmnts;
	@FindBy(xpath = "//*[@class='hide-closed-investments']")
	WebElement NoClosedinestmntsYet;

	@FindBy(xpath = "//*[text()='Withdraw Funds']")
	WebElement WithdrawAmount;
	@FindBy(xpath = "//*[@class='Rectangle-520']")
	WebElement EnterAmount;
	@FindBy(xpath = "//*[text()='Withdraw']")
	WebElement Withdraw;
	@FindBy(xpath = "//*[text()='Close']")
	WebElement CloseBtn;

	@FindBy(xpath = "//*[text()='Invest in minimum holding period product']")
	WebElement MinimumHolding;
	@FindBy(xpath = "//*[@id='amount']")
	WebElement Amount;
	@FindBy(xpath = "//*[@id='TnC']")
	WebElement TnCCheckBox;
	@FindBy(xpath = "//*[text()='Proceed']")
	WebElement ProceedBtn;
	@FindBy(xpath = "//*[text()='Please enter investment amount']")
	WebElement WithoutInvestedAmnt;
	@FindBy(xpath = "//*[text()='Please enter amount greater than ₹50,000']")
	WebElement InvestedBelowAmnt;
	@FindBy(xpath = "//*[text()='Insufficient wallet balance, Please add funds.']")
	WebElement InvestedAboveAmnt;

	@FindBy(xpath = "//*[text()='Add money to wallet']")
	WebElement AddMnytoWallet;
	@FindBy(xpath = "//*[@id='investment_amount']")
	WebElement AddMnyWltEnterAmount;
	@FindBy(xpath = "//*[text()='Create Link']")
	WebElement CreateLink;
	@FindBy(xpath = "//*[text()='Net Banking']")
	WebElement NetBanking;
	@FindBy(xpath = "//*[text()='UPI']")
	WebElement UPI;
	@FindBy(xpath = "//*[text()='SIGN IN']")
	WebElement SigninButton;
	@FindBy(xpath = "//*[@class='panel-header']")
	WebElement SignintoFp;

	@FindBy(xpath = "//*[@class='Onbehalf-Panel-Button']")
	WebElement OnBehalfPanel;
	@FindBy(xpath = "//*[text()='Logout (on-behalf)']")
	WebElement OnBehalfLogout;
	@FindBy(xpath = "//*[text()='Cancel']")
	WebElement OnBhalfCancel;
	@FindBy(xpath = "//*[text()='Wealth Manager Dashboard']")
	WebElement WealthManagerDashboard;

	@FindBy(xpath = "//*[contains(@class,'dropdown-icon right')]")
	WebElement FpwmDropDown;
	@FindBy(xpath = "//*[text()='My Profile']")
	WebElement MyProfile;
	@FindBy(xpath = "//*[text()='Change Password']")
	WebElement ChangePwd;
	@FindBy(xpath = "//*[text()='Onboard Lender']")
	WebElement PageNotFound;
	@FindBy(xpath = "//*[@class='col s2 l2']")
	WebElement AddBtn;
	@FindBy(xpath = "//*[@class='col s10 l10 center']")
	WebElement SaveBtn;
	@FindBy(xpath = "//*[text()='Please enter all the details']")
	WebElement PlzEnterDtls;

	@FindBy(xpath = "(//*[contains(@class,'MuiButtonBase')])[12]")
	WebElement AddBankDetails;
	@FindBy(xpath = "//*[@id=\"div-bankName\"]/div/div")
	WebElement DropDownBank;
	@FindBy(xpath = "//*[text()=\"ABHYUDAYA CO OPERATIVE BANK\"]")
	WebElement BankName;
	@FindBy(xpath = "//*[text()=\"Verify details\"]")
	WebElement VerifyDeatails;
	@FindBy(xpath = "//*[text()='Please enter input']")
	WebElement PleaseEnterInput;

	@FindBy(xpath = "//*[@id=\"primary-search-account-menu\"]/div[3]/ul/a[4]")
	WebElement AddLender;
	@FindBy(xpath = "//*[text()='Edit']")
	WebElement Edit;
	@FindBy(xpath = "//*[@class=\"col s10 l10 center\"][1]")
	WebElement SaveBotn;
	@FindBy(xpath = "//*[text()='Cancel']")
	WebElement Cancel;
	@FindBy(xpath = "//*[text()='Add New']")
	WebElement AddNew;
	@FindBy(xpath = "//*[@d=\"M7 10l5 5 5-5z\"][1]")
	WebElement IndLenderDp;
	@FindBy(xpath = "//*[text()='Individual Lender']")
	WebElement IndLender;
	@FindBy(xpath = "//*[@placeholder=\"Select RM Name\"]")
	WebElement RMName;

	@FindBy(id = "emailId")
	WebElement EmailLender;
	@FindBy(xpath = "//*[@type=\"password\"]")
	WebElement PwdLender;
	@FindBy(xpath = "//*[@id=\"name\"]")
	WebElement NameLender;
	@FindBy(xpath = "//*[@id=\"fatherName\"]")
	WebElement FatherNameLender;
	@FindBy(xpath = "//*[@id=\"panNumber\"]")
	WebElement PanNumberLender;
	@FindBy(xpath = "//*[@id=\"aadhaarNumber\"]")
	WebElement AaddherNumberLender;
	@FindBy(xpath = "//*[@id=\"UserIndividualDOB\"]")
	WebElement DOBLender;
	@FindBy(xpath = "//*[text()=\"OK\"]")
	WebElement OkBtn;
	@FindBy(xpath = "//*[@id=\"UserIndividualDOB\"]")
	WebElement DOBText;
	@FindBy(xpath = "//*[contains(@id,'Gender')]//div[2]")
	WebElement FemaleDropDown;
	@FindBy(xpath = "//*[text()=\"Female\"]")
	WebElement Female;
	@FindBy(xpath = "//*[@id=\"phoneNumber\"]")
	WebElement MblNoLender;
	@FindBy(xpath = "//*[@id=\"address\"]")
	WebElement AddressLender;
	@FindBy(xpath = "//*[text()=\"Save\"]")
	WebElement SaveLender;

	@FindBy(xpath = "//*[text()='Upload']")
	WebElement UploadAadher;
	@FindBy(xpath = "(//*[text()='Upload'])[2]")
	WebElement UploadPan;
	@FindBy(xpath = "(//*[text()='Upload'])[3]")
	WebElement CanceledCheque;

	@FindBy(xpath = "//*[@id=\"Nominee_emailId\"]")
	WebElement NomineeEmail1;
	@FindBy(xpath = "//*[@id=\"Nominee_firstname\"]")
	WebElement NomineeFN1;
	@FindBy(xpath = "//*[@id=\"Nominee_lastname\"]")
	WebElement NomineelN1;
	@FindBy(xpath = "//*[@id=\"Nominee_phoneNumber\"]")
	WebElement NomineePhone1;
	@FindBy(xpath = "//*[@id=\"Nominee_panNumber\"]")
	WebElement NomineePan1;
	@FindBy(xpath = "//*[@id=\"Nominee_aadhaarNumber\"]")
	WebElement NomineeAadher1;
	@FindBy(xpath = "//*[@id=\"Nominee_dob\"]")
	WebElement NomineeDOBl;
	@FindBy(xpath = "//*[text()=\"OK\"]")
	WebElement NomineeOk1;
	@FindBy(xpath = "//*[@id=\"Nominee_dob\"]")
	WebElement NomineeDOBTxt1;
	@FindBy(xpath = "//*[contains(@id,'Nominee_gender')]//div[2]")
	WebElement Nomineegenderl;
	@FindBy(xpath = "//*[text()='Male']")
	WebElement Nomineemale1;
	@FindBy(xpath = "//*[contains(@id,'relationship')]//div[2]")
	WebElement NomineeRelation1;
	@FindBy(xpath = "//*[text()='Father']")
	WebElement NomineeRelationTxtl;
	@FindBy(xpath = "//*[@id=\"Nominee_address\"]")
	WebElement NomineeAddress1;
	@FindBy(xpath = "//*[@id=\"Nominee_sharePercentage\"]")
	WebElement NomineeShare1;
	@FindBy(xpath = "//*[@id=\"app\"]/div/main/div/div/div[8]/div/div[2]/div/div/div/div[1]/div[2]/div/div/div/div/div/div[1]/div[5]/div[2]/div/button/div/div/span")
	WebElement NomineeSave1;

	@FindBy(xpath = "//*[text()='Nominee 2:']")
	WebElement Nominee2;
	@FindBy(xpath = "(//*[@id=\"Nominee_emailId\"])[2]")
	WebElement NomineeEmail2;
	@FindBy(xpath = "(//*[@id=\"Nominee_firstname\"])[2]")
	WebElement NomineeFN2;
	@FindBy(xpath = "(//*[@id=\"Nominee_lastname\"])[2]")
	WebElement NomineelN2;
	@FindBy(xpath = "(//*[@id=\"Nominee_phoneNumber\"])[2]")
	WebElement NomineePhone2;
	@FindBy(xpath = "(//*[@id=\"Nominee_panNumber\"])[2]")
	WebElement NomineePan2;
	@FindBy(xpath = "(//*[@id=\"Nominee_aadhaarNumber\"])[2]")
	WebElement NomineeAadher2;
	@FindBy(xpath = "(//*[@id=\"Nominee_dob\"])[2]")
	WebElement NomineeDOB2;
	@FindBy(xpath = "//*[text()='OK']")
	WebElement NomineeOk2;
	@FindBy(xpath = "(//*[@id=\"Nominee_dob\"])[2]")
	WebElement NomineeDOBTxt2;
	@FindBy(xpath = "(//*[@id=\"Nominee_gender\"]/div[1]/div[2])[2]")
	WebElement Nomineegender2;
	@FindBy(xpath = "(//*[text()='Male'])[2]")
	WebElement NomineeFemale2;
	@FindBy(xpath = "(//*[contains(@id,'relationship')]//div[2])[3]")
	WebElement NomineeRelation2;
	@FindBy(xpath = "(//*[text()='Father'])[2]")
	WebElement NomineeRelationTxt2;
	@FindBy(xpath = "(//*[@id='Nominee_address'])[2]")
	WebElement NomineeAddress2;
	@FindBy(xpath = "(//*[@id=\"Nominee_sharePercentage\"])[2]")
	WebElement NomineeShare2;
	@FindBy(xpath = "(//*[text()='Save'])[2]")
	WebElement NomineeSave2;

	@FindBy(xpath = "(//*[@class=\"MuiIconButton-label\"])[4]")
	WebElement Nominee3;
	@FindBy(xpath = "(//*[@id=\"Nominee_emailId\"])[3]")
	WebElement NomineeEmail3;
	@FindBy(xpath = "(//*[@id=\"Nominee_firstname\"])[3]")
	WebElement NomineeFN3;
	@FindBy(xpath = "(//*[@id=\"Nominee_lastname\"])[3]")
	WebElement NomineelN3;
	@FindBy(xpath = "(//*[@id=\"Nominee_phoneNumber\"])[3]")
	WebElement NomineePhone3;
	@FindBy(xpath = "(//*[@id=\"Nominee_panNumber\"])[3]")
	WebElement NomineePan3;
	@FindBy(xpath = "(//*[@id=\"Nominee_aadhaarNumber\"])[3]")
	WebElement NomineeAadher3;
	@FindBy(xpath = "(//*[@id=\"Nominee_dob\"])[3]")
	WebElement NomineeDOB3;
	@FindBy(xpath = "//*[text()='OK']")
	WebElement NomineeOk3;
	@FindBy(xpath = "(//*[@id=\"Nominee_dob\"])[3]")
	WebElement NomineeDOBTxt3;
	@FindBy(xpath = "(//*[@id=\"Nominee_gender\"]/div[1]/div[2])[3]")
	WebElement Nomineegender3;
	@FindBy(xpath = "(//*[text()='Male'])[3]")
	WebElement Nomineemale3;
	@FindBy(xpath = "(//*[contains(@id,'relationship')]//div[2])[5]")
	WebElement NomineeRelation3;
	@FindBy(xpath = "//*[text()='Mother']")
	WebElement NomineeRelationTxt3;
	@FindBy(xpath = "(//*[@id='Nominee_address'])[3]")
	WebElement NomineeAddress3;
	@FindBy(xpath = "(//*[@id=\"Nominee_sharePercentage\"])[3]")
	WebElement NomineeShare3;
	@FindBy(xpath = "(//*[text()='Save'])[3]")
	WebElement NomineeSave3;

	@FindBy(xpath = "//*[text()='On-Behalf Lender Login']")
	WebElement Onbehalflogin;
	@FindBy(xpath = "//*[@placeholder=\"Lender Name\"]")
	WebElement OnbehalflenderNM;
	@FindBy(xpath = "//*[@placeholder=\"Pan Number\"]")
	WebElement OnbehalfPanNumber;
	@FindBy(xpath = "//*[text()=\"Proceed\"]")
	WebElement Proceedtn;
	@FindBy(xpath = "//*[text()=\"Confirm and Login\"]")
	WebElement Cnfrmlgn;
	@FindBy(xpath = "//*[text()=\"cancel\"]")
	WebElement Cancelbtn;

	@FindBy(xpath = "//*[text()=\"Add funds :\"]")
	WebElement AddFunds;
	@FindBy(xpath = "//*[text()='Click here']")
	WebElement ClickHere;
	@FindBy(xpath = "//*[@id='investment_amount']")
	WebElement InvestAmount;
	@FindBy(xpath = "//*[text()='Create Link']")
	WebElement CreateLinkA;
	@FindBy(xpath = "//*[text()='SIGN IN']")
	WebElement SignInBtn;
	@FindBy(xpath = "//*[@class=\"panel-header\"]")
	WebElement SignInToFP;

	@FindBy(xpath = "//*[@class='valign-wrapper']//span")
	WebElement DropDownRight;
	@FindBy(xpath = "(//*[text()='My Portfolio'])[2]")
	WebElement MyPortfolio;
	@FindBy(xpath = "//*[text()='Start investing']")
	WebElement StartInvstng;
	@FindBy(xpath = "(//*[@class='rt-td'])[8]")
	WebElement EnterAmountB;
	@FindBy(xpath = "//*[text()='Invest']")
	WebElement InvestBtn;
	@FindBy(xpath = "//*[@class='tooltip']")
	WebElement BackBtn;

	@FindBy(xpath = "//*[text()='Downloads']")
	WebElement DownloadsBtn;
	@FindBy(xpath = "//*[text()='Download']")
	WebElement Download;
	@FindBy(xpath = "//*[text()='Summary (20-21)']")
	WebElement Summery21;
	@FindBy(xpath = "//*[@alt=\"Financepeer\"]")
	WebElement FinancepeerTitle;
	@FindBy(xpath = "//*[text()='E-sign Authorization']")
	WebElement EsignAuthzn;
	@FindBy(xpath = "//*[text()='close']")
	WebElement CloseEsign;
	@FindBy(xpath = "(//*[text()='Next'])[3]")
	WebElement NextBtn;

	@FindBy(xpath = "//*[text()='On-Behalf Wallet Recharge']")
	WebElement OnBfWalletRcrge;
	@FindBy(xpath = "//*[@placeholder=\"Lender Name\"]")
	WebElement OnbehalflenderNMW;
	@FindBy(xpath = "//*[text()='get payment link']")
	WebElement GetPaymentLink;
	@FindBy(xpath = "//*[text()='https://impactp2p.com/payment/?type=i&id=914349']")
	WebElement Link;
	@FindBy(xpath = "//*[@title='copy']")
	WebElement Copy;
	@FindBy(xpath = "//*[text()='Send email']")
	WebElement SendEmail;

	@FindBy(xpath = "//*[text()='Invest Now']")
	WebElement InvestNow;
	@FindBy(xpath = "//*[text()='View All Lenders']")
	WebElement ViewAllLenders;
	@FindBy(xpath = "(//*[text()='Next'])[2]")
	WebElement NextBtnI;
	@FindBy(xpath = "(//*[text()='OK'])[2]")
	WebElement OkView;
	@FindBy(xpath = "//*[text()='Selected lenders']")
	WebElement SelectedLenders;
	@FindBy(xpath = "//*[text()='OK']")
	WebElement OkSelect;
	@FindBy(xpath = "(//*[@class='rt-td']//div//input)[1]")
	WebElement CheckBox;
	@FindBy(xpath = "//*[text()='Invest']")
	WebElement Invest;
	@FindBy(xpath = "//*[text()='view']")
	WebElement View;
	@FindBy(xpath = "(//*[@type='checkbox'])[1]")
	WebElement ACheckbox;
	@FindBy(xpath = "//*[text()='OK']")
	WebElement OK;

	@FindBy(xpath = "//*[text()='Downloads']")
	WebElement MDownloads;
	@FindBy(xpath = "//*[text()='Download']")
	WebElement MDownload;
	@FindBy(xpath = "(//*[text()='Commission Overview'])[2]")
	WebElement CommisionOverview;
	@FindBy(xpath = "(//*[@viewBox='0 0 24 24'])[3]")
	WebElement CommisionOverviewDownload;
	@FindBy(xpath = "//*[@class='col s12']")
	WebElement CommisionOverviewProfile;

	@FindBy(xpath = "//*[text()='Loan Details']")
	WebElement LoanDetails;
	@FindBy(xpath = "(//*[@viewBox='0 0 24 24'])[3]")
	WebElement LoanDetailsDrop;
	@FindBy(xpath = "//*[text()='Active Loans']")
	WebElement ActiveLoans;
	@FindBy(xpath = "//*[text()='Closed Loans']")
	WebElement ClosedLoans;
	@FindBy(xpath = "//*[text()='Commission Records']")
	WebElement CommisionRecords;
	@FindBy(xpath = "//*[text()='Get Data']")
	WebElement GetData;
	@FindBy(xpath = "(//*[@viewBox='0 0 24 24'])[3]")
	WebElement Exceldownloads;
	@FindBy(xpath = "//*[text()='Filters']")
	WebElement FiltersProfile;

	@FindBy(xpath = "//*[@aria-hidden='true']")
	WebElement BorrowerDropdwn;
	@FindBy(xpath = "//*[text()='My Profile']")
	WebElement BorrowerPofile;
	@FindBy(xpath = "//*[text()='Change Password']")
	WebElement BorrowerChgPwd;
	@FindBy(xpath = "(//*[text()='My Loans'])[2]")
	WebElement BorrowerLoans;
	@FindBy(xpath = "//*[text()='APPLY FOR LOAN']")
	WebElement BorrowerApplyLoans;


	@FindBy(xpath = "//*[@id='Username']")
	WebElement SalesUN;
	@FindBy(xpath = "//*[@id='Password']")
	WebElement SalesPwd;
	@FindBy(xpath = "(//*[text()='Login'])[2]")
	WebElement SalesLgn;
	@FindBy(xpath = "//*[text()='ONBOARDING BORROWER ']")
	WebElement SalesOnBoarding;
	@FindBy(xpath = "//*[@type='text']")
	WebElement SalesMobile;
	@FindBy(xpath = "(//*[@type='button'])[2]")
	WebElement SalesSbmt;
	@FindBy(xpath = "//*[text()='click here to login!']")
	WebElement Salesclicklgn;
	@FindBy(xpath = "//*[@id='password']")
	WebElement Salesonbehalfpwd;
	@FindBy(xpath = "//*[contains(text(),'LOG IN')]")
	WebElement Salesonbehalflgn;

	@FindBy(xpath = "//*[@id='BorrowerName']")
	WebElement BorrowerName;
	@FindBy(xpath = "//*[@id='BorrowerDOB']")
	WebElement BorrowerDOb;
	@FindBy(xpath = "//*[text()='OK']")
	WebElement BorrowerDBOk;
	@FindBy(xpath = "//*[@id='BorrowerAddress']")
	WebElement BorrowerAdress;
	@FindBy(xpath = "//*[@id='BorrowerPinCode']")
	WebElement BorrowerPC;
	@FindBy(xpath = "//*[@id='BorrowerCity']")
	WebElement BorrowerCity;
	@FindBy(xpath = "//*[@id='BorrowerState']")
	WebElement BorrowerState;
	@FindBy(xpath = "//*[@id='BorrowerHighestEducation']//div[1]//div[2]")
	WebElement BorrowerEdctn;
	@FindBy(xpath = "//*[@id='BorrowerCollege']")
	WebElement BorrowerClg;
	@FindBy(xpath = "//*[@id='yearOfGraduation']//div[1]//div[2]")
	WebElement BorrowerYOG;
	@FindBy(xpath = "//*[@id='primaryIncomeSource']//div[1]//div[2]")
	WebElement BorrowerPIS;
	@FindBy(xpath = "//*[@id='BorrowerIndustry']")
	WebElement BorrowerIndustry;
	@FindBy(xpath = "//*[@id='BorrowerCompany']")
	WebElement BorrowerCompany;
	@FindBy(xpath = "//*[@id='BorrowerJobDesignation']")
	WebElement BorrowerDesignation;
	@FindBy(xpath = "//*[@id='purposeOther']")
	WebElement BorrowerLoanPs;
	@FindBy(xpath = "//*[@id='BorrowerAmount']")
	WebElement BorrowerAmount;
	@FindBy(xpath = "//*[@id='BorrowerTenure']")
	WebElement BorrowerTenure;
	@FindBy(xpath = "//*[text()='Pay Registration Fees']")
	WebElement BorrowerRegFees;
	@FindBy(xpath = "(//*[text()='Pay Registration Fees'])[2]")
	WebElement Borrowerdregfees;
	@FindBy(xpath = "//*[text()='Next']")
	WebElement BorrowerNext;
	@FindBy(xpath = "//*[@id='mobileNo']")
	WebElement BorrowerMobile;
	@FindBy(xpath = "//*[text()='Generate OTP']")
	WebElement BorrowerOTP;
	@FindBy(xpath = "//*[text()='Verify']")
	WebElement BorrowerVerify;
	@FindBy(xpath = "//*[text()='Aadhaar']")
	WebElement BorrowerAadher;
	@FindBy(xpath = "//*[text()='Upload']")
	WebElement BorrowerAadherUpload;
	@FindBy(xpath = "//*[text()='PAN']")
	WebElement BorrowerPan;
	@FindBy(xpath = "//*[text()='Upload']")
	WebElement BorrowerPanUpload;
	@FindBy(xpath = "//*[text()='VOTER ID']")
	WebElement BorrowerVoterId;
	@FindBy(xpath = "//*[text()='Upload']")
	WebElement BorrowerVoterIdUpload;
	@FindBy(xpath = "//*[text()='Next']")
	WebElement BorrowerSecondNext;
	@FindBy(xpath = "//*[text()='Next']")
	WebElement BorrowerThirdNext;
	@FindBy(xpath = "//*[text()='Next']")
	WebElement BorrowerFourthNext;
	@FindBy(xpath = "//*[text()=' Confirm']")
	WebElement BorrowerConfirm;
	@FindBy(xpath = "//*[text()='Ok']")
	WebElement BorrowerOKL;
	@FindBy(xpath = "//*[text()='Loan Overview']")
	WebElement BorrowerLoanOverview;
	@FindBy(xpath = "//*[text()='Back']")
	WebElement BorrowerBackBtn;

	@FindBy(xpath = "//*[@name='email']")
	WebElement LName;
	@FindBy(xpath = "//*[@name='password']")
	WebElement LPassword;
	@FindBy(xpath = "//*[@id='login']")
	WebElement LLogin;
	@FindBy(xpath = "//*[text()=\"Add funds :\"]")
	WebElement LAddFunds;
	@FindBy(xpath = "//button[@type='button']//following::div//span[text()='Click here']")
	WebElement LClickHere;
	@FindBy(xpath = "//*[@class='validate']")
	WebElement LInvAmount;
	@FindBy(xpath = "//*[text()='Create Link']")
	WebElement LCreateLink;

	@FindBy(xpath = "(//*[text()='BIJAYLAXMI BEHERA'])[1]")
	WebElement LMyprofile;
	@FindBy(xpath = "//*[text()='Summary (19-20)']")
	WebElement LSummery;
	@FindBy(xpath = "//*[text()='Student']")
	WebElement LFinancepeer;

	@FindBy(xpath = "//*[@id='investment_amount']")
	WebElement InvestedAmount;
	@FindBy(xpath = "//*[@contenteditable='true']")
	WebElement checkBoxzero;

	public Sanitypage() 
	{
		PageFactory.initElements(driver, this);
	}

//65. Check the optional field referral code when  fill data

	public String SignupIndividualLender(String password, String cpassword) throws Throwable 
	   {
		investbtn.click();
		Refercode.sendKeys("rcode" + Testutilities.RandomIntgs(3));
		Fname.sendKeys("fname" + Testutilities.RandomChars(5));
		Lname.sendKeys("lname" + Testutilities.RandomChars(4));
		Remail.sendKeys("email" + Testutilities.RandomChars(4) + "@gmail.com");
		PhoneNo.sendKeys(Testutilities.RandomIntgs(10));
		Pwd.sendKeys(password);
		Cpwd.sendKeys(cpassword);
		Thread.sleep(5000);
		Pan.sendKeys(Testutilities.RandomChars(5) + Testutilities.RandomIntgs(4) + Testutilities.RandomChars(1));
		dateOfBirth.click();
		Testutilities.selectDate(prop.getProperty("valid_day"), prop.getProperty("valid_month"),
				prop.getProperty("valid_year"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='registerIndividualForm']//*[@id='individualSignUp']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(RegisterSuccful));
		return RegisterSuccful.getText();
	      }

//2 and 15.To check if the user is able to View to the signing if he/she enters valid credentials

	public String SigninWithValidCredentials(String emailid, String pwd) throws Throwable 
	 {
		signinBtn.click();
		Thread.sleep(5000);
		email.sendKeys(emailid);
		password.sendKeys(pwd);
		login.click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(profileName));
		return profileName.getText();
	     }

//17 to 35.Check the on-behalf lender login home page and user is able to view the title is on-behalf lender login 

	public String[] OnBehalfLenderLogin(String emailid, String pwd, String Lendername, String Pannumber)
			throws Throwable 
	  {
		SigninWithValidCredentials(emailid, pwd);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Onbehalflgn);
		Onbehalflgn.click();
		Thread.sleep(1000);
		OnbehalflrNM.sendKeys(Lendername);
		Thread.sleep(2000);
		OnbehalfPanNO.sendKeys(Pannumber);
		proceedbtn.click();
		Thread.sleep(5000);

		cnfrmlgn.click();
		cancelbtn.click();
		Thread.sleep(5000);
		String[] allList = new String[] { WalletBalance.getText(), NoOfActiveInvstmntsAmnt.getText(),
				addedAmountCount.getText(), activePortfolioValue.getText(), totalActiveInvestments.getText(),
				AmountWithdrawn.getText(), ExistingInvestmts.getText(), NoInvestmntsYet.getText(),
				ClosedInvestmnts.getText(), NoClosedinestmntsYet.getText() };
		return allList;
	     }

//36 to 40 & 44.To check whether user is able to click the "withdraw funds" and user is able to enter amount and able click withdraw amount and displayed validation message and click "on-behalf panel" button and able to click "logout(on-behalf)"	

	public String MinimumHoldingPeriod(String emailid, String pwd, String Lendername, String Pannumber, String Amount,
			String amt) throws Throwable 
	  {
		OnBehalfLenderLogin(emailid, pwd, Lendername, Pannumber);
		WithdrawAmount.click();
		EnterAmount.sendKeys(Amount);
		Withdraw.click();
		CloseBtn.click();
		MinimumHolding.click();
		Testutilities.Dropdown();
		this.Amount.sendKeys(amt);
		TnCCheckBox.click();
		ProceedBtn.click();
		OnBehalfPanel.click();
		Thread.sleep(5000);
		OnBehalfLogout.click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(WealthManagerDashboard));
		return WealthManagerDashboard.getText();
	     }

//41 to 43.click "add money to wallet" and able to view details and able to enter amount and able to click create link and click signin button and displayed signin to financepeer 	

	public String AddMoneyToWallet(String emailid, String pwd, String Lendername, String Pannumber, String WalletAmount)
			throws Throwable
	    {
		OnBehalfLenderLogin(emailid, pwd, Lendername, Pannumber);
		MinimumHolding.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='Add money to wallet']")).click();
		Thread.sleep(5000);
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println("total windows are:" + allwindows.size());
		Iterator<String> it = allwindows.iterator();
		String parentWindowId = it.next();
		System.out.println("Parent window ID: " + parentWindowId);
		String childWindowId = it.next();
		System.out.println("Child Window ID: " + childWindowId);
		driver.switchTo().window(childWindowId);
		InvestAmount.sendKeys(WalletAmount);//no such element unable to locate the element//done in single
		CreateLinkA.click();
		SigninButton.click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(SignintoFp));
		return SignintoFp.getText();
	     }

//	45 to 47.To check whether user is able to click "dropdown" button and able to click "Myprofile" and change password and Add" button and able to click "Save" button and displaying validation message

	public boolean FpwmMyprofileFail(String emailid, String pwd) throws Throwable
	  {
		SigninWithValidCredentials(emailid, pwd);
		FpwmDropDown.click();
		Thread.sleep(2000);
		MyProfile.click();
		String parentWindowID = driver.getWindowHandle();
		System.out.println("Partent id: " + parentWindowID);
		driver.findElement(By.xpath("//*[contains(text(),'Change Password')]")).click();
		Thread.sleep(2000);
		Set<String> allwindows = driver.getWindowHandles();
		int count = allwindows.size();
		System.out.println(count);
		String currentURL = " ";
		for (String child : allwindows) 
		    {
			if (!parentWindowID.equalsIgnoreCase(child)) 
			 {
				driver.switchTo().window(child);
				currentURL = driver.getCurrentUrl();
				System.out.println(currentURL);
			  }
		     }
		if (driver.getCurrentUrl().equals(currentURL)) 
		  {
			return false;
		  } 
		  else
			return true;
	  }

//48 & 49.check whether user is able to click "dropdown" button and able to click "Add Bank Details" and bank name dropdown and able to fill all details 	

	public String BankDetails(String emailid, String pwd) throws Throwable
	  {
		SigninWithValidCredentials(emailid, pwd);
		FpwmDropDown.click();
		Thread.sleep(5000);
		AddBankDetails.click();
		Thread.sleep(5000);
		DropDownBank.click();
		BankName.click();
		VerifyDeatails.click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(PleaseEnterInput));
		return PleaseEnterInput.getText();
	}

//50 to 54.To check whether user is able to click "dropdown" button and able to click "Add Lender", User is able to click edit and save button , Cancel and AddNew button and user is able to fill all details  and save button...

	public void AddLender(String emailid, String pwd, String RMNameL, String NomineeShare01, String NomineeShare02,
			String NomineeShare03) throws Throwable 
	    {
		SigninWithValidCredentials(emailid, pwd);
		FpwmDropDown.click();
		AddLender.click();
		Thread.sleep(5000);
		Edit.click();
		SaveBotn.click();
		Thread.sleep(1000);
        Cancel.click();
		AddNew.click();
		IndLenderDp.click();
		Thread.sleep(2000);
		IndLender.click();
		Thread.sleep(2000);
		RMName.sendKeys(RMNameL);
		EmailLender.sendKeys(Testutilities.RandomChars(4) + "@gmail.com");
		Thread.sleep(5000);
		PwdLender.sendKeys(Testutilities.RandomIntgs(9));
		NameLender.sendKeys(Testutilities.RandomChars(4));
		FatherNameLender.sendKeys(Testutilities.RandomChars(4));
		PanNumberLender.sendKeys(Testutilities.RandomChars(5) + Testutilities.RandomIntgs(4) + Testutilities.RandomChars(1));
		AaddherNumberLender.sendKeys(Testutilities.RandomIntgs(12));
		DOBLender.click();
		OkBtn.click();
		FemaleDropDown.click();
		Thread.sleep(5000);
		Female.click();
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", MblNoLender);
		MblNoLender.sendKeys(Testutilities.RandomIntgs(10));
		AddressLender.sendKeys(Testutilities.RandomIntgs(6));
		SaveLender.click();
		driver.findElement(By.name("aadhaar")).sendKeys("C:\\Users\\Thinkpad\\Downloads\\formats\\sruthi aadharcard.pdf");
		UploadAadher.click();
		driver.findElement(By.name("pan")).sendKeys("C:\\Users\\Thinkpad\\Downloads\\formats\\Sruthi PAN  CARD.pdf");
		UploadPan.click();
		driver.findElement(By.name("cheque")).sendKeys("C:\\Users\\Thinkpad\\Downloads\\formats\\images.jpg");
		CanceledCheque.click();
		Thread.sleep(5000);
		NomineeEmail1.sendKeys(Testutilities.RandomChars(4) + "@gmail.com");
		NomineeFN1.sendKeys(Testutilities.RandomChars(4));
		NomineelN1.sendKeys(Testutilities.RandomChars(4));
		NomineePhone1.sendKeys(Testutilities.RandomIntgs(10));
		NomineePan1.sendKeys(Testutilities.RandomChars(5) + Testutilities.RandomIntgs(4) + Testutilities.RandomChars(1));
		NomineeAadher1.sendKeys(Testutilities.RandomIntgs(12));
		NomineeDOBl.click();
		NomineeOk1.click();
		Thread.sleep(5000);
		Nomineegenderl.click();
		Nomineemale1.click();
		Thread.sleep(5000);
		NomineeRelation1.click();
		NomineeRelationTxtl.click();
		Thread.sleep(5000);
		NomineeAddress1.sendKeys(Testutilities.RandomIntgs(6));
		NomineeShare1.sendKeys(NomineeShare01);
		NomineeSave1.click();
		Thread.sleep(5000);
		Nominee2.click();
		NomineeEmail2.sendKeys(Testutilities.RandomChars(4) + "@gmail.com");
		NomineeFN2.sendKeys(Testutilities.RandomChars(4));
		NomineelN2.sendKeys(Testutilities.RandomChars(4));
		NomineePhone2.sendKeys(Testutilities.RandomIntgs(10));
		NomineePan2.sendKeys(Testutilities.RandomChars(5) + Testutilities.RandomIntgs(4) + Testutilities.RandomChars(1));
		NomineeAadher2.sendKeys(Testutilities.RandomIntgs(12));
		NomineeDOB2.click();
		NomineeOk2.click();
		Thread.sleep(5000);
		Nomineegender2.click();
		NomineeFemale2.click();
		Thread.sleep(5000);
		NomineeRelation2.click();
		NomineeRelationTxt2.click();
		Thread.sleep(5000);
		NomineeAddress2.sendKeys(Testutilities.RandomIntgs(6));
		NomineeShare2.sendKeys(NomineeShare02);
		NomineeSave2.click();

		Nominee3.click();
		NomineeEmail3.sendKeys(Testutilities.RandomChars(4) + "@gmail.com");
		NomineeFN3.sendKeys(Testutilities.RandomChars(4));
		NomineelN3.sendKeys(Testutilities.RandomChars(4));
		NomineePhone3.sendKeys(Testutilities.RandomIntgs(10));
		NomineePan3.sendKeys(Testutilities.RandomChars(5) + Testutilities.RandomIntgs(4) + Testutilities.RandomChars(1));
		NomineeAadher3.sendKeys(Testutilities.RandomIntgs(12));
		NomineeDOB3.click();
		NomineeOk3.click();
		Thread.sleep(5000);
		Nomineegender3.click();
		Nomineemale3.click();
		Thread.sleep(5000);
		NomineeRelation3.click();
		NomineeRelationTxt3.click();
		Thread.sleep(5000);
		NomineeAddress3.sendKeys(Testutilities.RandomIntgs(6));
		NomineeShare3.sendKeys(NomineeShare03);
		NomineeSave3.click();
	}

//55 to 64.Check the on-behalf lender login button when click on it displayed on-behalf lender login home page and add funds" in click here and donate buttons and  click here and sign in link

	public String OnBehalfLenderLoginInWFAddFunds(String emailid, String pwd, String Lendername, String Pannumber,
			String BrAmount) throws Throwable 
	   {
		SigninWithValidCredentials(emailid, pwd);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Onbehalflogin);
		Onbehalflogin.click();
		Thread.sleep(1000);
		OnbehalflenderNM.sendKeys(Lendername);
		OnbehalfPanNumber.sendKeys(Pannumber);
		Thread.sleep(3000);
		Proceedtn.click();
		Cnfrmlgn.click();
		cancelbtn.click();
		Thread.sleep(5000);
		AddFunds.click();
		Thread.sleep(5000);
		ClickHere.click();
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		String parentWindowId = it.next();
		System.out.println("Parent window id: " + parentWindowId);
		String childWindowId = it.next();
		System.out.println("Child window id: " + childWindowId);
		driver.switchTo().window(childWindowId);
		driver.findElement(By.xpath("//*[@id='investment_amount']")).sendKeys(BrAmount);
		CreateLinkA.click();
		SignInBtn.click();
		driver.navigate().to("https://impactp2p.com/login/");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(SignInToFP));
		return SignInToFP.getText();
	}

//65 to 68. user is able to click the myportfolio and StartInvestment and Enter amount and click on invest button

	public String StartInvestment(String emailid, String pwd, String Lendername, String Pannumber, String BrAmount)
			throws Throwable
	        {
		SigninWithValidCredentials(emailid, pwd);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Onbehalflogin);
		Onbehalflogin.click();
		Thread.sleep(1000);
		OnbehalflenderNM.sendKeys(Lendername);
		OnbehalfPanNumber.sendKeys(Pannumber);
		Thread.sleep(1000);
		Proceedtn.click();
		Cnfrmlgn.click();
		Thread.sleep(5000);
		DropDownRight.click();
		MyPortfolio.click();
		StartInvstng.click();
		Thread.sleep(5000);
	//	try {
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@contenteditable='true']"))).sendKeys(BrAmount);
			Thread.sleep(5000);

			InvestBtn.click();
			Thread.sleep(1000);
			InvestBtn.click();
			Thread.sleep(5000);
			BackBtn.click();
			Thread.sleep(2000);
		/*} catch (Exception ex) {
			driver.findElement(By.xpath("//*[text()='OK']")).click();
		}*/
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(InvestBtn));
		return InvestBtn.getText();
	}

//69 to 70. user is able to click downloads in downloads all are downloaded or not and esignauthorization and dashboard like all loans and matured loans

	public String DownLoadsAndEsign(String emailid, String pwd, String Lendername, String Pannumber) throws Throwable 
	  {
		SigninWithValidCredentials(emailid, pwd);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Onbehalflogin);
		Onbehalflogin.click();
		Thread.sleep(1000);
		OnbehalflenderNM.sendKeys(Lendername);
		OnbehalfPanNumber.sendKeys(Pannumber);
		Thread.sleep(5000);
		Proceedtn.click();
		Cnfrmlgn.click();
		Thread.sleep(5000);
		DownloadsBtn.click();
		Download.click();
		Thread.sleep(3000);

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Summery21);
		Summery21.click();
		Thread.sleep(5000);
		FinancepeerTitle.click();
		EsignAuthzn.click();
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(LFinancepeer));
		return LFinancepeer.getText();
	}

//72 and 73 .To check whether user is able to click the "on-behalf wallet recharge" and getpaymentlink nd copy button

	public String OnBehalfWalletRecharge(String emailid, String pwd, String LenderNameW) throws Throwable 
	{
		SigninWithValidCredentials(emailid, pwd);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", OnBfWalletRcrge);
		OnBfWalletRcrge.click();
		Thread.sleep(5000);
		OnbehalflenderNMW.sendKeys(LenderNameW);
		Thread.sleep(5000);
		GetPaymentLink.click();
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Copy);
		Copy.click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(SendEmail));
		return SendEmail.getText();
	}

//74 and 79.To check whether user is able to click the "InvestNow" button and viewalllenders 

	public String InvestNow(String emailid, String pwd, String BrAmount) throws Throwable 
	   {
		SigninWithValidCredentials(emailid, pwd);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", InvestNow);
		InvestNow.click();
		ViewAllLenders.click();
		Thread.sleep(2000);
		OkView.click();
		SelectedLenders.click();
		Thread.sleep(2000);
		OkSelect.click();
		CheckBox.click();
		Invest.click();
		Thread.sleep(5000);
		View.click();
		ACheckbox.click();
		Thread.sleep(5000);
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='rt-td']//*[text()='0']"))).sendKeys(BrAmount);
		Thread.sleep(10000);
		ACheckbox.click();
		ACheckbox.click();
		Thread.sleep(1000);
		OK.click();
		Thread.sleep(1000);
		BackBtn.click();
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(ViewAllLenders));
		return ViewAllLenders.getText();
	}

//80 and 81.Downloads and Commision Overview

	public String DownloadsCommisionOverview(String emailid, String pwd) throws Throwable 
	{
		SigninWithValidCredentials(emailid, pwd);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", MDownloads);
		MDownloads.click();
		MDownload.click();
		Thread.sleep(2000);
		FinancepeerTitle.click();
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CommisionOverview);
		CommisionOverview.click();
		Thread.sleep(2000);
		CommisionOverviewDownload.click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(CommisionOverviewProfile));
		return CommisionOverviewProfile.getText();
	}

//82 and 83.Loandetails and commision records

	public String LoanDetailsCommisionRecords(String emailid, String pwd) throws Throwable
	  {
		SigninWithValidCredentials(emailid, pwd);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", LoanDetails);
		LoanDetails.click();
		Thread.sleep(5000);
		LoanDetailsDrop.click();
		Thread.sleep(3000);
        ActiveLoans.click();
		Thread.sleep(3000);
		LoanDetailsDrop.click();
		Thread.sleep(3000);
        ClosedLoans.click();
       // Testutilities.LoanDetailsDropdown();
		Thread.sleep(5000);
		FinancepeerTitle.click();
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CommisionRecords);
		CommisionRecords.click();
		GetData.click();
		Thread.sleep(5000);
		Exceldownloads.click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(FiltersProfile));
		return FiltersProfile.getText();
	}

//84 to 93.onbording borrower title and click on onboarding borrower,able to fill all details like borrower name,dob,address,pincose,state,city,education,year of graduation,industry,company,designation..

	public String SalesBorrowerLogin(String SalesEmailid, String Salespasswd, String SalesOnpasswd,
			String BorroweIndustry, String Amountborrower) throws Throwable
	       {
		SalesUN.sendKeys(SalesEmailid);
		SalesPwd.sendKeys(Salespasswd);
		SalesLgn.click();
		Thread.sleep(3000);
		SalesOnBoarding.click();
		SalesMobile.sendKeys(Testutilities.RandomIntgs(10));
		SalesSbmt.click();
		Thread.sleep(2000);
		String parentWindowID = driver.getWindowHandle();
		System.out.println("Partent id: " + parentWindowID);
		Salesclicklgn.click();
		Thread.sleep(2000);
		Set<String> allwindows = driver.getWindowHandles();
		int count = allwindows.size();
		System.out.println(count);
		String currentURL = " ";
		for (String child : allwindows) {
			if (!parentWindowID.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);

				currentURL = driver.getCurrentUrl();
				System.out.println(currentURL);
				Salesonbehalfpwd.sendKeys(SalesOnpasswd);
			}
		}
		Salesonbehalflgn.click();
		Thread.sleep(3000);
		BorrowerName.sendKeys(Testutilities.RandomChars(4));
		BorrowerDOb.click();
		BorrowerDBOk.click();
		BorrowerAdress.sendKeys(Testutilities.RandomIntgs(6));
		BorrowerPC.sendKeys(Testutilities.RandomIntgs(6));
		BorrowerCity.sendKeys(Testutilities.RandomChars(4));
		BorrowerState.sendKeys(Testutilities.RandomChars(4));
		BorrowerEdctn.click();
		List<WebElement> educationList = driver.findElements(By.xpath("//*[@role='menu']//span//div//div//div"));
		System.out.println(educationList.size());
		for (int i = 0; i < educationList.size(); i++) {
			if (educationList.get(i).getText().equals("Graduation")) {

				educationList.get(i).click();
			}
		}
		BorrowerClg.sendKeys(Testutilities.RandomChars(4));
		BorrowerYOG.click();
		try {
			List<WebElement> YOGraduation = driver
					.findElements(By.xpath("//*[@role='presentation']//span//div//div//div"));
			System.out.println(YOGraduation.size());
			for (int i = 0; i < YOGraduation.size(); i++) {
				if (YOGraduation.get(i).getText().equals("1982")) {

					YOGraduation.get(i).click();
				}
			}
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
		}
		BorrowerPIS.click();
		List<WebElement> PrimaruIncomeSource = driver
				.findElements(By.xpath("//*[@role='presentation']//span//div//div//div"));
		System.out.println(PrimaruIncomeSource.size());
		for (int i = 0; i < PrimaruIncomeSource.size(); i++) {
			if (PrimaruIncomeSource.get(i).getText().equals("Salaried")) {

				PrimaruIncomeSource.get(i).click();
			}
		}
		Thread.sleep(3000);
		BorrowerIndustry.sendKeys(BorroweIndustry);
		BorrowerCompany.sendKeys(Testutilities.RandomChars(4));
		BorrowerDesignation.sendKeys(Testutilities.RandomChars(4));
		BorrowerLoanPs.sendKeys(Testutilities.RandomChars(4));
		BorrowerAmount.sendKeys(Amountborrower);
		BorrowerTenure.sendKeys(Testutilities.RandomIntgs(1));
		BorrowerRegFees.click();
		Thread.sleep(2000);
		Borrowerdregfees.click();
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", BorrowerNext);
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
		}
		Thread.sleep(5000);
		BorrowerNext.click();
		BorrowerMobile.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.BACK_SPACE));
		Thread.sleep(1000);
		driver.findElement(By.id("mobileNo")).sendKeys("9398892192");
		Thread.sleep(1000);
		BorrowerOTP.click();
		Thread.sleep(20000);
		BorrowerVerify.click();
		BorrowerAadher.click();
		driver.findElement(By.name("aadhaar"))
				.sendKeys("C:\\Users\\Thinkpad\\Downloads\\formats\\sruthi aadharcard.pdf");
		BorrowerAadherUpload.click();
		BorrowerPan.click();
		driver.findElement(By.name("pan")).sendKeys("C:\\Users\\Thinkpad\\Downloads\\formats\\Sruthi PAN  CARD.pdf");
		BorrowerPanUpload.click();
		BorrowerVoterId.click();
		driver.findElement(By.name("voterIdCard"))
				.sendKeys("C:\\Users\\Thinkpad\\Downloads\\formats\\Sruthi Voter Id.pdf");
		Thread.sleep(5000);
		BorrowerVoterIdUpload.click();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", BorrowerSecondNext);
		BorrowerSecondNext.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='bank-statements']//div[2]//input"))
				.sendKeys("C:\\Users\\Thinkpad\\Downloads\\formats\\download.png");
		driver.findElement(By.xpath("//*[@name='salary-proof']//div[2]//input"))
				.sendKeys("C:\\Users\\Thinkpad\\Downloads\\formats\\format.jpg");
		driver.findElement(By.xpath("//*[@name='address-proof']//div[2]//input"))
				.sendKeys("C:\\Users\\Thinkpad\\Downloads\\formats\\images.jpg");
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", BorrowerThirdNext);
		BorrowerThirdNext.click();
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", BorrowerFourthNext);
		BorrowerFourthNext.click();
		BorrowerConfirm.click();
		Thread.sleep(3000);
		BorrowerOKL.click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(BorrowerLoanOverview));
		return BorrowerLoanOverview.getText();
	}

//94,95 and 96.To check whether user is able to click "dropdown" button and able to click "Myprofile" in Borrower Login and change password

	public boolean BorrowerMyProfileFail(String emailid, String pwd) throws Throwable 
	 {
		signinBtn.click();
		email.sendKeys(emailid);
		password.sendKeys(pwd);
		login.click();
		Thread.sleep(5000);
		BorrowerDropdwn.click();
		BorrowerPofile.click();
		String parentWindowID = driver.getWindowHandle();
		System.out.println("Partent id: " + parentWindowID);
		driver.findElement(By.xpath("//*[contains(text(),'Change Password')]")).click();
		Thread.sleep(2000);
		Set<String> allwindows = driver.getWindowHandles();
		int count = allwindows.size();
		System.out.println(count);
		String currentURL = " ";
		for (String child : allwindows) {
			if (!parentWindowID.equalsIgnoreCase(child)) 
			  {
				driver.switchTo().window(child);
				currentURL = driver.getCurrentUrl();
				System.out.println(currentURL);
			}
		}
		if (driver.getCurrentUrl().equals(currentURL)) 
		{
			return false;
		} else
			return true;
	    }

//97 and 98.To check whether user is able to click "dropdown" button and able to click "MyLoans" in Borrower Login and dashboard

	public boolean BorrowerMyLoansBackFail(String emailid, String pwd) throws Throwable
	 {
		signinBtn.click();
		email.sendKeys(emailid);
		password.sendKeys(pwd);
		login.click();
		Thread.sleep(3000);
		BorrowerDropdwn.click();
		BorrowerLoans.click();
		BorrowerApplyLoans.click();
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", BorrowerNext);
		     } 
		catch (org.openqa.selenium.StaleElementReferenceException ex)
		{
		}
		Thread.sleep(2000);
		BorrowerNext.click();
		Thread.sleep(5000);
		BorrowerBackBtn.click();
		return BorrowerSecondNext.isDisplayed();
		}
	   
//99 to 104.lender login and fill all details addfunds

	public String LenderLoginAddFunds(String Lemailid, String Lpwd, String BrAmount) throws Throwable 
	  {
		signinBtn.click();
		LName.sendKeys(Lemailid);
		LPassword.sendKeys(Lpwd);
		LLogin.click();
		Thread.sleep(3000);
		LAddFunds.click();
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(LClickHere));
		LClickHere.click();
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		String parentWindowId = it.next();
		System.out.println("Parent window id: " + parentWindowId);
		String childWindowId = it.next();
		System.out.println("Child window id: " + childWindowId);
		driver.switchTo().window(childWindowId);//element not interactable
		driver.findElement(By.xpath("//*[@class='validate']")).sendKeys(BrAmount);
		CreateLinkA.click();
		SignInBtn.click();
		driver.navigate().to("https://impactp2p.com/login/");
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(SignInToFP));
		return SignInToFP.getText();
	  }

//105 and 106.lender login start investment	

	public String LenderLoginStartInvesting(String Lemailid, String Lpwd, String BrAmount) throws Throwable 
	 {
		signinBtn.click();
		LName.sendKeys(Lemailid);
		LPassword.sendKeys(Lpwd);
		LLogin.click();
		Thread.sleep(5000);
		LMyprofile.click();
		MyPortfolio.click();
		StartInvstng.click();
		Thread.sleep(5000);
		//try{
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@contenteditable='true']"))).sendKeys(BrAmount);

			InvestBtn.click();
			Thread.sleep(1000);
			InvestBtn.click();
			Thread.sleep(3000);
			BackBtn.click();
			Thread.sleep(2000);
		/*  } 
		 catch (Exception ex) 
		  {
			driver.findElement(By.xpath("//*[text()='OK']")).click();
		    }*/
		   WebDriverWait wait = new WebDriverWait(driver, 20);
		   wait.until(ExpectedConditions.visibilityOf(InvestBtn));
		   return InvestBtn.getText();
	       }

//107.lenderlogin downloads

	public String LenderLoginDownloads(String Lemailid, String Lpwd) throws Throwable 
	  {
		signinBtn.click();
		LName.sendKeys(Lemailid);
		LPassword.sendKeys(Lpwd);
		LLogin.click();
		Thread.sleep(3000);
		DownloadsBtn.click();
		Thread.sleep(5000);
		Download.click();
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", LSummery);
		Thread.sleep(5000);
		LSummery.click();
		FinancepeerTitle.click();
		Thread.sleep(5000);
		EsignAuthzn.click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(LFinancepeer));
		return LFinancepeer.getText();
       }

}
