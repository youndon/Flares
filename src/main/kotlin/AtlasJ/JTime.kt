package AtlasJ

import java.text.ParsePosition
import java.time.*
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
import java.time.temporal.TemporalQuery
import java.util.*
import java.util.concurrent.TimeUnit

class JTime {
    lateinit var dateTimeFormatter: DateTimeFormatter
    lateinit var simpleTimeZone: SimpleTimeZone
    init {

        //
        LocalTime.MAX
        LocalTime.MIN
        LocalTime.MIDNIGHT
        LocalTime.NOON
        LocalTime.from(null)
        LocalTime.of(0,0,0)
        LocalTime.ofInstant(Instant.MAX, ZoneId.systemDefault())
        LocalTime.ofNanoOfDay(0L)
        LocalTime.ofSecondOfDay(0L)
        LocalTime.now().run{
            this.nano
            this.second
            this.minute
            this.hour
            this.atDate(LocalDate.MAX)
            this.atOffset(ZoneOffset.MAX)
            this.format(DateTimeFormatter.BASIC_ISO_DATE)
            this.isAfter(LocalTime.MAX)
            this.isBefore(LocalTime.MAX)
            this.minusHours(1L)
            this.minusMinutes(1L)
            this.minusNanos(1L)
            this.minusSeconds(1L)
            this.plusHours(1L)
            this.plusMinutes(1L)
            this.plusNanos(1L)
            this.plusSeconds(1L)
            this.toEpochSecond(LocalDate.MAX, ZoneOffset.MAX)
            this.toNanoOfDay()
            this.toSecondOfDay()
            this.truncatedTo(null)
            this.withHour(1)
            this.withMinute(1)
            this.withNano(1)
            this.withSecond(1)
        }

        //
        LocalDateTime.MAX
        LocalDateTime.MIN
        LocalDateTime.from(null)
        LocalDateTime.of(0,0,0,0,0,0)
        LocalDateTime.ofEpochSecond(0L,0, ZoneOffset.UTC)
        LocalDateTime.ofInstant(Instant.EPOCH, ZoneId.systemDefault())
        LocalDateTime.parse("")
        LocalDateTime.now().run {
            this.dayOfMonth
            this.dayOfWeek
            this.dayOfYear
            this.monthValue
            this.year
            this.nano
            this.second
            this.minute
            this.hour
            this.atOffset(ZoneOffset.MAX)
            this.format(DateTimeFormatter.BASIC_ISO_DATE)
//            this.isAfter()
//            this.isBefore()
            this.minusDays(0L)
            this.minusMonths(0L)
            this.minusWeeks(0L)
            this.minusYears(0L)
            this.minusDays(0L)
            this.minusHours(0L)
            this.minusMinutes(0L)
            this.minusNanos(0L)
            this.minusSeconds(0L)
            this.plusDays(0L)
            this.plusWeeks(0L)
            this.plusMonths(0L)
            this.plusYears(0L)
            this.plusHours(0L)
            this.plusMinutes(0L)
            this.plusNanos(0L)
            this.plusSeconds(0L)
            this.toEpochSecond(ZoneOffset.UTC)
            this.truncatedTo(null)
            this.withDayOfMonth(0)
            this.withDayOfYear(0)
            this.withYear(0)
            this.withHour(1)
            this.withMinute(1)
            this.withNano(1)
            this.withSecond(1)
        }

        //
        DateTimeFormatter.BASIC_ISO_DATE // example.
        DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)
        DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL)
        DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL)
        DateTimeFormatter.ofPattern("")
        DateTimeFormatter.parsedExcessDays().queryFrom(null).run {
        }
        DateTimeFormatter.parsedLeapSecond().queryFrom(null)
        with(dateTimeFormatter){
            this.chronology
            this.decimalStyle
            this.locale
            this.resolverFields
            this.resolverStyle
            this.zone
            this.format(null)
            this.formatTo(null,null)
            this.localizedBy(Locale.CANADA)
            this.parseBest("", TemporalQuery {  })
            this.parseUnresolved("", ParsePosition(0))
            this.toFormat().run {
            }
            this.withChronology(chronology)
            this.withDecimalStyle(decimalStyle)
            this.withLocale(locale)
            this.withResolverFields()
            this.withResolverStyle(resolverStyle)
            this.withZone(zone)
        }

        //
        OffsetTime.MAX
        OffsetTime.MIN
        OffsetTime.from(null)
        OffsetTime.of(0,0,0,0,null)
        OffsetTime.ofInstant(Instant.EPOCH, ZoneId.systemDefault())
        OffsetTime.parse("")
        OffsetTime.now().run {
            /** All LocalTime Attachment plus...*/
            this.offset
            this.withOffsetSameLocal(ZoneOffset.UTC)
            this.withOffsetSameInstant(ZoneOffset.UTC)
            this.isEqual(OffsetTime.now())
        }

        //
        OffsetDateTime.MAX
        OffsetDateTime.MIN
        OffsetDateTime.from(null)
        OffsetDateTime.of(0,0,0,0,0,0,0,null)
        OffsetDateTime.ofInstant(Instant.EPOCH, ZoneId.systemDefault())
        OffsetDateTime.parse("")
        OffsetDateTime.now().run {
            /** All LocalDateTime Attachment plus...*/
            this.offset
            this.atZoneSameInstant(ZoneId.systemDefault())
            this.atZoneSimilarLocal(ZoneId.systemDefault())
            this.isEqual(OffsetDateTime.now())
            this.toInstant()
            this.toLocalDate()
            this.toLocalDateTime()
            this.toLocalTime()
            this.toOffsetTime()
            this.toZonedDateTime()
            this.withOffsetSameInstant(ZoneOffset.UTC)
            this.withOffsetSameLocal(ZoneOffset.UTC)
        }

        //
        TimeUnit.SECONDS
        TimeUnit.DAYS
        TimeUnit.MILLISECONDS
        TimeUnit.NANOSECONDS
        TimeUnit.HOURS
        TimeUnit.MICROSECONDS
        TimeUnit.MINUTES.run {
            this.convert(Duration.ZERO)
            this.sleep(0L)
            this.timedJoin(Thread(),0L)
            this.timedWait(null,0L)
            this.toChronoUnit()
            this.toChronoUnit()
            this.timedWait(null,0L)
            this.toDays(0L)
            this.toHours(0L)
            this.toMicros(0L)
            this.toMillis(0L)
            this.toMinutes(0L)
            this.toNanos(0L)
            this.toSeconds(0L)
        }

        //
        Runtime.version().run {
            this.build()
            this.compareToIgnoreOptional(Runtime.version())
            this.equalsIgnoreOptional(null)
            this.feature()
            this.interim()
            this.optional().run {
            }
            this.patch()
            this.pre()
            this.update()
            this.version()
        }
        Runtime.Version.parse("").run {
        }
        Runtime.getRuntime().run {
            this.addShutdownHook(Thread())
            this.availableProcessors()
            this.exec("")
            this.exit(0)
            this.freeMemory()
            this.gc()
            this.halt(0)
            this.load("")
            this.loadLibrary("")
            this.runFinalization()
            this.maxMemory()
            this.totalMemory()
        }

        //
        TimeZone.LONG
        TimeZone.SHORT
        TimeZone.getAvailableIDs()
        TimeZone.getTimeZone("")
        TimeZone.setDefault(TimeZone.getDefault())
        TimeZone.getDefault().run {
            this.displayName
            this.dstSavings
            this.id
            this.rawOffset
            this.getOffset(0,0,0,0,0,0)
            this.hasSameRules(TimeZone.getDefault())
            this.inDaylightTime(Date())
            this.observesDaylightTime()
            this.toZoneId()
            this.useDaylightTime()
        }

        //
        ZonedDateTime.from(null)
        ZonedDateTime.of(0,0,0,0,0,0,0,null)
        ZonedDateTime.ofInstant(LocalDateTime.now(), ZoneOffset.UTC, ZoneId.systemDefault())
        ZonedDateTime.ofLocal(LocalDateTime.now(), ZoneId.systemDefault(), ZoneOffset.UTC)
        ZonedDateTime.ofStrict(LocalDateTime.now(), ZoneOffset.UTC, ZoneId.systemDefault())
        ZonedDateTime.parse("")
        ZonedDateTime.now().withFixedOffsetZone()

        //
        SimpleTimeZone.SHORT
        SimpleTimeZone.LONG
        SimpleTimeZone.STANDARD_TIME
        SimpleTimeZone.UTC_TIME
        SimpleTimeZone.WALL_TIME
        SimpleTimeZone.setDefault(TimeZone.getDefault())
        SimpleTimeZone.getTimeZone("")
        SimpleTimeZone.getAvailableIDs()
        simpleTimeZone.run {
            this.setEndRule(0,0,0,0)
            this.setStartRule(0,0,0,0)
            this.setStartYear(0)
        }

    }

}