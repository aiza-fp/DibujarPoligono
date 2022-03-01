package base;

public class Poligono extends FiguraGeometrica {

	// Número de lados del polígono
	private int lados;
	private double longitudLado;

	public Poligono(String nombreAsignado) {
		super(nombreAsignado);
	}
	public double calcularArea() {
		double area = 0.0;
		if(lados > 2 && longitudLado > 0) {
			double a = longitudLado / (2.0*Math.tan(180/lados));
			area = calcularPerimetro()*a/2.0;
		}
		setArea(area);
		return area;
	}
	public double calcularPerimetro() {
		double perimetro = 0.0;
		if(lados > 0) {
			perimetro = lados * longitudLado;
		}
		setPerimetro(perimetro);
		return perimetro;
	}
	public int getLados() {
		return lados;
	}

	public void setLados(int lados) {
		this.lados = lados;
	}

	public double getLongitudLado() {
		return longitudLado;
	}

	public void setLongitudLado(double longitudLado) {
		this.longitudLado = longitudLado;
	}
	
}
