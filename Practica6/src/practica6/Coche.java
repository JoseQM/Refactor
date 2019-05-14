package practica6;

public class Coche
{
	String matricula;
	String atrib;
	String modelo;
	String fabricante;
	
	
	public Coche()
	{
		matricula = "";
		atrib = "";
		modelo = "";
		fabricante = "";
	}
	
	
	public Coche(String m, String c, String mo, String f)
	{
		matricula = m;
		atrib = c;
		modelo = mo;
		fabricante = f;
	}
	
	
	public String metodo1()
	{
		String resultado = "";
		
		if (atrib == "Gasolina")
		{
			resultado += "El coche con matricula " + matricula + " ";
			resultado += metodoA(modelo, fabricante);
		}
		else if (atrib == "Diesel")
		{
			resultado += "El coche con matricula " + matricula + " ";
			resultado += metodoB(modelo, fabricante);
		}
		else if (atrib == "Híbrido")
		{
			resultado += "El coche con matricula " + matricula + " ";
			resultado += metodoC(modelo, fabricante);
		}
		else
		{
			resultado += "El coche con matricula " + matricula + " ";
			resultado += "no dispone de información";
		}
		return resultado;
	}
	
	
	public String metodoA(String producer, String model)
	{
		String resultado = "Es un " + producer + " " + model + " y gasta 1,337 euros por litro.";
		return resultado;
	}
	
	
	public String metodoB(String producer, String model)
	{
		String resultado = "Es un " + producer + " " + model + " y gasta 1,052 euros por litro.";
		return resultado;
	}
	
	
	public String metodoC(String producer, String model)
	{
		String resultado = "Es un " + producer + " " + model + " y no necesita combustible.";
		return resultado;
	}
}