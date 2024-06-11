import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';

const root = ReactDOM.createRoot(document.getElementById('root'));//this tells where the element needs to be rendered
root.render(
  <React.StrictMode>
    <App />
    
  </React.StrictMode>
);
//this kind of code is called JSX which is not understood by browser
//We are telling to render the custom HTML element App into the element root
//This is the first thing code is getting executed
// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
