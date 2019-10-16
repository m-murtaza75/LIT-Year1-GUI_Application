/**
*** Author: Muhammad Murtaza
**  Creation date: 19/04/2017
*   Purpose: Creating GUI of an Online Shop
**/

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.ImageIcon;



public class AppStorm extends JFrame
{

	private static final int FRAME_WIDTH = 1180;
	private static final int FRAME_HEIGHT = 740;

	private static final int AREA_ROWS = 8;
	private static final int AREA_COLUMNS = 30;
	private static final int DEFAULT_QUANTITY = 0;

	private static final int CANDY_GAME_STOCK = 8;
	private static final double DEFAULT_PRICE = 2.5; //Candy crush price

	private static final double GTA_PRICE = 7.50;
	private static final int GTA_STOCK = 5;

	private static final double WHATSAPP_PRICE = 1.50;
	private static final int WHATSAPP_STOCK = 12;

	private static final double WOLFRAMALPHA_PRICE = 5.50;
	private static final int WOLFRAMALPHA_STOCK = 10;

	private static final double NETFLIX_PRICE = 9.50;
	private static final int NETFLIX_STOCK = 7;

	private static final double TOUCHNOTE_PRICE = 6.50;
	private static final int TOUCHNOTE_STOCK = 12;

	private static final double UBER_PRICE = 2.50;
	private static final int UBER_STOCK = 8;

	private static final double ISCANNER_PRICE = 4.50;
	private static final int ISCANNER_STOCK = 8;

	private static final double FITNESS_BUDDY_PRICE = 10.50;
	private static final int FITNESS_BUDDY_STOCK = 4;

	private static final double FACETUNE_PRICE = 8.75;
	private static final int FACETUNE_STOCK = 5;

	private static final double SCREEN_DIMMER_PRICE = 3.50;
	private static final int SCREEN_DIMMER_STOCK = 3;

	private static final double MUSIC_PRO_PRICE = 7.15;
	private static final int MUSIC_PRO_STOCK = 6;


	private static final int VOUCHER_NO = 122244;

	private JLabel appStorm;


    //Candy Crush game Components

	private JLabel candyCrush;
	private JLabel candyStockLabel;
	private JLabel priceLabel;
	private JLabel adding;
	private JLabel totalPriceLabel;
	private JLabel salePriceLabel;
	private JLabel candyImage;
	private JLabel error;
	private JLabel invalid;

	private ImageIcon candy;

	private JTextField quantity;
	private JTextField candyStockField;

	private JButton incCandy;
	private JButton decCandy;
	private JButton buy;
	private JButton addTo;

	private double price;
	private int candyStock;
	private int candyGame;

	// GTA game Components
	private JLabel gta;
	private JLabel gtaStockLabel;
	private JLabel gtaPriceLabel;
	private JLabel gtaTotalPrice;
	private JLabel gtaImageLabel;
	private JLabel gtaCartLabel;
	private JLabel gtaAdding;
	private JLabel gtaError;

	private ImageIcon gtaImage;

	private JButton incGta;
	private JButton decGta;
	private JButton addCart;
	private JButton gtaProceed;

	private JTextField gtaStockField;
	private JTextField gtaQuantity;

	private double gtaPrice;
	private int gtaStock;
	private int gtaGame;




	//WhatsApp Components
	private JLabel whatsapp;
	private JLabel whatsappStockLabel;
	private JLabel whatsappPriceLabel;
	private JLabel whatsappTotalPrice;
	private JLabel whatsappImageLabel;
	private JLabel whatsappCartLabel;
	private JLabel whatsappAdding;
	private JLabel whatsappError;

	private ImageIcon whatsappImage;

	private JButton incWhatsapp;
	private JButton decWhatsapp;
	private JButton whatsappCart;

	private JTextField whatsappStockField;
	private JTextField whatsappQuantity;

	private double whatsappPrice;
	private int whatsappProgram;
	private int whatsappStock;

	//Netflix Components
	private JLabel netflixLabel;
	private JLabel netflixStockLabel;
	private JLabel netflixPriceLabel;
	private JLabel netflixTotalPrice;
	private JLabel netflixImageLabel;
	private JLabel netflixCartLabel;
	private JLabel netflixAdding;
	private JLabel netflixError;

	private ImageIcon netflixImage;

	private JButton incNetflix;
	private JButton decNetflix;
	private JButton netflixCart;

	private JTextField netflixStockField;
	private JTextField netflixQuantity;

	private double netflixPrice;
	private int netflix;
	private int netflixStock;


	//WolframAlpha Components

	private JLabel wolframLabel;
	private JLabel wolframStockLabel;
	private JLabel wolframPriceLabel;
	private JLabel wolframTotalPrice;
	private JLabel wolframImageLabel;
	private JLabel wolframCartLabel;
	private JLabel wolframAdding;
	private JLabel wolframError;

	private ImageIcon wolframImage;

	private JButton incWolfram;
	private JButton decWolfram;
	private JButton wolframCart;

	private JTextField wolframStockField;
	private JTextField wolframQuantity;

	private double wolframPrice;
	private int wolframAlpha;
	private int wolframStock;

	//Touchnote Components

	private JLabel touchnoteLabel;
	private JLabel touchnoteStockLabel;
	private JLabel touchnotePriceLabel;
	private JLabel touchnoteTotalPrice;
	private JLabel touchnoteImageLabel;
	private JLabel touchnoteCartLabel;
	private JLabel touchnoteAdding;
	private JLabel touchnoteError;

	private ImageIcon touchnoteImage;

	private JButton incTouchnote;
	private JButton decTouchnote;
	private JButton touchnoteCart;

	private JTextField touchnoteStockField;
	private JTextField touchnoteQuantity;

	private double touchnotePrice;
	private int touchnote;
	private int touchnoteStock;

	//Uber app Components

	private JLabel uberLabel;
	private JLabel uberStockLabel;
	private JLabel uberPriceLabel;
	private JLabel uberTotalPrice;
	private JLabel uberImageLabel;
	private JLabel uberCartLabel;
	private JLabel uberAdding;
	private JLabel uberError;

	private ImageIcon uberImage;

	private JButton incUber;
	private JButton decUber;
	private JButton uberCart;

	private JTextField uberStockField;
	private JTextField uberQuantity;

	private double uberPrice;
	private int uber;
	private int uberStock;

	//iScanner pdf Components

	private JLabel iScannerLabel;
	private JLabel iScannerStockLabel;
	private JLabel iScannerPriceLabel;
	private JLabel iScannerTotalPrice;
	private JLabel iScannerImageLabel;
	private JLabel iScannerCartLabel;
	private JLabel iScannerAdding;
	private JLabel iScannerError;

	private ImageIcon iScannerImage;

	private JButton incIScanner;
	private JButton decIScanner;
	private JButton iScannerCart;

	private JTextField iScannerStockField;
	private JTextField iScannerQuantity;

	private double iScannerPrice;
	private int iScanner;
	private int iScannerStock;

	//Fitness Buddy Components

	private JLabel fitnessBuddyLabel;
	private JLabel fitnessBuddyStockLabel;
	private JLabel fitnessBuddyPriceLabel;
	private JLabel fitnessBuddyTotalPrice;
	private JLabel fitnessBuddyImageLabel;
	private JLabel fitnessBuddyCartLabel;
	private JLabel fitnessBuddyAdding;
	private JLabel fitnessBuddyError;

