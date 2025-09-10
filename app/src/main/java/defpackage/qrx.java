package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.params.Face;
import android.os.SystemClock;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qrx {
    public final long a;
    public final Object b;
    public final Object c;
    public final Object d;

    public qrx(Face[] faceArr, List list, Rect rect, long j) {
        this.d = faceArr;
        this.b = list;
        this.c = rect;
        this.a = j;
    }

    public qrx(rww rwwVar, rww rwwVar2, uem uemVar) {
        this.a = SystemClock.uptimeMillis();
        this.b = rwwVar;
        this.c = rwwVar2;
        this.d = uemVar;
    }
}
