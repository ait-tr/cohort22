## Deploy on GitHub Pages
  Дорогие друзья, на данном этапе вы уже создали реакт-приложение, осталось только сделать финальные штрихи. Данная инструкция поможет вам, выполните ее по шагам.

1. В package.json вашего проекта перед строчкой ``name`` добавьте строку  

```"homepage": "./", ```

2. Установите пакет gh-pages при помощи команды.
```npm install gh-pages -D```  
Обратите внимание, что после выполнения в файле package.json будет добавлена новая  development dependencies:
```
"devDependencies": {
    "gh-pages": "^5.0.0"
  }
  ```
3. Добавьте свойства "predeploy" и "deploy" в скрипт в "scripts" в `package.json`
 ```json
  "scripts": {
    "start": "react-scripts start",
    "predeploy": "npm run build",
    "deploy": "gh-pages -d build",
    "build": "react-scripts build",
    "test": "react-scripts test",
    "eject": "react-scripts eject",
    "typecheck": "tsc",
    "lint": "eslint ."
  },
 ```
 4. Если в вашем проекте используется роутер, замените BrowserRouter на HashRouter:
 ``` javascript
 import { HashRouter } from 'react-router-dom';

 const root = ReactDOM.createRoot(
  document.getElementById('root') as HTMLElement
);
root.render(
  <React.StrictMode>
    <HashRouter>
      <App />
    </HashRouter>
  </React.StrictMode>
);
 ```

 5. Создайте пустой репозиторий на GitHub. Вы можете назвать его так же как ваше приложение. 
 
 6. Добавьте "remote" к вашему локальному GitHub репозиторию
  
Для этого запустите в терминале команду: 

``git remote add origin https://github.com/{username}/{repo-name}.git``

Не забудьте заменить `username` и `repo-name` на ваше актуальное имя пользователя и имя репозитория.

7. Запушьте React app в GitHub репозиторий
Для это запустите команду: ``npm run deploy``

```
Это приведет к запуску скриптов predeploy и deploy, определенных в package.json.

Под капотом сценарий предварительного развертывания(predeploy) создаст дистрибутив версию приложения React и сохранит ее в папке с именем build. Затем сценарий развертывания запушит содержимое этой папки в новую в ветку gh-pages вашего репозитория GitHub, создав эту ветку, если она еще не существует.

По умолчанию новый коммит в ветке gh-pages будет иметь сообщение коммита `Updates`. Вы можете указать собственное сообщение коммита: 
npm run deploy -- -m "Deploy React app to GitHub Pages"
```

8.  Настройка GitHub Pages
В вашем браузере перейдите в настройки GitHub Pages
"Settings" --> "Code and automation" --> "Pages" --> "Build and deployment"  
  
  Выберите следующие значения: 
- Source: Deploy from a branch
- Branch: gh-pages
- Folder: / (root)  
Нажмите "Save".   
На этом этапе вы успешно справились с deploy. 😈 

9. Разместить sorce код на GitHub в ветке main
```
git add .
git commit -m "Message of your commit"
git push origin master
```