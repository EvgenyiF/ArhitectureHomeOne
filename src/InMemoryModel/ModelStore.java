package InMemoryModel;

import ModelElements.*;

import java.util.ArrayList;

public class ModelStore implements IModelChanger {

    public ArrayList<PoligonalModel> models = new ArrayList<PoligonalModel>();
    public ArrayList<Scene> scenes = new ArrayList<Scene>();
    public ArrayList<Flash> flashes = new ArrayList<Flash>();
    public ArrayList<Camera> cameras = new ArrayList<Camera>();
    public ArrayList<Texture> textures = new ArrayList<Texture>();
    private ArrayList<IModelChangedObserver> changedObservers = new ArrayList<IModelChangedObserver>();

    /**
     * @param texture
     */

    public ModelStore(Texture texture) {
        models.add(new PoligonalModel(textures));
        flashes.add(new Flash());
        cameras.add(new Camera());
        scenes.add(new Scene(models.get(0), cameras.get(0)));
    }

    /**
     * метод интерфейса IModelChanger
     *
     * @param sender
     */

    @Override
    public void notifyChange(IModelChanger sender) {
    }

    /**
     * сцена по номеру
     *
     * @param sceneNumber
     * @return
     */
    
    public Scene getScene(int sceneNumber) {
        return scenes.get(sceneNumber);
    }
}
