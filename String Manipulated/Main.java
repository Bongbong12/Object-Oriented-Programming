public class Main {
  public static void main(String[] args) {
      String name = "NUGRAHA";
      int middleIndex = name.length() / 2;

      // Print the first pattern
      System.out.println("First Pattern:");
      for (int i = name.length() - 1; i >= 0; i--) {
          for (int j = 0; j <= i; j++) {
              System.out.print(name.charAt(j));
          }
          for (int k = 0; k < name.length() - i - 1; k++) {
              System.out.print("*");
          }
          System.out.println();
      }

      System.out.println(); // Add a blank line for separation

      // Print the second pattern
      System.out.println("Second Pattern:");
      for (int i = 0; i < name.length(); i++) {
          for (int j = 0; j < name.length(); j++) {
              if (j == i)
                  System.out.print(name.charAt(i));
              else
                  System.out.print("*");
          }
          System.out.println();
      }

      System.out.println(); // Add a blank line for separation

      // Print the third pattern
      System.out.println("Third Pattern:");
      for (int i = 0; i < name.length(); i++) {
          if (i == middleIndex) {
              System.out.println(name);
          } else {
              System.out.println("***" + name.charAt(i) + "***");
          }
      }
  }
}
