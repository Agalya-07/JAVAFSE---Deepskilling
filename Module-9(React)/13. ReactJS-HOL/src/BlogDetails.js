import React from "react";

function BlogDetails() {
  const blogs = [
    { id: 1, title: "React Introduction" },
    { id: 2, title: "JavaScript ES6" },
    { id: 3, title: "React Hooks" }
  ];

  return (
    <div>
      <h2>Blog Details</h2>

      <ul>
        {blogs.map((blog) => (
          <li key={blog.id}>{blog.title}</li>
        ))}
      </ul>
    </div>
  );
}

export default BlogDetails;