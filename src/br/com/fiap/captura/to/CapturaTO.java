package br.com.fiap.captura.to;

import java.io.Serializable;


public class CapturaTO implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = 7994957754059175799L;
	private int temp, umidade, chuva;
	private String _id, devCode, dispositivo;

	public CapturaTO() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	

	public CapturaTO(int temp, int umidade, int chuva, String _id, String devCode, String dispositivo) {
		super();
		this.temp = temp;
		this.umidade = umidade;
		this.chuva = chuva;
		this._id = _id;
		this.devCode = devCode;
		this.dispositivo = dispositivo;
	}

	public CapturaTO(String _id, String devCode) {
		// TODO Auto-generated constructor stub
		this._id = _id;
		this.devCode = devCode;
	}

	/**
	 * @return the temperatura
	 */
	public int getTemp() {
		return temp;
	}

	/**
	 * @param temperatura
	 *            the temperatura to set
	 */
	public void setTemp(int temp) {
		this.temp = temp;
	}

	/**
	 * @return the umidade
	 */
	public int getUmidade() {
		return umidade;
	}

	/**
	 * @param umidade
	 *            the umidade to set
	 */
	public void setUmidade(int umidade) {
		this.umidade = umidade;
	}

	/**
	 * @return the chuva
	 */
	public int getChuva() {
		return chuva;
	}

	/**
	 * @param chuva
	 *            the chuva to set
	 */
	public void setChuva(int chuva) {
		this.chuva = chuva;
	}

	/**
	 * @return the _id
	 */
	public String get_id() {
		return _id;
	}

	/**
	 * @param _id
	 *            the _id to set
	 */
	public void set_id(String _id) {
		this._id = _id;
	}

	/**
	 * @return the devCode
	 */
	public String getDevCode() {
		return devCode;
	}

	/**
	 * @param devCode
	 *            the devCode to set
	 */
	public void setDevCode(String devCode) {
		this.devCode = devCode;
	}

	/**
	 * @return the dispositivo
	 */
	public String getDispositivo() {
		return dispositivo;
	}

	/**
	 * @param dispositivo
	 *            the dispositivo to set
	 */
	public void setDispositivo(String dispositivo) {
		this.dispositivo = dispositivo;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getDispositivo() + " " + get_id() + " " + getDevCode() + " " + getTemp() + " " + getChuva() + " "
				+ getUmidade();
	}

}
