package Entities;

import Entities.Adress;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-02-26T17:59:06")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile ListAttribute<Customer, String> hobbies;
    public static volatile SingularAttribute<Customer, String> FirstName;
    public static volatile SingularAttribute<Customer, Adress> adress;
    public static volatile SingularAttribute<Customer, Long> id;
    public static volatile SingularAttribute<Customer, String> LastName;

}