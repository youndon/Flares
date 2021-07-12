package AtlasJ

import java.text.Format

class JFormat {
    lateinit var form: Format

    init{

        Format.Field.INPUT_METHOD_SEGMENT
        Format.Field.LANGUAGE
        Format.Field.READING

        //
        form.run {
            format("")
            parseObject("")
            formatToCharacterIterator("")
        }

        /**
        format is very import and useful option in the kotlin,
        some result in big operation will be long but not necessary to show the all ,
        for the we will use format option.
         */

        // add `f` for float number to print n numbers after the period.
        val pi = Math.PI  // 3.141592653589793
        println("%.2f".format(pi))

        // for remove all the string except the firsts characters.
        val str = "land rover"
        println("%.4s".format(str))

        // for remove all numbers except the firsts.
        val num = 123456789
        println("%.5s".format(num))

        // for remove all the line of string
        val year = 2001
        println("%n".format(year))

        // for changing the digit with unicode value.
        val boo = 1579
        println("%c".format(boo))


    }
}