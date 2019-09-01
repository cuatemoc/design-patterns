package pl.slemjet.observable.event;

class PropertyChangedEventArgs
{
    public Object source;
    public String propertyName;
    public Object value;

    public PropertyChangedEventArgs(Object source, String propertyName, Object value)
    {
        this.source = source;
        this.propertyName = propertyName;
        this.value = value;
    }
}
