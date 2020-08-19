package model;

import java.time.Year;

public class Planet implements Comparable<Planet>{

    private final int loc_rowid;
    private final String pl_hostname;
    private final String pl_letter;
    private final String pl_name;
    private final float gaia_dist;
    private final float st_teff;
    private final float st_mass;
    private final float st_rad;
    private final String rowupdate;
    private final Year pl_disc;
    private final String pl_facility;
    private final int pl_status;

    public Planet(int loc_rowid, String pl_hostname, String pl_letter, String pl_name, float gaia_dist, float st_teff, float st_mass, float st_rad, String rowupdate, Year pl_disc, String pl_facility, int pl_status) {
        this.loc_rowid = loc_rowid;
        this.pl_hostname = pl_hostname;
        this.pl_letter = pl_letter;
        this.pl_name = pl_name;
        this.gaia_dist = gaia_dist;
        this.st_teff = st_teff;
        this.st_mass = st_mass;
        this.st_rad = st_rad;
        this.rowupdate = rowupdate;
        this.pl_disc = pl_disc;
        this.pl_facility = pl_facility;
        this.pl_status = pl_status;
    }

    public int getLoc_rowid() {
        return loc_rowid;
    }
    public String getPl_hostname() {
        return pl_hostname;
    }
    public String getPl_letter() {
        return pl_letter;
    }
    public String getPl_name() {
        return pl_name;
    }
    public float getGaia_dist() {
        return gaia_dist;
    }
    public float getSt_teff() {
        return st_teff;
    }
    public float getSt_mass() {
        return st_mass;
    }
    public float getSt_rad() {
        return st_rad;
    }
    public String getRowupdate() {
        return rowupdate;
    }
    public Year getPl_disc() {
        return pl_disc;
    }
    public String getPl_facility() {
        return pl_facility;
    }
    public int getPl_status() {
        return pl_status;
    }
    
    @Override
    public int compareTo (Planet o) {
        return this.loc_rowid - o.getLoc_rowid();
    }

    @Override
    public String toString() {
        return "Planet{" +
                "loc_rowid=" + loc_rowid +
                ", pl_hostname='" + pl_hostname + '\'' +
                ", pl_letter='" + pl_letter + '\'' +
                ", pl_name='" + pl_name + '\'' +
                ", gaia_dist=" + gaia_dist +
                ", st_teff=" + st_teff +
                ", st_mass=" + st_mass +
                ", st_rad=" + st_rad +
                ", rowupdate='" + rowupdate + '\'' +
                ", pl_disc=" + pl_disc +
                ", pl_facility='" + pl_facility + '\'' +
                ", pl_status=" + pl_status +
                '}';
    }
    
    
}
