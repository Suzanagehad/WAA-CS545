import React, { useState } from "react";
import Posts from "./Posts";

function Dashboard() {

  const [posts, setPosts] = useState([
    { id: 111, title: "Happiness", author: "Jhon" },
    { id: 112, title: "MIU", author: "Dean" },
    { id: 113, title: "Enjoy Life", author: "Jasmine" },
  ]);

  const [title, setTitle]=useState("");

  const changeTitle=()=>{
    const postList=[...posts];
    postList[0].title=title;
    setPosts(postList);
  }

  const[postDetails, setPostDetails]=useState({
    id:"", title:"", author:""
  })

  return (
  <div>
    <Posts
         data={posts}
    />
    <div>
      <input type="text" id="text" title="title" onChange={(t)=>setTitle(t.target.value)}/><br/>
      <button onClick={changeTitle}>Change Title </button>
    </div>

  </div>);
}

export default Dashboard;
