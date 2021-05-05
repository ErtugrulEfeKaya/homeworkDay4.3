package GameMarket;

public class OrderManager implements OrderService {

	@Override
	public void buy(Player player, Game game) {

		System.out.println(player.getFirstName() + " " + game.getName() + " oyununu " + game.getUnitPrice()
				+ " TL'ye satýn aldý."+" Keyifli oyunlar :)");
	}

	@Override
	public void buyWithDiscountedPrice(Player player, Game game, Campaign campaign) {
		System.out.println(player.getFirstName() + " " + game.getName() + " oyununu " + campaign.getName()
				+ " kampanyasýyla %" + campaign.getDiscount() + " indirimle "
				+ (game.getUnitPrice() - ((game.getUnitPrice() * campaign.getDiscount()) / 100)) + "TL'ye satýn aldý."+" Keyifli oyunlar :)");

	}

}
