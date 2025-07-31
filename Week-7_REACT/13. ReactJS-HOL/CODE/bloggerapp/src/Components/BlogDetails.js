import React from 'react';

function BlogDetails({ show }) {
  // Conditional rendering using ternary operator
  return (
    <div className="v1">
      <h2>Blog Details</h2>
      {show ? (
        <p>This blog shares knowledge about tech, coding, and development.</p>
      ) : (
        <p>Blog section is currently hidden.</p>
      )}
    </div>
  );
}

export default BlogDetails;
