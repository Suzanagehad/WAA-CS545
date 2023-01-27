package edu.miu.WAALab5.domain;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String email;
    private String password;
    private String name;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "users")
    private List<Post> posts;

    @ManyToMany(fetch = FetchType.EAGER)
    List<Role>roles;

}
