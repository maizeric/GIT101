import { Link } from 'react-router-dom'

import classes from './MainNavigation.module.css'
function MainNavigation(){
    return <header>
        <div className={classes.header}>React Meetups</div>
        <nav   className={classes.logo}>
            <ul>
              <Link to="/" >All MeetUps</Link>
            </ul>
            <ul>
              <Link to="/new-meetup" >New MeetUp</Link>
            </ul>
            <ul>
              <Link to="/favorites" >My Favorites</Link>
            </ul>
        </nav>
    </header>
}

export default MainNavigation;

//if we use anchor tag like <a href=""> it sends a new request to server
//so we dont want to opne a new page
//Instead use Link component, it simply opens that corresponding page