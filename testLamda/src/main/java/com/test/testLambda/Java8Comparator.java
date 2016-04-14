package com.test.testLambda;

import java.util.Comparator;

/**
 * Hello world!
 *
 */
public class Java8Comparator 
{
    public static void main( String[] args )
    {
    	//Classic
        Comparator<Object> comparator = new Comparator<Object>() {
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				return 0;
			}
        };
        
        //Lambda
        Comparator<Object> comparatorLambda = (Object o1, Object o2)->o1.toString().compareTo(o2.toString());
    }
}
