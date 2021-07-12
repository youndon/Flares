package e


private class Environment {
    /**
     The [Environment] it's typealias of Map, the value in this map is always [String]
     and the value can be [Any] or null.
     And the [Environment] has specific deal with [ScriptDependenciesResolver] interface.
     */
    lateinit var environment: Environment
    init {
        environment.run {
           /* Map attachment */
        }
    }
}