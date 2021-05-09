package com.sw2.soap;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.sw2.soap.ws.client.generated.*;


/**
 * Hello world!
 *
 */
public class App 
{
	
	public static void main( String[] args ) throws JAXBException_Exception, IOException{
    	MarcaService service = new MarcaService();
        Servidor servidor = service.getServidorPort();
        
        Producto producto = new Producto();
        Marca marca = new Marca();
        String nombreMarca, nombreProducto, fechaDePublicaciónProducto,descripcionProducto, tipoProducto;
        Double precioProducto;
       
    	String directorio = System.getProperty("user.home");
    	File carpeta = new File(directorio + "/Cliente");
    	carpeta.mkdir();
    	directorio=carpeta.getAbsolutePath();
    		
    	
        int selector =-1;
        
        Scanner sc=new Scanner(System.in);
        while(selector!=0) {
        try {	
        	System.out.println("Menú");
        	System.out.println("Opción 0: Cerrar la aplicación");
        	System.out.println("Opción 1: Crear una Marca en el servidor");
        	System.out.println("Opción 2: Crear un Producto en el servidor");
        	System.out.println("Opción 3: Recibir una Marca del servidor");
        	System.out.println("Opción 4: Recibir un Producto del servidor");
        	System.out.println("Opción 5: Exportar una Marca.xml del servidor al cliente");
        	System.out.println("Opción 6: Exportar un Producto.xml del servidor al cliente");
        	System.out.println("Opción 7: Importar una Marca.xml del cliente al servidor");
        	System.out.println("Opción 8: Importar un Producto.xml del cliente al servidor");
        	
        	selector=Integer.parseInt(sc.nextLine());
        	
        	switch(selector) {
        	
        		case 0:
        			System.out.println("Saliendo del programa");
                    break;
                    
        		case 1:
        			System.out.println("Escriba el nombre de la marca que quiera crear");
        			nombreMarca = sc.nextLine();
        			servidor.crearMarca(nombreMarca);
        			break;
        		case 2:
        			System.out.println("Escriba el nombre de la marca que quiera crear");
        			nombreMarca = sc.nextLine();
        			System.out.println("Escriba el nombre del producto que quiera crear");
        			nombreProducto = sc.nextLine();
        			System.out.println("Escriba la fecha de publicación (separada con -) del producto que quiera crear");
        			fechaDePublicaciónProducto = sc.nextLine();
        			System.out.println("Escriba la descripción del producto que quiera crear");
        			descripcionProducto = sc.nextLine();
        			System.out.println("Escriba el precio del producto que quiera crear");
        			precioProducto = Double.parseDouble(sc.nextLine());
        			System.out.println("Escriba el tipo del producto que quiera crear");
        			tipoProducto = sc.nextLine();
        			
        			producto.setNombre(nombreProducto);
        			producto.setFechaDePublicacion(fechaDePublicaciónProducto);
        			producto.setDescripcion(descripcionProducto);
        			producto.setPrecio(precioProducto);
        			producto.setTipo(tipoProducto);
        			
        			servidor.crearProducto(nombreMarca, producto);
        			break;

        		case 3:
        			
        			System.out.println("Escriba el nombre de la marca que quiera recibir");
        			nombreMarca = sc.nextLine();
        			
        			     
        			
        			try {
        				
        				marca=servidor.devolverMarca(nombreMarca);

        				System.out.println("El objeto Marca que devuelve es:" + marca.getNombre());
        			} catch (Exception e){
        				System.out.println("No se ha encontrado la marca escrita");
        			}
        			
        			break;

        		case 4:
        			
        			System.out.println("Escriba el nombre de la marca que quiera recibir");
        			nombreMarca = sc.nextLine();
        			System.out.println("Escriba el nombre del producto que quiera recibir");
        			nombreProducto = sc.nextLine();
        			

        			try {
        				
        				producto=servidor.devolverProducto(nombreMarca,nombreProducto);

        				System.out.println("El objeto Producto de la Marca " + nombreMarca + " que devuelve es: Nombre " 
        				+ producto.getNombre() + " Fecha de publicación " + producto.getFechaDePublicacion() + " Descripción "+ producto.getDescripcion() 
        				+ " Precio " + producto.getPrecio() + " Tipo " + producto.getTipo() + " ");
        			} catch (Exception e){
        				System.out.println("No se ha encontrado la marca escrita");
        			}
        			
        			
        			break;
        			
        		case 5:
        			
        			System.out.println("Escriba el nombre de la marca que quiera recibir");
        			nombreMarca = sc.nextLine();
        			System.out.println(nombreMarca);
        			     
        			
        			try {
        				
        				marca=servidor.devolverMarca(nombreMarca);
        		
        				
        		
        				
        			}catch (Exception e){
            				System.out.println("No se ha encontrado la marca escrita");
            				e.printStackTrace();
            			}
        			break;
        			
        		case 6:
        			
        			break;
        			
        		case 7:
        			
        			break;
        			
        		case 8:
        			
        			break;
        			
        		case 9:
        			
        			break;
        			
        		default:
    				System.out.println("Opción no válida\n");
    				break;
        			
        			
        		
        	}
        	
        	
        }
        catch (Exception e){
        	System.out.println("Algo ha fallado que lo flipas\n");
        	e.printStackTrace();
        }
        
        }
}

	
}