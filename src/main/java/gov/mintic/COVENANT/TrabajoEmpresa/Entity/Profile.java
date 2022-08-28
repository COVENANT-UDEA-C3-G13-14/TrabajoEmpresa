package gov.mintic.COVENANT.TrabajoEmpresa.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String Image;
    private String phone;

    @OneToOne
    private Employee empleado;

    private Date createdAt;
    private Date updatedAt;

    public Profile() {
    }

    public Profile(long id, String image, String phone, Employee empleado, Date createdAt, Date updatedAt) {
        this.id = id;
        Image = image;
        this.phone = phone;
        this.empleado = empleado;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Employee getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Employee empleado) {
        this.empleado = empleado;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", Image='" + Image + '\'' +
                ", phone='" + phone + '\'' +
                ", empleado=" + empleado +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
