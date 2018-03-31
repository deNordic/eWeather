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
@Table(name = "DBFORECAST")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dbforecast.findAll", query = "SELECT d FROM Dbforecast d")
    , @NamedQuery(name = "Dbforecast.findByFileid", query = "SELECT d FROM Dbforecast d WHERE d.fileid = :fileid")
    , @NamedQuery(name = "Dbforecast.findByCityid", query = "SELECT d FROM Dbforecast d WHERE d.cityid = :cityid")
    , @NamedQuery(name = "Dbforecast.findByWeatherDescription", query = "SELECT d FROM Dbforecast d WHERE d.weatherDescription = :weatherDescription")
    , @NamedQuery(name = "Dbforecast.findByTemp", query = "SELECT d FROM Dbforecast d WHERE d.temp = :temp")
    , @NamedQuery(name = "Dbforecast.findByClouds", query = "SELECT d FROM Dbforecast d WHERE d.clouds = :clouds")
    , @NamedQuery(name = "Dbforecast.findByWindSpeed", query = "SELECT d FROM Dbforecast d WHERE d.windSpeed = :windSpeed")
    , @NamedQuery(name = "Dbforecast.findByDt", query = "SELECT d FROM Dbforecast d WHERE d.dt = :dt")
    , @NamedQuery(name = "Dbforecast.findByRain", query = "SELECT d FROM Dbforecast d WHERE d.rain = :rain")
    , @NamedQuery(name = "Dbforecast.findBySnow", query = "SELECT d FROM Dbforecast d WHERE d.snow = :snow")})
public class Dbforecast implements Serializable {

    @Column(name = "DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dt;

    @Basic(optional = false)
    @Column(name = "CITYNAME")
    private String cityname;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "FILEID")
    private Integer fileid;
    @Basic(optional = false)
    @Column(name = "CITYID")
    private int cityid;
    @Column(name = "WEATHER_DESCRIPTION")
    private String weatherDescription;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TEMP")
    private Double temp;
    @Column(name = "CLOUDS")
    private Integer clouds;
    @Column(name = "WIND_SPEED")
    private Double windSpeed;
    @Column(name = "RAIN")
    private Double rain;
    @Column(name = "SNOW")
    private Double snow;

    public Dbforecast() {
    }

    public Dbforecast(Integer fileid) {
        this.fileid = fileid;
    }

    public Dbforecast(Integer fileid, int cityid) {
        this.fileid = fileid;
        this.cityid = cityid;
    }
    public Dbforecast(Integer fileid, int cityid, String cityname, String weatherDescription, Double temp, int clouds,
            Double windSpeed, Date dt, Double snow, Double rain) {
        this.fileid = fileid;
        this.cityname = cityname;
        this.cityid = cityid;
        this.temp = temp;
        this.weatherDescription = weatherDescription;
        this.windSpeed = windSpeed;
        this.clouds = clouds;
        this.dt = dt;
        this.snow = snow;
        this.rain = rain;      
    }
    
    public Integer getFileid() {
        return fileid;
    }

    public void setFileid(Integer fileid) {
        this.fileid = fileid;
    }
    
    public String getCityName() {
        return cityname;
    }

    public void setCityName(String cityname) {
        this.cityname = cityname;
    }
    
    public int getCityid() {
        return cityid;
    }

    public void setCityid(int cityid) {
        this.cityid = cityid;
    }

    public String getWeatherDescription() {
        return weatherDescription;
    }

    public void setWeatherDescription(String weatherDescription) {
        this.weatherDescription = weatherDescription;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Integer getClouds() {
        return clouds;
    }

    public void setClouds(Integer clouds) {
        this.clouds = clouds;
    }

    public Double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }


    public Double getRain() {
        return rain;
    }

    public void setRain(Double rain) {
        this.rain = rain;
    }

    public Double getSnow() {
        return snow;
    }

    public void setSnow(Double snow) {
        this.snow = snow;
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
        if (!(object instanceof Dbforecast)) {
            return false;
        }
        Dbforecast other = (Dbforecast) object;
        if ((this.fileid == null && other.fileid != null) || (this.fileid != null && !this.fileid.equals(other.fileid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Dbforecast[ fileid=" + fileid + " ]";
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public Date getDt() {
        return dt;
    }

    public void setDt(Date dt) {
        this.dt = dt;
    }
    
}
