package com.example.toastx;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.content.ContextCompat;

public class ToastManager {

    public enum ToastType {
        SUCCESS, ERROR, INFO, WARNING
    }

    private Context context;

    public ToastManager(Context context) {
        this.context = context;
    }

    private Toast createToast(String message, ToastType type, int duration) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View layout = inflater.inflate(R.layout.toast_layout, null);

        TextView textView = layout.findViewById(R.id.toast_text);
        textView.setText(message);

        ImageView iconView = layout.findViewById(R.id.toast_icon);

        // Set background color and icon based on type
        GradientDrawable background = (GradientDrawable) layout.getBackground();
        switch (type) {
            case SUCCESS:
                background.setColor(ContextCompat.getColor(context, android.R.color.holo_green_dark));
                iconView.setImageResource(R.drawable.ic_check);
                break;
            case ERROR:
                background.setColor(ContextCompat.getColor(context, android.R.color.holo_red_light));
                iconView.setImageResource(R.drawable.ic_error);
                break;
            case INFO:
                background.setColor(ContextCompat.getColor(context, android.R.color.holo_blue_light));
                iconView.setImageResource(R.drawable.ic_info);
                break;
            case WARNING:
                background.setColor(ContextCompat.getColor(context, android.R.color.holo_orange_dark));
                iconView.setImageResource(R.drawable.ic_warning);
                break;
        }

        Toast toast = new Toast(context);
        toast.setDuration(duration);
        toast.setView(layout);
        return toast;
    }

    private Toast createToastAtPosition(String message, ToastType type, int duration, int gravity, int xOffset, int yOffset) {
        Toast toast = createToast(message, type, duration);
        toast.setGravity(gravity, xOffset, yOffset);
        return toast;
    }

    // Convenience methods
    public static void success(Context context, String message, int duration) {
        ToastQueueManager.getInstance().addToast(new ToastManager(context).createToast(message, ToastType.SUCCESS, duration));
    }

    public static void error(Context context, String message, int duration) {
        ToastQueueManager.getInstance().addToast(new ToastManager(context).createToast(message, ToastType.ERROR, duration));
    }

    public static void info(Context context, String message, int duration) {
        ToastQueueManager.getInstance().addToast(new ToastManager(context).createToast(message, ToastType.INFO, duration));
    }

    public static void warning(Context context, String message, int duration) {
        ToastQueueManager.getInstance().addToast(new ToastManager(context).createToast(message, ToastType.WARNING, duration));
    }

    public static void successAtPosition(Context context, String message, int duration, int gravity, int xOffset, int yOffset) {
        ToastQueueManager.getInstance().addToast(new ToastManager(context).createToastAtPosition(message, ToastType.SUCCESS, duration, gravity, xOffset, yOffset));
    }

    public static void errorAtPosition(Context context, String message, int duration, int gravity, int xOffset, int yOffset) {
        ToastQueueManager.getInstance().addToast(new ToastManager(context).createToastAtPosition(message, ToastType.ERROR, duration, gravity, xOffset, yOffset));
    }

    public static void infoAtPosition(Context context, String message, int duration, int gravity, int xOffset, int yOffset) {
        ToastQueueManager.getInstance().addToast(new ToastManager(context).createToastAtPosition(message, ToastType.INFO, duration, gravity, xOffset, yOffset));
    }

    public static void warningAtPosition(Context context, String message, int duration, int gravity, int xOffset, int yOffset) {
        ToastQueueManager.getInstance().addToast(new ToastManager(context).createToastAtPosition(message, ToastType.WARNING, duration, gravity, xOffset, yOffset));
    }
}
