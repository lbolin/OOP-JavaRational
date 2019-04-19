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
public class MutableRational {
    private int numerator;
    private int denominator;
  
    //default constrctor
public MutableRational()
{
    numerator = 0;
    denominator = 1;
}    
public MutableRational(int numerator )
{
    this.numerator = numerator;
    denominator = 1;
}
public MutableRational(int numerator , int denominator )
{
	this.numerator = numerator;
        if(denominator == 0)
        {
            throw new IllegalArgumentException();
        }
	this.denominator = denominator;
	Reduce();
}


public void Multiply(MutableRational rValue)
{
    //MutableRational result = new MutableRational();
    
    this.denominator= this.denominator * rValue.denominator;
    this.numerator = this.numerator * rValue.numerator;
    Reduce();

}

public void Multiply(int rValue)
{
    numerator = this.numerator * rValue;
}
public void Add(MutableRational rValue)
{
    
    denominator = LCM(this.denominator,rValue.denominator);
    numerator = (this.numerator * (denominator/this.denominator)) +(rValue.numerator * (denominator / rValue.denominator));
}

public void Add(int rValue)
{
    numerator = (this.numerator  + (rValue * this.denominator));
   

}


public void Sub(MutableRational rValue)
{
    int resultDenom = LCM(this.denominator,rValue.denominator);
    int resultNum = (this.numerator * (resultDenom / this.denominator)) - (rValue.numerator *(resultDenom/ rValue.denominator));
    MutableRational result = new MutableRational(resultNum,resultDenom);
}

public void Sub(int rValue)
{
    numerator = (this.numerator  - (rValue * this.denominator));
}

public void Div(MutableRational rValue)
{
    if(rValue.denominator == 0)
    {
        throw new IllegalArgumentException();
    }
    numerator = (this.numerator * rValue.denominator);
    denominator =(this.denominator * rValue.numerator);
    
}

public void Div(int rValue)
{
    if(rValue ==0 )
    {
        throw new IllegalArgumentException();
    }
    
    denominator =(this.denominator * rValue);
   
}

@Override
public String toString()
{
    String result = numerator + "/" + denominator;
    
     return result;
}
public void Set(MutableRational rValue)
{
  numerator = rValue.numerator;
  denominator = rValue.denominator;
    
}
public void Set(int rValue)
{
  numerator = rValue;
  denominator = 1;
    
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

private void Reduce() {
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

}
