package br.edu.ufam.icomp.lab_encapsulamento;
import java.util.*;

public class CarroLuxuoso  extends Carro implements Localizavel{
	
	public CarroLuxuoso(String placa) {
		super(placa);
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
		return 15.0;
	}
	
}




