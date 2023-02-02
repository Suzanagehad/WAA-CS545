import React, { useState } from "react";

function NewPost() {
  const [post, setPost] = useState({
    title: "",
    author: "",
  });

  const addPostHandler = (event) => {
    axios
      .post("http://localhost:8070/api/v1/posts", post)
      .then(() => {
        props.updateFlag();
      })
      .catch((error) => {
        console.log(error.message);
      });
  };

  return (
    <div>
      <h1>Add New Post</h1>
      <form>
        <label>Id: </label>
        <input
          type="text"
          label={"id"}
          name={"id"}
          value={props.id}
          onChange={(event) => setPost({ ...post, title: event.target.value })}
        />

        <label>Title: </label>
        <input
          type="text"
          label={"title"}
          name={"title"}
          value={props.title}
          onChange={(event) => setPost({ ...post, title: event.target.value })}
        />

        <label>Author: </label>
        <input
          type="text"
          label={"author"}
          name={"author"}
          value={props.author}
          onChange={(event) => setPost({ ...post, author: event.target.value })}
        />

        <button onClick={addPostHandler}>Add New Post</button>
      </form>
    </div>
  );
}

export default NewPost;
