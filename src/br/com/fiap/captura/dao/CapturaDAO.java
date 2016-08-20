package br.com.fiap.captura.dao;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import br.com.fiap.captura.to.CapturaTO;

public class CapturaDAO {
	
	static HashMap<String, CapturaTO> CapturaMap = getCapturaTOIdMap();
	
	public CapturaDAO(){
		super();
		
		if(CapturaMap == null){
			CapturaMap = new HashMap<String, CapturaTO>();
			CapturaTO cap = new CapturaTO(22, 20, 20, "9999", "1", "meuDispositivo");
			CapturaMap.put("9999", cap);
		}
	}
	public List<CapturaTO> getAllCapturas(){
		List<CapturaTO> capturas = new ArrayList<CapturaTO>(CapturaMap.values());
		return capturas;
	}
	public CapturaTO getCapturaTO(String id){
		CapturaTO CapturaTO = CapturaMap.get(id);
		return CapturaTO;
	}
	
	public CapturaTO addCapturaTO(CapturaTO CapturaTO){
		CapturaTO.set_id(Integer.toString(CapturaMap.size() + 1));
		CapturaMap.put(CapturaTO.get_id(), CapturaTO);
		return CapturaTO;
	}
	public CapturaTO updateCapturaTO(CapturaTO CapturaTO){
		System.out.println(CapturaTO.toString());
		if(Integer.parseInt(CapturaTO.get_id()) <= 0)
			return null;
			CapturaMap.put(CapturaTO.get_id(), CapturaTO);
			return CapturaTO;
		
	}
		
	public void deleteCapturaTO(String id){
		CapturaMap.remove(id);
	}
	public static HashMap<String, CapturaTO> getCapturaTOIdMap(){
		return CapturaMap;
	}
	
}
