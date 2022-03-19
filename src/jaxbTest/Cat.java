package jaxbTest;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "cat")
@XmlRootElement
public class Cat
{
    @XmlElement(name = "name")
    public String name;
    @XmlAttribute(name = "age")
    public int age;
    @XmlAttribute(name = "weight")
    public int weight;

    public Cat()
    {
    }
}
