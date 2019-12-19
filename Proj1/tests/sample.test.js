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