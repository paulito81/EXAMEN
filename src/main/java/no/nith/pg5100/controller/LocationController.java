package no.nith.pg5100.controller;

import no.nith.pg5100.dto.Location;
import no.nith.pg5100.infrastructure.location.LocationDao;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.faces.model.SelectItem;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Model
public class LocationController {

    @Inject
    private LocationDao locationDAO;

    private int selectedId;
    private Location location;

    @PostConstruct
    public void init(){
        location = new Location();
    }

    public void persistNewLocation(){

        locationDAO.persistLocation(location);
    }

    public List<Location> getAllLocations(){
        return locationDAO.getAll();
    }

    public void findLocationById(){
        location = locationDAO.findById(selectedId);
    }
    public void deleteLocationById(){
        locationDAO.removeLocation(selectedId);
    }
    public List<SelectItem> getDetachedLocations(){
        List<Location> locations = locationDAO.getAllDetachedLocations();
        return locations.stream().map(l -> new SelectItem(l.getId(), l.getRoom() + " -" + l.getBuilding())).collect(Collectors.toList()) ;

    }

    public int getSelectedId() {
        return selectedId;
    }

    public void setSelectedId(int selectedId) {
        this.selectedId = selectedId;
    }

    public Location getLocation() {

        return location;
    }


    public void setLocation(Location location) {
        this.location = location;
    }
    public String getSelectedLocation(){
        return location.getRoom();
    }
}
