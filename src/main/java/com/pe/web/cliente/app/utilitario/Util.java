package com.pe.web.cliente.app.utilitario;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {

	
	public static String convertToStringDate(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String fechaCadena = sdf.format(date);
		return fechaCadena;
	}
	
}
