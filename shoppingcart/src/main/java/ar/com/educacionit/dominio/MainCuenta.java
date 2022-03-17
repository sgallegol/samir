package ar.com.educacionit.dominio;

import java.lang.reflect.Field;

public class MainCuenta {

	public static void main(String[] args) throws Exception {
		

		//quieroi tomar un . classs y setear los atributos dentro de una platilaa(template)
		Cuenta miCuenta=new Cuenta(100l,"caja de ahorros",17);
		String template=buildTemplate(Cuenta.class,miCuenta);
		System.out.println(template);
		//construir un String que tenga
		//atributo={valor,atributo1=valor|atributo=valorn}
		
	}
	//a continuacion hacemos un metodo en el api reflection
	

	
	public static String buildTemplate(Class clazz,Object data) throws Exception  {
		String className=clazz.getSimpleName();//nombre de la clase
		
		StringBuffer template=new StringBuffer(className);
		template.append("={");
		//tomo los atributos de la clase
		Field[] fields=clazz.getDeclaredFields();
		
		//recorro  los atributos
		for(Field field : fields) {
			field.setAccessible(true);//pide el acceso al atributo
			String name =field.getName();//nombre del atributos
			Object value=field.get(data);
			
			template.append(name).append(",").append(value.toString()).append("|");
			
			
		}
		template.append("=}");
		return template.toString();
	}
	
	
	
	
}
