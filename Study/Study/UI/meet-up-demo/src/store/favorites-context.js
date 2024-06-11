import { createContext,useState } from "react";

const FavoritesContext = createContext({
    favorites: [],
    totalFavorites :0,
    addFavorite: (favoriteMeetup)=>{},
    removeFavorite: (meetupId)={},
    itemIsFavorite: (meetupId)={}
});

export function FavoritesContextProvider(props){

    const[userFavorites, setUserFavorites] = useState([]);

    function addFavoriteHandler(favoriteMeetup){
        //setUserFavorites(userFavorites.concat(favoritesMeetup))//it will work but not recommended
        setUserFavorites((prevUserFavorites)=>{
            return prevUserFavorites.concat(favoriteMeetup);
        })
    }

    function removeFavoriteHandler(meetupId){
        setUserFavorites(prevUserFavorites => {
            return prevUserFavorites.filter(meetup => meetup.id!==meetupId)
        })
    }

    function itemIsFavoriteHandler(meetupId){
        return userFavorites.some(meetup => meetup.id===meetupId)
    }
    const context = {
        favorites: userFavorites,
        totalFavorites: userFavorites.length,
        removeFavorite: removeFavoriteHandler,
        addFavorites: addFavoriteHandler,
        itemIsFavorite: itemIsFavoriteHandler
    };


    return <FavoritesContext.Provider value={context}>
        {props.children}
    </FavoritesContext.Provider>
}

export default FavoritesContext;

//createContext(obj) is a javascript function. It creates a context
//Context at the end is javascript object
//So FavoritesContext is a javascript object it contains an react component created by context.hence first letter is caps


