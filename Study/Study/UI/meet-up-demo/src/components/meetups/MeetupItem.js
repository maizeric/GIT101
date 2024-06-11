import { useContext } from 'react';
import Card from '../ui/Card';
import classes from './MeetupItem.module.css'
import FavoritesContext from '../../store/favorites-context';

function MeetupItem(props){

    const favoritesCtx =  useContext(FavoritesContext);
    const itemIsFavorite = favoritesCtx.itemIsFavorite(props.id);
    
    function toggleFavoriteStatusHandler(){
        if(itemIsFavorite){
            favoritesCtx.removeFavorite(props.id);
        } else{
            favoritesCtx.addFavorite({
                id:props.id,
                title:props.title,
                description:props.description,
                address:props.address,
                image:props.image
            })
        }
    }


    return (
        <li className={classes.item}>
            <Card>
                <div className={classes.image}>
                    <img src={props.image} alt={props.title}></img>
                </div>
                <div>
                    <h3>{props.title}</h3>
                    <address>{props.address}</address>
                    <p>{props.description}</p>
                </div>
                <div className={classes.actions}>
                    <button onClick={toggleFavoriteStatusHandler}>
                        {itemIsFavorite ? 'Remove From Favorites' : 'TO Favorites'}
                    </button>
                </div>
            </Card>
        </li>
    )
}

export default MeetupItem;

//By using the Card Component we are able to seperate the two items, previously we were not able to distinguish