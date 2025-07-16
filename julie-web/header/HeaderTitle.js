import Link from "next/link";

import "./Header.css";

/**
 * HeaderTitle component renders a clickable title that links to the home page.
 * It is intended to be used within the Header component provided by Julie.
 *
 * @param {Object} props - Component props.
 * @param {string} props.title - The text to display inside the header title.
 * @returns {JSX.Element} A styled header title linking to the home page.
 */
const HeaderTitle = ({ title }) => {
    return (
        <Link href="/" className="header-link">
            <h1 className="title-medium semi-bold header-title">{title}</h1>
        </Link>
    );
};

export default HeaderTitle;