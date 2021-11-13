## Jenkins Pipeline

Esse pipeline foi criado apenas para conhecimento, notem que não estou realizando testes integrados e também não verifico a integridade da imagem.

#### Topologia:

- Servidor Jenkins (http://192.168.0.11/jenkins)
- Servidor SonarQube (http://192.168.0.22:9000/)
- Servidor de Execução (192.168.0.22)

#### Setup:

>No servidor Jenkins:

Foi necessário a instalação do Docker e do Sonar-Scanner, os links para instalação estão logo abaixo:

- [x] - [Install Docker](https://docs.docker.com/v17.12/install/)
- [x] - [SonarScanner](https://docs.sonarqube.org/latest/analysis/scan/sonarscanner/)
- [x] - [Jenkins](https://bitnami.com/stack/jenkins)

>Obs: importante verificar o caminho onde foi instalado o sonar-scanner.

Sem muito o que configurar, no meu caso apenas tive que instalar o Docker e o Docker-Compose. Fica como referência este documento para instalação:

[SonarSource/docker-sonarqube](https://github.com/SonarSource/docker-sonarqube/blob/master/recipes/docker-compose-postgres-example.yml)

No servidor de Execução:

Como a aplicação é pequena, decidi utilizar o mesmo servidor do SonarQube para a execução, como já tinha o Docker instalado, não precisei de mais nenhuma configuração.

<a href="https://www.linkedin.com/in/mateus-macedo-937a32163/">
 <img style="border-radius:50%" width="100px; "src="https://avatars.githubusercontent.com/u/63172367?s=460&u=11fd26ea8a7f5663d7707d7ef254e4f8bfca1b05&v=4"/>
 <p>Mateus Macedo</p>
</a>
