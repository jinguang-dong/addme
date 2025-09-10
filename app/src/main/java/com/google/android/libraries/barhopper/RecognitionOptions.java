package com.google.android.libraries.barhopper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class RecognitionOptions {
    public static final int AZTEC = 4096;
    public static final int CODABAR = 8;
    public static final int CODE_128 = 1;
    public static final int CODE_39 = 2;
    public static final int CODE_93 = 4;
    public static final int DATA_MATRIX = 16;
    public static final int EAN_13 = 32;
    public static final int EAN_8 = 64;
    public static final int ITF = 128;
    public static final int PDF417 = 2048;
    public static final int QR_CODE = 256;
    public static final int TEZ_CODE = 32768;
    public static final int UNRECOGNIZED = 0;
    public static final int UPC_A = 512;
    public static final int UPC_E = 1024;
    private int barcodeFormats = 0;
    private boolean outputUnrecognizedBarcodes = false;
    private boolean useQrMobilenetV3 = false;
    private boolean useHalideAffineCrop = false;
    private MultiScaleDecodingOptions multiScaleDecodingOptions = new MultiScaleDecodingOptions();
    private MultiScaleDetectionOptions multiScaleDetectionOptions = new MultiScaleDetectionOptions();
    private OnedRecognitionOptions onedRecognitionOptions = new OnedRecognitionOptions();
    private boolean qrEnableFourthCornerApproximation = true;
    private boolean useDetectionAsCornerPointsForOneD = false;
    private boolean qrEnableNoQuietZoneDetection = false;
    private boolean qrEnableAlignmentPatternShapeFunction = false;

    public int getBarcodeFormats() {
        return this.barcodeFormats;
    }

    @Deprecated
    public boolean getEnableQrAlignmentGrid() {
        return true;
    }

    @Deprecated
    public boolean getEnableUseKeypointAsFinderPattern() {
        return true;
    }

    public MultiScaleDecodingOptions getMultiScaleDecodingOptions() {
        return this.multiScaleDecodingOptions;
    }

    public MultiScaleDetectionOptions getMultiScaleDetectionOptions() {
        return this.multiScaleDetectionOptions;
    }

    public OnedRecognitionOptions getOnedRecognitionOptions() {
        return this.onedRecognitionOptions;
    }

    public boolean getOutputUnrecognizedBarcodes() {
        return this.outputUnrecognizedBarcodes;
    }

    public boolean getQrEnableAlignmentPatternShapeFunction() {
        return this.qrEnableAlignmentPatternShapeFunction;
    }

    public boolean getQrEnableFourthCornerApproximation() {
        return this.qrEnableFourthCornerApproximation;
    }

    public boolean getQrEnableNoQuietZoneDetection() {
        return this.qrEnableNoQuietZoneDetection;
    }

    public boolean getUseDetectionAsCornerPointsForOneD() {
        return this.useDetectionAsCornerPointsForOneD;
    }

    public boolean getUseHalideAffineCrop() {
        return this.useHalideAffineCrop;
    }

    public boolean getUseQrMobilenetV3() {
        return this.useQrMobilenetV3;
    }

    public void setBarcodeFormats(int i) {
        this.barcodeFormats = i;
    }

    public void setMultiScaleDecodingOptions(MultiScaleDecodingOptions multiScaleDecodingOptions) {
        this.multiScaleDecodingOptions = multiScaleDecodingOptions;
    }

    public void setMultiScaleDetectionOptions(MultiScaleDetectionOptions multiScaleDetectionOptions) {
        this.multiScaleDetectionOptions = multiScaleDetectionOptions;
    }

    public void setOnedRecognitionOptions(OnedRecognitionOptions onedRecognitionOptions) {
        this.onedRecognitionOptions = onedRecognitionOptions;
    }

    public void setOutputUnrecognizedBarcodes(boolean z) {
        this.outputUnrecognizedBarcodes = z;
    }

    public void setQrEnableAlignmentPatternShapeFunction(boolean z) {
        this.qrEnableAlignmentPatternShapeFunction = z;
    }

    public void setQrEnableFourthCornerApproximation(boolean z) {
        this.qrEnableFourthCornerApproximation = z;
    }

    public void setQrEnableNoQuietZoneDetection(boolean z) {
        this.qrEnableNoQuietZoneDetection = z;
    }

    public void setUseDetectionAsCornerPointsForOneD(boolean z) {
        this.useDetectionAsCornerPointsForOneD = z;
    }

    public void setUseHalideAffineCrop(boolean z) {
        this.useHalideAffineCrop = z;
    }

    public void setUseQrMobilenetV3(boolean z) {
        this.useQrMobilenetV3 = z;
    }

    @Deprecated
    public void setEnableQrAlignmentGrid(boolean z) {
    }

    @Deprecated
    public void setEnableUseKeypointAsFinderPattern(boolean z) {
    }
}
