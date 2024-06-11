import classes from './Layout.module.css'
import MainNavigation from './MainNavigation';

function Layout(props) {
return (
    <div>
        <MainNavigation/>
        <main className={classes.main}>
            {props.children}
        </main>
    </div>
)
}

export default Layout;

//{props.children} -> here means whatever the elements present inside the <Layout> tag all will be come here. Here all the routes info will be present here