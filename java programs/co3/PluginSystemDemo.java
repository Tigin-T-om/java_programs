abstract class Plugin {
    private String name;

    public Plugin(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Encapsulation: Setter for the name (optional, but good practice if name can change).
    public void setName(String name) {
        this.name = name;
    }

    // Abstract method: execute() must be implemented by concrete plugins.
    public abstract void execute();
}

// Interface: Configurable
// Defines a contract for plugins that can be configured.
interface Configurable {
    // Abstract method: configure() must be implemented to set up the plugin.
    public void configure(String configSettings);
}

// Concrete Plugin Class: TextProcessorPlugin
// Demonstrates both inheritance from an abstract class and implementation of an interface.
class TextProcessorPlugin extends Plugin implements Configurable {
    // Encapsulation: Private field for plugin-specific configuration.
    private String processingMode;

    public TextProcessorPlugin() {
        super("TextProcessor"); // Call to superclass constructor.
        this.processingMode = "default"; // Default mode.
    }

    // Polymorphism/Inheritance: Implementing the abstract execute() method from Plugin.
    @Override
    public void execute() {
        System.out.println(getName() + " plugin is executing in " + processingMode + " mode.");
        System.out.println("Processing text...");
    }

    // Polymorphism/Interface Implementation: Implementing the configure() method from Configurable.
    @Override
    public void configure(String configSettings) {
        this.processingMode = configSettings;
        System.out.println(getName() + " plugin configured to: " + processingMode);
    }

    // Getter for processingMode (Encapsulation).
    public String getProcessingMode() {
        return processingMode;
    }
}

public class PluginSystemDemo {
    public static void main(String[] args) {
        // Demonstrating Abstraction, Inheritance, Interfaces, and Polymorphism in a plugin system.

        System.out.println("--- Text Processor Plugin Demonstration ---");

        // Create an instance of the concrete plugin.
        TextProcessorPlugin textPlugin = new TextProcessorPlugin();
        System.out.println("Initial plugin name: " + textPlugin.getName());
        System.out.println("Initial processing mode: " + textPlugin.getProcessingMode());

        // Configure the plugin (using the interface method).
        textPlugin.configure("uppercase");

        // Execute the plugin (using the inherited abstract method).
        textPlugin.execute();
        System.out.println();

        // Reconfigure and re-execute.
        textPlugin.configure("lowercase");
        textPlugin.execute();
        System.out.println();

        // Demonstrate polymorphism with abstract class reference.
        System.out.println("--- Polymorphism with Plugin reference ---");
        Plugin genericPlugin = new TextProcessorPlugin();
        // Configure this plugin through its Configurable interface reference.
        ((Configurable) genericPlugin).configure("stemming");
        genericPlugin.execute(); // Calls TextProcessorPlugin's execute method.
        System.out.println();

        // Demonstrate polymorphism with interface reference.
        System.out.println("--- Polymorphism with Configurable interface reference ---");
        Configurable configurablePlugin = new TextProcessorPlugin();
        configurablePlugin.configure("remove_stopwords"); // Calls TextProcessorPlugin's configure method.
        // configurablePlugin.execute(); // Compile error: execute() is not in Configurable interface.
        ((Plugin) configurablePlugin).execute(); // Cast back to Plugin to call execute.
    }
}
