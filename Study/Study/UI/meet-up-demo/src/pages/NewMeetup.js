import { useNavigate } from 'react-router-dom';

import NewMeetupForm from "../components/meetups/NewMeetupForm";

function NewMeetup(){

    const history = useNavigate();

    function addMeetupHandler(meetup){
        fetch(
            'https://react-getting-started-fa566-default-rtdb.firebaseio.com/meetups.json',
            {
                method:"POST",
                body : JSON.stringify(meetup),
                headers:{
                    'Content-type':'application-json'
                }
            }   
        ).then(()=>{
            history('/');
        });
    }

    return <section>
        <h1>
            Add New Meetup
        </h1>
        <NewMeetupForm onAddMeetup={addMeetupHandler}/>
    </section>
}

export default NewMeetup;

//In this I will send http request
//fetch()->its a js function(nothing with react) which helps us to send http requests
//fetch('url',object)
//url-> to which url we need to send the data
//and to store the data we need to send a post request
//by default fetch is GET request
//object contains type of request and body to send 
//we need to send data in json format, we have JSON.stringify to convert data to json

//After saving the form data we need to get back to home page
//for that we can use useNavigate() hook 
//const history =useNavigate()
//As we know promises after getting response go to home page
//fetch().then(()={history('/)})
//Normally after submitting form we cna use back button to go to home page but that does not make much sense
//so we cna stop it by history.replace()->it will not allow back button