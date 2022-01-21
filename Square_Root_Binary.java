package com.gs.ownpractice;
import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Square_Root_Binary {
  public static void main(String[] args) {
    float input=3;
    float start=0;
    float end=input;
    float mid=(end-start)/2.0f;
    float diff=(float)0.001;
    
    while(Math.abs((mid*mid)-input)>=diff)
    {
      if((mid*mid)>input)
      {
        end=mid;
      }
      else
      {
        start=mid;
      }
      mid=start+((end-start)/2.0f);
     // System.out.println(mid);
    }
    System.out.println("Sqrt is : "+mid);
  }
}
