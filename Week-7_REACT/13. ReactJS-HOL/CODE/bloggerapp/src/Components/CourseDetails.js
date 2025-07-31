import React from 'react';

function CourseDetails({ show }) {
  // Conditional rendering using IIFE
  return (
    <div className="mystyle1">
      <h2>Course Details</h2>
      {
        (() => {
          if (show) {
            return (
              <ul>
                <li>React for Beginners</li>
                <li>Advanced JavaScript</li>
                <li>Full Stack Development</li>
              </ul>
            );
          } else {
            return <p>Course section is not available.</p>;
          }
        })()
      }
    </div>
  );
}

export default CourseDetails;
