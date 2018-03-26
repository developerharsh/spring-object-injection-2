package mypack;

import org.springframework.core.io.Resource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;;


public class DemoClient 
{
	public static void main(String args[])
	{
		Resource resource = new FileSystemResource("Democfg.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Demo d=(Demo) factory.getBean("db");
		d.showData();
	}
}
