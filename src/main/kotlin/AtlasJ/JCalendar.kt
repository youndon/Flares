package AtlasJ

import java.util.*
import java.util.spi.CalendarDataProvider
import java.util.spi.CalendarNameProvider

class JCalendar {
    private lateinit var calendarDataProvider: CalendarDataProvider
    private lateinit var calendarNameProvider: CalendarNameProvider
    private lateinit var gregoriancalendar: GregorianCalendar
    init {
        Calendar.getInstance().run {
            this.calendarType
            this.firstDayOfWeek
            this.isLenient
            this.isWeekDateSupported
            this.minimalDaysInFirstWeek
            this.time
            this.timeInMillis
            this.timeZone
            this.weekYear
            this.weeksInWeekYear
            this.get(0)
            this.set(0, 0)
            this.add(0, 0)
            this.after(0)
            this.before(0)
            this.clear()
            this.getMaximum(0)
            this.getMinimum(0)
            this.getActualMaximum(0)
            this.getActualMinimum(0)
            this.getGreatestMinimum(0)
            this.getLeastMaximum(0)
            this.getDisplayName(0, 0, Locale.CANADA)
            this.getDisplayNames(0, 0, Locale.CANADA)
            this.isSet(0)
            this.setWeekDate(0, 0, 0)
            this.roll(0, true)
            this.toInstant()
        }
        Calendar.getAvailableCalendarTypes().run {
            this.size
            this.spliterator()
            this.contains("")
            this.containsAll(arrayListOf())
            this.isEmpty()
            this.iterator()
            this.minus("")
            this.minusElement("")
            this.orEmpty()
            this.plus("")
            this.plusElement("")
        }
        Calendar.getAvailableLocales().run {
            /* This synchronized has all the Array Attachment */
        }
        Calendar.Builder().run {
            this.build()
            this.set(0,0)
            this.setCalendarType("")
            this.setDate(0,0,0)
            this.setFields()
            this.setInstant(0L)
            this.setLenient(true)
            this.setLocale(Locale.CANADA)
            this.setTimeOfDay(0,0,0,0)
            this.setTimeZone(TimeZone.getDefault())
            this.setWeekDate(0,0,0)
            this.setWeekDefinition(0,0)
        }
        calendarDataProvider.run {
            this.getFirstDayOfWeek(Locale.CANADA)
            this.getMinimalDaysInFirstWeek(Locale.CANADA)
        }
        calendarNameProvider.run {
            this.getDisplayName("",0,0,0, Locale.CANADA)
            this.getDisplayNames("",0,0, Locale.CANADA)
        }
        gregoriancalendar.run {
            this.gregorianChange.run {
            }
            this.isLeapYear(0)
            this.toZonedDateTime().run {
            }
        }

    }
}