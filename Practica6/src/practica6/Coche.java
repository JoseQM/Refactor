package practica6;

/**
 * Clase Coche en la que se indica los atributos que ha de tiene que tener un objeto de dicha clase.
 * Cuenta con 4 m�todos: 
 * 					combustibleUsado.
 * 					matriculaFraseCoche.
 * 					cocheGasolina.
 * 					cocheDiesel.
 * 					cocheHibrido.
 * @author Jos� Francisco Quintero Moreno
 * @version 2019
 */
public class Coche
{
	//Definic�n de Variables.
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
     * M�todo que devuelve un String con la informaci�n sobre el objeto coche, dependiendo de el tipo de combustible que use el coche.
     * 
     * combustible es uno de los par�metros de creaci�n del objeto coche, el cual, ser� el par�metro de evaluaci�n del switch.
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
			
		case "H�brido":
			resultado += matriculaFraseCoche() + cocheHibrido(modelo, fabricante);
			break;
			
		default:
			resultado += matriculaFraseCoche() + "no dispone de informaci�n";
			break;
		}
		return resultado;
	}
	
	
	/**
     * M�todo que devuelve un String que contiene la matricula del coche, acompa�ada de un String incial.
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
     * M�todo que devuelve un String con la informaci�n obtenida del coche, en caso de usar combustible Gasolina.
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
     * M�todo que devuelve un String con la informaci�n obtenida del coche, en caso de usar combustible Diesel.
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
     * M�todo que devuelve un String con la informaci�n obtenida del coche, en caso de usar combustible H�brido.
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