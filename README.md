# Exoplanets   

## 1.Introduction  

Backend was developed by [shuffle-coding](https://github.com/shuffle-coding) and [samihintersteiner](https://github.com/samihintersteiner).  
Frontend was developed by [ahmedaltaai](https://github.com/ahmedaltaai).  

This Project was created for the educational purpose to learn Java EE.  

The source of the data is a "small" csv of datas in [Nasa's Exoplanets Database](http://exoplanets.org/table).  

## 2.Tecnology Stack

### 2.1.Backend  

Backend was coded in [Apache Netbeans IDE](https://netbeans.apache.org/).
At the given time, this was the better IDE we could use. The reasons for this are following:

- Netbeans was at the given time the only IDE, that supported Java EE on a non profit basis.
- It was easy to use and keybinds were not that different compared to other IDE's
- Servlet's have a good Implementation in Netbeans.

Java EE made it possible to read HTTP reqests and send response back.  
Apache Tomcats was beeing used to create the Web Server for hosting this Servlet.  

The service can be used with GET or POST on [http://erik.entwicklung.ws:8080/Planets/].  
Explanation for how to use this service and how it is made: see below.  
[GSON library](https://github.com/google/gson) is used to Build the Json, that gets returned to the sender.  

### 2.2.Frontend


## 3.How it Works

### 3.1.Backend

At the start of the Servlet, [Version2.csv](https://github.com/shuffle-coding/Exoplanets/blob/master/src/main/resources/files/Version2.csv) is read and every entry in there will be saved in a ArrayList.  

When you send [/Planets/all](http://erik.entwicklung.ws:8080/Planets/all) it returns you all Planets that are existing inside this csv file. Its iterating through all the Planets and pack them all inside a JSON String. This String is then returned to the the sender.  

If you want a filtered List of Planets you can type /Planets/filter?property="your key"&criteria="value, you want to filter for". This could look like this: [/Planets/filter?property=pl_disc&criteria=2016](http://erik.entwicklung.ws:8080//Planets/filter?property=pl_disc&criteria=2016). This returns you all Planets, that were discovered at the year 2016.  

You also can sort this Request: [/Planets/sort?property=pl_disc&criteria=desc](http://erik.entwicklung.ws:8080//Planets/sort?property=pl_disc&criteria=desc). This returns you the whole List, sorted by newest Discoveries first.  
You can sort every property of the given objects:  

- loc_rowid       This is simply the id of the entry and has nothing important to say
- pl_hostname     Stellar name most commonly used in the literature.
- pl_letter       Letter assigned to the planetary component of a planetary system.
- pl_name         Planet name most commonly used in the literature.
- gaia_dist       Distance computed from Gaia parallax.
- st_teff         Temperature of the star as modeled by a black body emitting the same total amount of electromagnetic radiation.
- st_mass         Amount of matter contained in the star, measured in units of masses of the Sun.
- st_rad          Length of a line segment from the center of the star to its surface, measured in units of radius of the Sun.
- rowupdate       Date of last update of the planet parameters.
- pl_disc         Year the planet was discovered
- pl_facility     Name of facility of planet discovery observations
- pl_status       Status of the planet (1 = announced, 2 = submitted, 3 = accepted, 0 = retracted).
