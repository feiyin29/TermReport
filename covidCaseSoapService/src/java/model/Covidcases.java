/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author feifei
 */
@Entity
@Table(name = "COVIDCASES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Covidcases.findAll", query = "SELECT c FROM Covidcases c"),
    @NamedQuery(name = "Covidcases.findByRow", query = "SELECT c FROM Covidcases c WHERE c.row = :row"),
    @NamedQuery(name = "Covidcases.findByYearnum", query = "SELECT c FROM Covidcases c WHERE c.yearnum = :yearnum"),
    @NamedQuery(name = "Covidcases.findByWeeknum", query = "SELECT c FROM Covidcases c WHERE c.weeknum = :weeknum"),
    @NamedQuery(name = "Covidcases.findByNewCase", query = "SELECT c FROM Covidcases c WHERE c.newCase = :newCase"),
    @NamedQuery(name = "Covidcases.findByTotalCase", query = "SELECT c FROM Covidcases c WHERE c.totalCase = :totalCase"),
    @NamedQuery(name = "Covidcases.findByNewCaseExcludeabroad", query = "SELECT c FROM Covidcases c WHERE c.newCaseExcludeabroad = :newCaseExcludeabroad"),
    @NamedQuery(name = "Covidcases.findByTotalCaseExcludeabroad", query = "SELECT c FROM Covidcases c WHERE c.totalCaseExcludeabroad = :totalCaseExcludeabroad"),
    @NamedQuery(name = "Covidcases.findByNewRecovered", query = "SELECT c FROM Covidcases c WHERE c.newRecovered = :newRecovered"),
    @NamedQuery(name = "Covidcases.findByTotalRecovered", query = "SELECT c FROM Covidcases c WHERE c.totalRecovered = :totalRecovered"),
    @NamedQuery(name = "Covidcases.findByNewDeath", query = "SELECT c FROM Covidcases c WHERE c.newDeath = :newDeath"),
    @NamedQuery(name = "Covidcases.findByTotalDeath", query = "SELECT c FROM Covidcases c WHERE c.totalDeath = :totalDeath"),
    @NamedQuery(name = "Covidcases.findByCaseForeign", query = "SELECT c FROM Covidcases c WHERE c.caseForeign = :caseForeign"),
    @NamedQuery(name = "Covidcases.findByCasePrison", query = "SELECT c FROM Covidcases c WHERE c.casePrison = :casePrison"),
    @NamedQuery(name = "Covidcases.findByCaseWalkin", query = "SELECT c FROM Covidcases c WHERE c.caseWalkin = :caseWalkin"),
    @NamedQuery(name = "Covidcases.findByCaseNewPrev", query = "SELECT c FROM Covidcases c WHERE c.caseNewPrev = :caseNewPrev"),
    @NamedQuery(name = "Covidcases.findByCaseNewDiff", query = "SELECT c FROM Covidcases c WHERE c.caseNewDiff = :caseNewDiff"),
    @NamedQuery(name = "Covidcases.findByDeathNewPrev", query = "SELECT c FROM Covidcases c WHERE c.deathNewPrev = :deathNewPrev"),
    @NamedQuery(name = "Covidcases.findByDeathNewDiff", query = "SELECT c FROM Covidcases c WHERE c.deathNewDiff = :deathNewDiff"),
    @NamedQuery(name = "Covidcases.findByUpdateDate", query = "SELECT c FROM Covidcases c WHERE c.updateDate = :updateDate")})
