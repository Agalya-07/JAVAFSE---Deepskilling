import React from "react";

function App() {
  const office = {
    name: "Skyline Tech Park",
    rent: 55000,
    address: "Chennai"
  };

  const officeList = [
    {
      name: "Skyline Tech Park",
      rent: 55000,
      address: "Chennai"
    },
    {
      name: "DLF IT Park",
      rent: 75000,
      address: "Coimbatore"
    },
    {
      name: "RMZ Millenia",
      rent: 65000,
      address: "Bangalore"
    },
    {
      name: "Tidel Park",
      rent: 45000,
      address: "Chennai"
    }
  ];

  return (
    <div style={{ padding: "20px", fontFamily: "Arial" }}>
      <h1>Office Space Rental App</h1>

      <img
        src="https://images.unsplash.com/photo-1497366754035-f200968a6e72?w=700"
        alt="Office"
        width="500"
      />

      <h2>Single Office Details</h2>

      <p><b>Name:</b> {office.name}</p>

      <p>
        <b>Rent:</b>
        <span
          style={{
            color: office.rent < 60000 ? "red" : "green",
            fontWeight: "bold"
          }}
        >
          {" "}₹{office.rent}
        </span>
      </p>

      <p><b>Address:</b> {office.address}</p>

      <hr />

      <h2>Office Space List</h2>

      {officeList.map((item, index) => (
        <div
          key={index}
          style={{
            border: "1px solid gray",
            padding: "10px",
            marginBottom: "10px",
            width: "350px"
          }}
        >
          <p><b>Name:</b> {item.name}</p>

          <p>
            <b>Rent:</b>
            <span
              style={{
                color: item.rent < 60000 ? "red" : "green",
                fontWeight: "bold"
              }}
            >
              {" "}₹{item.rent}
            </span>
          </p>

          <p><b>Address:</b> {item.address}</p>
        </div>
      ))}
    </div>
  );
}

export default App;