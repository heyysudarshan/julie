import Link from "next/link";
import {Spacer} from "../index";

const HeaderLogoAndTitle = ({logo, title}) => {
    return (
        <Link href="/" className="header-link with-logo">
            <img className="header-logo" src={logo} alt="Header logo"/>
            <Spacer className="spacer-8px-width"></Spacer>
            <h1 className="title-medium semi-bold header-title">{title}</h1>
        </Link>
    );
};

export default HeaderLogoAndTitle;