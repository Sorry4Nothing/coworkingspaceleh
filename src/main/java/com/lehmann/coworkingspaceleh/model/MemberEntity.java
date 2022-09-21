package com.lehmann.coworkingspaceleh.model;

import lombok.*;
import org.hibernate.Hibernate;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Entity(name = "MEMBER")
@DynamicUpdate
public class MemberEntity implements Serializable {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", updatable = false, nullable = false)
    @Type(type = "org.hibernate.type.UUIDCharType")
    UUID id = UUID.randomUUID();

    @Column(name = "username", nullable = false)
    String username;

    @Column(name = "email", nullable = false)
    String email;

    @Column(name = "firstname", nullable = false)
    String firstname;

    @Column(name = "lastname", nullable = false)
    String lastname;
    @Column(name = "password_hash", nullable = false)
    String passwordHash;

    @Column(name = "newsletter", nullable = false)
    Boolean newsletter = true;

    @Column(name = "is_admin", nullable = false)
    Boolean isAdmin = false;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        MemberEntity that = (MemberEntity) o;
        return id != null && Objects.equals(id, that.id) &&
                username != null && Objects.equals(username, that.username) &&
                email != null && Objects.equals(email, that.email) &&
                passwordHash != null && Objects.equals(passwordHash, that.passwordHash);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}