import {usePathname} from "next/navigation";
import Spacer from "../spacer/Spacer";
import Link from "next/link";

import "./Header.css";

const NavigationOption = ({label, route}) => {
    const isSelected = usePathname() === route;

    let labelStyle = "header-navigation-option-link ";
    if (isSelected) {
        labelStyle += "primary-color-text body-medium semi-bold"
    } else {
        labelStyle += "secondary-font-color body-medium regular"
    }

    let indicatorStyle = "header-navigation-option-indicator ";
    if (isSelected) {
        indicatorStyle += "primary-color"
    } else {
        indicatorStyle += ""
    }

    return (
        <li className="header-navigation-option">
            <Link href={route} className={labelStyle}>
                <span>{label}</span>
                <Spacer className="spacer-8px-height"></Spacer>
                <div className={indicatorStyle}></div>
            </Link>
        </li>
    );
};

const HeaderNavigation = ({navigationOptionList}) => {
    return (
        <nav className="header-navigation">
            <ul>
                {
                    navigationOptionList.map((option) => (
                        <NavigationOption
                            key={option.label}
                            label={option.label}
                            route={option.route}>
                        </NavigationOption>
                    ))
                }
            </ul>
        </nav>
    );
};

export default HeaderNavigation;