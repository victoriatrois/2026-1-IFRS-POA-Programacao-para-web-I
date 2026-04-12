import javax.swing.*;

void main() {
    // em java, entrada e saída de arquivos é feita com fluxos/streams
    // Todas as classes pertencem ao pacote java.io

    // A principal classe é a classe File, que compreende em um ponteiro para um caminho no sistema de arquivos
    // FileWriter.write() / FileReader.read()

    // String nomeDoArquivo = JOptionPane.showInputDialog("Insira o nome do arquivo:");

    File arqE = new File("Arquivo.txt"); // cria o arquivo se não existir
    try (FileWriter fw = new FileWriter(arqE)) {
        fw.write('2');

        fw.write("2");
        fw.flush();
        fw.close();
    } catch (NullPointerException error) {
        System.out.println("Nome do arquivo nulo.");
//        System.out.println(error.getMessage());
        error.fillInStackTrace();
    } catch (IOException error) {
        System.out.println("Erro ao acessar o arquivo ou ao escrever no arquivo.");
//        System.out.println(error.getMessage());
        error.fillInStackTrace();
    } catch (Exception error) {
        System.out.println(error.getMessage());
    }
    // ou
//     catch (NullPointerException | IOException | Exception error) {
//        System.out.println(error.getMessage());
//        throw new RuntimeException(error);
//    }
}