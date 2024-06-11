import Backdrop from "./components/Backdrop";
import Modal from "./components/Modal";
import Todo from "./components/Todo";

function App() {
  return (
    <div>
      <h1>My Todos</h1>
      <Todo text="Learn React"/>
      <Todo text='Master React'/>
      <Todo text='Explore the full React course'/>
    </div>
    );
}

export default App;
//App is a function which is made to make it available
//It is a JSX code
//It returns HTML in javascript code