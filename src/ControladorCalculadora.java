/**
 * 
 */

/**
 * @author Edwin Coronado
 *
 */
public class ControladorCalculadora implements Calculadora {

	
	private String cadena;
	private int resultado;
	Stack<Character> miStack = new StackVector<Character>();
	
	public ControladorCalculadora()
	{
		cadena="";
		resultado=0;
	}
	
	@Override
	public void setString(String archivo) {
		// TODO Auto-generated method stub
		cadena=archivo;
		
	}

	@Override
	public void meterVector() {
		// TODO Auto-generated method stub
		for(int i=(cadena.length()-1);i>=0;i--)
		{
			miStack.push(cadena.charAt(i));
		}
		/*System.out.println(miStack.pop());
		System.out.println(miStack.pop());
		System.out.println(miStack.pop());*/
	}

	@Override
	public boolean calcularVector() {
		
		int operando1=0;
		int operando2=0;
		int total=0;
		boolean bOperando=false;//Bandera que utilizo para saber si ya tengo 2 operandos para la operacion
		int lCadena=cadena.length()-1;
		char caracter=0;
		boolean bandera=true;//Sirve para saber que se hagan los ifs
		/*try
		{*/
		//caracter=miStack.pop();
		caracter=miStack.peek();
		if(miStack.peek()<48||miStack.peek()>57)
		{
			bandera=false;
		}
		else
		{
			try
			{
				caracter=miStack.peek();
				
			if(miStack.peek()>=48&&miStack.peek()<=57)
			{
				caracter=miStack.pop();
				operando1=Character.getNumericValue(caracter);
				System.out.println(operando1);
				lCadena-=1;
				while(bandera==true&&lCadena>=0)
				{
						/*try
						{*/
							if(miStack.peek()==32)
							{
								caracter=miStack.pop();
								lCadena-=1;
								if(miStack.peek()>=48&&miStack.peek()<=57&&bOperando==false)
								{
									caracter=miStack.pop();
									operando2=Character.getNumericValue(caracter);
									System.out.println(operando2);
									lCadena-=1;
									bOperando=true;
								}
								else if (miStack.peek()=='+'||miStack.peek()=='-'||miStack.peek()=='*'||miStack.peek()=='/'&&bOperando==true)
								{
									caracter=miStack.pop();
									System.out.println(caracter);
									lCadena-=1;
									bOperando=false;
									try
									{
										if(caracter=='+')
											operando1=operando1+operando2;
										if(caracter=='-')
											operando1=operando1-operando2;
										if(caracter=='*')
											operando1=operando1*operando2;
										if(caracter=='/')
											operando1=operando1/operando2;
									}
									catch(Exception e)
									{
										//System.out.println("Operacion invalida, revise el documento datos.txt");
										bandera=false;
									}
								}
								else if (miStack.peek()!='+'||miStack.peek()!='-'||miStack.peek()!='*'||miStack.peek()!='/')
								{
									bandera=false;
								}
								
							}
							else if(miStack.peek()!=32)
							{
								bandera=false;
								//System.out.println("El formato del texto esta incorrecto, revise el documeto datos.txt");
							}
							
						/*}
						catch (Exception e)
						{
							bandera=false;
						}*/
					System.out.println(total);
				}
			}
			}
			catch (Exception e)
			{
				bandera=false;
			}
		}
		/*}
		catch (Exception e)
		{
			bandera=false;
			System.out.println("pene");
		}*/
		resultado=operando1;	
		return bandera;
	}

	@Override
	public int getResultado() {
		// TODO Auto-generated method stub
		return resultado;
	}
	public int getStackS(){
		return miStack.size();
	}


}
