package Task;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskTest {


    @Test
    public void testTask() {
        int expected = 5;
        Task task = new Task (expected);


        int actual = task.getId();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSimpleTaskMatches() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("Позвонить");


        Assertions.assertTrue(actual);
    }

    @Test
    public void testSimpleTaskNotMatches() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("Написать");


        Assertions.assertFalse(actual);

    }

    @Test
    public void testEpicMatches() {
        Epic epic = new Epic(55, new String[]{"Молоко", "Яйца", "Хлеб"});

        boolean actual = epic.matches("Молоко");

        Assertions.assertTrue(actual);
    }

    @Test
    public void testEpicNotMatches() {
        Epic epic = new Epic(55, new String[]{"Молоко", "Яйца", "Хлеб"});

        boolean actual = epic.matches("Сыр");

        Assertions.assertFalse(actual);

    }

    @Test
    public void testMeetingTopicMatches() {
        Meeting meeting = new Meeting(555, "Выкатка 3й версии приложения", "Приложение НетоБанка", "Во вторник после обеда");


        boolean actual = meeting.matches("Выкатка");

        Assertions.assertTrue(actual);
    }

    @Test
    public void testMeetingTopicNotMatches() {
        Meeting meeting = new Meeting(555, "Выкатка 3й версии приложения", "Приложение НетоБанка", "Во вторник после обеда");


        boolean actual = meeting.matches("Обкатка");

        Assertions.assertFalse(actual);
    }

    @Test
    public void testMeetingProjectMatches() {
        Meeting meeting = new Meeting(555, "Выкатка 3й версии приложения", "Приложение НетоБанка", "Во вторник после обеда");


        boolean actual = meeting.matches("НетоБанк");

        Assertions.assertTrue(actual);
    }

    @Test
    public void testMeetingProjectNotMatches() {
        Meeting meeting = new Meeting(555, "Выкатка 3й версии приложения", "Приложение НетоБанка", "Во вторник после обеда");


        boolean actual = meeting.matches("АльфаБанк");

        Assertions.assertFalse(actual);
    }


}



















