import React, { Component } from "react";
import GuestPage from "./GuestPage";
import UserPage from "./UserPage";

class App extends Component {
  constructor() {
    super();
    this.state = {
      isLoggedIn: false
    };
  }

  login = () => {
    this.setState({ isLoggedIn: true });
  };

  logout = () => {
    this.setState({ isLoggedIn: false });
  };

  render() {
    return (
      <div style={{ padding: "20px", fontFamily: "Arial" }}>
        <h1>Ticket Booking App</h1>

        {this.state.isLoggedIn ? (
          <>
            <button onClick={this.logout}>Logout</button>
            <UserPage />
          </>
        ) : (
          <>
            <button onClick={this.login}>Login</button>
            <GuestPage />
          </>
        )}
      </div>
    );
  }
}

export default App;