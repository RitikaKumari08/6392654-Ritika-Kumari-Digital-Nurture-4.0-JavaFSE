import React from 'react';

function ListofIndianPlayers({ T20Players, RanjiPlayers }) {
  const merged = [...T20Players, ...RanjiPlayers];

  return (
    <ul>
      {merged.map((player, index) => (
        <li key={index}>{player}</li>
      ))}
    </ul>
  );
}

export default ListofIndianPlayers;
