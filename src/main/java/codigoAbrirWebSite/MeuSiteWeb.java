package codigoAbrirWebSite;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MeuSiteWeb {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("index.html"))) {

            String html = "<html>"
                    + "<head>"
                    + "<style>"
                    + "body {"
                    + "    display: flex;"
                    + "    flex-direction: column;"
                    + "    align-items: center;"
                    + "    justify-content: center;"
                    + "    height: 100vh;"
                    + "    background-image: url('imagens/FOTO.jpg');"
                    + "    background-size: cover;"
                    + "    justify-content: center;" // Centraliza verticalmente o conteúdo
                    + "    margin-left: 20px;" // Adiciona uma margem esquerda para mover o site para a direita
                    + "    color: white;" // Define a cor do texto como branco
                    + "}"
                    + ".button-container {"
                    + "    display: flex;"
                    + "    gap: 50px;" // Aumenta o espaçamento entre os botões para 50 pixels
                    + "}"
                    + ".button-container button {"
                    + "    color: white;" // Define a cor do texto dos botões como branco
                    + "    font-size: 40px;" // Define o tamanho da fonte dos botões como 40 pixels
                    + "    padding: 10px 20px;" // Adiciona um espaçamento interno aos botões
                    + "}"
                    + ".highlight-box {"
                    + "    background-color: rgba(255, 255, 255, 0.2);"
                    + "    padding: 10px 20px;"
                    + "    border-radius: 10px;"
                    + "}"
                    + "button {"
                    + "    border: none;"
                    + "    background: none;"
                    + "    padding: 0;"
                    + "    text-decoration: underline;"
                    + "    cursor: pointer;"
                    + "}"
                    + ".header-text {"
                    + "    font-size: 80px;" // Aumenta o tamanho da fonte do cabeçalho para 80 pixels
                    + "    background-color: rgba(0, 0, 0, 0.5);" // Define um fundo com transparência para o cabeçalho
                    + "    padding: 20px;" // Adiciona um espaçamento interno ao cabeçalho
                    + "    border-radius: 10px;" // Adiciona bordas arredondadas ao cabeçalho
                    + "}"
                    + "</style>"
                    + "<script>"
                    + "function openPage() {"
                    + "    window.open('https://www.youtube.com/watch?v=HR4ZxjGQGYY', '_blank');"
                    + "}"
                    + "function moveButton(event) {"
                    + "    var button = document.getElementById('buttonNo');"
                    + "    var centerX = window.innerWidth / 2;"
                    + "    var centerY = window.innerHeight / 2;"
                    + "    var rangeX = centerX / 2;" // Define a metade da largura da área central
                    + "    var rangeY = centerY / 2;" // Define a metade da altura da área central
                    + "    var randomX = Math.random() * rangeX + centerX - rangeX / 2;"
                    + "    var randomY = Math.random() * rangeY + centerY - rangeY / 2;"
                    + "    button.style.position = 'absolute';"
                    + "    button.style.left = randomX + 'px';"
                    + "    button.style.top = randomY + 'px';"
                    + "}"
                    + "</script>"
                    + "</head>"
                    + "<body>"
                    + "<h1 class='header-text'>Quer ser minha ? ? ?</h1>"
                    + "<div class='button-container'>"
                    + "<div class='highlight-box'>"
                    + "<button onclick='openPage()'>SIM</button>"
                    + "</div>"
                    + "<div class='highlight-box'>"
                    + "<button id='buttonNo' onmousemove='moveButton(event)'>NÃO</button>"
                    + "</div>"
                    + "</div>"
                    + "</body>"
                    + "</html>";

            writer.write(html);
            System.out.println("Site criado com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
