import java.util.ArrayList;
import java.util.List;
import java.io.Console;
import java.util.Scanner;

public class App{
  public static void main(String[] args) {
  Console myConsole = System.console();


  List<Cd> allCds = new ArrayList<Cd>();
  boolean programRunning = true;
    while(programRunning){
  System.out.println("---------------------------- \nEnter the number desired option:\n1. Create new CD entry\n2. View CD inventory \n3. Search inventory by artist \n4. Search by price \n5. Enter coupon code\n6. To leave\n --------------------");
  String response = myConsole.readLine();

  if(response.equals("1")){
    System.out.println("Enter CD Details");
    System.out.println("Enter Artist/Band Name");
    String newArtist = myConsole.readLine();

    System.out.println("Enter Album Name");
    String newAlbum = myConsole.readLine();

    System.out.println("Enter Year");
    String newYearString = myConsole.readLine();
    Integer newYear = Integer.parseInt(newYearString);

    System.out.println("Genre");
    String newGenre = myConsole.readLine();


    System.out.println("Enter Price");
    String newPriceString = myConsole.readLine();
    double newPrice = Double.parseDouble(newPriceString);

    Cd userCD = new Cd(newArtist, newAlbum, newYear, newGenre, newPrice);
    allCds.add(userCD);

    for (Cd individualCd : allCds){
      System.out.println("________________");
      System.out.println(individualCd.mArtistName);
      System.out.println(individualCd.mAlbumName);
      System.out.println(individualCd.mYear);
      System.out.println(individualCd.mGenre);
      System.out.println(individualCd.mPrice);

    }
  }

  else if (response.equals("2")){
    System.out.println("Current Inventory");
    for (Cd individualCd : allCds){
      System.out.println("________________");
      System.out.println(individualCd.mArtistName);
      System.out.println(individualCd.mAlbumName);
      System.out.println(individualCd.mYear);
      System.out.println(individualCd.mGenre);
      System.out.println(individualCd.mPrice);
    }

  }
  else if (response.equals("3")){
    System.out.println("To search by artist enter name:");
    String nameSearch = myConsole.readLine();
    for (Cd individualCd : allCds){
      if(individualCd.mArtistName.equals(nameSearch)){
        System.out.println("________________");
        System.out.println(individualCd.mArtistName);
        System.out.println(individualCd.mAlbumName);
        System.out.println(individualCd.mYear);
        System.out.println(individualCd.mGenre);
        System.out.println(individualCd.mPrice);
      }
      else System.out.println("Oops, couldn't find it here. Try Tower Records");
    }
  }
  else if (response.equals("4")){
    System.out.println("To search by price enter maximum price:");
    Scanner scan = new Scanner(System.in);
    // Double priceSearch = myConsole.readD();
     Double priceSearch = scan.nextDouble();
      for (Cd individualCd : allCds){
      if(individualCd.mPrice <= priceSearch){
        System.out.println("________________");
        System.out.println(individualCd.mArtistName);
        System.out.println(individualCd.mAlbumName);
        System.out.println(individualCd.mYear);
        System.out.println(individualCd.mGenre);
        System.out.println(individualCd.mPrice);
      }
        else {System.out.println("Oops, couldn't locate an item for that price. Don't skimp, these are The Greatest CD's. Everyone loves them.");
      }
  }
}
  else if (response.equals("5")){
    System.out.println("Enter coupon code for discount:");
    String coupon = myConsole.readLine();


    for (Cd individualCd : allCds){
      Double discountCoupon = individualCd.Valid(coupon);
      if (discountCoupon == 0.00) {
        System.out.println("The coupon code you entered is no longer valid.");
      } else {
        System.out.println("________________");
        System.out.println(individualCd.mArtistName);
        System.out.println(individualCd.mAlbumName);
        System.out.println(individualCd.mYear);
        System.out.println(individualCd.mGenre);
        System.out.println(individualCd.mPrice*discountCoupon);
      }
    }
  }
  else if (response.equals("6")){
    System.out.println("goodbye");
    programRunning = false;
  }
  else {System.out.println("That was not a valid response. Try again");
  }
  }
}
}
