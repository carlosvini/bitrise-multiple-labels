// https://medium.com/swlh/automation-testing-using-react-native-and-appium-on-ubuntu-ddfddc0c29fe
// https://chase-seibert.github.io/blog/2017/01/06/appium-react-native-quickstart.html
// https://webdriver.io/docs/api.html
describe("Running a sample test", () => {
    beforeEach(() => {
        $("~app-root").waitForDisplayed(11000, false)
    });

    it("Text is correct", () => {
        const text = $("~text1").getText();
        console.log({ text });
        expect(text).toEqual("This is the ONE Project");
    });
  });