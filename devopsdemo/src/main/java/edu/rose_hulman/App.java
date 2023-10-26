package edu.rose_hulman;

/**
 * The {@code App} class represents an application with a name and a version number.
 * It provides constructors to create instances of the application with various attributes.
 *
 * This class can be used to model and manage application-related data and functionality.
 *
 * @version 1.0
 * @since 2023-10-26
 */
public class App
{
    private String appName;
    private double version;

    /**
     * Constructs an {@code App} instance with the specified name and version.
     *
     * @param appName  The name of the application.
     * @param version  The version number of the application.
     */
    public App(String appName, double version)
    {
        this.appName = appName;
        this.version = version;
    }

    /**
     * Gets the description of the application, including its name and version.
     *
     * @return A string representing the application's name and version.
     */
    public String getAppDescription()
    {
        String description = this.appName + ", version " + Double.toString(this.version);
        return description;
    }

    /**
     * The main method demonstrates the usage of the {@code App} class by creating an instance,
     * getting the application description, and printing it to the console.
     *
     * @param args The command-line arguments (not used in this example).
     */
    public static void main( String[] args )
    {
        App myApp = new App("Test App", 1.0);
        String description = myApp.getAppDescription();
        System.out.println(description);
    }
}
