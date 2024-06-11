import { useRef } from 'react'

import Card from "../ui/Card";
import classes from './NewMeetupForm.module.css'

function NewMeetupForm(props) {

    const titleInputRef= useRef();
    const imageInputRef = useRef();
    const addressInputRef = useRef();
    const descriptionInputRef = useRef();

    function submitHandler(event){
        event.preventDefault();

        const enteredTitle = titleInputRef.current.value;//Holds the current input value object of title which is in form
        const enteredImage = imageInputRef.current.value;
        const enteredAddress = addressInputRef.current.value;
        const enterDesscription = descriptionInputRef.current.value;

        const meetupData = {
            title : enteredTitle,
            image : enteredImage,
            address : enteredAddress,
            description : enterDesscription
        }

        props.onAddMeetup(meetupData);

    }

    return <Card>
        <form className={classes.form} onSubmit={submitHandler}> 
            <div className={classes.control}>
                <label htmlFor="title">MeetUp Title</label>
                <input type="text" required id="title" ref={titleInputRef}/>
            </div>
            <div className={classes.control}>
                <label htmlFor="title">MeetUp Image</label>
                <input type="url" required id="image" ref={imageInputRef}/>
            </div>
            <div className={classes.control}>
                <label htmlFor="title">Address</label>
                <input type="text" required id="address" ref={addressInputRef}/>
            </div>
            <div className={classes.control}>
                <label htmlFor="title">description</label>
                <textarea id='description' required rows='5' ref={descriptionInputRef}></textarea>
            </div>
            <div className={classes.actions}>
                <button className="">Add MeetUp</button>
            </div>
        </form>

    </Card>
}

export default NewMeetupForm;

//Generally we use className = {classes.form} to import form style from css file
//Another way is htmlFor='title'
//We need to save the things entered in form
//By default a submit event will be triggered when we have button in form  
//for that we need onSubmit={function_name} this will take care
//Whatever the things you do in form they are called events
//and those events are automatically passed to onSubmit function
//submitHandler function is nested function

//The default behaviour of browser would actually be sending the request to the server serving this page automatically but we dont want that
//we dont want to trigger http request but we need to send the request behind the scenes without reloading the page
//event-> built in events like onclick, onsubmit all are present in this object

//Step 1: event.preventDefault(); -serves our purpose, vanilla js which is supported by react js
//Step 2:We need to listen to values that are entered
//One thing we can use is onChange but this gets triggered on all keystrokes but I am interested only on submission of form
//Another way is useRef() which is special func 
//ref->reference
//React helps us to set the references to DOM elements
//In the input tag we are having extra property called ref={titleInputRef}
//And on top we declare this variable titleInputRef=useRef()
//So by this way the connection between the value and useRef is integrated
//Whatever the data we entered now it is in meetupData object and we need to save it in DB
//But from frontend React or Angular we dont directly connect to DB because of security
//Whatever the code we write code is exposed.From Dev tools i can read the js code so due to that DB creds will also be there
//this is the reason we need to have an api which takes this data and store it in DB
//We can use firebase dummy api ->it contains api and DB, it has bunch of inbuilt capabilities
//go to firebase.com -> create a demo project with name->react-getting-started
//under build->real time database->create in test-mode