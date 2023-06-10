
package com.onlar_pattern.singleton;

import java.lang.reflect.Constructor;
/*

One of those solutions is by throwing a run-time exception in the constructor 
if the instance already exists. This would prevent you to create another instance.
*/
public class Singleton 
{
	 private float coffeQty;
	    private float milkQty;
	    private float waterQty;
	    private float sugarQty;
	    
	    static private Singleton my=null;
	    
	    private Singleton()
	    {
	        coffeQty=1;
	        milkQty=1;
	        waterQty=1;
	        sugarQty=1;
//Throwing a run-time exception would prevent Reflection API 
//	        to create object
//if( my != null ) {
// throw new InstantiationError( "Object creation is not allowed!" );
//	        }
	    }
	    
	    public void fillWater(float qty)
	    {
	        waterQty=qty;
	    }
	    public void fillSugar(float qty)
	    {
	        sugarQty=qty;
	    }
	    public float getCoffee()
	    {
	        return 0.15f;
	    }
	    
	    static Singleton getInstance()
	    {
	        if(my==null)
	            my=new Singleton();
	        return my;
	    }
	    
    @Override
		public String toString() {
			return "Singleton [coffeQty=" + coffeQty + ", milkQty=" + milkQty + ", waterQty=" + waterQty + ", sugarQty="
					+ sugarQty + "]";
		}

	public static void main(String[] args) 
    {
    	Singleton m1=Singleton.getInstance();
    	
//    	Singleton m2=Singleton.getInstance();
    	Singleton m2=new Singleton();
    	try {
            Constructor constructor = Singleton.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            m2 = (Singleton) constructor.newInstance();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    	Singleton m3=Singleton.getInstance();
        
        System.out.println(m1+" "+m2+" "+m3);
        if(m1==m2 && m1==m3)
            System.out.println("Same");
        System.out.println("Hashcode of Object 1 - " + m1.hashCode());
        System.out.println("Hashcode of Object 2 - " + m2.hashCode());
        System.out.println("Hashcode of Object 3 - " + m3.hashCode());
    }   
}
