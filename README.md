# Trabalho de conclusão de curso - Pedro Bueno
# Conclusion course project - Pedro Bueno

## Repositório para armazenar códigos das aplicações criadas para o TCC
## Repository for storage all code from the applications created for the project
English at the final

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

Duvidas e sugestões [<img src="readmefiles/mailto.png" width="25" alt="mailto" style="vertical-align:bottom"> ](mailto:pedroarcbueno@gmail.com?subject=%5BTCC%5D%20D%C3%BAvida)

Para leitura do texto, acesse [este link](https://drive.google.com/file/d/1eUHLOdNRd9tGkRDw7cipfk9g5rHDbz0m/view?usp=sharing)

#### Scripts

- Requirements:
  - Appium desktop version
  - AVD device setted
  - Visual Studio Code
  - Java Extension Pacl for VSCode
    <br>
- For running the script (either for the Flutter app either for the Android app) follow the steps:

  - Change the property `DEVICE_NAME` from file `Constants.java` for the name of the device used
  - In the file `App.java`, in the variable `repeticoes`, define how many itens should be created
  - In the file `App.java`, uncomment wich function shoud be tested:

    - `create()` - inserts itens and stores the memory cost for eatch insert
    - `update()` - inserts itens and updates title text and body text, stores the memory cost for each update
    - `remove()` - insert itens and delete them, stores the memory cost for each deletion

  - For VSCode, it's neede to be installed the `Java Extension Pack` for the "Run" option be available

  - At the end, a file `resultadosFlutter.json` or `resultadosAndroid.json` will be created with a list of objects. These objects can be parsed in [this site](https://www.convertcsv.com/json-to-csv.htm).
  
Questions and sugestiosn [<img src="readmefiles/mailto.png" width="25" alt="mailto" style="vertical-align:bottom"> ](mailto:pedroarcbueno@gmail.com?subject=%5BTCC%5D%20Question)
ida)

For the article text (pt-br only), access [this link](https://drive.google.com/file/d/1eUHLOdNRd9tGkRDw7cipfk9g5rHDbz0m/view?usp=sharing)
