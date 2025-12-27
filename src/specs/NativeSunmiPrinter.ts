import type {TurboModule} from 'react-native';
import {TurboModuleRegistry} from 'react-native';

export interface Spec extends TurboModule {
  // Initialization & Info Methods
  printerInit(): void;
  printerSelfChecking(): void;
  getPrinterSerialNo(): Promise<string>;
  getPrinterVersion(): Promise<string>;
  getServiceVersion(): Promise<string>;
  getPrinterModal(): Promise<string>;
  getPrinterPaper(): Promise<string>;
  getPrintedLength(): void;
  updatePrinterState(): Promise<number>;
  hasPrinter(): Promise<boolean>;

  // Raw Data & Style Methods
  sendRAWData(data: string): void;
  setPrinterStyle(key: number, value: number): void;
  setAlignment(align: number): void;
  setFontName(typeface: string): void;
  setFontSize(size: number): void;
  setFontWeight(isWeight: boolean): void;

  // Text Printing Methods
  printerText(text: string): void;
  printTextWithFont(text: string, typeface: string, fontsize: number): void;
  printOriginalText(text: string): void;
  printColumnsText(
    texts: ReadonlyArray<string>,
    widths: ReadonlyArray<number>,
    aligns: ReadonlyArray<number>
  ): void;
  printColumnsString(
    texts: ReadonlyArray<string>,
    widths: ReadonlyArray<number>,
    aligns: ReadonlyArray<number>
  ): void;

  // Barcode & QR Code Methods
  printBarCode(
    data: string,
    symbology: number,
    height: number,
    width: number,
    textPosition: number
  ): void;
  printQRCode(data: string, modulesize: number, errorlevel: number): void;
  print2DCode(
    data: string,
    symbology: number,
    modulesize: number,
    errorlevel: number
  ): void;

  // Image Printing
  printBitmapBase64Custom(
    encodedString: string,
    pixelWidth: number,
    type: number
  ): void;

  // Transaction Buffer Methods
  enterPrinterBuffer(clear: boolean): void;
  exitPrinterBuffer(commit: boolean): void;
  commitPrinterBuffer(): void;
  commitPrinterBufferWithCallbacka(): void;

  // Hardware Control
  lineWrap(num: number): void;
  cutPaper(): void;
  openDrawer(): void;
  getDrawerStatus(): Promise<number>;
}

export default TurboModuleRegistry.getEnforcing<Spec>('SunmiPrinter');
