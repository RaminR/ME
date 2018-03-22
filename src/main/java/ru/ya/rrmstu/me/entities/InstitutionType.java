package ru.ya.rrmstu.me.entities;

/**
 * Created by RRM on 22/03/2018.
 */
public class InstitutionType {
    private long idInstitutionType;
    private String nameInstitutionType;
    private String descriptionInstitutionType;

    public long getIdInstitutionType() {
        return idInstitutionType;
    }

    public void setIdInstitutionType(long idInstitutionType) {
        this.idInstitutionType = idInstitutionType;
    }

    public String getNameInstitutionType() {
        return nameInstitutionType;
    }

    public void setNameInstitutionType(String nameInstitutionType) {
        this.nameInstitutionType = nameInstitutionType;
    }

    public String getDescriptionInstitutionType() {
        return descriptionInstitutionType;
    }

    public void setDescriptionInstitutionType(String descriptionInstitutionType) {
        this.descriptionInstitutionType = descriptionInstitutionType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InstitutionType that = (InstitutionType) o;

        if (idInstitutionType != that.idInstitutionType) return false;
        if (nameInstitutionType != null ? !nameInstitutionType.equals(that.nameInstitutionType) : that.nameInstitutionType != null)
            return false;
        if (descriptionInstitutionType != null ? !descriptionInstitutionType.equals(that.descriptionInstitutionType) : that.descriptionInstitutionType != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idInstitutionType ^ (idInstitutionType >>> 32));
        result = 31 * result + (nameInstitutionType != null ? nameInstitutionType.hashCode() : 0);
        result = 31 * result + (descriptionInstitutionType != null ? descriptionInstitutionType.hashCode() : 0);
        return result;
    }
}
