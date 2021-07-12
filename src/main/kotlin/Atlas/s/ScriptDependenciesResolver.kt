package s

interface ScriptDependenciesResolver {
    val SC: ScriptContents
    var scriptDependenciesResolver: ScriptDependenciesResolver
}