public class JavaDeveloper extends Developer{
    private String framework;

    public JavaDeveloper(int id, String name, double salary, boolean isActive, String versionControlSystem, String framework){
        super(id, name, salary, isActive, versionControlSystem);
        this.framework = framework;
    }

    public void compileJava() {
        System.out.println(getName() + " is building a robust JAR file using the " + framework + "framework");
    }

    @Override
    public void writeCode(){
        System.out.println(getName() + "is writing thread-safe Java code and managing JVM memory footprint.");
    }


}
