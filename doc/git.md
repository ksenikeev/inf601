1.  Дистрибутивы для установки: https://git-scm.com/install/

Документация: 
```
    git config --global user.name "John Doe"
    git config --global user.email johndoe@example.com
```
2. Переходи м в директорию где будет новый репозиторий
3. Локальный репозиторий: `git init` (автоматически создается директория .git)
   `git branch -m master`
4. `git add TestMethod.java` - добавляем файл в систему отслеживания
5. `git commit -m "создан TestMethod"` - фиксируем состояние добавленных в индексирование файлов (состояние на момент 
выполнения `git add TestMethod`).
Чаще фиксируется текущее состояние всех добавленных в индекс файлов `git commit -a -m "создан TestMethod"`
6. git remote add origin git@github.com:ksenikeev/inf602.git

8. ssh-keygen -t ed25519 -C "ksenikeev@mail.ru"