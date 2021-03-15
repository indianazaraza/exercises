import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;
import java.io.IOException;
import org.xml.sax.SAXException;

class CompanyEmployeeDatabase{
	
	public void getEmployeeDataFromFile(){
		
		try{
			
			DocumentBuilderFactory docEmployeesFactory= DocumentBuilderFactory.newInstance();
			DocumentBuilder docEmployeesBuild= docEmployeesFactory.newDocumentBuilder();
			Document docEmployees= docEmployeesBuild.parse("Employees.xml");
			docEmployees.getDocumentElement().normalize();
			
			System.out.println(docEmployees.getDocumentElement().getNodeName() + "\n");
			
			NodeList employeesList= docEmployees.getElementsByTagName("Employee");
			
			traverse_(employeesList);
			
		}catch (IOException | ParserConfigurationException | SAXException errorFile){
			
			System.out.println(errorFile.getMessage());
		}
	}
	
	public void traverse_(NodeList employeesList){
		
		for (int i= 0; i < employeesList.getLength(); i++){
				
				Node employeeNode= employeesList.item(i);
				
				print_Elements(employeeNode);
		}
	}

	public void print_Elements(Node employeeNode){

		if (employeeNode.getNodeType() == Node.ELEMENT_NODE){
					
			Element elemEmployee= (Element) employeeNode;
			
			print_Properties(elemEmployee);
			
			System.out.print("\n");
			
		}
	}

	public void print_Properties(Element elemEmployee){
		
		System.out.println("Id: " + elemEmployee.getAttribute("id"));
		
		print_From_OfThe("Nombre: ", "Name", elemEmployee);
	
		print_From_OfThe("Apellido: ", "LastName", elemEmployee);
		
		print_From_OfThe("Clave: ", "Key", elemEmployee);
			
		print_From_OfThe("Departamento: ", "Department", elemEmployee);
			
		print_From_OfThe("Años de servicio: ", "YearsService", elemEmployee);

		print_From_OfThe("Salario: ", "Salary", elemEmployee);	
		
		print_From_OfThe("CUIT: ", "SocialSecurity", elemEmployee);	
		
		
	}

	public void print_From_OfThe(String elemName, String tagName, Element elemEmployee){

		System.out.println(elemName + getTextOf_With_Tag(elemEmployee, tagName));
	}
	
	public String getTextOf_With_Tag(Element elemEmployee, String tagName){
		
		return elemEmployee.getElementsByTagName(tagName).item(0).getTextContent(); 
	}
}
