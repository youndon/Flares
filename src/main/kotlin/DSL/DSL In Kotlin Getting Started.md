# Domain-Specific Languages In Kotlin: Getting Started

In this Kotlin tutorial, learn how to create a DSL using Kotlin lambdas with receivers, builder pattern and extension functions!

![img](https://koenig-media.raywenderlich.com/uploads/2019/06/DomainSpecificLanguages-feature-1.png)

In modern programming, developers strive to write clean and readable code that is intuitive and easy to use. Normally, to achieve this, developers use *design patterns* and create specific architectural solutions. Code written in such a way is *maintainable* and readable by experienced developers, but what if you could write code that *everybody can understand* and reason about?

Kotlin gives you the tools to help craft code into something which feels more natural to use, through a *domain-specific language* — or *DSL*! :]

In this tutorial, you’ll create DSLs to show Android dialogs, in different DSL styles, and data models you need to use for the application. Your app will show a list of puppies, which you can attempt to favorite, using the mentioned dialogs. Throughout implementing these features, you’ll:

- Learn the fundamentals of building a DSL in Kotlin.
- Learn the basics of lambdas with and without receivers.
- Create a DSL using the builder pattern.
- Create a DSL using Kotlin extension functions.

Before building a DSL of your own, it’s best to take a look at some of DSLs you already use, but may not be aware of.

## Domain-Specific Languages

Domain-specific languages, or DSLs, are languages specialized for a specific part of an app. It is used to extract a part of the code to make it reusable and more understandable. As opposed to a function or a method, DSLs also change the way you use and write code. Usually, DSLs make the code more readable, almost like a spoken language. This means that even people who don’t understand the architecture behind the code will be able to grasp the meaning of it.

To make a DSL means to change the syntax of that specific part of the code. In Kotlin, this is achieved by using lambda and extension functions, and expressions, to remove a lot of boilerplate code and hide the internal implementation from the user. One of the best examples is a crucial part of Android development – *Gradle*.

### Popular DSLs

If you’re an Android developer, chances are that you’ve already seen a DSL before. However, would you be surprised to learn that you write the Gradle build files using a DSL? Take a look at the following:

```gradle
android {
  compileSdkVersion 28
  defaultConfig {
    applicationId "android.raywenderlich.com.puppyparadise"
    minSdkVersion 19
    targetSdkVersion 28
    versionCode 1
    versionName "1.0"
    testInstrumentationRunner "android.support.test.runner.AndroidJUnitRunner"
  }
  buildTypes {
    release {
      minifyEnabled false
      proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
    }
  }
}
```

Look at the way the code is written in any `build.gradle` file. Objects use curly brackets to specify their contents. Inside those brackets, you set the value of certain parameters by writing a parameter name and then a value.

It may look like this file simply contains notes or diagram documentation for some class, but in reality, it’s just a special DSL. Below, check out the same code written without the DSL:

```kotlin
Android(28,
  DefaultConfig("android.raywenderlich.com.puppyparadise",
    19,
    28,
    1,
    "1.0",
    "android.support.test.runner.AndroidJUnitRunner"
  )
),
  BuildTypes(
  Release(false,
    getDefaultProguardFile('proguard-android-optimize.txt'),
    'proguard-rules.pro'
    )
)
```

At first glance, it may look unclear, mostly because each object you build has many parameters, and you don’t know their names. By comparing these two approaches, you can see that the version which uses a DSL is easier to read. But more importantly, because you know the parameters and properties you can access, it’s easier to maintain, as well. This is one of the requirements this DSL has, and because of it, it’s much easier to use than the default – using objects.

Another popular example in Android is called *Anko*. It’s a group of Kotlin DSL libraries which cover a lot of functionality. The libraries not only contain DSLs for UI components, but for handling networking calls, background tasks, and database management. The code snippet below uses Anko to execute a background call using *Kotlin Coroutines*:

```kotlin
suspend fun getData(): Data { ... }

class MyActivity : Activity() {
  fun loadAndShowData() {
    // Ref<T> uses the WeakReference under the hood
    val ref: Ref<MyActivity> = this.asReference()
	
    async(UI) {
      val data = getData()			

      // Use ref() instead of this@MyActivity
      ref().showData(data)
    }
  }

  fun showData(data: Data) { ... }
}
```

