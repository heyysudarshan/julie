import "./Header.css";

/**
 * A reusable header component you can use to wrap all your header elements.
 * This is a standard header component with pre-applied styles, so it's ready to use out of the box.
 *
 * @component
 * @param {Object} props
 * @param {React.ReactNode} props.children - Elements to be rendered inside the header.
 * @returns {JSX.Element}
 */
const Header = ({ children }) => {
    return <header className="header">{children}</header>;
};

export default Header;