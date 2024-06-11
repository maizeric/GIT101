//the values/parameters are collected in props object
//anyname can be given to parameter

import { useState } from 'react'
import Modal from './Modal';
import Backdrop from './Backdrop';
function Todo(props){

    //It is called react hook which can be called directly.
    //we can give starting value
    
    const [ modalIsOpen, setModalIsOpen ] = useState(false);
    //with only vanilla without react
    //document.querySelector('button').addEventListener('click','sfd')

    function deleteHandler(){
        setModalIsOpen(true);
    }

    function cloaseModalHandler(){
        setModalIsOpen(false);
    }

    return(
            <div className='card'>
                <h2>{props.text}</h2>
                <div className='actions'>
                <button className='btn' onClick={deleteHandler}>Delete</button>
                </div>
                { modalIsOpen && <Modal onCancel={cloaseModalHandler} onConfirm={cloaseModalHandler}/>}
                { modalIsOpen && <Backdrop onCancel={cloaseModalHandler}/>}
            </div>
    );
}

export default Todo;
//to get used in other components we need to write the above step
// and it has to be in caps letter first 
//everything will be treated as HTML element
//but to evaluate expression we need to wrap under curly bracees
//like {props.text}
//In Javascript if you are using a && b if both are truee it returns b
//similarly for or operator a||b it returns a
//Functions are first class objects, we can just pass them as variables