import React, { useState } from 'react';

function CurrencyConvertor() {
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('EUR'); // Default currency

  const handleSubmit = (e) => {
    e.preventDefault();

    const rates = {
      EUR: 90,
      USD: 83,
      GBP: 105,
      JPY: 0.57
    };

    const rate = rates[currency];

    if (!amount || isNaN(amount)) {
      alert("Please enter a valid amount in INR.");
      return;
    }

    const result = parseFloat(amount) / rate;
    alert(`Converted Value: ${result.toFixed(2)} ${currency}`);
  };

  return (
    <div>
      <h2 style={{ color: "green" }}>Currency Convertor!!!</h2>
      <form onSubmit={handleSubmit}>
        <div>
          <label>Amount: </label>
          <input
            type="text"
            value={amount}
            onChange={(e) => setAmount(e.target.value)}
          />
        </div><br />
        <div>
          <label>Currency: </label>
          <select value={currency} onChange={(e) => setCurrency(e.target.value)}>
            <option value="EUR">Euro</option>
            <option value="USD">US Dollar</option>
            <option value="GBP">British Pound</option>
            <option value="JPY">Japanese Yen</option>
          </select>
        </div><br />
        <button type="submit">Submit</button>
      </form>
    </div>
  );
}

export default CurrencyConvertor;
