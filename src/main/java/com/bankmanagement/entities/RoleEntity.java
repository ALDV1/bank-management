package com.bankmanagement.entities;

import com.bankmanagement.core.enums.Role;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "role", schema = "user_service")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RoleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =  "role_seq_generator")
    @SequenceGenerator(name = "role_seq_generator", sequenceName = "role_id_seq", allocationSize = 1)
    private Integer id;

    @Enumerated(value = EnumType.STRING)
    private Role name;

    @ManyToMany(mappedBy = "roles")
    private Set<UserEntity> users;
}
