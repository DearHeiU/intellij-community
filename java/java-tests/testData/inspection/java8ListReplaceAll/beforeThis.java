// "Replace the loop with 'List.replaceAll'" "true"
import java.util.ArrayList;
import java.util.List;

class Main extends ArrayList<String> {
  void modifyStrings(List<String> strings) {
    for (int i = 0; i < this.size(); i++)<caret> {
      this.set(i, modifyString(this.get(i)));
    }
  }

  static String modifyString(String str) {
    return str.repeat(2);
  }
}