package ModelElements;

import java.util.ArrayList;

/**
 * класс Модель сцены
 */

public class Scene<Type1, Type2> {
    public int Id;

    public ArrayList<PoligonalModel> models = new ArrayList<>();
    public ArrayList<Flash> flashes = new ArrayList<>();
    public ArrayList<Camera> cameras = new ArrayList<>();

    /**
     * конструктор
     * @param inputModels
     * @param inputCameras
     */

    public Scene(PoligonalModel inputModels, Camera inputCameras) {
        models.add(inputModels);
        cameras.add(inputCameras);
    }

    /**
     * заглушка
     * @param t
     * @return
     */
    
    public Type1 metod1(Type1 t){
        return t;
    }

    /**
     * заглушка
     * @param t1
     * @param t2
     * @return
     */

    public Type1 metod2(Type1 t1, Type2 t2){
        return t1;
    }
}
