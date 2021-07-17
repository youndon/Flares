package Atlas.r

import kotlin.random.Random
import kotlin.random.asJavaRandom

private class Random {
    lateinit var random: Random
    init {
        random.run {
            this.nextInt() /** return random number from [MIN_VALE] until [MAX_VALUE] */
            this.nextInt(10) // from 0 until 10
            this.nextInt(50,100) // from 50 until 100
            this.nextLong() // work like nextInt()
            this.nextDouble() // like nextInt()
            this.nextFloat() // like nextInt()
            this.nextBoolean() // true | false
            this.nextBits(0) // return random number from binary by bitCount as max range.
            this.nextBytes(10) /** return [Array] of random numbers in byte range */
            this.asJavaRandom().run {
                this.doubles().run {
                    /** @see AtlasJ.JStream */
                }
                this.ints().run {
                    /** @see AtlasJ.JStream */
                }
                this.longs().run {
                    /** @see AtlasJ.JStream */
                }
                this.nextGaussian() // return random double number between 0.0 and 1.0
                this.setSeed(1L) // TODO: 2/5/21 NOT REPORTED!
                this.nextBoolean() // And other types.
            }
        }
    }
}