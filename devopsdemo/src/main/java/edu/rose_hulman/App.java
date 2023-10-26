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
    /**
     * The name of the application.
     */
    private String appName;

    /**
     * The version number of the application.
     */
    private double appVersion;

    /**
     * Constructs an {@code App} instance with the specified name and version.
     *
     * @param name  The name of the application.
     * @param version  The version number of the application.
     */
    public App(String name, double version)
    {
        this.appName = name;
        this.appVersion = version;
    }

    /**
     * Gets the description of the application, including its name and version.
     *
     * @return A string representing the application's name and version.
     */
    public String getAppDescription()
    {
        String description = this.appName + ", version " + Double.toString(this.appVersion);
        return description;
    }

    /**
     * The main method demonstrates the usage of the {@code App} class by creating an instance,
     * getting the application description, and printing it to the console.
     *
     * @param args The command-line arguments (not used in this example).
     */
    public static void main(String[] args)
    {
        App myApp = new App("Test App", 1.0);
        String description = myApp.getAppDescription();
        System.out.println(description);
    }
}
