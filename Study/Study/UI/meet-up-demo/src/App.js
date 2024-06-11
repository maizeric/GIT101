import './App.css';
import { Route, Routes  } from 'react-router-dom'; 
import AllMeetups from './pages/AllMeetups';
import NewMeetup from './pages/NewMeetup';
import Favorites from './pages/Favorites';
import Layout from './components/layout/Layout';
function App() {
  return (
      <Layout>
        <Routes>
          <Route path='/' element={<AllMeetups/>} >
          </Route>

          <Route path='/new-meetup' element={<NewMeetup/>}>
          </Route>

          <Route path='favorites' element={<Favorites/>}>
          </Route>
        </Routes>
      </Layout>
  );
}

export default App;
//If we want to get the state of an object in all components we need to maintain globally
//Now if i select on favourite button it should get added to favourites and count shoudl get increased
//So i can maintain one global state and pass it on Favorites component and get it displayed

//One disadvantage -> In bigger apps,if we have many components managed by the many states then 
//these app component will become bigger and bigger - not good
//2nd disadvantage-> we need to pass the props through many components till the required component has got
//Solution is Redux->react has built in management solution