	private ImageIcon fitnessBuddyImage;

	private JButton incFitnessBuddy;
	private JButton decFitnessBuddy;
	private JButton fitnessBuddyCart;

	private JTextField fitnessBuddyStockField;
	private JTextField fitnessBuddyQuantity;

	private double fitnessBuddyPrice;
	private int fitnessBuddy;
	private int fitnessBuddyStock;

	//Facetune Components

	private JLabel facetuneLabel;
	private JLabel facetuneStockLabel;
	private JLabel facetunePriceLabel;
	private JLabel facetuneTotalPrice;
	private JLabel facetuneImageLabel;
	private JLabel facetuneCartLabel;
	private JLabel facetuneAdding;
	private JLabel facetuneError;

	private ImageIcon facetuneImage;

	private JButton incFacetune;
	private JButton decFacetune;
	private JButton facetuneCart;

	private JTextField facetuneStockField;
	private JTextField facetuneQuantity;

	private double facetunePrice;
	private int facetune;
	private int facetuneStock;

	//Screen-Dimmer Components

	private JLabel screenDimmerLabel;
	private JLabel screenDimmerStockLabel;
	private JLabel screenDimmerPriceLabel;
	private JLabel screenDimmerTotalPrice;
	private JLabel screenDimmerImageLabel;
	private JLabel screenDimmerCartLabel;
	private JLabel screenDimmerAdding;
	private JLabel screenDimmerError;

	private ImageIcon screenDimmerImage;

	private JButton incScreenDimmer;
	private JButton decScreenDimmer;
	private JButton screenDimmerCart;

	private JTextField screenDimmerStockField;
	private JTextField screenDimmerQuantity;

	private double screenDimmerPrice;
	private int screenDimmer;
	private int screenDimmerStock;

	//Music Pro Components

	private JLabel musicProLabel;
	private JLabel musicProStockLabel;
	private JLabel musicProPriceLabel;
	private JLabel musicProTotalPrice;
	private JLabel musicProImageLabel;
	private JLabel musicProCartLabel;
	private JLabel musicProAdding;
	private JLabel musicProError;

	private ImageIcon musicProImage;

	private JButton incMusicPro;
	private JButton decMusicPro;
	private JButton musicProCart;

	private JTextField musicProStockField;
	private JTextField musicProQuantity;

	private double musicProPrice;
	private int musicPro;
	private int musicProStock;




	//Internal Frame(Cart Frame) Components

	private JLabel voucher;
	private JLabel buyLabel;
	private JLabel shoppingCartLabel;
	private JTextArea totalCartProducts;

	private JButton proceed;

	private JTextField voucherField;

	JFrame shoppingCart = new JFrame();  //This is the Frame for displaying Items in cart

	//Constructor
	public AppStorm()
	{
		super("AppStorm");

		appStorm = new JLabel("");
		appStorm.setFont(new Font("Andalus", Font.ITALIC, 32));   //("Font-family", Font style, Font size);
		appStorm.setText("                                          			          WELCOME TO APPSTORM");
		appStorm.setLayout(new BorderLayout());
		appStorm.setOpaque(true);
		add(appStorm, BorderLayout.NORTH);


		//Candy Crush

		price = DEFAULT_PRICE;
		candyStock = CANDY_GAME_STOCK;


		priceLabel = new JLabel("Price: ");
		totalPriceLabel = new JLabel("Total Price: ");
		salePriceLabel = new JLabel("Sale Price: ");

		candyCrush = new JLabel("Candy-Crush: ");
		candyStockLabel = new JLabel("In stock: ");
		shoppingCartLabel = new JLabel("Dear Customer! ");

		voucher = new JLabel("Enter voucher no. : ");
		error = new JLabel(" ");
		invalid = new JLabel("");
		adding = new JLabel("Add this to cart");

		ImageIcon candy = new ImageIcon("candycrush.jpg");
		candyImage = new JLabel(new ImageIcon("candycrush.jpg"));
		candyImage = new JLabel(candy);
		this.add(candyImage);

		//GTA SanAndreas

		gtaPrice = GTA_PRICE;
		gtaStock = GTA_STOCK;

		gta = new JLabel("GTA San Andreas: ");
		gtaPriceLabel = new JLabel("Price: ");
		gtaStockLabel = new JLabel("In stock: ");
		gtaAdding = new JLabel("Add this to cart");
		gtaError = new JLabel("Invalid Selection");

		ImageIcon gtaImage = new ImageIcon("gta2.jpg");
		gtaImageLabel = new JLabel(new ImageIcon("gta2.jpg"));
		gtaImageLabel = new JLabel(gtaImage);

		//WhatsApp

		whatsappPrice = WHATSAPP_PRICE;
		whatsappStock = WHATSAPP_STOCK;

		whatsapp = new JLabel("WhatsApp Plus: ");
		whatsappPriceLabel = new JLabel("Price: ");
		whatsappStockLabel = new JLabel("In stock: ");
		whatsappAdding = new JLabel("Add this to cart");
		whatsappError = new JLabel("Invalid Selection");

		ImageIcon whatsappImage = new ImageIcon("whatsapp.jpg");
		whatsappImageLabel = new JLabel(new ImageIcon("whatsapp.jpg"));
		whatsappImageLabel = new JLabel(whatsappImage);

		//Wolfram-Alpha

		wolframPrice = WOLFRAMALPHA_PRICE;
		wolframStock = WOLFRAMALPHA_STOCK;

		wolframLabel = new JLabel("WolframAlpha: ");
		wolframPriceLabel = new JLabel("Price: ");
		wolframStockLabel = new JLabel("In stock: ");
		wolframAdding = new JLabel("Add this to cart");
		wolframError = new JLabel("Invalid Selecion");

		ImageIcon wolframImage = new ImageIcon("wolfram.jpg");
		wolframImageLabel = new JLabel(new ImageIcon("wolfram.jpg"));
		wolframImageLabel = new JLabel(wolframImage);

		//Netflix

		netflixPrice = NETFLIX_PRICE;
		netflixStock = NETFLIX_STOCK;

		netflixLabel = new JLabel("NETFLIX Pro App:");
		netflixPriceLabel = new JLabel("Price: ");
		netflixStockLabel = new JLabel("In stock: ");
		netflixAdding = new JLabel("Add this to cart");
		netflixError = new JLabel("Invalid Selecion");

		ImageIcon netflixImage = new ImageIcon("netflix.jpg");
		netflixImageLabel = new JLabel(new ImageIcon("netflix.jpg"));
		netflixImageLabel = new JLabel(netflixImage);

		//Touchnote

		touchnotePrice = TOUCHNOTE_PRICE;
		touchnoteStock = TOUCHNOTE_STOCK;

		touchnoteLabel = new JLabel("Touchnote App: ");
		touchnotePriceLabel = new JLabel("Price: ");
		touchnoteStockLabel = new JLabel("In stock: ");
		touchnoteAdding = new JLabel("Add this to cart");
		touchnoteError = new JLabel("Invalid Selection");

		ImageIcon touchnoteImage = new ImageIcon("touchnote.jpg");
		touchnoteImageLabel = new JLabel(new ImageIcon("touchnote.jpg"));
		touchnoteImageLabel = new JLabel(touchnoteImage);

		//Uber

		uberPrice = UBER_PRICE;
		uberStock = UBER_STOCK;

		uberLabel = new JLabel("Uber App: ");
		uberPriceLabel = new JLabel("Price: ");
		uberStockLabel = new JLabel("In stock: ");
		uberAdding = new JLabel("Add this to cart");
		uberError = new JLabel("Invalid Selection");

		ImageIcon uberImage = new ImageIcon("uber.jpg");
		uberImageLabel = new JLabel(new ImageIcon("uber.jpg"));
		uberImageLabel = new JLabel(uberImage);

		//iScanner

		iScannerPrice = ISCANNER_PRICE;
		iScannerStock = ISCANNER_STOCK;

		iScannerLabel = new JLabel("iScanner Pdf: ");
		iScannerPriceLabel = new JLabel("Price: ");
		iScannerStockLabel = new JLabel("In stock: ");
		iScannerAdding = new JLabel("Add this to cart");
		iScannerError = new JLabel("Invalid Selection");

		ImageIcon iScannerImage = new ImageIcon("iScanner.jpg");
		iScannerImageLabel = new JLabel(new ImageIcon("iScanner.jpg"));
		iScannerImageLabel = new JLabel(iScannerImage);

		//Fitness Buddy

		fitnessBuddyPrice = FITNESS_BUDDY_PRICE;
		fitnessBuddyStock = FITNESS_BUDDY_STOCK;

		fitnessBuddyLabel = new JLabel("Fitness Buddy: ");
		fitnessBuddyPriceLabel = new JLabel("Price: ");
		fitnessBuddyStockLabel = new JLabel("In stock: ");
		fitnessBuddyAdding = new JLabel("Add this to cart");
		fitnessBuddyError = new JLabel("Invalid Selection");

		ImageIcon fitnessBuddyImage = new ImageIcon("fitnessBuddy.jpg");
		fitnessBuddyImageLabel = new JLabel(new ImageIcon("fitnessBuddy.jpg"));
		fitnessBuddyImageLabel = new JLabel(fitnessBuddyImage);

		//Facetune

		facetunePrice = FACETUNE_PRICE;
		facetuneStock = FACETUNE_STOCK;

		facetuneLabel = new JLabel("Facetune app: ");
		facetunePriceLabel = new JLabel("Price: ");
		facetuneStockLabel = new JLabel("In stock: ");
		facetuneAdding = new JLabel("Add this to cart");
		facetuneError = new JLabel("Invalid Selection");

		ImageIcon facetuneImage = new ImageIcon("facetune.jpg");
		facetuneImageLabel = new JLabel(new ImageIcon("facetune.jpg"));
		facetuneImageLabel = new JLabel(facetuneImage);

		//Screen-Dimmer

		screenDimmerPrice = SCREEN_DIMMER_PRICE;
		screenDimmerStock = SCREEN_DIMMER_STOCK;

		screenDimmerLabel = new JLabel("Screen Dimmer app: ");
		screenDimmerPriceLabel = new JLabel("Price: ");
		screenDimmerStockLabel = new JLabel("In stock: ");
		screenDimmerAdding = new JLabel("Add this to cart");
		screenDimmerError = new JLabel("Invalid Selection");

		ImageIcon screenDimmerImage = new ImageIcon("screenDimmer.jpg");
		screenDimmerImageLabel = new JLabel(new ImageIcon("screenDimmer.jpg"));
		screenDimmerImageLabel = new JLabel(screenDimmerImage);

		//Music Pro

		musicProPrice = MUSIC_PRO_PRICE;
		musicProStock = MUSIC_PRO_STOCK;

		musicProLabel = new JLabel("Music Pro app: ");
		musicProPriceLabel = new JLabel("Price: ");
		musicProStockLabel = new JLabel("In stock: ");
		musicProAdding = new JLabel("Add this to cart");
		musicProError = new JLabel("Invalid Selection");

		ImageIcon musicProImage = new ImageIcon("musicPro.jpg");
		musicProImageLabel = new JLabel(new ImageIcon("musicPro.jpg"));
		musicProImageLabel = new JLabel(musicProImage);


		//Calling Methods
		createTextField();
		createButton();
		createPanel();
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}

