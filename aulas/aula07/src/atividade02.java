void main() {
    File arqLeit = new File("Arquivo.txt");
    try (FileReader fr = new FileReader(arqLeit)) {
        int c = fr.read();
        while (c != -1) {
            System.out.print((char) c);
            c = fr.read();
        }
    } catch (FileNotFoundException error) {
        System.out.println(error.getMessage());
        throw new RuntimeException(error);
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
}
