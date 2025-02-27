# 🚀 Padrões de Commits e GitHub

Os repositórios do projeto estão na organização do GitHub: [Grupo-6-2SISA](https://github.com/Grupo-6-2SISA)

## 📌 Formato do Commit

```bash
<tipo>(<escopo opcional>): <descrição curta no presente e imperativo>

[Corpo opcional explicando o motivo da mudança, o que foi alterado e impactos]

[Issue relacionada, se houver]
```

## 📊 Tipos de Commits (Conventional Commits)

| Prefixo        | Significado                                         |
| -------------- | --------------------------------------------------- |
| 🎉 `feat`      | Adição de nova funcionalidade                       |
| 🐛 `fix`       | Correção de bugs                                    |
| 🏗️ `refactor` | Refatoração do código (sem mudar funcionalidade)    |
| 🛠️ `chore`    | Mudanças na configuração, dependências              |
| 🎨 `style`     | Alterações de formatação, lint, espaços, indentação |
| 🧪 `test`      | Adição ou correção de testes                        |
| 📖 `docs`      | Alterações na documentação                          |
| 🔧 `ci`        | Mudanças na configuração de CI/CD                   |
| ⚡ `perf`       | Melhorias de performance                            |
| ⏪ `revert`     | Reversão de commit                                  |

## 🏆 Exemplos de Commits Bem Escritos

### ✅ Commit Simples

```bash
feat(user): adicionar validação de e-mail no cadastro
```

### 📜 Commit com Corpo Explicativo

```bash
fix(auth): corrigir erro na geração de token JWT

O erro acontecia porque o tempo de expiração estava sendo passado como string 
ao invés de um número inteiro. Agora, a conversão para `Long` foi corrigida.

Fixes #42
```

### 🔄 Commit para Atualização de Dependências

```bash
chore(deps): atualizar Spring Boot para versão 3.1.0
```

##
