package AtlasJ

class JThread {
    lateinit var thread: Thread
    init {
        thread.run {
            this.threadGroup
            this.contextClassLoader
            this.id
            this.isAlive
            this.isDaemon
            this.isInterrupted
            this.name
            this.priority
            this.stackTrace
            this.state
            this.uncaughtExceptionHandler
            this.checkAccess()
            this.interrupt()
            this.join()
            this.setUncaughtExceptionHandler{t: Thread?, e: Throwable? ->  }
            this.start()
        }
    }
}