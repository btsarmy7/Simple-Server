package com.cooksys.ftd.assignments.socket;

import com.cooksys.ftd.assignments.socket.model.Config;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

/**
 * Shared static methods to be used by both the {@link Client} and {@link Server} classes.
 */
public class Utils {
    /**
     * @return a {@link JAXBContext} initialized with the classes in the
     * com.cooksys.socket.assignment.model package
     */
    public static JAXBContext createJAXBContext() {
    	
    	String pkgAddress = "com.cooksys.socket.assignment.model";
		String workingDirectory = System.getProperty("user.dir");
		String content = workingDirectory + File.separator + pkgAddress;
		JAXBContext pkgContent = null;
    	
    	try {
			pkgContent = JAXBContext.newInstance(content);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println(pkgAddress);
    	System.out.println(workingDirectory);
    	System.out.println(pkgContent);
        return pkgContent; // TODO
    }

    /**
     * Reads a {@link Config} object from the given file path.
     *
     * @param configFilePath the file path to the config.xml file
     * @param jaxb the JAXBContext to use
     * @return a {@link Config} object that was read from the config.xml file
     */
    public static Config loadConfig(String configFilePath, JAXBContext jaxb) {
        return null; // TODO
    }
    
    public static void main(String[] args) {
    	
    
    	createJAXBContext();
    }
}
