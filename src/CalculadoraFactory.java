
public class CalculadoraFactory {

	public Calculadora getCalculadora(int Num)
	{
		if(Num==1)
			return new ControladorCalculadora();
		else
			return new CalculadoraHDT2();
	}

}
