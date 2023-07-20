package hello.cicd_project.controller;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


class MainControllerTest {
    MainController mainController = new MainController();

    @Test
    void API테스트() {
        //given - 뭔가 주어졌을때

        //when - 이걸 실행했을때

        //then - 이런 결과가 나와야해
        assertThat(mainController.helloWorld()).isEqualTo("Hello World");
    }
}