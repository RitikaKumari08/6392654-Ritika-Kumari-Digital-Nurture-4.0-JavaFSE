import React from 'react';

function EvenPlayers({ team }) {
  return (
    <ul>
      {team.map((player, index) => {
        if ((index + 1) % 2 === 0) {
          let position = ["Second", "Fourth", "Sixth"][Math.floor(index / 2)];
          return (
            <li key={index}>
              {position} : {player}
            </li>
          );
        }
        return null;
      })}
    </ul>
  );
}

export default EvenPlayers;
