package com.reactnativesunmiprinter;

import androidx.annotation.NonNull;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReadableArray;

public abstract class NativeSunmiPrinterSpec extends ReactContextBaseJavaModule {
  public NativeSunmiPrinterSpec(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @NonNull
  @Override
  public abstract String getName();

  public abstract void printerInit() throws android.os.RemoteException;
  public abstract void printerSelfChecking() throws android.os.RemoteException;
  public abstract void getPrinterSerialNo(Promise promise);
  public abstract void getPrinterVersion(Promise promise);
  public abstract void getServiceVersion(Promise promise);
  public abstract void getPrinterModal(Promise promise);
  public abstract void getPrinterPaper(Promise promise);
  public abstract void getPrintedLength() throws android.os.RemoteException;
  public abstract void updatePrinterState(Promise promise);
  public abstract void hasPrinter(Promise promise);
  public abstract void sendRAWData(String data) throws android.os.RemoteException;
  public abstract void setPrinterStyle(double key, double value) throws android.os.RemoteException;
  public abstract void setAlignment(double align) throws android.os.RemoteException;
  public abstract void setFontName(String typeface) throws android.os.RemoteException;
  public abstract void setFontSize(double size) throws android.os.RemoteException;
  public abstract void setFontWeight(boolean isWeight) throws android.os.RemoteException;
  public abstract void printerText(String text) throws android.os.RemoteException;
  public abstract void printTextWithFont(String text, String typeface, double fontsize) throws android.os.RemoteException;
  public abstract void printOriginalText(String text) throws android.os.RemoteException;
  public abstract void printColumnsText(ReadableArray texts, ReadableArray widths, ReadableArray aligns) throws android.os.RemoteException;
  public abstract void printColumnsString(ReadableArray texts, ReadableArray widths, ReadableArray aligns) throws android.os.RemoteException;
  public abstract void printBarCode(String data, double symbology, double height, double width, double textPosition) throws android.os.RemoteException;
  public abstract void printQRCode(String data, double modulesize, double errorlevel) throws android.os.RemoteException;
  public abstract void print2DCode(String data, double symbology, double modulesize, double errorlevel) throws android.os.RemoteException;
  public abstract void printBitmapBase64Custom(String encodedString, double pixelWidth, double type) throws android.os.RemoteException;
  public abstract void enterPrinterBuffer(boolean clear) throws android.os.RemoteException;
  public abstract void exitPrinterBuffer(boolean commit) throws android.os.RemoteException;
  public abstract void commitPrinterBuffer() throws android.os.RemoteException;
  public abstract void commitPrinterBufferWithCallbacka() throws android.os.RemoteException;
  public abstract void lineWrap(double num) throws android.os.RemoteException;
  public abstract void cutPaper() throws android.os.RemoteException;
  public abstract void openDrawer() throws android.os.RemoteException;
  public abstract void getDrawerStatus(Promise promise);
}
