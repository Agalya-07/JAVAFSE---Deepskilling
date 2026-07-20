import React from "react";

function IndianPlayers() {

    const T20Players = [
        "Virat Kohli",
        "Rohit Sharma",
        "Hardik Pandya",
        "Suryakumar Yadav",
        "Jasprit Bumrah"
    ];

    const RanjiTrophyPlayers = [
        "Ruturaj Gaikwad",
        "Shubman Gill",
        "KL Rahul",
        "Ravindra Jadeja",
        "R Ashwin"
    ];

    // Array Merge using spread operator
    const allPlayers = [...T20Players, ...RanjiTrophyPlayers];

    return (
        <div>
            <h2>Indian Players</h2>

            <h3>T20 Players</h3>

            {T20Players.map((player, index) => (
                <p key={index}>{player}</p>
            ))}


            <h3>Ranji Trophy Players</h3>

            {RanjiTrophyPlayers.map((player, index) => (
                <p key={index}>{player}</p>
            ))}


            <h3>All Indian Players (Merged Array)</h3>

            {allPlayers.map((player, index) => (
                <p key={index}>{player}</p>
            ))}

        </div>
    );
}

export default IndianPlayers;