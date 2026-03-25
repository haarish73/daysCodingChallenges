import React from "react";

function page() {
  const heading = {
    // textAlign:'center',
    color: "Black",
    fontSize: "50px",
    fontFamily: "cursive",
    marginTop: "20px",
    marginLeft: "20%",
  };

  const container = {
    // display:'flex',
    justifyContent: "center",
    alignItems: "center",
    height: "100vh",
    marginLeft: "25%",
    backgroundColor: "white",
    width: "50%",
  };

  const headingDiv = {
    height: "15%",
    width: "100%",
    backgroundColor: "blue",
  };

  const message ={
    // marginLeft:'15%',
    // marginTop:'20%',
    margin:"0 auto",
    height:'100%',
    width:'100%',
    backgroundColor:'lightgray',
  }

  const messageh1 = {
    marginLeft:'20%',
    // marginTop:'20%',
  }
  return (
    <div style={container}>
      <div style={headingDiv}>
        <h1 style={heading}>ChatBot</h1>
      </div>

      <div style={message}>
        <h1 style={messageh1}>chatbot</h1>
      </div>

    </div>
  );
}

export default page;
