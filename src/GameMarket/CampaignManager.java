package GameMarket;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya sisteme eklendi: " + campaign.getName());
		System.out.println("Kampanyadan kazand���n�z indirim: %" + campaign.getDiscount());
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya bitti " + campaign.getName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya g�ncellendi: " + campaign.getName() + ": %" + campaign.getDiscount());
		
	}

}
