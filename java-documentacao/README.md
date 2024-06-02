# JAVA DOCUMENTAÇÃO

## Javadoc

Javadoc é um gerador de documentação criado pela Sun Microsystems , para documentar a API dos programas em Java, a partir do código-fonte. O resultado é expresso em HTML. É constituído, basicamente, por algumas marcações muitos simples, inseridas nos comentários do programa.

Criando nossa documentação no formato html, para disponibilizar via web

> No terminal execute o comando abaixo
>
> javadoc -encoding UTF-8 -docencoding ISO-8859-1  -d ../docs  src/*.java

## Tags

Java Documentation é composto por tags que, representam dados relevantes para a compreensão da proposta de uma classe e os conjuntos de seus métodos e atributos conforme tabela abaixo:

| **Tag**    | **Descrição** |
| -------- | ------- |
| @author  | Autor / Criador |
| @version | Versão do recurso disponibilizado |
| @since | Versão / Data de início da disponibilização do recurso |
| @param | Descrição dos parâmetros dos métodos criados |
| @return | Definição do tipo de retorno de um método |
| @throws | Se o método lança alguma exceção |




