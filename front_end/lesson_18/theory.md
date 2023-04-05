
### Create react app, useState
Чтобы создать приложение зайдите в папку, где хотите его расположить и введите в терминал команду(замените my-app на имя вашего приложения):
- npx create-react-app my-app --template typescript
  
После этого войдите в терминале в директорию приложение: 
- cd my-app
И запустите приложение:
- npm start

### Настройка eslint
- Создайте файл с именем .env в директории проекта.
- Добавьте в него следующую строку:
ESLINT_NO_DEV_ERRORS=true

### Запустите в терминале команды: 
- npm install --save-dev eslint-config-airbnb
- npm install --save-dev eslint-config-airbnb-typescript
После выполнения команд, у вас package-json у вас появится следующее свойство: 
```json lines
  "devDependencies": {
    "eslint-config-airbnb": "^19.0.4",
    "eslint-config-airbnb-typescript": "^17.0.0"
  }
```


- После этого замените в package-json свойства "scripts" и "eslintConfig" на:
````json lines
"scripts": {
    "start": "react-scripts start",
    "build": "react-scripts build",
    "test": "react-scripts test",
    "eject": "react-scripts eject",
    "typecheck": "tsc",
    "lint": "eslint ."
  },
  "eslintConfig": {
    "extends": [
      "react-app",
      "react-app/jest",
      "airbnb",
      "airbnb-typescript"
    ],
    "rules": {
      "react/jsx-indent": 0,
      "implicit-arrow-linebreak": 0,
      "@typescript-eslint/indent": 0,
      "@typescript-eslint/comma-dangle": 0,
      "function-paren-newline": 0,
      "no-param-reassign": 0,
      "no-nested-ternary": 0,
      "no-confusing-arrow": 0,
      "operator-linebreak": 0,
      "jsx-a11y/anchor-is-valid": 0,
      "jsx-a11y/label-has-associated-control": 0,
      "react/jsx-one-expression-per-line": 0,
      "jsx-a11y/click-events-have-key-events": 0,
      "default-case": 0,
      "@typescript-eslint/default-param-last": 0,
      "@typescript-eslint/switch-exhaustiveness-check": 2,
      "@typescript-eslint/explicit-function-return-type": [
        2,
        {
          "allowExpressions": true,
          "allowTypedFunctionExpressions": true,
          "allowHigherOrderFunctions": true,
          "allowDirectConstAssertionInArrowFunctions": true
        }
      ]
    },
    "parserOptions": {
      "project": [
        "tsconfig.json"
      ]
    }
  },
````

Теперь когда вы запускаете приложение у вас будут показываться ошибки от eslint.

### Для проектов на CRA мы будем использовать ES модули — с синтаксисом import/export
// App.jsx  
export default App;  

// index.jsx  
import App from './App';

### node_modules
Поскольку директория node_modules указана в gitignore, когда вы склонируете проект к себе, вам потребуется подгрузить все эти модули, сделать это можно при помощи команды npm i.

### TypeScript
TypeScript — это язык программирования, в котором исправлены многие недостатки JavaScript.
TS компилируется в JS и подходит для разработки любых проектов под любые браузеры — тем более что можно выбрать версию JS, в которую будет компилироваться код.

###  TypeScript: плюсы
- TS это open source проект Microsoft с большим сообществом
- ошибки допущенные в процессе модификации кода, видны
сразу, а не во время выполнения кода
- TS индустриальный стандарт типизации в веб-разработке
- 
###  TypeScript: минусы
- порог вхождения в TS выше, чем в JS
- несмотря на статическую типизацию, можно допустить
прохождение любого типа данных, прописав слово any
- если в работе вы используете пакет который не портирован
на TS, то вам придётся описывать типы всех функций и методов самостоятельно

## Ссылки
- React CRA: [ссылка](https://create-react-app.dev/docs/adding-typescript/)
- 


## Дополнительно:

- Статья про JSON и fetch: [ссылка](https://dmitripavlutin.com/fetch-with-json/)
- Статья про Event Loop: [ссылка](https://dev.to/lydiahallie/javascript-visualized-event-loop-3dif)  
- Онлайн визуализатор Event Loop: [ссылка](http://latentflip.com/loupe/?code=!!!PGJ1dHRvbj5DbGljayBtZSE8L2J1dHRvbj4%3D)  
- Теория по promise: [ссылка](https://learn.javascript.ru/promise-basics)
- API, которая предоставляет случайное URL - фото кота: [ссылка](https://aws.random.cat/meow)



