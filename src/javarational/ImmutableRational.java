/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarational;

/**
 *
 * @author lauren
 */
public class ImmutableRational {
    private int numerator;
    private int denominator;
  
    //default constrctor
public ImmutableRational()
{
    numerator = 0;
    denominator = 1;
}    
public ImmutableRational(int numerator )
{
    this.numerator = numerator;
    denominator = 1;
}
public ImmutableRational(int numerator , int denominator )
{
	this.numerator = numerator;
        if(denominator == 0)
        {
            throw new IllegalArgumentException();
        }
	this.denominator = denominator;
	Reduce();
}


public ImmutableRational Multiply(ImmutableRational rValue)
{
    ImmutableRational result = new ImmutableRational();
    
    result.denominator= this.denominator * rValue.denominator;
    result.numerator = this.numerator * rValue.numerator;
    result.Reduce();
    return result;
    	
}
public ImmutableRational Multiply(int rValue)
{
    int tempNum = this.numerator * rValue;
    ImmutableRational result = new ImmutableRational(tempNum,this.denominator);
    return result;
    	
}

public ImmutableRational Add(ImmutableRational rValue)
{
    int resultDenom = LCM(this.denominator,rValue.denominator);
    int resultNum = (this.numerator * (resultDenom / this.denominator)) +(rValue.numerator *(resultDenom/ rValue.denominator));
    ImmutableRational result = new ImmutableRational(resultNum,resultDenom);
    return result; 
    

}
public ImmutableRational Add(int rValue)
{
    int resultNum = (this.numerator  + (rValue * this.denominator));
    ImmutableRational result = new ImmutableRational(resultNum,this.denominator);
    return result; 
    

}

public ImmutableRational Sub(ImmutableRational rValue)
{
    int resultDenom = LCM(this.denominator,rValue.denominator);
    int resultNum = (this.numerator * (resultDenom / this.denominator)) - (rValue.numerator *(resultDenom/ rValue.denominator));
    ImmutableRational result = new ImmutableRational(resultNum,resultDenom);
    return result;
    
}

public ImmutableRational Sub(int rValue)
{
    int resultNum = (this.numerator  - (rValue * this.denominator));
    ImmutableRational result = new ImmutableRational(resultNum,this.denominator);
    return result;
}

public ImmutableRational Div(ImmutableRational rValue)
{
    if(rValue.denominator == 0 )
    {
        throw new IllegalArgumentException();
    }
       
    int resultNum = (this.numerator * rValue.denominator);
    int resultDenom = (this.denominator * rValue.numerator);
    ImmutableRational result = new ImmutableRational(resultNum,resultDenom);
   
    return result;
}

public ImmutableRational Div(int rValue)
{
    if(rValue ==0 )
    {
        throw new IllegalArgumentException();
    }
    
    int resultDenom =(this.denominator * rValue);
    ImmutableRational result = new ImmutableRational(this.numerator,resultDenom);
   
    return result;
}

@Override
public String toString()
{
    String result = numerator + "/" + denominator;
    
     return result;
}
private int GreatestCommonDivisor(int x, int y) 
{
	int remainder = x % y;
	while (remainder != 0)
	{
		x = y;
		y = remainder;
		remainder = x % y;
	}
	return y;
}

private void Reduce() 
    {
       int GCD = GreatestCommonDivisor(numerator, denominator);
	numerator = numerator / GCD;
	denominator = denominator / GCD;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


private int LCM(int  x, int y)
{
	Boolean Continue = true;
	int result = x;
	while (result % y != 0)
	{
		result += x;
	}
	return result;
}


public boolean equals(ImmutableRational rValue)
{
   
    return rValue.numerator == this.numerator && rValue.denominator == this.denominator;
}

}