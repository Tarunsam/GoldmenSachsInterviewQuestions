package com.gs.ownpractice;
import java.util.*;
import java.util.stream.*;

class Dictionary {
  private String[] entries;

  public Dictionary(String[] entries) {
    this.entries = entries;
  }
  
  public String[] getEntries()
  {
    return this.entries;
  }

  public boolean contains(String word) {
    return Arrays.asList(entries).contains(word);
  }
}

public class DictonaryCode {
  public static Set<String> longestWord(String letters, Dictionary dict) {
    Set<String> result = new HashSet<String>();
    HashMap<String,ArrayList<String>> mapOfWords=new HashMap<String,ArrayList<String>>();
    
    String[] allDictWords=dict.getEntries();
    
    for(int i=0;i<allDictWords.length;i++)
    {
     String tempWord=allDictWords[i];
     String distinctWord=tempWord.charAt(0)+"";
     for(int j=1;j<tempWord.length();j++)
     {
       if(!distinctWord.contains(""+tempWord.charAt(j)))
       {
         distinctWord+=tempWord.charAt(j);
       }
     }
      char[] distArr=distinctWord.toCharArray();
      Arrays.sort(distArr);
      String key=new String(distArr);
      
     // System.out.println("Key is : "+key);
      
      if(mapOfWords.containsKey(key))
      {
        ArrayList<String> listTemp=mapOfWords.get(key);
        listTemp.add(tempWord);
        listTemp.sort(Comparator.comparing(String::length).reversed());
        mapOfWords.put(key,listTemp);
      }
      else
      {
        ArrayList<String> listTemp=new ArrayList();
        listTemp.add(tempWord);
        mapOfWords.put(key,listTemp);
      }
    }
    
    mapOfWords.forEach((k,v) ->{
    	System.out.println("Key "+k +" Value "+v);
    });
    
    char[] newArr=letters.toCharArray();
    Arrays.sort(newArr);
//    if(mapOfWords.containsKey(new String(newArr)))
//    {
//      int length=mapOfWords.get(new String(newArr)).get(0).length();
//      int index=0;
//      while(index<mapOfWords.get(new String(newArr)).size()&&mapOfWords.get(new String(newArr)).get(index).length()==length)
//      {
//        result.add(mapOfWords.get(new String(newArr)).get(index));
//        index++;
//      }
//  //  result.addAll(mapOfWords.get(new String(newArr)));
//    }
    
    if(mapOfWords.containsKey(new String(newArr))) {
    	result.addAll(mapOfWords.get(new String(newArr)));
    }
    
    
   /* Iterator<String> iter=mapOfWords.keySet().iterator();
    
    while(iter.hasNext())
    {
     String key= iter.next();
    System.out.println("Key is : "+key+" : Value is : "+mapOfWords.get(key));
    }
  */
   /* if (dict.contains(letters)) {
      result.add(letters);
    }*/
    
    System.out.println(result);
    return result;
  }


  public static boolean pass() {
	  //Dictionary dict = new Dictionary(new String[]{"to", "toe", "toes", "doe", "dog", "godddd", "dogs", "banana"});
    Dictionary dict = new Dictionary(new String[]{"godddd", "dogs", "banana","dog"});
    boolean r = new HashSet<String>(Arrays.asList("dog","godddd")).equals(longestWord("god", dict));
    return r;
  }

  public static void main(String[] args) {
    if(pass()) {
      System.out.println("Pass");
    } else {
      System.err.println("Fails");
    }
  }
}