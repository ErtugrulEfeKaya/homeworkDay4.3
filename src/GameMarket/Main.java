package GameMarket;

public class Main {

	public static void main(String[] args) {
		Player player = new Player(1, "Ertuðrul Efe", "Kaya", "29035547724", 2001);
		Player player2 = new Player(2, "Zeynep", "Kaya", "15151515151", 2006);
		Player player3 = new Player(3, "Engin", "Demiroð", "10101010101", 1992);
		
		Game game = new Game(1, "Battlefield V", 420);
		Game game2 = new Game(2, "Cyberpunk 2077", 250);
		Game game3 = new Game(3, "Yakuza Kiwami 2 ", 105);
		Game game4 = new Game(4,"God of War: Ragnarök", 800);
		Game game5 = new Game(5,"Far Cry 6",700);

		Campaign campaign = new Campaign(1, "Hoþgeldin Ýndirimi", 10);
		Campaign campaign2 = new Campaign(2, "Nisan Fýrsatlarý", 35);
		Campaign campaign3 = new Campaign(3, "Play at Home", 60);
		Campaign campaign4 = new Campaign(4, "Altýn Hafta", 25);
		
		
		PlayerManager playerManager = new PlayerManager(new MerniceService());
		playerManager.add(player);
		
		GameManager gameManager = new GameManager();
		System.out.println("OYUNLAR");
		gameManager.add(game);
		gameManager.add(game2);
		gameManager.add(game3);
		gameManager.add(game4);
		gameManager.add(game5);
		System.out.println("------------------------------------------------------");
		
		CampaignManager campaignManager = new CampaignManager();
		System.out.println("KAMPANYALAR");
		campaignManager.add(campaign);
		campaignManager.add(campaign2);
		campaignManager.delete(campaign2);
		campaignManager.add(campaign3);
		campaignManager.add(campaign4);
		campaignManager.update(campaign4);
		System.out.println("------------------------------------------------------");
		
		OrderManager orderManager = new OrderManager();
		orderManager.buyWithDiscountedPrice(player, game2, campaign3);
		orderManager.buyWithDiscountedPrice(player, game4, campaign3);
		
		System.out.println("------------------------------------------------------");
		
		playerManager.add(player3);
		System.out.println("OYUNLAR");
		gameManager.add(game);
		gameManager.delete(game2);
		gameManager.add(game3);
		gameManager.add(game4);
		gameManager.add(game5);
		System.out.println("------------------------------------------------------");
		
		System.out.println("KAMPANYALAR");
		campaignManager.add(campaign);
		campaignManager.add(campaign2);
		campaignManager.delete(campaign2);
		campaignManager.add(campaign3);
		System.out.println("------------------------------------------------------");
		
		orderManager.buy(player3, game5);
		System.out.println("------------------------------------------------------");

		playerManager.add(player2);
		playerManager.delete(player2);
		System.out.println("------------------------------------------------------");
	}
	}


