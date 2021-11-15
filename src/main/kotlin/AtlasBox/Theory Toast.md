## Theory: Toast

Any application relies on successful communication between the app and the user. A great way to let the user know what's going on is notifying them with short messages. One of the ways to notify our users is through Toast. In this topic, we will discuss how to use Toasts in your application.

##### What is a Toast

A **Toast** is a message that appears on the surface of the application window filling the amount of space it needs for the message. Toasts are generally used to display short messages.

![img](https://ucarecdn.com/30907303-ebb6-4339-90a4-a88426e66b25/)

##### How to create a Toast message

To create a Toast, you need to pass three parameters: `context`, `text`, and `duration`.

`Context` is the context of the current state of the application or object. It helps only created objects to receive any information that it needs.

`Text` is the message that you want to show:

```kotlin
val text = "User's text"
```

`Duration` defines how long the Toast will be displayed:

```kotlin
val duration = Toast.LENGTH_SHORT
```

After that, you need to initialize the Toast object using the `Toast.makeText()` method, and then call the `show()` method to display the message on the screen:

```kotlin
val toast = Toast.makeText(context, text, duration)

toast.show()
```

So, how do you set the duration of displaying a Toast? Well, there are actually only two options for message duration: `LENGTH_SHORT` and `LENGTH_LONG`. Toast message lasts for several seconds and this duration is not strictly defined.

Often, some lines of code are combined into one to make code easier to read the code, for example:

```kotlin
Toast.makeText(context, text, duration).show()
```

Don’t forget to add the `show()` method at the end of your Toast code line. Luckily, in Android studio, if you skip the `show()` method, the line will be highlighted, and when you hover over it, you will see a warning message.

##### Adjusting the screen position

By default, a standard Toast appears at the bottom of the screen. You can change where the toast appears using the `setGravity()` method. For example, if you want the message in the center of the screen, use the `Gravity.CENTER` parameter in the `setGravity()` method.

If you need to shift your Toast along the OX axis, just increase the value of the second parameter. To shift along the OY axis, increase the value of the last parameter.

```kotlin
val text = "Here can be your text"
val duration = Toast.LENGTH_SHORT
val toast = Toast.makeText(context, text, duration)
toast.setGravity(Gravity.CENTER, 0, 0)
toast.show()
```

![img](https://ucarecdn.com/8278bba8-e907-4882-b92e-2c7a0a89f1c7/)

**Toast.Callback**

In Android 11 R (API 30), you can know when the Toast appears and disappears using `Toast.Callback`:

```kotlin
val toast = Toast.makeText(this, "Here will be your text", Toast.LENGTH_SHORT)
toast.addCallback(object: Toast.Callback() {
    override fun onToastShown() {
        // Your code here
    }

    override fun onToastHidden() {
        // Your code here
    }
})
toast.show()
```

Also, it is generally recommended not to use toast messages too often. Otherwise, you may run into system restrictions that may be unsolvable.

##### Conclusion

Toast is one of the most popular ways to show a short message while the app is in use. It's easy to use and integrate into your application. However, don't forget that overusing Toasts can negatively affect the evaluation of your application.