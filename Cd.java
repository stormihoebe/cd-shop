
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Cd {
  public String mArtistName;
  public String mAlbumName;
  public int mYear;
  public String mGenre;
  public Double mPrice;

  public Cd(String artistName, String albumName, int year, String genre, double price ){
    mArtistName = artistName;
    mAlbumName = albumName;
    mYear = year;
    mGenre = genre;
    mPrice = price;
  }


List couponList = Arrays.asList("COUPON10", "COUPON25", "COUPON50");



public Double Valid(String coupon){
  Double returnDouble = 0.00;
  if(couponList.contains(coupon)){
    if( coupon.equals("COUPON10")){
      returnDouble = 1 - .10;
    } else if ( coupon.equals("COUPON25")){
      returnDouble = 1-.25;
    } else if( coupon.equals("COUPON50")){
      returnDouble = 1-0.50;
    };
  } else {
    returnDouble = 0.00;
  }
  return returnDouble;
}
}