	private void createTextField()
	{

		final int FIELD_WIDTH = 2;
		final int VOUCHER_FIELD = 7;
		final int STOCK_WIDTH = 1;
		quantity = new JTextField(FIELD_WIDTH);
		quantity.setText("" + DEFAULT_QUANTITY);

		candyStockField = new JTextField(STOCK_WIDTH);
		candyStockField.setText("" + CANDY_GAME_STOCK);

		gtaStockField = new JTextField(STOCK_WIDTH);
		gtaStockField.setText("" + GTA_STOCK);

		whatsappStockField = new JTextField(STOCK_WIDTH);
		whatsappStockField.setText("" + WHATSAPP_STOCK);

		wolframStockField = new JTextField(STOCK_WIDTH);
		wolframStockField.setText("" + WOLFRAMALPHA_STOCK);

		netflixStockField = new JTextField(STOCK_WIDTH);
		netflixStockField.setText("" + NETFLIX_STOCK);

		touchnoteStockField = new JTextField(STOCK_WIDTH);
		touchnoteStockField.setText("" + TOUCHNOTE_STOCK);

		uberStockField = new JTextField(STOCK_WIDTH);
		uberStockField.setText("" + UBER_STOCK);

		iScannerStockField = new JTextField(STOCK_WIDTH);
		iScannerStockField.setText("" + ISCANNER_STOCK);

		fitnessBuddyStockField = new JTextField(STOCK_WIDTH);
		fitnessBuddyStockField.setText("" + FITNESS_BUDDY_STOCK);

		facetuneStockField = new JTextField(STOCK_WIDTH);
		facetuneStockField.setText("" + FACETUNE_STOCK);

		screenDimmerStockField = new JTextField(STOCK_WIDTH);
		screenDimmerStockField.setText("" + SCREEN_DIMMER_STOCK);

		musicProStockField = new JTextField(STOCK_WIDTH);
		musicProStockField.setText("" + MUSIC_PRO_STOCK);


		voucherField = new JTextField(VOUCHER_FIELD);
		voucherField.setText("");

		gtaQuantity = new JTextField(FIELD_WIDTH);
		gtaQuantity.setText("" + DEFAULT_QUANTITY);

		whatsappQuantity = new JTextField(FIELD_WIDTH);
		whatsappQuantity.setText("" + DEFAULT_QUANTITY);

		wolframQuantity = new JTextField(FIELD_WIDTH);
		wolframQuantity = new JTextField("" + DEFAULT_QUANTITY);

		netflixQuantity = new JTextField(FIELD_WIDTH);
		netflixQuantity = new JTextField("" + DEFAULT_QUANTITY);

		touchnoteQuantity = new JTextField(FIELD_WIDTH);
		touchnoteQuantity = new JTextField("" + DEFAULT_QUANTITY);

		uberQuantity = new JTextField(FIELD_WIDTH);
		uberQuantity = new JTextField("" + DEFAULT_QUANTITY);

		iScannerQuantity = new JTextField(FIELD_WIDTH);
		iScannerQuantity = new JTextField("" + DEFAULT_QUANTITY);

		fitnessBuddyQuantity = new JTextField(FIELD_WIDTH);
		fitnessBuddyQuantity = new JTextField("" + DEFAULT_QUANTITY);

		facetuneQuantity = new JTextField(FIELD_WIDTH);
		facetuneQuantity = new JTextField("" + DEFAULT_QUANTITY);

		screenDimmerQuantity = new JTextField(FIELD_WIDTH);
		screenDimmerQuantity = new JTextField("" + DEFAULT_QUANTITY);

		musicProQuantity = new JTextField(FIELD_WIDTH);
		musicProQuantity = new JTextField("" + DEFAULT_QUANTITY);
	}

