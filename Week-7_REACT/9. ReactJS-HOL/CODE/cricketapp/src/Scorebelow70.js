import React from 'react';

function Scorebelow70({ players }) {
  const playersBelow70 = players.filter(player => player.score < 70);

  return (
    <ul>
      {playersBelow70.map((item, index) => (
        <li key={index}>
          Mr. {item.name} <span>{item.score}</span>
        </li>
      ))}
    </ul>
  );
}

export default Scorebelow70;
