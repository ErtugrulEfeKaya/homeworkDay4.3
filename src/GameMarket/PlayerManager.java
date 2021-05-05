package GameMarket;

public class PlayerManager implements PlayerService {

	PlayerCheckService playerCheckService;

	public PlayerManager(PlayerCheckService playerCheckService) {
		this.playerCheckService = playerCheckService;
	}

	@Override
	public void add(Player player) {
		if (playerCheckService.validate(player)) {
			System.out.println("Oyuncu Sisteme Ba�ar�yla Kay�t Oldu!!");
			System.out.println("Ho�geldiniz : " + player.getFirstName()+" "+player.getLastName());
			System.out.println("------------------------------------------------------");
		} else {
			System.out.println("L�tfen Bilgilerinizi Kontrol Ediniz. " + player.firstName +" "+player.getLastName());
		}

	}

	@Override
	public void delete(Player player) {
		System.out.println("Kullan�c� bilgileri ba�ar�l� bir �ekilde silindi: " + player.getFirstName()+" "+player.getLastName());

	}

	@Override
	public void update(Player player) {
		System.out.println("Kullan�c� bilgileri ba�ar�l� bir �ekilde g�ncellendi: " + player.getFirstName()+" "+player.getLastName());

	}

}