public class Covidcases implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ROW")
    private Integer row;
    @Column(name = "YEARNUM")
    private Integer yearnum;
    @Column(name = "WEEKNUM")
    private Integer weeknum;
    @Column(name = "NEW_CASE")
    private Integer newCase;
    @Column(name = "TOTAL_CASE")
    private Integer totalCase;
    @Column(name = "NEW_CASE_EXCLUDEABROAD")
    private Integer newCaseExcludeabroad;
    @Column(name = "TOTAL_CASE_EXCLUDEABROAD")
    private Integer totalCaseExcludeabroad;
    @Column(name = "NEW_RECOVERED")
    private Integer newRecovered;
    @Column(name = "TOTAL_RECOVERED")
    private Integer totalRecovered;
    @Column(name = "NEW_DEATH")
    private Integer newDeath;
    @Column(name = "TOTAL_DEATH")
    private Integer totalDeath;
    @Column(name = "CASE_FOREIGN")
    private Integer caseForeign;
    @Column(name = "CASE_PRISON")
    private Integer casePrison;
    @Column(name = "CASE_WALKIN")
    private Integer caseWalkin;
    @Column(name = "CASE_NEW_PREV")
    private Integer caseNewPrev;
    @Column(name = "CASE_NEW_DIFF")
    private Integer caseNewDiff;
    @Column(name = "DEATH_NEW_PREV")
    private Integer deathNewPrev;
    @Column(name = "DEATH_NEW_DIFF")
    private Integer deathNewDiff;
    @Size(max = 80)
    @Column(name = "UPDATE_DATE")
    private String updateDate;

    public Covidcases() {
    }

    public Covidcases(Integer row) {
        this.row = row;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getYearnum() {
        return yearnum;
    }

    public void setYearnum(Integer yearnum) {
        this.yearnum = yearnum;
    }

    public Integer getWeeknum() {
        return weeknum;
    }

    public void setWeeknum(Integer weeknum) {
        this.weeknum = weeknum;
    }

    public Integer getNewCase() {
        return newCase;
    }

    public void setNewCase(Integer newCase) {
        this.newCase = newCase;
    }

    public Integer getTotalCase() {
        return totalCase;
    }

    public void setTotalCase(Integer totalCase) {
        this.totalCase = totalCase;
    }

    public Integer getNewCaseExcludeabroad() {
        return newCaseExcludeabroad;
    }

    public void setNewCaseExcludeabroad(Integer newCaseExcludeabroad) {
        this.newCaseExcludeabroad = newCaseExcludeabroad;
    }

    public Integer getTotalCaseExcludeabroad() {
        return totalCaseExcludeabroad;
    }

    public void setTotalCaseExcludeabroad(Integer totalCaseExcludeabroad) {
        this.totalCaseExcludeabroad = totalCaseExcludeabroad;
    }

    public Integer getNewRecovered() {
        return newRecovered;
    }

    public void setNewRecovered(Integer newRecovered) {
        this.newRecovered = newRecovered;
    }

    public Integer getTotalRecovered() {
        return totalRecovered;
    }

    public void setTotalRecovered(Integer totalRecovered) {
        this.totalRecovered = totalRecovered;
    }

    public Integer getNewDeath() {
        return newDeath;
    }

    public void setNewDeath(Integer newDeath) {
        this.newDeath = newDeath;
    }

    public Integer getTotalDeath() {
        return totalDeath;
    }

    public void setTotalDeath(Integer totalDeath) {
        this.totalDeath = totalDeath;
    }

    public Integer getCaseForeign() {
        return caseForeign;
    }

    public void setCaseForeign(Integer caseForeign) {
        this.caseForeign = caseForeign;
    }

    public Integer getCasePrison() {
        return casePrison;
    }

    public void setCasePrison(Integer casePrison) {
        this.casePrison = casePrison;
    }

    public Integer getCaseWalkin() {
        return caseWalkin;
    }

    public void setCaseWalkin(Integer caseWalkin) {
        this.caseWalkin = caseWalkin;
    }

    public Integer getCaseNewPrev() {
        return caseNewPrev;
    }

    public void setCaseNewPrev(Integer caseNewPrev) {
        this.caseNewPrev = caseNewPrev;
    }

    public Integer getCaseNewDiff() {
        return caseNewDiff;
    }

    public void setCaseNewDiff(Integer caseNewDiff) {
        this.caseNewDiff = caseNewDiff;
    }

    public Integer getDeathNewPrev() {
        return deathNewPrev;
    }

    public void setDeathNewPrev(Integer deathNewPrev) {
        this.deathNewPrev = deathNewPrev;
    }

    public Integer getDeathNewDiff() {
        return deathNewDiff;
    }

    public void setDeathNewDiff(Integer deathNewDiff) {
        this.deathNewDiff = deathNewDiff;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (row != null ? row.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Covidcases)) {
            return false;
        }
        Covidcases other = (Covidcases) object;
        if ((this.row == null && other.row != null) || (this.row != null && !this.row.equals(other.row))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Covidcases[ row=" + row + " ]";
    }
    
}
