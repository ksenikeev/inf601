1.  
```
    git config --global user.name "John Doe"
    git config --global user.email johndoe@example.com
```
2. Переходи м в директорию где будет новый репозиторий
3. Локальный репозиторий: `git init` (автоматически создается директория .git)
4. git add TestMethod.java - добавляем файл в систему отслеживания
5. git commit -m "создан TestMethod" - фиксируем состояние
6. git remote add origin git@github.com:ksenikeev/inf602.git
7. git push -u origin master
8. ssh-keygen -t ed25519 -C "ksenikeev@mail.ru"