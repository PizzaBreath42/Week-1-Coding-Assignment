public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double itemPrice = 3.25;
		String itemName = "Banana";
		
		double amountOfMoneyInWallet = 33.46;
		boolean isMoneyCash = true;
		
		int numberOfFriends = 58;
		boolean areAllFriendsBoys = false;
		
		int ageInYears = 29;
		int ageInWeeks = ageInYears*52;
		
		String firstName = "Sergio";
		char middleInitial = 'J';
		String lastName = "Munoz";
		
		// Now for performing operations
		
		double newAmountOfMoneyInWalletAfterBuyingItem = amountOfMoneyInWallet-itemPrice;
		
		//Number of friends you've made each year based on your age variable and your number of friends variable
		
		int numberOfFriendsMadeEachYear = numberOfFriends/ageInYears;
		
		//Full name based on first name, middle initial, and last name
		
		String fullName = firstName + " " + middleInitial + " " + lastName;
		
		System.out.println("A new item is on sale, a "+itemName+" costs $"+itemPrice+".");
		System.out.println("Luckily I have $"+amountOfMoneyInWallet+" in my wallet.");
		System.out.println("Is it true that the money in my wallet is cash? Let's ask this program? "+isMoneyCash);
		System.out.println("Currently I have "+numberOfFriends+" friends.");
		System.out.println("Hey program, are all my friends boys? "+areAllFriendsBoys);
		System.out.println("This January, I've turned "+ageInYears+" years old.");
		System.out.println("It sounds a lot older if I convert that to weeks. Geez, that would be "+ageInWeeks+" weeks old!");
		System.out.println("People ask my name, I tell them, first name, "+firstName+", middle initial, "+middleInitial+". and last name, "+lastName+"!!!");
		
		System.out.println("So I went to the store to buy a "+itemName+" and now I only have $"+newAmountOfMoneyInWalletAfterBuyingItem+".");
		System.out.println("Leaving the grocery store, I was thinking to myself the average nuber of friends I've made a year. After some thinking I've made "+numberOfFriendsMadeEachYear+" friends a year on average!");
		System.out.println("I suppose that's just the life of Mr. "+fullName+".");
		}
	
}
