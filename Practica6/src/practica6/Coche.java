package practica6;

public class Coche
{
	private static final String COCHE_MATRICULA = "El coche con matricula ";
	
	String matricula;
	String combustible;
	String modelo;
	String fabricante;
	
	
	public Coche()
	{
		matricula = "";
		combustible = "";
		modelo = "";
		fabricante = "";
	}
	
	
	public Coche(String m, String c, String mo, String f)
	{
		matricula = m;
		combustible = c;
		modelo = mo;
		fabricante = f;
	}
	
	
	public String combustibleUsado()
	{
		String resultado = "";
		
		switch (combustible)
		{
		
			case "Gasolina":
				resultado += matriculaFraseCoche() + cocheGasolina(modelo, fabricante);
				break;
			
			case "Diesel":
				resultado += matriculaFraseCoche() + cocheDiesel(modelo, fabricante);
				break;
				
			case "Híbrido":
				resultado += matriculaFraseCoche() + cocheHibrido(modelo, fabricante);
				break;
			
			default:
				resultado += matriculaFraseCoche() + "no dispone de información";
				break;
		}
		return resultado;
	}


	public String matriculaFraseCoche()
	{
		return COCHE_MATRICULA + matricula + " ";
	}
	
	
	public String cocheGasolina(String producer, String model)
	{
		String resultado = "Es un " + producer + " " + model + " y gasta 1,337 euros por litro.";
		return resultado;
	}
	
	
	public String cocheDiesel(String producer, String model)
	{
		String resultado = "Es un " + producer + " " + model + " y gasta 1,052 euros por litro.";
		return resultado;
	}
	
	
	public String cocheHibrido(String producer, String model)
	{
		String resultado = "Es un " + producer + " " + model + " y no necesita combustible.";
		return resultado;
	}
}