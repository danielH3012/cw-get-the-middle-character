class Kata {
  public static String getMiddle(String word) {
    //Code goes here!
    int panjang = word.length();
    if(panjang % 2 == 1){
          panjang = (panjang - 1)/2;
      char ch = word.charAt(panjang);
      String a = String.valueOf(ch);
     return a;
    }else{
      char a = word.charAt(panjang/2 -1);
      char b = word.charAt(panjang/2);
      String s = String.valueOf(a) + String.valueOf(b);
      return s;
    }
  }
}
