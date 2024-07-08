# ToastX

ToastX is a simple and flexible Android library for creating customizable toast messages. With ToastX, you can display various types of toasts with different styles, icons, and positions.

## Features

- **Success Toast**: Display a toast message indicating success.
- **Error Toast**: Display a toast message indicating an error.
- **Info Toast**: Display a toast message with informational content.
- **Warning Toast**: Display a toast message with a warning.
- **Custom Positioning**: Display toasts at custom positions on the screen.
- **Queueing**: Handle multiple toasts in a queue to ensure they are displayed sequentially.
- Usage
Basic Usage

To display a simple toast, use the following methods:


ToastManager.success(context, "This is a success message", Toast.LENGTH_SHORT);
ToastManager.error(context, "This is an error message", Toast.LENGTH_LONG);
ToastManager.info(context, "This is an info message", Toast.LENGTH_SHORT);
ToastManager.warning(context, "This is a warning message", Toast.LENGTH_SHORT);

Custom Positioning

To display a toast at a custom position, use the following methods:



ToastManager.successAtPosition(context, "This is a success message at position", Toast.LENGTH_SHORT, Gravity.TOP, 0, 100);
ToastManager.errorAtPosition(context, "This is an error message at position", Toast.LENGTH_LONG, Gravity.BOTTOM, 0, 100);
ToastManager.infoAtPosition(context, "This is an info message at position", Toast.LENGTH_SHORT, Gravity.CENTER, 0, 100);
ToastManager.warningAtPosition(context, "This is a warning message at position", Toast.LENGTH_SHORT, Gravity.TOP, 0, 100);

Screenshots
Success Toast
![image](https://github.com/avibaazov/ToastX/assets/110473435/8fec9aac-5377-4963-aa3c-d319172585ad)
<img src="https://github.com/avibaazov/ToastX/assets/110473435/8fec9aac-5377-4963-aa3c-d319172585ad" width="300" alt="Success Toast">

Error Toast

Info Toast

Warning Toast

Custom Positioned Toast
