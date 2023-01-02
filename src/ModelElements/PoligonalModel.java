package ModelElements;

import java.util.ArrayList;

/**
 * модель полигона
 */

public class PoligonalModel {
    public ArrayList<Texture> Textures;
    public ArrayList<Poligon>  Poligons;

    public PoligonalModel(ArrayList<Texture> textures){
        this.Poligons = new ArrayList<>();
        this.Textures = textures;
    }
}