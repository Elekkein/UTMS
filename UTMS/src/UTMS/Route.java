package UTMS;

//Route class
class Route {
 private String routeId;
 private String routeName;
 private String startPoint;
 private String endPoint;
 private String[] stops;

 public Route(String routeId, String routeName, String startPoint, 
             String endPoint, String[] stops) {
     this.routeId = routeId;
     this.routeName = routeName;
     this.startPoint = startPoint;
     this.endPoint = endPoint;
     this.stops = stops;
 }

 // Getter methods
 public String getRouteId() { return routeId; }
 public String getRouteName() { return routeName; }
 public String getStartPoint() { return startPoint; }
 public String getEndPoint() { return endPoint; }
 public String[] getStops() { return stops; }
}