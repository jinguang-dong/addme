package defpackage;

import android.graphics.Bitmap;
import android.os.SystemClock;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewe implements eqp {
    public static final eql a = new eql("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90, eql.a);
    public static final eql b = new eql("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, eql.a);
    private final etl c;

    @Deprecated
    public ewe() {
        this.c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // defpackage.eqa
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, eqm eqmVar) throws Throwable {
        Bitmap bitmap = (Bitmap) ((esw) obj).c();
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) eqmVar.b(b);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        double d = fas.a;
        SystemClock.elapsedRealtimeNanos();
        int iIntValue = ((Integer) eqmVar.b(a)).intValue();
        OutputStream eqtVar = null;
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    etl etlVar = this.c;
                    eqtVar = etlVar != null ? new eqt(fileOutputStream, etlVar) : fileOutputStream;
                    bitmap.compress(compressFormat, iIntValue, eqtVar);
                    eqtVar.close();
                    eqtVar.close();
                    return true;
                } catch (IOException unused) {
                    eqtVar = fileOutputStream;
                    this = 0;
                    this = 0;
                    if (eqtVar != null) {
                        eqtVar.close();
                    }
                    return this;
                } catch (Throwable th) {
                    th = th;
                    eqtVar = fileOutputStream;
                    if (eqtVar != null) {
                        try {
                            eqtVar.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused3) {
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException unused4) {
            return this;
        }
    }

    @Override // defpackage.eqp
    public final int b() {
        return 2;
    }

    public ewe(etl etlVar) {
        this.c = etlVar;
    }
}
