package execrcise.e1;

import java.util.*;

public class CodeBuilder
{
    private String className;
    private List<Map.Entry> fields = new ArrayList<>();

    public CodeBuilder(String className)
    {
        this.className = className;
    }

    public CodeBuilder addField(String name, String type)
    {
        fields.add(new AbstractMap.SimpleEntry(type, name));
        return this;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder(String.format("public class %s\n", className)).append("{\n");
        for (Map.Entry entry : fields){
            sb.append(String.format("  public %s %s;\n", entry.getKey(), entry.getValue()));
        }
        sb.append("}");
        return sb.toString();
    }
}
