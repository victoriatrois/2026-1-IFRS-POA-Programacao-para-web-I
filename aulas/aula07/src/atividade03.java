void main() throws Exception {
    File arqLeit = new File("Arquivo.txt");
    FileReader fr = new FileReader(arqLeit);
    int c = fr.read();

    while (c != -1) {
        System.out.print((char) c);
        c = fr.read();
    }
}
