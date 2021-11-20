package Atlas.a

/**
 This class work with the annotation class @Target(),
 and Contains the list of code elements which are the possible annotation targets
 */
private enum class AnnotationTarget {  ;
    init {
        AnnotationTarget.ANNOTATION_CLASS
        AnnotationTarget.CLASS
        AnnotationTarget.CONSTRUCTOR
        AnnotationTarget.EXPRESSION
        AnnotationTarget.FIELD
        AnnotationTarget.FILE
        AnnotationTarget.FUNCTION
        AnnotationTarget.LOCAL_VARIABLE
        AnnotationTarget.PROPERTY
        AnnotationTarget.PROPERTY_GETTER
        AnnotationTarget.PROPERTY_SETTER
        AnnotationTarget.TYPE
        AnnotationTarget.TYPEALIAS
        AnnotationTarget.TYPE_PARAMETER
        AnnotationTarget.VALUE_PARAMETER
    }
}