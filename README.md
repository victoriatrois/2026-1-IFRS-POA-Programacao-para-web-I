# 2026-1 IFRS POA - Programação para Web I

Repositório para armazenar notas de aula e projetos Java.

## 📁 Estrutura do Repositório

```
.
├── anotações/          # Anotações de aula em Markdown
├── projetos/       # Projetos Java propostos pela professora
└── README.md       # Este arquivo
```

## 🛠️ Ambiente de Desenvolvimento

Este repositório está configurado com um Dev Container que inclui:

- **Java 21** (OpenJDK)
- **Maven** e **Gradle** para gerenciamento de dependências
- **Extensões VS Code:**
  - Java Extension Pack (desenvolvimento Java completo)
  - Spring Boot Tools (para desenvolvimento web)
  - Markdown All in One (para anotações)
  - SonarLint (qualidade de código)
  - GitLens (controle de versão avançado)

## Como Usar

### Para Notas

1. Acesse a pasta `anotações/`
2. Crie arquivos `.md` para suas anotações
3. Use Markdown para formatação

### Para Projetos Java

1. Acesse a pasta `projetos/`
2. Crie uma pasta para cada novo projeto
3. Use Maven ou Gradle conforme orientação do professor

## 📝 Dicas

- **Ctrl+Shift+V** - Preview de arquivos Markdown
- **F5** - Debug de aplicações Java
- **Ctrl+Shift+P** → "Java: Create Java Project" - Criar novo projeto

## 🔄 Após Alterar o Dev Container

Se você modificar o arquivo `.devcontainer/devcontainer.json`, precisa reconstruir o container:

1. Pressione **Ctrl+Shift+P**
2. Digite "Dev Containers: Rebuild Container"
3. Aguarde a reconstrução

## 📚 Recursos

- [Documentação Java](https://docs.oracle.com/en/java/)
- [Maven Guide](https://maven.apache.org/guides/)
- [Markdown Guide](https://www.markdownguide.org/)
