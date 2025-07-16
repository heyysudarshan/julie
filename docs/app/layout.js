import webInfo from "./WebInfo";

const NextApp = () => {
    return (
        <html lang="en">
            <head>
                <meta charSet="UTF-8" />
                <meta name="viewport" content="width=device-width, initial-scale=1.0" />
                <meta name="description" content={webInfo.description} />
                <title>{webInfo.title}</title>
            </head>
            <body>
                <div className="next-app">

                </div>
            </body>
        </html>
    );
};

export default NextApp;