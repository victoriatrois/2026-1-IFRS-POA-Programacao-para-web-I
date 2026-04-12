void main() {
    try (OutputStream saida = new FileOutputStream(new File("Arquivo.bin"))) {
        byte[] b = {50, 51, 52, 53};
        String string = "Teste com várias palavras";
        saida.write(53);
        saida.write(b);
        saida.write(string.getBytes());
    } catch (NullPointerException error) {
        System.out.println("O nome do arquivo está nulo.");
    } catch (SecurityException error) {
        System.out.println("Faltam permissões para executar essa ação.");
    } catch (FileNotFoundException error) {
        System.out.println("Arquivo não encontrado");
    } catch (IOException error) {
        System.out.println("Erro ao escrever no arquivo.");
    } catch (Exception error) {
        System.out.println("Exceção desconhecida");
    }
}
