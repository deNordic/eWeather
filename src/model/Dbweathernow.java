package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "DBWEATHERNOW")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dbweathernow.findAll", query = "SELECT d FROM Dbweathernow d")
    , @NamedQuery(name = "Dbweathernow.findByFileid", query = "SELECT d FROM Dbweathernow d WHERE d.fileid = :fileid")
    , @NamedQuery(name = "Dbweathernow.findByCityname", query = "SELECT d FROM Dbweathernow d WHERE d.cityname = :cityname")
    , @NamedQuery(name = "Dbweathernow.findByCityid", query = "SELECT d FROM Dbweathernow d WHERE d.cityid = :cityid")
    , @NamedQuery(name = "Dbweathernow.findByTemp", query = "SELECT d FROM Dbweathernow d WHERE d.temp = :temp")
    , @NamedQuery(name = "Dbweathernow.findByWeatherDescription", query = "SELECT d FROM Dbweathernow d WHERE d.weatherDescription = :weatherDescription")
    , @NamedQuery(name = "Dbweathernow.findByWindSpeed", query = "SELECT d FROM Dbweathernow d WHERE d.windSpeed = :windSpeed")
    , @NamedQuery(name = "Dbweathernow.findByClouds", query = "SELECT d FROM Dbweathernow d WHERE d.clouds = :clouds")})
public class Dbweathernow implements Serializable {

    @Column(name = "DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dt;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "FILEID")
    private Integer fileid;
    @Basic(optional = false)
    @Column(name = "CITYNAME")
    private String cityname;
    @Basic(optional = false)
    @Column(name = "CITYID")
    private int cityid;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TEMP")
    private Double temp;
    @Column(name = "WEATHER_DESCRIPTION")
    private String weatherDescription;
    @Column(name = "WIND_SPEED")
    private Double windSpeed;
    @Column(name = "CLOUDS")
    private Integer clouds;

    public Dbweathernow() {
    }

    public Dbweathernow(Integer fileid) {
        this.fileid = fileid;
    }

    public Dbweathernow(Integer fileid, String cityname, int cityid, Double temp, String weatherDescription, Double windSpeed, Integer clouds, Date dt) {
        
        this.fileid = fileid;
        this.cityname = cityname;
        this.cityid = cityid;
        this.temp = temp;
        this.weatherDescription = weatherDescription;
        this.windSpeed = windSpeed;
        this.clouds = clouds;
        this.dt = dt;
    }
    
    public Integer getFileid() {
        return fileid;
    }

    public void setFileid(Integer fileid) {
        this.fileid = fileid;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public int getCityid() {
        return cityid;
    }

    public void setCityid(int cityid) {
        this.cityid = cityid;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public String getWeatherDescription() {
        return weatherDescription;
    }

    public void setWeatherDescription(String weatherDescription) {
        this.weatherDescription = weatherDescription;
    }

    public Double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Integer getClouds() {
        return clouds;
    }

    public void setClouds(Integer clouds) {
        this.clouds = clouds;
    }
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fileid != null ? fileid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dbweathernow)) {
            return false;
        }
        Dbweathernow other = (Dbweathernow) object;
        if ((this.fileid == null && other.fileid != null) || (this.fileid != null && !this.fileid.equals(other.fileid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Dbweathernow[ fileid=" + fileid + " ]";
    }    

    public Date getDt() {
        return dt;
    }

    public void setDt(Date dt) {
        this.dt = dt;
    }
}