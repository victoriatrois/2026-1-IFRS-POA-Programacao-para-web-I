void main() {
    try (BufferedReader leitura = new BufferedReader(
                new FileReader(
                        new File("Arquivo.txt")))) {
        String content;
        while( ( content = leitura.readLine() ) != null){
            System.out.println( content );
        }
    } catch (NullPointerException error) {
        System.out.println("O nome do arquivo é nulo.");
    } catch (FileNotFoundException error) {
            System.out.println("Arquivo não encontrado.");
    } catch (IOException error) {
        System.out.println("Erro ao escrever no arquivo.");
    } catch (Exception error) {
        System.out.println("Exceção desconhecida.");
        System.out.println(error.getMessage());
    }
}
