package cat.apuntstecnologia.proves;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class ServeiProva {
    public ServeiProva() {
    }
    
    @WebMethod
    public int suma(int a, int b) {
    	return a + b;
    } 
    
    @WebMethod
    public String concatena(String a, String b) {
    	return a + b;
    }
    
    @WebMethod
    public String quinDiaEsAvui() {
    	SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");
    	return sdf.format(new Date());
    }
}
