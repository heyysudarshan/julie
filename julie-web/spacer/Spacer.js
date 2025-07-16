/**
 * Spacer provides empty space in a layout. It renders a `div` element styled with a custom class to add spacing.
 *
 * You can pass predefined utility classes to control height or width spacing:
 *
 * #### Vertical Spacers (height)
 * - `spacer-4px-height`
 * - `spacer-8px-height`
 * - `spacer-12px-height`
 * - `spacer-16px-height`
 * - `spacer-20px-height`
 *
 * #### Horizontal Spacers (width)
 * - `spacer-4px-width`
 * - `spacer-8px-width`
 * - `spacer-12px-width`
 * - `spacer-16px-width`
 * - `spacer-20px-width`
 *
 * These classes provide spacing between elements without needing custom inline styles.
 *
 * @component
 * @param {Object} props - The props object.
 * @param {string} props.className - The CSS class to apply for controlling spacing.
 * @returns {JSX.Element} A `div` element that creates space between elements.
 */
const Spacer = ({ className }) => {
    return <div className={className}></div>;
};

export default Spacer;