The curly brackets when calling `asnyc` is one of the signatures of DSLs. And here, you state that a function call will be done asynchronously, without really delving into the implementation details. Just like it should be. If you want to see more examples of *Anko* library, check out the [official GitHub page](https://github.com/Kotlin/anko).

## Getting Started

Before you begin writing DSLs, download the tutorial materials from the *Download Materials* button at the top or bottom of the page. You’ll see the starter and final projects, which you’ll use throughout the tutorial.

After the project is set up, build and run the app and you’ll get a screen like this:
![img](https://koenig-media.raywenderlich.com/uploads/2019/04/puppies-287x500.jpg)

You can see a scrollable screen with cute puppies. You can click on any of them to open the dialog.

![img](https://koenig-media.raywenderlich.com/uploads/2019/04/puppies_dialog-287x500.jpg)

After clicking on a puppy, a dialog is shown with a blurred background. You can choose if you like the puppy or not. If you select *YES* option, a heart icon is shown in the bottom-right corner. Selecting *NO* option removes the heart, but you won’t need to use it because all the puppies are too cute to not be liked. :]

This dialog is the main focus of the tutorial. Open the class `DialogPopupView`. If you look at the code, you can see that the class contains several properties of the dialog. Those include click listeners and the methods to blur the background. At the bottom, you can find the `DialogPopupBuilder` which is responsible for building and setting those properties, ultimately creating a dialog.

Open *PuppyActivity.kt* and look inside the `createDialogPopup()`:

```kotlin
DialogPopupView.builder(this)
    .viewToBlur(rootView)
    .titleText(titleText)
    .negativeText(negativeText)
    .positiveText(positiveText)
    .onBackgroundClickAction(backgroundClickAction)
    .onCancelClickAction(cancelActionClick)
    .onPositiveClickAction(positiveClickAction)
    .build()
```

This method creates a `DialogPopupView` using the *builder pattern*. The goal is to change this call to look more user-friendly, using a DSL. Roughly speaking, you’re going to clean up the code above, so it can be written as follows:

```kotlin
buildDialog(this) {
  viewToBlur(rootView)
  title(titleText)
  positiveAction(positiveText) { positiveClickAction() }
  negativeAction(negativeText) { negativeClickAction() }
  backgroundAction { backgroundClickAction() }
}
```

*Note*: If you’re unfamiliar with the builder pattern, you should check out our [Intermediate Design Patterns in Swift](https://www.raywenderlich.com/2102-intermediate-design-patterns-in-swift). Although it’s a tutorial written for Swift, the concepts described in that tutorial translate to all programming languages including Kotlin.

As you can see, with a DSL, there will be less code and no dots required to connect the chained calls, for the builder pattern.

## DSLs in Kotlin

Now that you know what you want to achieve, you’ll need to use two important features of the Kotlin language to create a DSL:

- Lambda expressions
- Lambdas outside of parentheses.
- Lambdas with receivers.

< The lambda expression is an anonymous function used to wrap behavior you can call any number of times, with or without parameters. You can pass also them around as function parameters and store them as class properties. If you are unfamiliar with lambda expressions, you can check [the official documentation](https://kotlinlang.org/docs/reference/lambdas.html).

To create or use a lambda expression, you first have to declare the type of a lambda you need. The *lambda-type* syntax is as follows: `(parameter, parameter) -> returnType`.

You can interpret this by separating it into two parts, left and right side of the arrow. On the left side, there are required parameters inside the parentheses. You can define any number of required parameters for every lambda function, so it doesn’t have to be one, or two. Every lambda can have no parameters, and it can have any number of parameters.

And on the right side, you define the return type. In easier terms, on the left side, you specify which parameters you want to pass to the right side, where you call a method, and return a result, using those parameters. For a lambda function which doesn’t return anything, you can use `Unit` as the return type. If you were to write a lambda which takes a `String` and returns an `Int`, you’d write the following: `(String) -> Int`.

However, when you use lambdas expressions in code, they are written in a different way from the lambda-type syntax. Using lambda goes as follows: `{ parameter, parameter -> behavior }`. You first open the curly braces and define the list of parameters you receive and need to use. Then you separate the code which you’ll run, using an arrow (`->`). After that, you can run any number of function calls between the arrow and the closing braces.

Since lambdas are *extremely useful*, there’s quite a lot of syntax sugar around them. Three most common sugars include *inferring lambda parameters*, writing *lambdas outside of parentheses* and *lambdas with receivers*.

### Inferring Lamda Parameters

For example, if a lambda has only one parameter, you don’t have to list it in the expression. It’s then *inferred* within the curly braces, and named *it*. It’s common when using collection functions, as you write something like: `list.filter { it.isFavorite }` when filtering a list of items. The `it` in this example is then inferred as each item in the list, over which you’re iterating.

### Lambdas Outside of Parentheses

Lambdas outside of parentheses is a feature in Kotlin which allows you to move the lambda argument outside of parentheses if it is the last parameter. In addition, if it is the only parameter, you can completely remove the parentheses. This means that if you have a method call resembling `method({})`, with lambdas outside the parentheses, it can also be called `method{}`. This feature makes the code more readable and is suggested by the Kotlin style guide.

### Lambdas With Receivers

Imagine that you have a model class for a object that looks like this:

```kotlin
data class Puppy(var isLiked: Boolean = false, var imageResource: Int = 0)
```

You can make a DSL by creating a function named `puppy` which takes a lambda as a parameter and returns a full `Puppy` object:

```kotlin
fun puppy(lambda: (Puppy) -> Unit): Puppy {
  // 1
  val puppy = Puppy()
  // 2
  lambda(puppy)
  // 3
  return puppy
}
```

In this function you do the following:

- Instantiate a `Puppy`.
- Call the lambda which will use the `Puppy`
- Returns the `Puppy`

You can invoke the DSL, creating and editing a `Puppy`:

```kotlin
puppy {
  it.isLiked = true
  it.imageResource = R.drawable.golden_retriever
}
```

You call the `puppy` function and set the properties inside the curly brackets. The current solution works, but you have to use `it` to access the properties instead of accessing them directly. This can be fixed by implementing *lambdas with receivers*.

A lambda with receivers allows you to call methods of an object in the body of a lambda without any qualifiers, such as `it`. You add the receiver with the class type, which means that the received action is a function that any object of the type can call. Moreover, it changes the *this* object within the braces. Examine the snippet below:

```kotlin
fun puppy(lambda: Puppy.() -> Unit): Puppy {
  val puppy = Puppy()
  puppy.lambda()
  return puppy
}
```

Notice that, previously, the lambda passed a `Puppy` (`lambda: (Puppy) -> Unit`) to the caller. However, with receivers, you can call the lambda as a function directly on any `Puppy`. To make the code more simple, you can use Kotlin’s `apply` extension function:

```kotlin
fun puppy(lambda: Puppy.() -> Unit) = Puppy().apply(lambda)
```

`apply` allows you to make the function implementation a one-liner by directly referencing the new object without the need to create a named property. The `puppy` function is now called like:

```kotlin
puppy {
  isLiked = true
  imageResource = R.drawable.golden_retriever
}
```

Instead of using the `it` keyword, you can now reference the object directly because you explicitly said that it must be of type `Puppy`.

## Your First DSL

Armed with the above knowledge, it’s time to modify the `DialogPopupBuilder` and create your first DSL!

You’ll use what you learned to refactor the `DialogPopupView` and make a DSL for it. The goal is to replace the current functions to set the properties by calling a lambda. By doing this, you’ll be able to call the builder with lambdas outside of parentheses, and without using chained function calls. Replace the `DialogPopupBuilder` with:

```kotlin
class DialogPopupBuilder {
  var context: Context? = null
  var viewToBlur: View? = null
  var titleText: String = ""
  var negativeText: String = ""
  var positiveText: String = ""
  var onBackgroundClickAction: () -> Unit = {}
  var onNegativeClickAction: () -> Unit = {}
  var onPositiveClickAction: () -> Unit = {}

  inline fun with(context: () -> Context) {
    this.context = context()
  }

  inline fun viewToBlur(viewToBlur: () -> View) {
    this.viewToBlur = viewToBlur()
  }

  inline fun titleText(title: () -> String) {
    this.titleText = title()
  }

  inline fun negativeText(negativeText: () -> String) {
    this.negativeText = negativeText()
  }

  inline fun positiveText(positiveText: () -> String) {
    this.positiveText = positiveText()
  }

  fun onNegativeClickAction(onNegativeClickAction: () -> Unit) {
    this.onNegativeClickAction = onNegativeClickAction
  }

  fun onPositiveClickAction(onPositiveClickAction: () -> Unit) {
    this.onPositiveClickAction = onPositiveClickAction
  }

  fun onBackgroundClickAction(onBackgroundClickAction: () -> Unit) {
    this.onBackgroundClickAction = onBackgroundClickAction
  }

  fun build() = DialogPopupView(context!!, this)
}
```

You removed the constructor and added a `with()` call, to make it look cleaner in the long run. Since you are going to use a DSL to build the dialog, you don’t need the method to build it in `DialogPopupView`. Remove the `builder` method from the `companion object`.

Finally, you have to write a DSL which will create the `DialogPopupBuilder` and build the `DialogPopupView`. Create a new Kotlin file called *DialogPopupViewDsl.kt* and paste in the following code:

```kotlin
fun dialogPopupView(lambda: DialogPopupView.DialogPopupBuilder.() -> Unit) =
  DialogPopupView.DialogPopupBuilder() // 1
    .apply(lambda)                     // 2
    .build()                           // 3
```

The function has a lambda with a `DialogPopupBuilder` receiver as a parameter. Each line breaks down as follows:

- Instantiate an instance of `DialogPopupBuilder`.
- Set all the properties using the lambda.
- Call `build()` to return a `DialogPopupView`.

You can use the DSL instead of the old builder pattern from within `PuppyActivity`. Change `createDialogPopup()` to use the DSL:

```kotlin
dialogPopupView {
  with { this@PuppyActivity }
  viewToBlur { rootView }
  titleText { titleText }
  negativeText { negativeText }
  positiveText { positiveText }
  onPositiveClickAction { positiveClickAction() }
  onNegativeClickAction { negativeClickAction() }
  onBackgroundClickAction { backgroundClickAction() }
}
```

`dialogPopupView()` takes every dialog property directly, without the need to chain function calls or calling `build()`.

Build and run the code. You’ll see the everything as before, but test the dialog to ensure that it works the same.

## DSL With Extension Functions

You just made your first DSL by using a builder pattern! :]

Next, you’ll make a DSL using the extension functions and applying the builder pattern to create the data to display puppies!

Extension functions are functions that allow you to add new functionality to an existing class type. Any object of the type you specify can use the extension function. If you are unfamiliar with extension functions, you can check out [the official documentation](https://kotlinlang.org/docs/reference/extensions.html).

You’ll create another DSL for the same `DialogPopupView`, but this time, usin extension functions.

Create a new Kotlin file called *DialogPopupViewWithExtensionsDsl.kt*. This time, you’ll want to pass the `context` as a parameter to separate it from *UI* properties. You also want to connect the title of the actions and their lambdas into a single function so that similar properties are grouped in one place.

First, create a function `buildDialog` that will create the whole dialog and build it:

```kotlin
inline fun buildDialog(context: Context, buildDialog: DialogPopupView.DialogPopupBuilder.() -> Unit): DialogPopupView {
  val builder = DialogPopupView.DialogPopupBuilder()

  builder.context = context
  builder.buildDialog()
  return builder.build()
}
```

The function accepts a `Context` and a lambda with a receiver of the type `DialogPopupView.DialogPopupBuilder`. Building the dialog is the same as in the last example.

Next, create a method for each property group and set the properties inside:

```kotlin
fun DialogPopupView.DialogPopupBuilder.title(title: String) {
  this.titleText = title
}

fun DialogPopupView.DialogPopupBuilder.viewToBlur(viewToBlur: View) {
  this.viewToBlur = viewToBlur
}

fun DialogPopupView.DialogPopupBuilder.negativeAction(
  negativeText: String,
  onNegativeClickAction: () -> Unit
) {
  this.onNegativeClickAction = onNegativeClickAction
  this.negativeText = negativeText
}

fun DialogPopupView.DialogPopupBuilder.positiveAction(
  positiveText: String,
  onPositiveClickAction: () -> Unit
) {
  this.onPositiveClickAction = onPositiveClickAction
  this.positiveText = positiveText
}

fun DialogPopupView.DialogPopupBuilder.backgroundAction(onBackgroundClickAction: () -> Unit) {
  this.onBackgroundClickAction = onBackgroundClickAction
}
```

Each of these methods is fairly similar. They set the properties for their corresponding groups.

Finally, you can change the `createDialogPopup()` inside *PuppyActivity.kt* to use the new DSL:

```kotlin
buildDialog(this) {
  viewToBlur(rootView)
  title(titleText)
  positiveAction(positiveText) { positiveClickAction() }
  negativeAction(negativeText) { negativeClickAction() }
  backgroundAction { backgroundClickAction() }
}
```

You can see that `context` is now set through a parameter and not a function. Positive and negative actions are joined with their respective texts to improve the readability by grouping the code.

Build and run the code to verify that everything works as expected. Once again, you’ll get the same screen as before because you only changed the syntax and not the logic. But it never hurts to be sure! :]

### Collections With DSL

Another interesting use of DSLs is with collections. Take a look at `puppies`, which is instantiated at the top of `PuppyActivity`. The code by itself looks pretty clean and readable; this is because there are currently only two properties inside the `Puppy` class. But in case you have four or more properties, it will start to look clunky. For this reason, you’ll create a DSL that will change the way you instantiate collections.

Create a new Kotlin file called *PuppiesDsl.kt*. First, add a `PuppyBuilder` that has two properties and a build method:

```kotlin
class PuppyBuilder {
  var isLiked: Boolean = false
  var imageResourceId: Int = 0

  fun build(): Puppy = Puppy(isLiked, imageResourceId)
}
```

The build method returns a `Puppy` with the listed properties.

Next, create a *Puppies.kt* file which extends `ArrayList` of `Puppy` and has a `puppy` method:

```kotlin
class Puppies : ArrayList<Puppy>() {
  fun puppy(puppyBuilder: PuppyBuilder.() -> Unit) {
    add(PuppyBuilder().apply(puppyBuilder).build())
  }
}
```

`puppy()` uses a lambda with the receiver of type `PuppyBuilder`. Inside, you call `add()` from `ArrayList`, to add a new `Puppy` built with the `PuppyBuilder`.

Next, you need to create a `PuppyViewModelBuilder` that will hold the list of all the puppies, by adding the following code:

```kotlin
class PuppyViewModelBuilder {
  private val puppies = mutableListOf<Puppy>()

  fun puppies(puppiesList: Puppies.() -> Unit) {
    puppies.addAll(Puppies().apply(puppiesList))
  }

  fun build(): ArrayList<Puppy> = ArrayList(puppies)
}
```

The class contains a `MutableList` of `Puppy`. `puppies()` has a lambda with the receiver of type `Puppies` and it adds all of the elements returned by calling `puppiesList()`, to the collection. In addition, you added `build()` which returns an `ArrayList` of `Puppy` with `puppies` as its data.

Finally, create a `puppyViewModel` method inside `PuppiesDsl`:

```kotlin
fun puppyViewModel(puppies: PuppyViewModelBuilder.() -> Unit): ArrayList<Puppy> = 
  PuppyViewModelBuilder().apply(puppies).build()
```

The function uses a lambda with the receiver of type `PuppyViewModelBuilder` as a parameter, which you use to build the `ArrayList` of `Puppy`.

Now, you can replace the code in the *PuppyActivity.kt*, which creates `puppies`, using the DSL you’ve just created:

```kotlin
private var puppies: List<Puppy> = puppyViewModel {
    puppies {
      puppy {
        isLiked = false
        imageResourceId = R.drawable.samoyed
      }
      puppy {
        isLiked = false
        imageResourceId = R.drawable.shiba
      }
      puppy {
        isLiked = false
        imageResourceId = R.drawable.siberian_husky
      }
      puppy {
        isLiked = false
        imageResourceId = R.drawable.akita
      }
      puppy {
        isLiked = false
        imageResourceId = R.drawable.german_shepherd
      }
      puppy {
        isLiked = false
        imageResourceId = R.drawable.golden_retriever
      }
    }
  }
```

First, you call `puppyViewModel()`, to begin the data buildup. Inside, you call `puppies()` in which you call `puppy()` for each `Puppy` you need to create. Each of these calls will create a new `Puppy`, and you can their properties as you like.

The current syntax for creating a collection looks like a *JSON* structure, which is very user-friendly. The benefits of this DSL would grow, the larger and more complex the `Puppy` would become. And we all know how puppies can grow! :]

Build and run the app to check the current state. You should get the same starting screen with a list of puppies in the same order.

## DSL Markers

Try to add a new `Puppy` to an existing `Puppy` or a new `ArrayList` of `Puppy` inside the existing list. You’ll see that you are able to do it even though you should not be, since it may break the data. Because you’re creating lambdas within other lambdas, you can still access the receivers of the outer lambdas! To prevent this, you need to create a DSL marker, which was made specifically to solve this case. Inside the `PuppiesDsl`, at the bottom, create a new annotation class called `PuppyDslMarker`:

```kotlin
@DslMarker
annotation class PuppyDslMarker
```

`@DslMarker` specifies that classes marked with it, or `PuppyDslMarker` define a DSL.

Next, annotate all the classes inside the *PuppiesDsl.kt* file with `@PuppyDslMarker`. Try adding a new `Puppy` to an existing one, and you’ll get an error that says, “can’t be called with implicit receiver.” Problem solved!

## Where to Go From Here?

You can download the final project using the *Download Materials* button, at the top or the bottom of the tutorial.

In this tutorial, you learned how to make different types of DSL for different situations. You can now create your own specific DSLs which will ease your daily programming. If you want to learn more, check out the [official documentation](https://build.bitcoinabc.org/app/dsl-documentation/index.html).

I hope you enjoyed this tutorial! If you have any questions or comments, please join the forum discussion below! And try not to look at the puppies for too long! :]