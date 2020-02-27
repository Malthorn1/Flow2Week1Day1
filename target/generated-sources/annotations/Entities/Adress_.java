package Entities;

import Entities.Customer;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-02-26T19:29:17")
@StaticMetamodel(Adress.class)
public class Adress_ { 

    public static volatile SingularAttribute<Adress, String> city;
    public static volatile SingularAttribute<Adress, String> street;
    public static volatile SingularAttribute<Adress, Long> id;
    public static volatile SingularAttribute<Adress, Customer> customer;

}