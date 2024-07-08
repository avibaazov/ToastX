# ToastX

ToastX is a simple and flexible Android library for creating customizable toast messages. With ToastX, you can display various types of toasts with different styles, icons, and positions.

## Features

- **Success Toast**: Display a toast message indicating success.
- **Error Toast**: Display a toast message indicating an error.
- **Info Toast**: Display a toast message with informational content.
- **Warning Toast**: Display a toast message with a warning.
- **Custom Positioning**: Display toasts at custom positions on the screen.
- **Queueing**: Handle multiple toasts in a queue to ensure they are displayed sequentially.

## Basic Usage

To display a simple toast, use the following methods:


    ToastManager.success(context, "This is a success message", Toast.LENGTH_SHORT);

    ToastManager.error(context, "This is an error message", Toast.LENGTH_LONG);

    ToastManager.info(context, "This is an info message", Toast.LENGTH_SHORT);

    ToastManager.warning(context, "This is a warning message", Toast.LENGTH_SHORT);


**Custom Positioning**


To display a toast at a custom position, use the following methods:



    ToastManager.successAtPosition(context, "This is a success message at position", Toast.LENGTH_SHORT, Gravity.TOP, 0, 100);

    ToastManager.errorAtPosition(context, "This is an error message at position", Toast.LENGTH_LONG, Gravity.BOTTOM, 0, 100);

    ToastManager.infoAtPosition(context, "This is an info message at position", Toast.LENGTH_SHORT, Gravity.CENTER, 0, 100);

    ToastManager.warningAtPosition(context, "This is a warning message at position", Toast.LENGTH_SHORT, Gravity.TOP, 0, 100);
Parameters for Custom Positioning

  context: The context in which the toast should be displayed.
  
  message: The message to display in the toast.
  
  duration: The duration for which the toast should be displayed. Use Toast.LENGTH_SHORT or Toast.LENGTH_LONG.
  
  gravity: The gravity to control the placement of the toast. Use constants from android.view.Gravity (e.g., Gravity.TOP, Gravity.BOTTOM, Gravity.CENTER).
  
  xOffset: The x-offset in pixels to apply to the toast's position.
  
  yOffset: The y-offset in pixels to apply to the toast's position.
## Screenshots
<table>
  <tr>
    <td><strong>Success Toast</strong></td>
    <td><strong>Error Toast</strong></td>
  </tr>
  <tr>
    <td><img src="https://github.com/avibaazov/ToastX/assets/110473435/8fec9aac-5377-4963-aa3c-d319172585ad" width="300" alt="Success Toast"></td>
    <td><img src="https://github.com/avibaazov/ToastX/assets/110473435/ed4198cd-560a-4a95-aa13-e5a74d7b10a2" width="300" alt="Error Toast"></td>
  </tr>
  <tr>
    <td><strong>Info Toast</strong></td>
    <td><strong>Warning Toast</strong></td>
  </tr>
  <tr>
    <td><img src="https://github.com/avibaazov/ToastX/assets/110473435/b64b5fee-f8fc-478a-942e-bba89f7a341b" width="300" alt="Info Toast"></td>
    <td><img src="https://github.com/avibaazov/ToastX/assets/110473435/ea2b073c-633a-4e01-b77e-5283d35af52d" width="300" alt="Warning Toast"></td>
  </tr>
</table>
