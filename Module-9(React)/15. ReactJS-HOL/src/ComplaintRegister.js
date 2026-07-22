import React, { useState } from "react";

function ComplaintRegister() {
  const [employeeName, setEmployeeName] = useState("");
  const [complaint, setComplaint] = useState("");

  const handleSubmit = (e) => {
    e.preventDefault();

    const referenceNumber = Math.floor(Math.random() * 100000);

    alert(
      "Complaint Submitted Successfully!\nReference Number: " +
        referenceNumber
    );

    setEmployeeName("");
    setComplaint("");
  };

  return (
    <div style={{ textAlign: "center", marginTop: "30px" }}>
      <h2>Ticket Raising App</h2>

      <form onSubmit={handleSubmit}>
        <label>Employee Name</label>
        <br />
        <input
          type="text"
          value={employeeName}
          onChange={(e) => setEmployeeName(e.target.value)}
        />

        <br />
        <br />

        <label>Complaint</label>
        <br />
        <textarea
          rows="5"
          cols="30"
          value={complaint}
          onChange={(e) => setComplaint(e.target.value)}
        />

        <br />
        <br />

        <button type="submit">Submit Complaint</button>
      </form>
    </div>
  );
}

export default ComplaintRegister;