package com.codersbay.exoplanet;

import java.time.Year;

public class Planet {

    private int loc_rowid;
    private String pl_hostname;
    private String pl_letter;
    private String pl_name;
    private float gaia_dist;
    private float st_teff;
    private float st_mass;
    private float st_rad;
    private String rowupdate;
    private Year pl_disc;
    private String pl_facility;
    private int pl_status;

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
