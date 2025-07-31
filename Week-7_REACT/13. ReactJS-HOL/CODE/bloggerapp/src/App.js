import React, { useState } from 'react';
import './App.css';
import { books } from './data/BookData';
import BookDetails from './Components/BookDetails';
import BlogDetails from './Components/BlogDetails';
import CourseDetails from './Components/CourseDetails';

function App() {
  const [showBook, setShowBook] = useState(true);
  const [showBlog, setShowBlog] = useState(true);
  const [showCourse, setShowCourse] = useState(true);

  return (
    <div className="App">
      <h1>Blogger App</h1>

      <div className="btns">
        <button onClick={() => setShowBook(!showBook)}>Toggle Book</button>
        <button onClick={() => setShowBlog(!showBlog)}>Toggle Blog</button>
        <button onClick={() => setShowCourse(!showCourse)}>Toggle Course</button>
      </div>

      <hr />

      {showBook && <BookDetails books={books} />}
      <BlogDetails show={showBlog} />
      <CourseDetails show={showCourse} />
    </div>
  );
}

export default App;
