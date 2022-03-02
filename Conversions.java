/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversion;

/**
 *
 * @author achmadmutawazin
 */
public class Conversions {
    //attribute
    public double celcius, reamur, farenheit, kelvin;
    public String water;


public Conversions (double celcius){
this.celcius = celcius;
}
public void convertz(){
farenheit = (9 * celcius)/5 +32;
reamur = (4*celcius)/5;
kelvin = (celcius + 273.15);
if (celcius >= 100){
water = "Boiling";}
else if (celcius <= 0){
water = "Freezing";}else {
water = "Normal";}
System.out.println("In Celcius      : " + celcius );
System.out.println("In Farenheit    : " + farenheit);
System.out.println("In Reamur       : " + reamur);
System.out.println("In Kelvin       : " + kelvin );
System.out.println("Water Condition " + water );
}
}
