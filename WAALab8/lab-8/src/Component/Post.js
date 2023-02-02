import React, { useState } from 'react'

function Post(props) {
 
  return (
    <div className="Content" onClick={props.setSelected}>
      
      <h5>Author: {props.author}</h5>
      <h3>Title: {props.title}</h3>
      <h3>Id: {props.id}</h3>
    </div>
  )
}

export default Post