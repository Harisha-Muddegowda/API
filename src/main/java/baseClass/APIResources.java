package baseClass;

public enum APIResources {

    GetPetAPI("/petstore/pets");

    private String resource;

    APIResources(String resource)
    {
        this.resource=resource;
    }

    public String getResource()
    {
        return resource;
    }
}
