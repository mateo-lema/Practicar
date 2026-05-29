package controllers;
import models.Producto;

public class ProductoController {
   


    public void SortByPriceShell(Producto[]productos){
        for(int gap=productos.length/2;gap>0;gap/=2){
            for(int i=gap;i<productos.length;i++){
                Producto aux=productos[i];
                int j=i;
                while(j>=gap && productos[j-gap].getPrecio()<aux.getPrecio()){
                    productos[j]=productos[j-gap];
                    j-=gap;
                }
                productos[j]=aux;
            }
        }
    }


    public void SortByPriceInsertion(Producto[] productos){
        for(int i=1;i<productos.length;i++){
            Producto aux=productos[i];
            int j=i-1;
            while(j>=0&& productos[j].getPrecio()<aux.getPrecio()){
                productos[j+1]=productos[j];
                j--;
            }
            productos[j+1]=aux;
        }
    }


    public void SortByPriceSelection(Producto[]productos){
        for(int i=0;i<productos.length;i++){
            int indiceMenor=i;
            for(int j=i + 1;j<productos.length;j++){
                if(productos[j].getPrecio()>productos[indiceMenor].getPrecio()){
                    indiceMenor=j;
                }
                if(i!=indiceMenor){
                    Producto aux= productos[i];
                    productos[i]=productos[indiceMenor];
                    productos[indiceMenor]=aux;

                }
            }
        }
    }


    public void SortByPriceBubble(Producto[]productos){
        for(int i=0;i<productos.length;i++){
            boolean swap=false;
            for(int j=0;j<productos.length-1-i;j++){
                if(productos[j].getPrecio()<productos[j+1].getPrecio()){
                    Producto aux=productos[j];
                    productos[j]=productos[j+1];
                    productos[j+1]=aux;
                    swap=true;
                }
            }
            if(swap==false){
                break;
            }
        }
    }



     public Producto BinarySearchByPrice(Producto[] productos, double precioBuscar){
        int alto=productos.length-1;
        int bajo=0;
        while(bajo<= alto){
            int centro=(alto+bajo)/2;
            if(productos[centro].getPrecio()== precioBuscar){
                return productos[centro];
            }
            if(productos[centro].getPrecio()>precioBuscar){
                bajo=centro+1;
            }else{
                alto=centro-1;
            }

        }
        return null;
     }


     //como recorrer arreglo en orden

     public int getTotalValidYears(){
    int totalValidYears=0;
    for(CarModel model:models){
      for(CarYear year:model.getYears()){
        if(year.isValid()==true){
          totalValidYears++;

        }
      }
    }
    return totalValidYears;
  }

     
}
