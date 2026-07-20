import React from "react";

function ListofPlayers() {

    const players = [
        { name: "Virat Kohli", score: 90 },
        { name: "Rohit Sharma", score: 45 },
        { name: "Shubman Gill", score: 75 },
        { name: "KL Rahul", score: 60 },
        { name: "Hardik Pandya", score: 85 },
        { name: "Ravindra Jadeja", score: 40 },
        { name: "MS Dhoni", score: 95 },
        { name: "Suryakumar Yadav", score: 72 },
        { name: "R Ashwin", score: 55 },
        { name: "Jasprit Bumrah", score: 88 },
        { name: "Mohammed Shami", score: 65 }
    ];

    return (
        <div>
            <h2>List of Players</h2>

            {players.map((player, index) => (
                <p key={index}>
                    {player.name} - {player.score}
                </p>
            ))}

            <h2>Players with Score Below 70</h2>

            {players
                .filter(player => player.score < 70)
                .map((player, index) => (
                    <p key={index}>
                        {player.name} - {player.score}
                    </p>
                ))}
        </div>
    );
}

export default ListofPlayers;