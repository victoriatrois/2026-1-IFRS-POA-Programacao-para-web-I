void main() {
    try (BufferedWriter escrita = new BufferedWriter(
                new FileWriter(
                        new File("Arquivo.txt")))) {
        escrita.write( "teste" );
        escrita.newLine();
        escrita.write( "teste2");
    } catch (NullPointerException error) {
        System.out.println("Nome do arquivo nulo.");
    } catch (IOException error) {
        System.out.println("Erro ao escrever no arquivo.");
    } catch (Exception error) {
        System.out.println(error.getMessage());
        System.out.println("Exceção desconhecida.");
    }
}
