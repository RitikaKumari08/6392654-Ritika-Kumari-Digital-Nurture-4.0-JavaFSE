import React from 'react';

function BookDetails({ books }) {
  // Conditional rendering using logical && operator
  return (
    <div className="st2">
      <h2>Book Details</h2>
      {books.length > 0 && (
        <ul>
          {books.map((book) => (
            <li key={book.id}>
              <strong>{book.bname}</strong> - ₹{book.price}
            </li>
          ))}
        </ul>
      )}
    </div>
  );
}

export default BookDetails;
