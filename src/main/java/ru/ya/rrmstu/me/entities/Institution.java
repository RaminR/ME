package ru.ya.rrmstu.me.entities;

/**
 * Created by RRM on 22/03/2018.
 */
public class Institution {
    private long idInstitution;
    private String nameInstitution;
    private InstitutionType institution_type;

    public InstitutionType getInstitution_type() {
        return institution_type;
    }

    public void setInstitution_type(InstitutionType institution_type) {
        this.institution_type = institution_type;
    }

    public long getIdInstitution() {
        return idInstitution;
    }

    public void setIdInstitution(long idInstitution) {
        this.idInstitution = idInstitution;
    }

    public String getNameInstitution() {
        return nameInstitution;
    }

    public void setNameInstitution(String nameInstitution) {
        this.nameInstitution = nameInstitution;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Institution that = (Institution) o;

        if (idInstitution != that.idInstitution) return false;
        if (nameInstitution != null ? !nameInstitution.equals(that.nameInstitution) : that.nameInstitution != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idInstitution ^ (idInstitution >>> 32));
        result = 31 * result + (nameInstitution != null ? nameInstitution.hashCode() : 0);
        return result;
    }
}
