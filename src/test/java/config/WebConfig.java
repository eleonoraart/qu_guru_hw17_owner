package config;

import org.aeonbits.owner.Config;

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
        @DefaultValue("https://user1:1234@selenoid.autotests.cloud/wd/hub")
        String remoteUrl();

}
