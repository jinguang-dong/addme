package org.chromium.net;

import android.os.ParcelFileDescriptor;
import defpackage.ujo;
import defpackage.vax;
import defpackage.vay;
import defpackage.vba;
import java.io.File;
import java.nio.ByteBuffer;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class UploadDataProviders {
    private UploadDataProviders() {
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return new vba(new vax(parcelFileDescriptor, 0));
    }

    public static UploadDataProvider create(File file) {
        return new vba(new vax(file, 1));
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new vay(byteBuffer.slice());
    }

    public static UploadDataProvider create(byte[] bArr) {
        return ujo.q(bArr, 0, bArr.length);
    }

    public static UploadDataProvider create(byte[] bArr, int i, int i2) {
        return ujo.q(bArr, i, i2);
    }
}
