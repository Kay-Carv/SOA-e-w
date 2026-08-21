package br.com.fiap;

import br.com.fiap.stubclasses.NumberConversionSoapType;
import jakarta.xml.ws.Service;

import javax.xml.namespace.QName;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;

public class TradutorDeNumerosApplications {
    static void main() throws MalformedURLException {
        //Estrutura de consumo do Web Service
        final String WSDL = "https://www.dataaccess.com/webservicesserver/NumberConversion.wso?WSDL";
        final String TARGET = "http://www.dataaccess.com/webservicesserver/";   //targetNamespace="http://www.dataaccess.com/webservicesserver/">
        final String NAME = "NumberConversion";

        URL url = new URL(WSDL);
        QName qName = new QName(TARGET, NAME);
        Service service = Service.create(url, qName);

        //Polimorfismo
        NumberConversionSoapType numberConversion = service.getPort(NumberConversionSoapType.class);
        String convertedNumber = numberConversion.numberToWords(BigInteger.valueOf(56));

        System.out.println(convertedNumber);
    }
}
