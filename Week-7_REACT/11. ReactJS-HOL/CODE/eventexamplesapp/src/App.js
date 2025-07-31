import React, { useState } from 'react';
import './App.css';
import CurrencyConvertor from './CurrencyConvertor';

function App() {
  const [count, setCount] = useState(0);

  const increment = () => {
    setCount(prev => prev + 1);
    sayHello();
  };

  const decrement = () => {
    setCount(prev => prev - 1);
  };

  const sayHello = () => {
    alert("Hello! Member1");
  };

  const sayWelcome = (msg) => {
    alert(msg);
  };

  const handleClick = (e) => {
    alert("I was clicked");
  };

  return (
    <div style={{ padding: '20px' }}>
      <h3>{count}</h3>
      <button onClick={increment}>Increment</button> &nbsp;
      <button onClick={decrement}>Decrement</button> <br /><br />
      <button onClick={() => sayWelcome("Welcome!")}>Say welcome</button> <br /><br />
      <button onClick={handleClick}>Click on me</button>

      <hr />

      <CurrencyConvertor />
    </div>
  );
}

export default App;
