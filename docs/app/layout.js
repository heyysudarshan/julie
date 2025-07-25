import website from "./WebInfo";

export const metadata = {
    title: website.title,
    description: website.description,
}

const NextApp = ({children}) => {
    return (
        <html lang="en">
            <body>
                <div className="main-app">{children}</div>
            </body>
        </html>
    );
};

export default NextApp;