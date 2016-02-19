public interface Flys{
String fly();
}

class CantFly implements Flys{
public String fly(){
return "Can't Fly";
}
}

class CanFly implements Flys{
public String fly(){
return "Can Fly";
}
}