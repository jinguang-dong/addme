package defpackage;

import android.hardware.camera2.CameraDevice;
import android.os.SystemClock;
import android.os.Trace;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tl extends uht implements uiq {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl(abr abrVar, Object obj, uhb uhbVar, int i) {
        super(1, uhbVar);
        this.c = i;
        this.a = abrVar;
        this.b = obj;
    }

    @Override // defpackage.uiq
    public final /* synthetic */ Object a(Object obj) {
        int i = this.c;
        if (i == 0) {
            Object obj2 = this.a;
            return new tl((tm) obj2, (wi) this.b, (uhb) obj, 0).b(ufg.a);
        }
        if (i != 1) {
            Object obj3 = this.a;
            return new tl((abr) obj3, this.b, (uhb) obj, 2).b(ufg.a);
        }
        Object obj4 = this.a;
        return new tl((CameraDevice) obj4, (ujw) this.b, (uhb) obj, 1).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        int i = this.c;
        if (i == 0) {
            rnt.aN(obj);
            Object obj2 = this.a;
            Objects.toString(obj2);
            String strConcat = obj2.toString().concat(" stopRepeating");
            Object obj3 = this.b;
            try {
                Trace.beginSection(strConcat);
                ((wi) obj3).b();
                Trace.endSection();
                Object obj4 = this.a;
                Objects.toString(obj4);
                String strConcat2 = obj4.toString().concat(" abortCaptures");
                Object obj5 = this.b;
                try {
                    Trace.beginSection(strConcat2);
                    ((wi) obj5).a();
                    Trace.endSection();
                    return ufg.a;
                } finally {
                }
            } finally {
            }
        }
        if (i != 1) {
            rnt.aN(obj);
            abr abrVar = (abr) this.a;
            abrVar.g();
            abz abzVar = abrVar.a;
            Object objB = abrVar.b(this.b);
            abzVar.c(objB);
            abrVar.i(objB);
            return ufg.a;
        }
        rnt.aN(obj);
        Object obj6 = this.a;
        CameraDevice cameraDevice = (CameraDevice) obj6;
        cameraDevice.getId();
        String str = "CXCP#CameraDevice-" + cameraDevice.getId() + "#close";
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(str);
            ((CameraDevice) obj6).close();
            Trace.endSection();
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf((SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos) / 1000000.0d)}, 1)).getClass();
            ((ujw) this.b).a = true;
            return ufg.a;
        } catch (Throwable th) {
            Trace.endSection();
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf((SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos) / 1000000.0d)}, 1)).getClass();
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl(CameraDevice cameraDevice, ujw ujwVar, uhb uhbVar, int i) {
        super(1, uhbVar);
        this.c = i;
        this.a = cameraDevice;
        this.b = ujwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl(tm tmVar, wi wiVar, uhb uhbVar, int i) {
        super(1, uhbVar);
        this.c = i;
        this.a = tmVar;
        this.b = wiVar;
    }
}
