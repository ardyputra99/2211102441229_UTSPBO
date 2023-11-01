import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

    public class snake extends Actor
{
    public int JumlahApelDimakan = 0;
    public void act()
    {
        checkKey();
    }
    public void checkKey(){
        move(1);
        if(Greenfoot.isKeyDown("up")){
            turn(-5);
        }
        if(Greenfoot.isKeyDown("down")){
            turn(5);
        }
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-2, getY());
        }
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+2, getY());
        }
        MakanApel();
    }
    public void MakanApel(){
        Actor apel = getOneObjectAtOffset(0,0, apel.class);
        if(apel != null){
            getWorld().removeObject(apel);
            JumlahApelDimakan++;
        }
    }
}
