package test;
public class Motor {
	public int numerocilindros;
	public String tipo;
	public int registro;
	
	void cambiarRegistro (int registro) {
		this.registro = registro;
	}	
	void asignarTipo (String tipo) {
		if (tipo.equals("electrico") || tipo.equals("gasolina,")) {
		this.tipo = tipo;
		}
	}
	
}