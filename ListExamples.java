import java.util.ArrayList;
import java.util.List;

interface StringChecker { boolean checkString(String s); }

class ListExamples {

  // Returns a new list that has all the elements of the input list for which
  // the StringChecker returns true, and not the elements that return false, in
  // the same order they appeared in the input list;
  static List<String> filter(List<String> list, StringChecker sc) {
    List<String> result = new ArrayList<>();
    for(String s: list) {
      if(sc.checkString(s)) {
        result.add(0, s);
        // correct result.add(s);
      }
    }
    return result;
  }


  // Takes two sorted list of strings (so "a" appears before "b" and so on),
  // and return a new list that has all the strings in both list in sorted order.
  static List<String> merge(List<String> list1, List<String> list2) {
    List<String> result = new ArrayList<>();
    int index1 = 0, index2 = 0;
    while(index1 < list1.size() && index2 < list2.size()) {
      if(list1.get(index1).compareTo(list2.get(index2)) < 0) {
        result.add(list1.get(index1));
        index1 += 1;
      }
      else {
        result.add(list2.get(index2));
        index2 += 1;
      }
    }
    while(index1 < list1.size()) {
      result.add(list1.get(index1));
      index1 += 1;
      
    }
    
    while(index2 < list2.size()) {
      result.add(list2.get(index2));
      index1 += 1;
      // correct index2 += 1;
    }
    return result;
  }
  public static void main(String[] args) {
    List<String> strList = new ArrayList<>();
    StringChecker y = new ListTests();
    strList.add("howard");
    strList.add("bob");
    strList.add("apple");
    strList.add("red");
    strList.add("asshoe");
    List<String> actual = ListExamples.filter(strList, y);
    Object[] x = actual.toArray();
    for (int i = 0; i < x.length; i++) {
      System.out.println(x[i]);
    }
    // List<String> strList1 = new ArrayList<>();
    // List<String> strList2 = new ArrayList<>();
    // strList1.add("bob");
    // strList1.add("howard");
    // strList2.add("apple");
    // strList2.add("red");
    // List<String> actual = ListExamples.merge(strList1, strList2);
    // Object[] x = actual.toArray();
    // for (int i = 0; i < x.length; i++) {
    //   System.out.println(x[i]);
    // }
  }

}