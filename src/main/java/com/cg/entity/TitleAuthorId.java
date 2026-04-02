package com.cg.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

/*
 * @author Siddhant*/
@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TitleAuthorId implements Serializable {

    private String auId;
    private String titleId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TitleAuthorId)) return false;
        TitleAuthorId that = (TitleAuthorId) o;
        return Objects.equals(auId, that.auId) &&
                Objects.equals(titleId, that.titleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(auId, titleId);
    }
}

