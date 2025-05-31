package br.edu.ufam.icomp.lab_encapsulamento;
import java.util.*;
public class Celular implements Localizavel{
	private int codPais ;
	private int codArea;
	private int numero;
	
	public Celular(int codPais, int codArea, int numero) {
		setCodPais(codPais);
		setCodArea(codArea);
		setNumero(numero);
	}
	
	//setter
	public final void setCodPais(int codPais) {
		if (codPais >= 1 && codPais <= 199 && codPais >0) {
            this.codPais = codPais;
        }else {
        	this.codPais = -1;
        }
	}
	
	//getter
	public int getCodPais() {
		return codPais;
	}
	
	public final void setCodArea(int codArea) {
		if (codArea >= 10 && codArea <= 99 && codArea > 0) {
            this.codArea= codArea;
        }else {
        	this.codArea = -1;
        }
	}
	
	//getter
	public int getCodArea() {
		return codArea;
	}
	
	public final void setNumero(int numero) {
		if (numero >= 10000000 && numero <= 999999999 && numero > 0) {
            this.numero= numero;
        }else {
        	this.numero = -1;
        }
	}
	
	//getter
	public int getNumero() {
		return numero;
	}
	
	
	
	public Posicao getPosicao() {
		double valorMinimo = -3.160000;
		double valorMaximo = -2.960000;
		Random r = new Random();
		double latitude = valorMinimo + (valorMaximo - valorMinimo) * r.nextDouble();
		double valorMin = -60.120000;
		double valorMax = -59.820000;
		double longitude = valorMin + (valorMax - valorMin) * r.nextDouble();
		double valorMini = 15.0;
		double valorMaxi = 100.0;
		double altitude = valorMini + (valorMaxi - valorMini) * r.nextDouble();
		Posicao pos = new Posicao(latitude, longitude, altitude);
		return pos;
	}
	
	public double getErroLocalizacao() {
		return 50.0;
	}
	
}




