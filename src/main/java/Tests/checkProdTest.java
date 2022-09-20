package Tests;

import Pages.productStorePage;
import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class checkProdTest {

    @Test
     public void insert(){
    WebElement cart = driver.findElement(By.id("cartur"));
    cart.click();
}
    public void numberProducts(){
    List<WebElement> products = driver.findElements(By.className("success"));
    if(products.size()==1){
    Ststem.out.println("Number of items in the card == 1");
    else
    Ststem.out.println("Number of items in the card != 1");
     }
} 

     public void checkPrice(){
     list<WebElement> price_list = driver.findElements(By.tag_Name("td"));
     if(price_list.text(2)==650){
      Ststem.out.println("The price of the selected phone = 650");
     else
     Ststem.out.println("The price of the selected phone != 650");
      }
}
    
     public void checkName(){
     list<WebElement> names_list = driver.findElements(By.tag_Name("td"));
     if(names_list.text(1)=="Nexus 6"){
      Ststem.out.println("The title of the selected phone = Nexus 6");
     else
     Ststem.out.println("The title of the selected phone 1=Nexus 6");
      }
}
    

}
}
