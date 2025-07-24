// src/Posts.js
import React from 'react';
import Post from './Post'; // Post is a plain JavaScript data class

class Posts extends React.Component {

  constructor(props) {
    super(props);

    // Initialize the state
    this.state = {
      posts: []
    };
  }

  loadPosts() {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then((response) => response.json())
      .then((data) => {
        const postObjects = data.map(
          (item) => new Post(item.id, item.title, item.body)
        );
        this.setState({ posts: postObjects });
      })
      .catch((error) => {
        console.error('Error fetching posts:', error);
        alert('Error fetching posts');
      });
  }

  componentDidMount() {
    this.loadPosts();
  }

  render() {
    return (
      <div>
        <h1>Blog Posts</h1>
        {this.state.posts.map((post) => (
          <div key={post.id}>
            <h2>{post.title}</h2>
            <p>{post.body}</p>
            <hr />
          </div>
        ))}
      </div>
    );
  }

  componentDidCatch(error, info) {
    alert('An error occurred: ' + error.toString());
    console.error('Error boundary caught:', error, info);
  }
}

export default Posts;
