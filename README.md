# Trabalho de conclusão de curso - Pedro Bueno

Repositório para armazenar códigos das aplicações criadas para o TCC

#### Scripts

- Requerimentos:
  - Appium versão desktop
  - Um dispositivo AVD configurado
  - Visual Studio Code
  - Extensão Java Extension Pack para VSCode
    <br>
- Para executar o script (tanto pro app em Flutter quanto para o app em Android) siga os passos:

  - Altere a propriedade `DEVICE_NAME` do arquivo `Constants.java` para o nome do dispositivo utilizado
  - No arquivo `App.java`, na variável `repeticoes`, insira quantos itens devem ser criados
  - No arquivo `App.java`, descomente qual a função deve ser testada:

    - `create()` - insere os itens e armazena o custo de memória a cada inserção
    - `update()` - insere os itens e modifica os textos de títlo e corpo, armazenando o custo de memória a cada modificação
    - `remove()` - insere os itens e então os remove, armazenando o custo de memória a cada remoção.

  - Pelo VSCode, é necessário apenas ter instalado o `Java Extension Pack` que a opção "Run" estará disponível.

  - Ao final, um arquivo `resultadosFlutter.json` (ou `resultadosAndroid.json`) será criado contendo uma lista de objetos. Estes podem ser convertidos em tabela por meio [deste site](https://www.convertcsv.com/json-to-csv.htm).

Duvidas e sugestões [<img src="readmefiles/mailto.png" width="25" alt="mailto" style="vertical-align:bottom"> ](mailto:parcb.augusto@gmail.com?subject=%5BTCC%5D%20D%C3%BAvida)
