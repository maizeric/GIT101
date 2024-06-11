import { useState,useEffect } from "react";

import MeetupList from "../components/meetups/MeetupList";

const DUMMY_DATA = [
    {
      id: 'm1',
      title: 'This is a first meetup',
      image:
        'https://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/Stadtbild_M%C3%BCnchen.jpg/2560px-Stadtbild_M%C3%BCnchen.jpg',
      address: 'Meetupstreet 5, 12345 Meetup City',
      description:
        'This is a first, amazing meetup which you definitely should not miss. It will be a lot of fun!',
    },
    {
      id: 'm2',
      title: 'This is a second meetup',
      image:
        'https://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/Stadtbild_M%C3%BCnchen.jpg/2560px-Stadtbild_M%C3%BCnchen.jpg',
      address: 'Meetupstreet 5, 12345 Meetup City',
      description:
        'This is a first, amazing meetup which you definitely should not miss. It will be a lot of fun!',
    },
  ];

function AllMeetups(){

  const [isLoading, setIsLoading] = useState(true);
  const [loadedMeetups, setLoadedMeetups] =useState([]);

  useEffect(()=>{ 
    setIsLoading(true);
    fetch(
      'https://react-getting-started-fa566-default-rtdb.firebaseio.com/meetups.json'
      ).then((response )=> {
        return (response.json()
      )}).then(data => {
        const meetups =[];

        for(const key in data ) {
          const meetup ={
            id:key,
            ...data[key]
          }
          meetups.push(meetup);//add to starting list
        }
        setIsLoading(false);
        setLoadedMeetups(meetups);
      })

  }, []);

  

    if(isLoading) {
      return <section>
        <p>Loading...</p>
      </section>
    }

    return(
      <section>
        <h1>All Meetups</h1>
        <MeetupList meetups={DUMMY_DATA}/>
        <MeetupList meetups={loadedMeetups}/>
      </section>
    ) 
}

export default AllMeetups;


//Here what we are doing is fetch('url')->we get some data
//As it is promise we can have callback function whatever the response we are getting we 
//need to convert to json and this itself has callback function to set the variable isLoading false
//Once the data is loaded we need to set it to false
//We are using useState because laoding the data will take sometime until this the component will get executed
//But as the data will not be there ->then how can we stop it from loading
//Can we use async function for component and async for function to wait for getting resposne and then component should load.
//But thats is not react meant for, so we can update values by isLoaded variable and this is updated by useState hook
//So once we get the data we set the variable isloading to false and loadedMeetups with came data
//So by this once the state values are changed the component will run which means
//fetch() function also runs again and the state values gets changes ->component runs->state changes->component runs-...infinite loop
//Solution is use useEffect(func, []) hook which takes 1 function and array of values
//if we dont pass second parameter then there is no use of useEffect(), it will be same as running without useEffect
//if 2nd param is empty -> then react checks its equivalence when the function fetch has ran for last item and as it is empty hence no dependencies and react will run
//fetch only once when the component has been executed for first time and for subsequent time the effect function will not run as there are no dependencies
//if in 2nd parameter we have [isLoading] -> then the useEffect will run whenever the isLoading value has been changed because it is dependent on the variable
//
//In you dependency array we should add the external values but here we dont have external values at all


// for(const key in data ) {
//   const meetup ={
//     id:key,
//     ...data[key]
//   }
// }

//Here above we are iterating over the received data which was in json format
//and we are setting id as key and copying the data of key with spread operator to meetup object
//Spread operator is a default javascript operator to copy all the key value pairs of this nested object into this object