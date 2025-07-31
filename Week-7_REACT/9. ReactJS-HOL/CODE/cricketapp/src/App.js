import React from 'react';
import ListofPlayers from './ListofPlayers';
import Scorebelow70 from './Scorebelow70';
import OddPlayers from './OddPlayers';
import EvenPlayers from './EvenPlayers';
import ListofIndianPlayers from './ListofIndianPlayers';

function App() {
  const players = [
    { name: "Jack", score: 50 },
    { name: "Michael", score: 70 },
    { name: "John", score: 40 },
    { name: "Ann", score: 61 },
    { name: "Elisabeth", score: 61 },
    { name: "Sachin", score: 95 },
    { name: "Dhoni", score: 100 },
    { name: "Virat", score: 84 },
    { name: "Jadeja", score: 64 },
    { name: "Raina", score: 75 },
    { name: "Rohit", score: 80 },
  ];

  const indianPlayers = ["Sachin1", "Dhoni2", "Virat3", "Rohit4", "Yuvaraj5", "Raina6"];
  const T20Players = [
    "Mr. First Player",
    "Mr. Second Player",
    "Mr. Third Player",
  ];
  const RanjiPlayers = [
    "Mr. Fourth Player",
    "Mr. Fifth Player",
    "Mr. Sixth Player",
  ];

  return (
    <div>
      <h1>List of Players</h1>
      <ListofPlayers players={players} />

      <hr />

      <h1>List of Players having Scores Less than 70</h1>
      <Scorebelow70 players={players} />

      <hr />

      <h1>Odd Players</h1>
      <OddPlayers team={indianPlayers} />

      <hr />

      <h1>Even Players</h1>
      <EvenPlayers team={indianPlayers} />

      <hr />

      <h1>List of Indian Players Merged:</h1>
      <ListofIndianPlayers
        T20Players={T20Players}
        RanjiPlayers={RanjiPlayers}
      />
    </div>
  );
}

export default App;
