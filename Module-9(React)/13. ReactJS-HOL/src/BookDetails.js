import React from "react";

function BookDetails() {
  const books = [
    { id: 1, name: "React Basics", price: 500 },
    { id: 2, name: "Java Programming", price: 650 },
    { id: 3, name: "Python Guide", price: 450 }
  ];

  return (
    <div>
      <h2>Book Details</h2>

      <ul>
        {books.map((book) => (
          <li key={book.id}>
            {book.name} - ₹{book.price}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default BookDetails;