import React from 'react';
import './App.css';
import officeImg from './office.jpg'; // Use correct path if image is in /public

function App() {
  const heading = "Office Space";
  const office = {
    Name: "DBS",
    Rent: 50000,
    Address: "Chennai"
  };

  const rentClass = office.Rent <= 60000 ? "textRed" : "textGreen";

  return (
    <div>
      <h1>{heading} , at Affordable Range</h1>
      <img src={officeImg} width="25%" height="25%" alt="Office Space" />
      <h1>Name: {office.Name}</h1>
      <h3 className={rentClass}>Rent: Rs. {office.Rent}</h3>
      <h3>Address: {office.Address}</h3>
    </div>
  );
}

export default App;
