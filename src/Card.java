
public class Card 
{
	private int rank;//An integer from 0 to 12
	private int suit;//An integer from 0 to 3
	
	//constructors
	public Card() 
	{
		this(0, 0);
	}
	
	public Card(int r, int s)
	{
		this.setRank(r);
		this.setSuit(s);
	}
	
	//private mutators
	private void setRank(int r)
	{
		if ( r >= 0 && r <= 12)
		{
		this.rank = r;
		}
	}
	
	private void setSuit(int s)
	{
		if (s >= 0 && s <= 3)
		this.suit = s;
	}
	
	//public accessors
	public int getRank()
	{
		return this.rank;
	}
	
	public int getSuit()
	{
		return this.suit;
	}
	
	//clone method
	public Card clone()
	{
		Card card = new Card();
		
		card.setRank(this.getRank());
		card.setSuit(this.getSuit());
		
		return card;
	}
	
	//equals method
	public boolean equals(Card guest)
	{
		if (this.rank == guest.rank && this.suit == guest.suit)
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
	
	//other methods
	public void displayCard()
	{
		System.out.println(this.toString());
	}
	
	public String toString()
	{
		String s = "nothing";
		String r = "nothing";
		
		//assign suit 0-3
		if (this.suit == 0)
		{
			s = "C";
		}
		
		else if (this.suit == 1)
		{
			s = "S";
		}
		
		else if (this.suit == 2)
		{
			s = "H";
		}
		
		else if (this.suit == 3)
		{
			s = "D";
		}
		
		
		
		//assign rank 0-12
		if (this.rank == 0)
		{
			r = "A";//Ace
		}
		
		else if (this.rank == 1)
		{
			r = "2";
		}
		
		else if (this.rank == 2)
		{
			r = "3";
		}
		
		else if (this.rank == 3)
		{
			r = "4";
		}
		
		else if (this.rank == 4)
		{
			r = "5";
		}
		
		else if (this.rank == 5)
		{
			r = "6";
		}
		
		else if (this.rank == 6)
		{
			r = "7";
		}
		
		else if (this.rank == 7)
		{
			r = "8";
		}
		
		else if (this.rank == 8)
		{
			r = "9";
		}
		
		else if (this.rank == 9)
		{
			r = "10";
		}
		
		else if (this.rank == 10)
		{
			r = "J";//Jack
		}
		
		else if (this.rank == 11)
		{
			r = "Q";//Queen
		}
		
		else if (this.rank == 12)
		{
			r = "K";//King
		}
		
		return r + " " + s;
	}
}
