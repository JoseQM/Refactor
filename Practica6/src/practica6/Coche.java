package practica6;

/**
 * Clase Coche en la que se indica los atributos que ha de tiene que tener un objeto de dicha clase.
 * Cuenta con 4 métodos: 
 * 					combustibleUsado.
 * 					matriculaFraseCoche.
 * 					cocheGasolina.
 * 					cocheDiesel.
 * 					cocheHibrido.
 * @author José Francisco Quintero Moreno
 * @version 2019
 */
public class Coche
{
	//Definicón de Variables.
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
	
	
    /**
     * Método que devuelve un String con la información sobre el objeto coche, dependiendo de el tipo de combustible que use el coche.
     * 
     * combustible es uno de los parámetros de creación del objeto coche, el cual, será el parámetro de evaluación del switch.
     * 
     * @return devuelve un String con los atributos de cada coche.
     */
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
	
	
	/**
     * Método que devuelve un String que contiene la matricula del coche, acompañada de un String incial.
     * 
     * COCHE_MATRICULA es una constante del tipo String.
     * matricula es un atributo de la Clase Coche.
     * 
     * @return devuelve un String con la matricula del coche.
     */
	public String matriculaFraseCoche()
	{
		return COCHE_MATRICULA + matricula + " ";
	}
	
	
	/**
     * Método que devuelve un String con la información obtenida del coche, en caso de usar combustible Gasolina.
     * 
     * @param producer es el atributo fabricante del objeto coche.
     * @param model es el atributo modelo del objeto coche.
     * 
     * @return devuelve un String con el fabricante, modelo y consumo de combustible por litro, en euros.
     */
	public String cocheGasolina(String producer, String model)
	{
		String resultado = "Es un " + producer + " " + model + " y gasta 1,337 euros por litro.";
		return resultado;
	}
	
	
	/**
     * Método que devuelve un String con la información obtenida del coche, en caso de usar combustible Diesel.
     * 
     * @param producer es el atributo fabricante del objeto coche.
     * @param model es el atributo modelo del objeto coche.
     * 
     * @return devuelve un String con el fabricante, modelo y consumo de combustible por litro, en euros.
     */
	public String cocheDiesel(String producer, String model)
	{
		String resultado = "Es un " + producer + " " + model + " y gasta 1,052 euros por litro.";
		return resultado;
	}
	
	
	/**
     * Método que devuelve un String con la información obtenida del coche, en caso de usar combustible Híbrido.
     * 
     * @param producer es el atributo fabricante del objeto coche.
     * @param model es el atributo modelo del objeto coche.
     * 
     * @return devuelve un String con el fabricante, modelo y consumo de combustible por litro, en euros.
     */
	public String cocheHibrido(String producer, String model)
	{
		String resultado = "Es un " + producer + " " + model + " y no necesita combustible.";
		return resultado;
	}
}