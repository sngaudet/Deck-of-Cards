
public class CardDriver 
{
	public static void main(String [] args)
	{
		Card [] myDeck = new Card [52];
		
		//initialize the deck to a proper deck
		initDeck(myDeck);
		
		//shuffle the deck 100 times
		shuffleDeck(myDeck, 100);
		
		//display Deck
		for (int i = 0; i < myDeck.length; ++i)
		{
		myDeck[i].displayCard();
		}

		
		//Find and display the Queen of Clubs (rank 11, suit 0)
		System.out.println("\nThe queen of clubs was found at location " + findCard(myDeck) );
	}
	
	public static int findCard(Card [] myDeck)
	{
		Card queenOfClubs = new Card(11, 0);
		
		for (int i = 0; i < myDeck.length; ++i)
		{
			if (myDeck[i].equals(queenOfClubs))
			{
				return i;
			}
		}
		
		return -1;
		
	}

	

	
	public static void shuffleDeck(Card [] deck, int n)
	{
		for (int i = 1;i < n; ++i)
		{
			int j = (int)(Math.random() * 52);
			int k = (int)(Math.random() * 52);
			
			Card temp = deck[j];
			
			
			deck [j] = deck [k];
			deck [k] = temp;
		}
	}
	
	public static void initDeck(Card [] myDeck)
	{
				//create clubs
				for (int i = 0; i <= 13; ++i)
				{
				myDeck[i] = new Card(i, 0);
				}
				
				//create Spades
				for (int i = 13; i <= 26; ++i)
				{
					myDeck[i] = new Card((i%13), 1);
				}
				
				//create Hearts
				for (int i = 26; i <= 39; ++i)
				{
					myDeck[i] = new Card((i%13), 2);
				}
				
				//create Diamonds
				for (int i = 39; i <= 51; ++i)
				{
					myDeck[i] = new Card((i%13), 3);
				}
	}
}
