package GameMarket;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya sisteme eklendi: " + campaign.getName());
		System.out.println("Kampanyadan kazandýðýnýz indirim: %" + campaign.getDiscount());
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya bitti " + campaign.getName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya güncellendi: " + campaign.getName() + ": %" + campaign.getDiscount());
		
	}

}
