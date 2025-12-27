# @heasy/react-native-sunmi-printer

Caution: this is not the official project. I share it because I am working on this device but no any official support in react-native It's welcome to ask any question about the usage,problems or feature required, I will support ASAP.

Offical Demos plz refer: https://github.com/shangmisunmi/SunmiPrinterDemo

## Requirements

- **React Native**: >= 0.74.0
- **Android**: API Level 23+ (Android 6.0+)
- **Java**: JDK 17
- **New Architecture**: Required (TurboModules)

This library has been migrated to React Native's new architecture (TurboModules). It requires React Native 0.74 or higher and the new architecture must be enabled.

## TOC

- [Requirements](#Requirements)
- [Installation](#Installation)
- [Linking](#Linking)
- [Migration from v1.x](#Migration-from-v1x)
- [Usage](#Usage)
- [API](#API)
- [Broadcast Events Listener](#Broadcast-Event-Listener)

## Installation:

Using npm：

```bash
npm install @heasy/react-native-sunmi-printer --save
```

or using yarn：

```bash
yarn add @heasy/react-native-sunmi-printer
```

## Linking

Automatic linking is supported for React Native >= 0.74 with the new architecture enabled.

To enable the new architecture in your app, add this to your `android/gradle.properties`:

```properties
newArchEnabled=true
```

## Migration from v1.x

If you're upgrading from v1.x (old architecture) to v2.x (new architecture):

1. **Update React Native** to 0.74 or higher
2. **Enable new architecture** in `android/gradle.properties`:
   ```properties
   newArchEnabled=true
   ```
3. **Update the package**:
   ```bash
   yarn add @heasy/react-native-sunmi-printer@^2.0.0
   # or
   npm install @heasy/react-native-sunmi-printer@^2.0.0
   ```
4. **Rebuild your app**:
   ```bash
   cd android && ./gradlew clean
   cd .. && npx react-native run-android
   ```

**No code changes required!** The JavaScript API remains 100% compatible.

## Usage

```js
import SunmiPrinter from '@heasy/react-native-sunmi-printer';

SunmiPrinter.printerText('Hello World\n');
```

## Scan

```js
import { SunmiScan } from '@heasy/react-native-sunmi-printer';

useEffect(() => {
  DeviceEventEmitter.addListener('onScanSuccess', (msg) => {
    console.log('result', msg);
  });
  return () => DeviceEventEmitter.removeAllListeners('onScanSuccess');
}, []);

SunmiScan.scan();
```

## API

The example app in this repository shows an example usage of every single API, consult the example app if you have questions, and if you think you see a problem make sure you can reproduce it using the example app before reporting it, thank you.

| Method                                                                  | Return Type       | iOS | Android | Windows | Web |
| ----------------------------------------------------------------------- | ----------------- | :-: | :-----: | :-----: | :-: |
| [printerInit()](#printerInit)                                           | `null`            | ❌  |   ✅    |   ❌    | ❌  |
| [printerSelfChecking()](#printerSelfChecking)                           | `null`            | ❌  |   ✅    |   ❌    | ❌  |
| [getPrinterSerialNo()](#getPrinterSerialNo)                             | `Promise<string>` | ❌  |   ✅    |   ❌    | ❌  |
| [getPrinterVersion()](#getPrinterVersion)                               | `Promise<string>` | ❌  |   ✅    |   ❌    | ❌  |
| [getServiceVersion()](#getServiceVersion)                               | `Promise<string>` | ❌  |   ✅    |   ❌    | ❌  |
| [getPrinterModal()](#getPrinterModal)                                   | `Promise<string>` | ❌  |   ✅    |   ❌    | ❌  |
| [getPrinterPaper()](#getPrinterPaper)                                   | `Promise<string>` | ❌  |   ✅    |   ❌    | ❌  |
| [getPrintedLength()](#getPrintedLength)                                 | `null`            | ❌  |   ✅    |   ❌    | ❌  |
| [updatePrinterState()](#updatePrinterState)                             | `Promise<number>` | ❌  |   ✅    |   ❌    | ❌  |
| [sendRAWData()](#sendRAWData)                                           | `null`            | ❌  |   ✅    |   ❌    | ❌  |
| [setPrinterStyle()](#setPrinterStyle)                                   | `null`            | ❌  |   ✅    |   ❌    | ❌  |
| [setAlignment()](#setAlignment)                                         | `null`            | ❌  |   ✅    |   ❌    | ❌  |
| [setFontName()](#setFontName)                                           | `null`            | ❌  |   ✅    |   ❌    | ❌  |
| [setFontSize()](#setFontSize)                                           | `null`            | ❌  |   ✅    |   ❌    | ❌  |
| [setFontWeight()](#setFontWeight)                                       | `null`            | ❌  |   ✅    |   ❌    | ❌  |
| [printerText()](#printerText)                                           | `null`            | ❌  |   ✅    |   ❌    | ❌  |
| [printTextWithFont()](#printTextWithFont)                               | `null`            | ❌  |   ✅    |   ❌    | ❌  |
| [printOriginalText()](#printOriginalText)                               | `null`            | ❌  |   ✅    |   ❌    | ❌  |
| [printColumnsText()](#printColumnsText)                                 | `null`            | ❌  |   ✅    |   ❌    | ❌  |
| [printColumnsString()](#printColumnsString)                             | `null`            | ❌  |   ✅    |   ❌    | ❌  |
| [printBarCode()](#printBarCode)                                         | `null`            | ❌  |   ✅    |   ❌    | ❌  |
| [printQRCode()](#printQRCode)                                           | `null`            | ❌  |   ✅    |   ❌    | ❌  |
| [print2DCode()](#print2DCode)                                           | `null`            | ❌  |   ✅    |   ❌    | ❌  |
| [commitPrint()](#commitPrint)                                           | `null`            | ❌  |   ✅    |   ❌    | ❌  |
| [enterPrinterBuffer()](#enterPrinterBuffer)                             | `null`            | ❌  |   ✅    |   ❌    | ❌  |
| [exitPrinterBuffer()](#exitPrinterBuffer)                               | `null`            | ❌  |   ✅    |   ❌    | ❌  |
| [commitPrinterBuffer()](#commitPrinterBuffer)                           | `null`            | ❌  |   ✅    |   ❌    | ❌  |
| [commitPrinterBufferWithCallbacka()](#commitPrinterBufferWithCallbacka) | `null`            | ❌  |   ✅    |   ❌    | ❌  |
| [lineWrap()](#lineWrap)                                                 | `null`            | ❌  |   ✅    |   ❌    | ❌  |
| [cutPaper()](#cutPaper)                                                 | `null`            | ❌  |   ✅    |   ❌    | ❌  |
| [getCutPaperTimes()](#getCutPaperTimes)                                 | `Promise<number>` | ❌  |   ✅    |   ❌    | ❌  |
| [openDrawer()](#openDrawer)                                             | `null`            | ❌  |   ✅    |   ❌    | ❌  |
| [getDrawerStatus()](#getCutPaperTimes)                                  | `null`            | ❌  |   ✅    |   ❌    | ❌  |
| [printBitmap()](#printBitmap)                                           | `null`            | ❌  |   ✅    |   ❌    | ❌  |
| [printBitmapCustom()](#printBitmapCustom)                               | `null`            | ❌  |   ✅    |   ❌    | ❌  |

## Broadcast-Event-Listener

You can enable `Output Via Broadcast` option in your SUNMI Device `Scanner's Settings` and then listen the `onScanSuccess` Event with the `result`.
You have to use physical special key buttons on your SUNMI device or soft floating button on your device (if you enabled that)  to trigger infrared scanning for the barcodes . And then afterwards , you can get the result in the `onScanSuccess` event.

```js

useEffect(() => {
  DeviceEventEmitter.addListener('onScanSuccess', (msg) => {
    console.log('result', msg);
  });
  return () => DeviceEventEmitter.removeAllListeners('onScanSuccess');
}, []);

```

## Contributing

See the [contributing guide](CONTRIBUTING.md) to learn how to contribute to the repository and the development workflow.

## License

MIT
