package GameMarket;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MerniceService implements PlayerCheckService {

	@Override
	public boolean validate(Player player) {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		boolean result = true;
		try {
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(player.getNationalityId()),
					player.getFirstName().toUpperCase(), player.getLastName().toUpperCase(), player.getDateOfBirth());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;

	}

}
