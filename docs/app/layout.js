

import "../styles/Global.css";
import webInfo from "./WebInfo";

export const metadata = {
    title: webInfo.title,
    description: webInfo.description,
}

export default function RootLayout({children}) {
    return (
        <html lang="en">
            <body>
                <div className="main-app">
                    <main className="main-section">{children}</main>
                </div>
            </body>
        </html>
    );
}