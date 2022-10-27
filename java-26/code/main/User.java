package main;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Indexed;
import org.springframework.stereotype.Repository;

@Table(name="users")
class User {
    @Id int id;
    public String email;
    @Column("first_name")
    public String firstname;
    @Column("last_name")
    public String lastname;
    public char gender;
    String address;
    String password;
}

@Repository @Indexed
interface UserRepository extends CrudRepository<User, Integer> {
    
}