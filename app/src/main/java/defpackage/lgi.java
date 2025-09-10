package defpackage;

import android.content.res.AssetFileDescriptor;
import com.google.googlex.gcam.AssetData;
import com.google.googlex.gcam.GcamModuleJNI;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lgi implements paq {
    public static final lgi a = new lgi("", null, null);
    public final AssetData b;
    private final paq c;

    public lgi(String str, AssetFileDescriptor assetFileDescriptor, paq paqVar) {
        this.c = paqVar;
        if (assetFileDescriptor == null) {
            this.b = null;
            ((sgt) lgk.a.b().M(4136)).s("Empty asset file.");
            return;
        }
        AssetData assetData = new AssetData();
        this.b = assetData;
        GcamModuleJNI.AssetData_fd_set(assetData.a, assetData, assetFileDescriptor.getParcelFileDescriptor().getFd());
        GcamModuleJNI.AssetData_offset_set(assetData.a, assetData, (int) assetFileDescriptor.getStartOffset());
        GcamModuleJNI.AssetData_length_set(assetData.a, assetData, (int) assetFileDescriptor.getLength());
        GcamModuleJNI.AssetData_name_set(assetData.a, assetData, str);
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        paq paqVar = this.c;
        if (paqVar != null) {
            paqVar.close();
        }
    }
}
