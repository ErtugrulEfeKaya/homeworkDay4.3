package GameMarket;

public class PlayerManager implements PlayerService {

	PlayerCheckService playerCheckService;

	public PlayerManager(PlayerCheckService playerCheckService) {
		this.playerCheckService = playerCheckService;
	}

	@Override
	public void add(Player player) {
		if (playerCheckService.validate(player)) {
			System.out.println("Oyuncu Sisteme Baþarýyla Kayýt Oldu!!");
			System.out.println("Hoþgeldiniz : " + player.getFirstName()+" "+player.getLastName());
			System.out.println("------------------------------------------------------");
		} else {
			System.out.println("Lütfen Bilgilerinizi Kontrol Ediniz. " + player.firstName +" "+player.getLastName());
		}

	}

	@Override
	public void delete(Player player) {
		System.out.println("Kullanýcý bilgileri baþarýlý bir þekilde silindi: " + player.getFirstName()+" "+player.getLastName());

	}

	@Override
	public void update(Player player) {
		System.out.println("Kullanýcý bilgileri baþarýlý bir þekilde güncellendi: " + player.getFirstName()+" "+player.getLastName());

	}

}
