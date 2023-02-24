# flutter_go_mobile

I created this app to testing running go code into Flutter. I tested and running Okay!

See below step to running

1. go code is into folder gomobilelib  (if would you like see gomobile.go)
2. i created folder libs into android/app/src/main and copied file to folder gomobilelib.aar
2. i configured the library into build grade /android/app/buil.grade

repositories {
    flatDir {
        dirs 'src/main/libs'
    }
}
dependencies {
    api(name:'gomobilelib', ext:'aar')
}

3. run project 
4. i tested only vm android 12 x86_64 api level 31
5. If you have some doubles, open issue or question here in github, thanks!

![image](https://user-images.githubusercontent.com/65929403/221300997-2be5147f-0c01-4972-9527-f3492fc357cd.png)


Reference https://blog.logrocket.com/why-use-go-backend-flutter/

A new Flutter project.

## Getting Started

This project is a starting point for a Flutter application.

A few resources to get you started if this is your first Flutter project:

- [Lab: Write your first Flutter app](https://docs.flutter.dev/get-started/codelab)
- [Cookbook: Useful Flutter samples](https://docs.flutter.dev/cookbook)

For help getting started with Flutter development, view the
[online documentation](https://docs.flutter.dev/), which offers tutorials,
samples, guidance on mobile development, and a full API reference.
