package com.google.googlex.gcam.hdrplus;

import android.hardware.camera2.TotalCaptureResult;
import defpackage.pjo;
import defpackage.pjp;
import defpackage.tgq;

/* compiled from: PG */
/* loaded from: classes.dex */
public class NativeMetadataConverter extends tgq {
    public NativeMetadataConverter(pjo pjoVar, pjp pjpVar) {
        super(pjoVar, pjpVar);
    }

    private native void nativeConvertToGcamFrameMetadata(String str, CharacteristicsCache characteristicsCache, TotalCaptureResult totalCaptureResult, TotalCaptureResult totalCaptureResult2, ExperimentalVendorTags experimentalVendorTags, AdditionalJavaMetadata additionalJavaMetadata, long j);

    private native void nativeWriteGcamFrameMetadataInputs(String str, int i, String str2, CharacteristicsCache characteristicsCache, TotalCaptureResult totalCaptureResult, TotalCaptureResult totalCaptureResult2, ExperimentalVendorTags experimentalVendorTags, AdditionalJavaMetadata additionalJavaMetadata);
}
