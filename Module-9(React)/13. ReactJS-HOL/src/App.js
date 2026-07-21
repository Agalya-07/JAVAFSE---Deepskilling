import React, { Component } from "react";
import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";
import CourseDetails from "./CourseDetails";

class App extends Component {
  constructor() {
    super();
    this.state = {
      showBooks: true,
      showBlogs: true,
      showCourses: true
    };
  }

  render() {
    return (
      <div style={{ padding: "20px", fontFamily: "Arial" }}>
        <h1>Blogger App</h1>

        {this.state.showBooks && <BookDetails />}

        <hr />

        {this.state.showBlogs ? <BlogDetails /> : <h3>No Blogs Available</h3>}

        <hr />

        {this.state.showCourses ? (
          <CourseDetails />
        ) : (
          <h3>No Courses Available</h3>
        )}
      </div>
    );
  }
}

export default App;