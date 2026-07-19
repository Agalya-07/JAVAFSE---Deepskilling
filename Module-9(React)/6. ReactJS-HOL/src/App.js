import React from "react";
import {
    BrowserRouter,
    Routes,
    Route,
    Link,
    Navigate
} from "react-router-dom";

import Home from "./Home";
import TrainerList from "./TrainerList";
import TrainerDetails from "./TrainerDetails";

function App() {
    return (
        <BrowserRouter>

            <h1>Cognizant Academy Trainers Portal</h1>

            <nav>
                <Link to="/">Home</Link> |{" "}
                <Link to="/trainers">Trainers</Link>
            </nav>

            <hr />

            <Routes>
                <Route path="/" element={<Navigate to="/home" />} />
                <Route path="/home" element={<Home />} />
                <Route path="/trainers" element={<TrainerList />} />
                <Route path="/trainer/:id" element={<TrainerDetails />} />
            </Routes>

        </BrowserRouter>
    );
}

export default App;