package com.example.flutter_go_mobile;

import androidx.annotation.NonNull;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.common.MethodChannel;
import gomobilelib.DataProcessor;

public class MainActivity extends FlutterActivity {
    private static final String CHANNEL = "example.com/gomobilelib";

    @Override
    public void configureFlutterEngine(@NonNull FlutterEngine flutterEngine) {

        DataProcessor myDataProcessor = new DataProcessor();

        super.configureFlutterEngine(flutterEngine);
        new MethodChannel(flutterEngine.getDartExecutor().getBinaryMessenger(), CHANNEL)
                .setMethodCallHandler(
                        (call, result) -> {
                            if(call.method.equals("getRandomNumber")) {
                                result.success(myDataProcessor.randomNumber());
                            }
                            else {
                                result.notImplemented();
                            }
                        }
                );
    }
}