	class IncrementCandy implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			int addition = 1;
			candyGame = candyGame + addition;
			quantity.setText("" + candyGame);

			int newQuantity = Integer.parseInt(quantity.getText());
			double newPrice  = price * newQuantity;
			priceLabel.setText("Price: " + newPrice);

		}
	}

	class IncrementGta implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			int addition = 1;
			gtaGame = gtaGame + addition;
			gtaQuantity.setText("" + gtaGame);

			int newGtaQuantity = Integer.parseInt(gtaQuantity.getText());
			double newPrice  = gtaPrice * newGtaQuantity;
			gtaPriceLabel.setText("Price: " + newPrice);

		}
	}

	class IncrementWhatsapp implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			int addition = 1;
			whatsappProgram = whatsappProgram + addition;
			whatsappQuantity.setText("" + whatsappProgram);

			int newWhatsappQuantity = Integer.parseInt(whatsappQuantity.getText());
			double newPrice = whatsappPrice * newWhatsappQuantity;
			whatsappPriceLabel.setText("Price: " + newPrice);
		}
	}

	class IncrementWolfram implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			int addition = 1;
			wolframAlpha = wolframAlpha + addition;
			wolframQuantity.setText("" + wolframAlpha);

			int newWolframQuantity = Integer.parseInt(wolframQuantity.getText());
			double newPrice = wolframPrice * newWolframQuantity;
			wolframPriceLabel.setText("Price: " + newPrice);
		}
	}

	class IncrementNetflix implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			int addition = 1;
			netflix = netflix + addition;
			netflixQuantity.setText("" + netflix);

			int netFlixQuantity = Integer.parseInt(netflixQuantity.getText());
			double newPrice = netflixPrice * netFlixQuantity;
			netflixPriceLabel.setText("Price: " + newPrice);
		}
	}

	class IncrementTouchnote implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			int addition = 1;
			touchnote = touchnote + addition;
			touchnoteQuantity.setText("" + touchnote);

			int touchNoteQuantity = Integer.parseInt(touchnoteQuantity.getText());
			double newPrice = touchnotePrice * touchNoteQuantity;
			touchnotePriceLabel.setText("Price: " + newPrice);
		}
	}

	class IncrementUber implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			int addition = 1;
			uber = uber + addition;
			uberQuantity.setText("" + uber);

			int newUberQuantity = Integer.parseInt(uberQuantity.getText());
			double newPrice = uberPrice * newUberQuantity;
			uberPriceLabel.setText("Price: " + newPrice);
		}
	}

	class IncrementIScanner implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			int addition = 1;
			iScanner = iScanner + addition;
			iScannerQuantity.setText("" + iScanner);

			int newIScannerQuantity = Integer.parseInt(iScannerQuantity.getText());
			double newPrice = iScannerPrice * newIScannerQuantity;
			iScannerPriceLabel.setText("Price: " + newPrice);
		}
	}

	class IncrementFitnessBuddy implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			int addition = 1;
			fitnessBuddy = fitnessBuddy + addition;
			fitnessBuddyQuantity.setText("" + fitnessBuddy);

			int newFitnessBuddyQuantity = Integer.parseInt(fitnessBuddyQuantity.getText());
			double newPrice = fitnessBuddyPrice * newFitnessBuddyQuantity;
			fitnessBuddyPriceLabel.setText("Price: " + newPrice);
		}
	}

	class IncrementFacetune implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			int addition = 1;
			facetune = facetune + addition;
			facetuneQuantity.setText("" + facetune);

			int newFacetuneQuantity = Integer.parseInt(facetuneQuantity.getText());
			double newPrice = facetunePrice * newFacetuneQuantity;
			facetunePriceLabel.setText("Price: " + newPrice);
		}
	}

	class IncrementScreenDimmer implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			int addition = 1;
			screenDimmer = screenDimmer + addition;
			screenDimmerQuantity.setText("" + screenDimmer);

			int newScreenDimmerQuantity = Integer.parseInt(screenDimmerQuantity.getText());
			double newPrice = screenDimmerPrice * newScreenDimmerQuantity;
			screenDimmerPriceLabel.setText("Price: " + newPrice);
		}
	}

	class IncrementMusicPro implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			int addition = 1;
			musicPro = musicPro + addition;
			musicProQuantity.setText("" + musicPro);

			int newMusicProQuantity = Integer.parseInt(musicProQuantity.getText());
			double newPrice = musicProPrice * newMusicProQuantity;
			musicProPriceLabel.setText("Price: " + newPrice);
		}
	}

	class DecrementCandy implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			int subtraction = 1;
			if(candyGame > 0)
			{

				candyGame = candyGame - subtraction;
				quantity.setText("" + candyGame);

				int newQuantity = Integer.parseInt(quantity.getText());
				double newPrice  = price * newQuantity;
				priceLabel.setText("Price: " + newPrice);

			}
		}
	}

	class DecrementWhatsapp implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			int subtraction = 1;
			if(whatsappProgram > 0)
			{

				whatsappProgram = whatsappProgram - subtraction;
				whatsappQuantity.setText("" + whatsappProgram);

				int newWhatsappQuantity = Integer.parseInt(whatsappQuantity.getText());
				double newPrice = whatsappPrice * newWhatsappQuantity;
				whatsappPriceLabel.setText("Price: " + newPrice);
			}
		}
	}

	class DecrementWolfram implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			int subtraction = 1;
			if(wolframAlpha > 0)
			{
				wolframAlpha = wolframAlpha - subtraction;
				wolframQuantity.setText("" + wolframAlpha);

				int newWolframQuantity = Integer.parseInt(wolframQuantity.getText());
				double newPrice = whatsappPrice * newWolframQuantity;
				wolframPriceLabel.setText("Price: " + newPrice);
			}
		}
	}


	class DecrementGta implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			int subtraction = 1;
			if(gtaGame > 0)
			{

				gtaGame = gtaGame - subtraction;
				gtaQuantity.setText("" + gtaGame);

				int newQuantity = Integer.parseInt(gtaQuantity.getText());
				double newPrice  = gtaPrice * newQuantity;
				gtaPriceLabel.setText("Price: " + newPrice);

			}
		}
	}

	class DecrementNetflix implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			int subtraction = 1;
			if(netflix > 0)
			{
				netflix = netflix - subtraction;
				netflixQuantity.setText("" + netflix);

				int netFlixQuantity = Integer.parseInt(netflixQuantity.getText());
				double newPrice = netflixPrice * netFlixQuantity;
				netflixPriceLabel.setText("Price: " + newPrice);
			}
		}
	}

	class DecrementTouchnote implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			int subtraction = 1;
			if(touchnote > 0)
			{
				touchnote = touchnote - subtraction;
				touchnoteQuantity.setText("" + touchnote);

				int touchNoteQuantity = Integer.parseInt(touchnoteQuantity.getText());
				double newPrice = touchnotePrice * touchNoteQuantity;
				touchnotePriceLabel.setText("Price: " + newPrice);
			}
		}
	}

	class DecrementUber implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			int subtraction = 1;
			if(uber > 0)
			{
				uber = uber - subtraction;
				uberQuantity.setText("" + uber);

				int newUberQuantity = Integer.parseInt(uberQuantity.getText());
				double newPrice = uberPrice * newUberQuantity;
				uberPriceLabel.setText("Price: " + newPrice);
			}
		}
	}

	class DecrementIScanner implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			int subtraction = 1;
			if(iScanner > 0)
			{
				iScanner = iScanner - subtraction;
				iScannerQuantity.setText("" + iScanner);

				int newIScannerQuantity = Integer.parseInt(iScannerQuantity.getText());
				double newPrice = iScannerPrice * newIScannerQuantity;
				iScannerPriceLabel.setText("Price: " + newPrice);
			}
		}
	}

	class DecrementFitnessBuddy implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			int subtraction = 1;
			if(fitnessBuddy > 0)
			{
				fitnessBuddy = fitnessBuddy - subtraction;
				fitnessBuddyQuantity.setText("" + fitnessBuddy);

				int newFitnessBuddyQuantity = Integer.parseInt(fitnessBuddyQuantity.getText());
				double newPrice = fitnessBuddyPrice * newFitnessBuddyQuantity;
				fitnessBuddyPriceLabel.setText("Price: " + newPrice);
			}
		}
	}

	class DecrementScreenDimmer implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			int subtraction = 1;
			if(screenDimmer > 0)
			{
				screenDimmer = screenDimmer - subtraction;
				screenDimmerQuantity.setText("" + screenDimmer);

				int newScreenDimmerQuantity = Integer.parseInt(screenDimmerQuantity.getText());
				double newPrice = screenDimmerPrice * newScreenDimmerQuantity;
				screenDimmerPriceLabel.setText("Price: " + newPrice);
			}
		}
	}

	class DecrementFacetune implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			int subtraction = 1;
			if(facetune > 0)
			{
				facetune = facetune - subtraction;
				facetuneQuantity.setText("" + facetune);

				int newFacetuneQuantity = Integer.parseInt(facetuneQuantity.getText());
				double newPrice = facetunePrice * newFacetuneQuantity;
				facetunePriceLabel.setText("Price: " + newPrice);
			}
		}
	}

	class DecrementMusicPro implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			int subtraction = 1;
			if(musicPro > 0)
			{
				musicPro = musicPro - subtraction;
				musicProQuantity.setText("" + musicPro);

				int newMusicProQuantity = Integer.parseInt(musicProQuantity.getText());
				double newPrice = musicProPrice * newMusicProQuantity;
				musicProPriceLabel.setText("Price: " + newPrice);
			}
		}
	}

	class AddToCartListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			int newQuantity = Integer.parseInt(quantity.getText());
			if((newQuantity > 0)&&(newQuantity <= CANDY_GAME_STOCK))
			{
				int remainingStock = CANDY_GAME_STOCK - newQuantity;
				candyStockField.setText("" + remainingStock);
				error.setVisible(false);

			}

			if((newQuantity > CANDY_GAME_STOCK)||(newQuantity <= 0))
			{
				error.setText("Invalid, Selection");
				candyStockField.setText("" + CANDY_GAME_STOCK);
				error.setVisible(true);
			}

		}

	}

	class GtaCartListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			int newQuantity = Integer.parseInt(gtaQuantity.getText());
			if((newQuantity > 0)&&(newQuantity <= GTA_STOCK))
			{
				int remainingStock = GTA_STOCK - newQuantity;
				gtaStockField.setText("" + remainingStock);
				gtaError.setVisible(false);

			}

			if((newQuantity > GTA_STOCK)||(newQuantity <= 0))
			{
				gtaError.setText("Invalid, Selection");
				gtaStockField.setText("" + GTA_STOCK);
				gtaError.setVisible(true);
			}

		}

	}

	class WhatsappCartListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			int newQuantity = Integer.parseInt(whatsappQuantity.getText());
			if((newQuantity > 0)&&(newQuantity <= WHATSAPP_STOCK))
			{
				int remainingStock = WHATSAPP_STOCK - newQuantity;
				whatsappStockField.setText("" + remainingStock);
				whatsappError.setVisible(false);
			}

			if((newQuantity > WHATSAPP_STOCK)||(newQuantity <= 0))
			{
				whatsappError.setText("Invalid, Selection");
				whatsappStockField.setText("" + WHATSAPP_STOCK);
				whatsappError.setVisible(true);
			}
		}
	}

	class WolframCartListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			int newQuantity = Integer.parseInt(wolframQuantity.getText());
			if((newQuantity > 0)&&(newQuantity <= WOLFRAMALPHA_STOCK))
			{
				int remainingStock = WOLFRAMALPHA_STOCK - newQuantity;
				wolframStockField.setText("" + remainingStock);
				wolframError.setVisible(false);
			}

			if((newQuantity > WOLFRAMALPHA_STOCK)||(newQuantity <= 0))
			{
				wolframError.setText("Invalid, Selection");
				wolframStockField.setText("" + WOLFRAMALPHA_STOCK);
				wolframError.setVisible(true);
			}
		}
	}

	class NetflixCartListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			int newQuantity = Integer.parseInt(netflixQuantity.getText());
			if((newQuantity > 0)&&(newQuantity <= NETFLIX_STOCK))
			{
				int remainingStock = NETFLIX_STOCK - newQuantity;
				netflixStockField.setText("" + remainingStock);
				netflixError.setVisible(false);
			}

			if((newQuantity > NETFLIX_STOCK)||(newQuantity <= 0))
			{
				netflixError.setText("Invalid, Selection");
				netflixStockField.setText("" + NETFLIX_STOCK);
				netflixError.setVisible(true);
			}
		}
	}

	class TouchnoteCartListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			int newQuantity = Integer.parseInt(touchnoteQuantity.getText());
			if((newQuantity > 0)&&(newQuantity <= TOUCHNOTE_STOCK))
			{
				int remainingStock = TOUCHNOTE_STOCK - newQuantity;
				touchnoteStockField.setText("" + remainingStock);
				touchnoteError.setVisible(false);
			}

			if((newQuantity > TOUCHNOTE_STOCK)||(newQuantity <= 0))
			{
				touchnoteError.setText("Invalid, Selection");
				touchnoteStockField.setText("" + TOUCHNOTE_STOCK);
				touchnoteError.setVisible(true);
			}
		}
	}

	class UberCartListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			int newQuantity = Integer.parseInt(uberQuantity.getText());
			if((newQuantity > 0)&&(newQuantity <= UBER_STOCK))
			{
				int remainingStock = UBER_STOCK - newQuantity;
				uberStockField.setText("" + remainingStock);
				uberError.setVisible(false);
			}

			if((newQuantity > UBER_STOCK)||(newQuantity <= 0))
			{
				uberError.setText("Invalid, Selection");
				uberStockField.setText("" + UBER_STOCK);
				uberError.setVisible(true);
			}
		}
	}

	class IScannerCartListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			int newQuantity = Integer.parseInt(iScannerQuantity.getText());
			if((newQuantity > 0)&&(newQuantity <= ISCANNER_STOCK))
			{
				int remainingStock = ISCANNER_STOCK - newQuantity;
				iScannerStockField.setText("" + remainingStock);
				iScannerError.setVisible(false);
			}

			if((newQuantity > ISCANNER_STOCK)||(newQuantity <= 0))
			{
				iScannerError.setText("Invalid, Selection");
				iScannerStockField.setText("" + ISCANNER_STOCK);
				iScannerError.setVisible(true);
			}
		}
	}

	class FitnessBuddyCartListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			int newQuantity = Integer.parseInt(fitnessBuddyQuantity.getText());
			if((newQuantity > 0)&&(newQuantity <= FITNESS_BUDDY_STOCK))
			{
				int remainingStock = FITNESS_BUDDY_STOCK - newQuantity;
				fitnessBuddyStockField.setText("" + remainingStock);
				fitnessBuddyError.setVisible(false);
			}

			if((newQuantity > FITNESS_BUDDY_STOCK)||(newQuantity <= 0))
			{
				fitnessBuddyError.setText("Invalid, Selection");
				fitnessBuddyStockField.setText("" + FITNESS_BUDDY_STOCK);
				fitnessBuddyError.setVisible(true);
			}
		}
	}

	class FacetuneCartListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			int newQuantity = Integer.parseInt(facetuneQuantity.getText());
			if((newQuantity > 0)&&(newQuantity <= FACETUNE_STOCK))
			{
				int remainingStock = FACETUNE_STOCK - newQuantity;
				facetuneStockField.setText("" + remainingStock);
				facetuneError.setVisible(false);
			}

			if((newQuantity > FACETUNE_STOCK)||(newQuantity <= 0))
			{
				facetuneError.setText("Invalid, Selection");
				facetuneStockField.setText("" + FACETUNE_STOCK);
				facetuneError.setVisible(true);
			}
		}
	}

	class ScreenDimmerCartListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			int newQuantity = Integer.parseInt(screenDimmerQuantity.getText());
			if((newQuantity > 0)&&(newQuantity <= SCREEN_DIMMER_STOCK))
			{
				int remainingStock = SCREEN_DIMMER_STOCK - newQuantity;
				screenDimmerStockField.setText("" + remainingStock);
				screenDimmerError.setVisible(false);
			}

			if((newQuantity > SCREEN_DIMMER_STOCK)||(newQuantity <= 0))
			{
				screenDimmerError.setText("Invalid, Selection");
				screenDimmerStockField.setText("" + SCREEN_DIMMER_STOCK);
				screenDimmerError.setVisible(true);
			}
		}
	}

	class MusicProCartListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			int newQuantity = Integer.parseInt(musicProQuantity.getText());
			if((newQuantity > 0)&&(newQuantity <= MUSIC_PRO_STOCK))
			{
				int remainingStock = MUSIC_PRO_STOCK - newQuantity;
				musicProStockField.setText("" + remainingStock);
				musicProError.setVisible(false);
			}

			if((newQuantity > MUSIC_PRO_STOCK)||(newQuantity <= 0))
			{
				musicProError.setText("Invalid, Selection");
				musicProStockField.setText("" + MUSIC_PRO_STOCK);
				musicProError.setVisible(true);
			}
		}
	}



	class CartDisplay implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			buyLabel = new JLabel();

			String candy = " Candy-Crush game";
			String gta = " GTA SanAndreas game";
			String whatsapp = " WhatsApp Plus app";
			String wolfram = " WolframAlpha app";
			String netflix = " Netflix app";
			String touchnote = " Touch-Note app";
			String uber = " Uber app";
			String iScanner = " iScanner pdf";
			String fitnessBuddy = " Fitness Buddy app";
			String facetune = " Facetune app";
			String screenDimmer = " Screen dimmer app";
			String musicPro = " Music Pro app";

			int newQuantity = Integer.parseInt(quantity.getText());
			int gtaQ = Integer.parseInt(gtaQuantity.getText());
			int whatsappQ = Integer.parseInt(whatsappQuantity.getText());
			int wolframQ =  Integer.parseInt(wolframQuantity.getText());
			int netflixQ =  Integer.parseInt(netflixQuantity.getText());
			int touchnoteQ = Integer.parseInt(touchnoteQuantity.getText());
			int uberQ = Integer.parseInt(uberQuantity.getText());
			int iScannerQ = Integer.parseInt(iScannerQuantity.getText());
			int fitnessBuddyQ = Integer.parseInt(fitnessBuddyQuantity.getText());
			int facetuneQ = Integer.parseInt(facetuneQuantity.getText());
			int screenDimmerQ = Integer.parseInt(screenDimmerQuantity.getText());
			int musicProQ = Integer.parseInt(musicProQuantity.getText());

			//Total Price calculation of Products

			double netflixP = netflixPrice * netflixQ;
			double touchnoteP = touchnotePrice * touchnoteQ;
			double uberP = uberPrice * uberQ;
			double iScannerP = iScannerPrice * iScannerQ;
			double fitnessBuddyP = fitnessBuddyPrice * fitnessBuddyQ;
			double facetuneP = facetunePrice * facetuneQ;
			double screenDimmerP = screenDimmerPrice * screenDimmerQ;
			double musicProP = musicProPrice * musicProQ;
			double gtaP =  (gtaPrice * gtaQ);
			double candyP = price * newQuantity;
			double whatsappP = (whatsappPrice * whatsappQ);
			double wolframP = (wolframPrice * wolframQ);


			double totalPrice  = candyP  + gtaP  + whatsappP + wolframP + netflixP + touchnoteP + uberP + iScannerP + fitnessBuddyP + facetuneP + screenDimmerP + musicProP;
			totalPriceLabel.setText("Total Price: " + totalPrice);

			shoppingCartLabel.setText("Dear Customer ! you added :- ");
			shoppingCartLabel.setOpaque(true);
			shoppingCartLabel.setBackground(new Color(217,222,81,230));
			totalCartProducts = new JTextArea(AREA_ROWS, AREA_COLUMNS);
		    totalCartProducts.setEditable(false);
		    totalCartProducts.setFont(new Font("Andalus", Font.PLAIN, 14));  //("Font-family, Font style, Font size);
			totalCartProducts.setText("");

			if(newQuantity != 0)
			{
				totalCartProducts.append(newQuantity + " " + candy);
			}
			if(gtaQ != 0)
			{
				totalCartProducts.append("\n" + gtaQ + " " + gta);
			}
			if(whatsappQ != 0)
			{
				totalCartProducts.append("\n" + whatsappQ + " " + whatsapp);
			}
			if(wolframQ != 0)
			{
				totalCartProducts.append("\n" + wolframQ + " " + wolfram);
			}
			if(netflixQ != 0)
			{
				totalCartProducts.append("\n" + netflixQ + " " + netflix);
			}
			if(touchnoteQ != 0)
			{
				totalCartProducts.append("\n" + touchnoteQ + " " + touchnote);
			}
			if(uberQ != 0)
			{
				totalCartProducts.append("\n" + uberQ + " " + uber);
			}
			if(iScannerQ != 0)
			{
				totalCartProducts.append("\n" + iScannerQ + " " + iScanner);
			}
			if(fitnessBuddyQ != 0)
			{
				totalCartProducts.append("\n" + fitnessBuddyQ + " " + fitnessBuddy);
			}
			if(facetuneQ != 0)
			{
				totalCartProducts.append("\n" + facetuneQ + " " + facetune);
			}
			if(screenDimmerQ != 0)
			{
				totalCartProducts.append("\n" + screenDimmerQ + " " + screenDimmer);
			}
			if(musicProQ != 0)
			{
				totalCartProducts.append("\n" + musicProQ + " " + musicPro);
			}

			class DiscountListener implements ActionListener
			{
				public void actionPerformed(ActionEvent event)
				{
					int newCode = Integer.parseInt(voucherField.getText());
					if(newCode == VOUCHER_NO)
					{
						double rate = 0.3;
						double discountAmount = totalPrice * rate;
						double salePrice = totalPrice - discountAmount;
						salePriceLabel.setText("Sale Price: " + salePrice);
						invalid.setVisible(false);
					}

					if(newCode != VOUCHER_NO)
					{
						invalid.setText("Invalid voucher");
						salePriceLabel.setText("Sale Price: error ");
						totalPriceLabel.setVisible(true);
						invalid.setVisible(true);
					}

				}
			}


			class BuyButtonListener implements ActionListener
			{
				public void actionPerformed(ActionEvent event)
				{
					if(totalCartProducts != null)
					{
						buyLabel.setFont(new Font("Andalus", Font.ITALIC,16));    //("Font-family, Font.style, Font size);
						buyLabel.setText("Thank you for purchasing from AppStorm");
					}
				}
			}


			JButton voucherButton = new JButton("Get 30% off");
			ActionListener getDiscount = new DiscountListener();
			voucherButton.addActionListener(getDiscount);

			buy =  new JButton("Buy");
			ActionListener BuyListener = new BuyButtonListener();
			buy.addActionListener(BuyListener);


			JPanel display = new JPanel();
			display.setBackground(new Color(70,140,210));
			display.add(shoppingCartLabel);
			display.add(totalCartProducts);
			display.add(totalPriceLabel);
			display.add(voucher);
			display.add(voucherField);
			display.add(invalid);
			display.add(voucherButton);
			display.add(salePriceLabel);
			display.add(buy);
			display.add(buyLabel);
			buyLabel.setOpaque(true);
			buyLabel.setBackground(new Color(217,222,81,230));
			shoppingCart.add(display);
			shoppingCart.setSize(520,400);
			shoppingCart.setTitle("Shopping Cart frame ");
			shoppingCart.setVisible(true);

		}
	}

	private void createButton()
	{
		incCandy = new JButton("+");
		ActionListener listener = new IncrementCandy();
		incCandy.addActionListener(listener);

		decCandy = new JButton("-");
		ActionListener listener2 = new DecrementCandy();
		decCandy.addActionListener(listener2);

		incGta = new JButton("+");
		ActionListener gtaListener = new IncrementGta();
		incGta.addActionListener(gtaListener);

		decGta = new JButton("-");
		ActionListener gtaListener2 = new DecrementGta();
		decGta.addActionListener(gtaListener2);

		incWhatsapp = new JButton("+");
		ActionListener whatsappListener = new IncrementWhatsapp();
		incWhatsapp.addActionListener(whatsappListener);

		decWhatsapp = new JButton("-");
		ActionListener whatsappListener2 = new DecrementWhatsapp();
		decWhatsapp.addActionListener(whatsappListener2);

		incWolfram = new JButton("+");
		ActionListener wolframListener = new IncrementWolfram();
		incWolfram.addActionListener(wolframListener);

		decWolfram = new JButton("-");
		ActionListener wolframListener2 = new DecrementWolfram();
		decWolfram.addActionListener(wolframListener2);

		incNetflix = new JButton("+");
		ActionListener netflixListener = new IncrementNetflix();
		incNetflix.addActionListener(netflixListener);

		decNetflix = new JButton("-");
		ActionListener netflixListener2 = new DecrementNetflix();
		decNetflix.addActionListener(netflixListener2);

		incTouchnote = new JButton("+");
		ActionListener touchnoteListener = new IncrementTouchnote();
		incTouchnote.addActionListener(touchnoteListener);

		decTouchnote = new JButton("-");
		ActionListener touchnoteListener2 = new DecrementTouchnote();
		decTouchnote.addActionListener(touchnoteListener2);

		incUber = new JButton("+");
		ActionListener uberListener = new IncrementUber();
		incUber.addActionListener(uberListener);

		decUber = new JButton("-");
		ActionListener uberListener2 = new DecrementUber();
		decUber.addActionListener(uberListener2);

		incIScanner = new JButton("+");
		ActionListener iScannerListener = new IncrementIScanner();
		incIScanner.addActionListener(iScannerListener);

		decIScanner = new JButton("-");
		ActionListener iScannerListener2 = new DecrementIScanner();
		decIScanner.addActionListener(iScannerListener2);

		incFitnessBuddy = new JButton("+");
		ActionListener fitnessBuddyListener = new IncrementFitnessBuddy();
		incFitnessBuddy.addActionListener(fitnessBuddyListener);

		decFitnessBuddy = new JButton("-");
		ActionListener fitnessBuddyListener2 = new DecrementFitnessBuddy();
		decFitnessBuddy.addActionListener(fitnessBuddyListener2);

		incFacetune = new JButton("+");
		ActionListener facetuneListener = new IncrementFacetune();
		incFacetune.addActionListener(facetuneListener);

		decFacetune = new JButton("-");
		ActionListener facetuneListener2 = new DecrementFacetune();
		decFacetune.addActionListener(facetuneListener2);

		incScreenDimmer = new JButton("+");
		ActionListener screenDimmerListener = new IncrementScreenDimmer();
		incScreenDimmer.addActionListener(screenDimmerListener);

		decScreenDimmer = new JButton("-");
		ActionListener screenDimmerListener2 = new DecrementScreenDimmer();
		decScreenDimmer.addActionListener(screenDimmerListener2);

		incMusicPro = new JButton("+");
		ActionListener MusicProListener = new IncrementMusicPro();
		incMusicPro.addActionListener(MusicProListener);

		decMusicPro = new JButton("-");
		ActionListener MusicProListener2 = new DecrementMusicPro();
		decMusicPro.addActionListener(MusicProListener2);


		addTo = new JButton("Add");
		ActionListener stockReduction = new AddToCartListener();
		addTo.addActionListener(stockReduction);

		addCart = new JButton("Add");
		ActionListener gtaStock = new GtaCartListener();
		addCart.addActionListener(gtaStock);

		whatsappCart = new JButton("Add");
		ActionListener whatsappStock = new WhatsappCartListener();
		whatsappCart.addActionListener(whatsappStock);

		wolframCart = new JButton("Add");
		ActionListener wolframStock = new WolframCartListener();
		wolframCart.addActionListener(wolframStock);

		netflixCart = new JButton("Add");
		ActionListener netflixStock = new NetflixCartListener();
		netflixCart.addActionListener(netflixStock);

		touchnoteCart = new JButton("Add");
		ActionListener touchnoteStock = new TouchnoteCartListener();
		touchnoteCart.addActionListener(touchnoteStock);

		uberCart = new JButton("Add");
		ActionListener uberStock = new UberCartListener();
		uberCart.addActionListener(uberStock);

		iScannerCart = new JButton("Add");
		ActionListener iScannerStock = new IScannerCartListener();
		iScannerCart.addActionListener(iScannerStock);

		fitnessBuddyCart = new JButton("Add");
		ActionListener fitnessBuddyStock = new FitnessBuddyCartListener();
		fitnessBuddyCart.addActionListener(fitnessBuddyStock);

		facetuneCart = new JButton("Add");
		ActionListener facetuneStock = new FacetuneCartListener();
		facetuneCart.addActionListener(facetuneStock);

		screenDimmerCart = new JButton("Add");
		ActionListener screenDimmerStock = new ScreenDimmerCartListener();
		screenDimmerCart.addActionListener(screenDimmerStock);

		musicProCart = new JButton("Add");
		ActionListener musicProStock = new MusicProCartListener();
		musicProCart.addActionListener(musicProStock);


		proceed = new JButton("Proceed");
		proceed.setLayout(new BorderLayout());
		add(proceed, BorderLayout.SOUTH);
		ActionListener display = new CartDisplay();
		proceed.addActionListener(display);
	}

	private void createPanel()
	{
		JPanel panel = new JPanel(new GridLayout(12,12,14,14)); // 12 by 12 & 14 by 14 pixel gap
		panel.setBackground(new Color(215,215,235));
		panel.add(candyImage);
		panel.add(candyCrush);
		panel.add(quantity);
		panel.add(candyStockLabel);
		panel.add(candyStockField);
		panel.add(incCandy);
		panel.add(decCandy);
		panel.add(priceLabel);
		panel.add(adding);
		panel.add(addTo);
		panel.add(error);
		panel.add(gtaImageLabel);
		panel.add(gta);
		panel.add(gtaQuantity);
		panel.add(gtaStockLabel);
		panel.add(gtaStockField);
		panel.add(incGta);
		panel.add(decGta);
		panel.add(gtaPriceLabel);
		panel.add(gtaAdding);
		panel.add(addCart);
		panel.add(gtaError);
		gtaError.setVisible(false);
		panel.add(whatsappImageLabel);
		panel.add(whatsapp);
		panel.add(whatsappQuantity);
		panel.add(whatsappStockLabel);
		panel.add(whatsappStockField);
		panel.add(incWhatsapp);
		panel.add(decWhatsapp);
		panel.add(whatsappPriceLabel);
		panel.add(whatsappAdding);
		panel.add(whatsappCart);
		whatsappError.setVisible(false);
		panel.add(whatsappError);
		panel.add(uberImageLabel);
		panel.add(uberLabel);
		panel.add(uberQuantity);
		panel.add(uberStockLabel);
		panel.add(uberStockField);
		panel.add(incUber);
		panel.add(decUber);
		panel.add(uberPriceLabel);
		panel.add(uberAdding);
		panel.add(uberCart);
		uberError.setVisible(false);
		panel.add(uberError);
		panel.add(wolframImageLabel);
		panel.add(wolframLabel);
		panel.add(wolframQuantity);
		panel.add(wolframStockLabel);
		panel.add(wolframStockField);
		panel.add(incWolfram);
		panel.add(decWolfram);
		panel.add(wolframPriceLabel);
		panel.add(wolframAdding);
		panel.add(wolframCart);
		wolframError.setVisible(false);
		panel.add(wolframError);
		panel.add(iScannerImageLabel);
		panel.add(iScannerLabel);
		panel.add(iScannerQuantity);
		panel.add(iScannerStockLabel);
		panel.add(iScannerStockField);
		panel.add(incIScanner);
		panel.add(decIScanner);
		panel.add(iScannerPriceLabel);
		panel.add(iScannerAdding);
		panel.add(iScannerCart);
		iScannerError.setVisible(false);
		panel.add(iScannerError);
		panel.add(facetuneImageLabel);
		panel.add(facetuneLabel);
		panel.add(facetuneQuantity);
		panel.add(facetuneStockLabel);
		panel.add(facetuneStockField);
		panel.add(incFacetune);
		panel.add(decFacetune);
		panel.add(facetunePriceLabel);
		panel.add(facetuneAdding);
		panel.add(facetuneCart);
		facetuneError.setVisible(false);
		panel.add(facetuneError);
		panel.add(fitnessBuddyImageLabel);
		panel.add(fitnessBuddyLabel);
		panel.add(fitnessBuddyQuantity);
		panel.add(fitnessBuddyStockLabel);
		panel.add(fitnessBuddyStockField);
		panel.add(incFitnessBuddy);
		panel.add(decFitnessBuddy);
		panel.add(fitnessBuddyPriceLabel);
		panel.add(fitnessBuddyAdding);
		panel.add(fitnessBuddyCart);
		fitnessBuddyError.setVisible(false);
		panel.add(fitnessBuddyError);
		panel.add(screenDimmerImageLabel);
		panel.add(screenDimmerLabel);
		panel.add(screenDimmerQuantity);
		panel.add(screenDimmerStockLabel);
		panel.add(screenDimmerStockField);
		panel.add(incScreenDimmer);
		panel.add(decScreenDimmer);
		panel.add(screenDimmerPriceLabel);
		panel.add(screenDimmerAdding);
		panel.add(screenDimmerCart);
		screenDimmerError.setVisible(false);
		panel.add(screenDimmerError);
		panel.add(netflixImageLabel);
		panel.add(netflixLabel);
		panel.add(netflixQuantity);
		panel.add(netflixStockLabel);
		panel.add(netflixStockField);
		panel.add(incNetflix);
		panel.add(decNetflix);
		panel.add(netflixPriceLabel);
		panel.add(netflixAdding);
		panel.add(netflixCart);
		netflixError.setVisible(false);
		panel.add(netflixError);
		panel.add(touchnoteImageLabel);
		panel.add(touchnoteLabel);
		panel.add(touchnoteQuantity);
		panel.add(touchnoteStockLabel);
		panel.add(touchnoteStockField);
		panel.add(incTouchnote);
		panel.add(decTouchnote);
		panel.add(touchnotePriceLabel);
		panel.add(touchnoteAdding);
		panel.add(touchnoteCart);
		touchnoteError.setVisible(false);
		panel.add(touchnoteError);
		panel.add(musicProImageLabel);
		panel.add(musicProLabel);
		panel.add(musicProQuantity);
		panel.add(musicProStockLabel);
		panel.add(musicProStockField);
		panel.add(incMusicPro);
		panel.add(decMusicPro);
		panel.add(musicProPriceLabel);
		panel.add(musicProAdding);
		panel.add(musicProCart);
		musicProError.setVisible(false);
		panel.add(musicProError);

		//Colouring Add cart Labels
		adding.setOpaque(true);
		adding.setBackground(new Color(32,178,170));
		gtaAdding.setOpaque(true);
		gtaAdding.setBackground(new Color(32,178,170,180));  //Color(int r, int g, int b, int alpha)
		whatsappAdding.setOpaque(true);
		whatsappAdding.setBackground(new Color(56,120,190));
		wolframAdding.setOpaque(true);
		wolframAdding.setBackground(new Color(32,128,150));
		netflixAdding.setOpaque(true);
		netflixAdding.setBackground(new Color(60,120,240));
		touchnoteAdding.setOpaque(true);
		touchnoteAdding.setBackground(new Color(70,140,210));
		uberAdding.setOpaque(true);
		uberAdding.setBackground(new Color(50,120,170,200));
		iScannerAdding.setOpaque(true);
		iScannerAdding.setBackground(new Color(210,210,210));
		fitnessBuddyAdding.setOpaque(true);
		fitnessBuddyAdding.setBackground(new Color(30,210,70));
		facetuneAdding.setOpaque(true);
		facetuneAdding.setBackground(new Color(95,185,205));
		screenDimmerAdding.setOpaque(true);
		screenDimmerAdding.setBackground(new Color(165,165,240));
		musicProAdding.setOpaque(true);
		musicProAdding.setBackground(new Color(70,150,75));
		add(panel);
	}

	public static void main(String [] args)
	{
		AppStorm frame = new AppStorm();
		frame.setTitle("App-Storm");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}