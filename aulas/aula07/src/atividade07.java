void main() {
    try (InputStream entrada = new FileInputStream(new File("Arquivo.bin"))) {
        int content = 0;

        while ((content = entrada.read()) != -1) {
            System.out.println( content +" - "+ ((char) content));
        }

    } catch (NullPointerException error) {
        System.out.println("O nome do arquivo está nulo.");
    } catch (SecurityException error) {
        System.out.println("Faltam permissões para executar essa ação.");
    } catch (FileNotFoundException error) {
        System.out.println("Arquivo não encontrado");
    } catch (IOException error) {
        System.out.println("Erro ao ler no arquivo.");
    } catch (Exception error) {
        System.out.println("Exceção desconhecida");
    }
}
