void main() {
    try (ObjectOutputStream out = new ObjectOutputStream(
            new FileOutputStream("Arquivo3.bin"))) {

        Pessoa objetoPessoa = new Pessoa("nome", 22, true);
        out.writeObject(objetoPessoa);

    } catch (NullPointerException error) {
        System.out.println("O nome do arquivo está nulo.");

    } catch (SecurityException error) {
        System.out.println("Faltam permissões para executar essa ação.");

    } catch (InvalidClassException error) {
        System.out.println("Classe inválida.");

    } catch (NotSerializableException error) {
        System.out.println("O objeto não pode ser enviado para o arquivo.");

    } catch (FileNotFoundException error) {
        System.out.println("Arquivo não encontrado");

    } catch (IOException error) {
        System.out.println("Erro ao escrever no arquivo.");

    } catch (Exception error) {
        System.out.println("Exceção desconhecida");
    }
}
