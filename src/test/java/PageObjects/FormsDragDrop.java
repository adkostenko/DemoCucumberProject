package PageObjects;

public class FormsDragDrop extends CommonPage {
    Navigation navigation = new Navigation();

    public void navigateToDragDrop() {
        navigate();
        navigation.pressOnDragDropItem();
    }
}