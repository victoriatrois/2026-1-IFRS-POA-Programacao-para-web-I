void main() {
    try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("Arquivo.bin"))) {
        var objetoPessoa = (Pessoa) in.readObject();

        System.out.println(objetoPessoa);

    } catch (SecurityException error) {
        System.out.println("Faltam permissões para executar essa ação.");

    } catch (FileNotFoundException error) {
        System.out.println("Arquivo não encontrado");

    } catch (NullPointerException error) {
        System.out.println("O nome do arquivo está nulo.");

    } catch (StreamCorruptedException error) {
        System.out.println("O arquivo foi corrompido.");

    } catch (ClassNotFoundException error) {
        System.out.println("Classe não encontrada.");

    } catch (InvalidClassException error) {
        System.out.println("Classe inválida.");

    } catch (OptionalDataException error) {
        System.out.println("Tipos primitivos não podem ser salvos.");

    } catch (IllegalStateException error) {
        System.out.println("O arquivo foi corrompido.");

    } catch (IOException error) {
        System.out.println("Erro ao ler no arquivo.");

    } catch (Exception error) {
        System.out.println("Exceção desconhecida");
    }
}
