public abstract class DocumentCreator {
    public abstract Document createDocument(); // Factory Method

    // Можно оставить общий метод, который использует фабричный метод
    public void openDocument() {
        Document doc = createDocument();
        doc.open();
    }
}
