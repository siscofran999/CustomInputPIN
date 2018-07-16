# CustomInputPIN
Simple library to randomize number in pinpad.

![alt tag](https://raw.githubusercontent.com/siscofran999/CustomInputPIN/master/image/image.jpg)

# Usage
To make a CustomInputPIN add in your layout XML and add CustomInputPIN library in your project or you can also grab it via Gradle:

Add it in your root build.gradle at the end of repositories:

```gradle
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

Add the dependency :
```build.gradle(:app)
dependencies {
	        compile 'com.github.siscofran999:CustomInputPIN:1.0'
	}
```

# XML
```Add to your xml 
<com.example.tsmpc47.custominputpin.CustomInputPIN
    android:id="@+id/custom"
    android:layout_width="match_parent"
    android:layout_height="match_parent" />
```

