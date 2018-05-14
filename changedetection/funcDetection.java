import com.sun.deploy.util.StringUtils;

public class funcDetection {

  public static String difference(String str1, String str2) {
    if (str1 == null && str2 == null) {
      return "";
    }

    if (str2 == null){
      return str1;
    }

    int changeIndex = indexOfDifference(str1, str2);

    if (changeIndex == -1){
      return "";
    }

    return str2.substring(changeIndex);

  }

  public static int indexOfDifference(String str1, String str2){
    if (str1.equals(str2)){
      return -1;
    }
    if (str1 == null || str2 == null){
      return 0;
    }

    int i;
    for (i = 0; i < str1.length() && i < str2.length(); i++){
      if (str1.charAt(i) != str2.charAt(i)){
        return i;
      }
    }
    return -1;
  }

    /**
     *
     * @param origin
     * @param current
     */
  public static void detectFunction(String origin, String current) {
    String diff = difference(origin, current);
      
  }

  public static void main(String[] args) {

  }
}
