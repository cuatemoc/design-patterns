package pl.slemjet.strategy;

class MarkdownListStrategy implements ListStrategy
{
    @Override
    public void addListItem(StringBuilder stringBuilder, String item)
    {
        stringBuilder.append(" * ").append(item)
                .append(System.lineSeparator());
    }
}
