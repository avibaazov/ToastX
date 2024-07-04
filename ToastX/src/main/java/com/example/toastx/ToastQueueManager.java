package com.example.toastx;

import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

import java.util.LinkedList;
import java.util.Queue;

public class ToastQueueManager {

    private static ToastQueueManager instance;
    private Queue<Toast> toastQueue = new LinkedList<>();
    private Handler handler = new Handler(Looper.getMainLooper());
    private boolean isShowing = false;

    private ToastQueueManager() {}

    public static synchronized ToastQueueManager getInstance() {
        if (instance == null) {
            instance = new ToastQueueManager();
        }
        return instance;
    }

    public void addToast(Toast toast) {
        toastQueue.add(toast);
        showNextToast();
    }

    private void showNextToast() {
        if (isShowing) return;

        Toast nextToast = toastQueue.poll();
        if (nextToast != null) {
            isShowing = true;
            nextToast.show();
            handler.postDelayed(() -> {
                isShowing = false;
                showNextToast();
            }, nextToast.getDuration() == Toast.LENGTH_LONG ? 3500 : 2000);
        }
    }
}
