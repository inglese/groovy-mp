package email.englisch

import org.junit.Test

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle

import static org.junit.Assert.assertThat
import static org.hamcrest.Matchers.equalTo
import static org.hamcrest.Matchers.is

class LocalDateCreationTest {
    @Test
    void test_formatted_date_output() {
        LocalDate date = LocalDate.of(2016, 3, 2)

        assertThat(date.format(DateTimeFormatter.ISO_DATE), is(equalTo('2016-03-02')))
        assertThat(date.format(DateTimeFormatter.ofPattern('dd.MM.yyyy')), is(equalTo('02.03.2016')))
        assertThat(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.GERMAN)), is(equalTo('02.03.2016')))
    }

    @Test
    void test_date_parsing() {
        String mediumDateString = '02.03.2016'
        String shortDateString = '02.03.16'

        LocalDate parsedMediumDate = LocalDate.parse(mediumDateString, DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.GERMAN))
        LocalDate parsedShortDate = LocalDate.parse(shortDateString, DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(Locale.GERMAN))
        LocalDate expectedDate = LocalDate.of(2016, 3, 2)

        assertThat(parsedMediumDate, is(equalTo(expectedDate)))
        assertThat(parsedShortDate, is(equalTo(expectedDate)))
    }
}

