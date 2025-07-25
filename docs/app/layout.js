import website from "./WebInfo";

import "/styles/Global.css";

export const metadata = {
    title: website.title,
    description: website.description,
}

const NextApp = ({children}) => {
    return (
        <html lang="en">
            <body>
                <div className="main-app">
                    <main className="main-section">{children}</main>
                </div>
            </body>
        </html>
    );
};

export default NextApp;