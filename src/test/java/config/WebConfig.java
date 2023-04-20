package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties"}
)

public interface WebConfig extends Config {

        @Key("browser")
        @DefaultValue("chrome")
        Browser browser();

        @Key("browserVersion")
        String browserVersion();

        @Key("browserSize")
        @DefaultValue("1920x1080")
        String browserSize();

        @Key("baseUrl")
        @DefaultValue("https://www.it-one.ru")
        String baseUrl();

        @DefaultValue("false")
        @Key("isRemote")
        boolean isRemote();

        @Key("remoteUrl")
        String remoteUrl();

}
