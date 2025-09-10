package defpackage;

import android.hardware.camera2.CaptureResult;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class piz implements pnx {
    private final CaptureResult a;
    private final Map b = new ConcurrentHashMap();

    public piz(CaptureResult captureResult) {
        this.a = captureResult;
    }

    @Override // defpackage.pnx
    public final Object a(CaptureResult.Key key) {
        Object obj;
        Map map = this.b;
        piy piyVar = (piy) map.get(key);
        if (piyVar == null) {
            synchronized (map) {
                piyVar = (piy) map.get(key);
                if (piyVar == null) {
                    piyVar = new piy(this.a, key);
                    map.put(key, piyVar);
                }
            }
        }
        Object obj2 = piyVar.d;
        Object obj3 = piy.a;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (piyVar) {
            obj = piyVar.d;
            if (obj == obj3) {
                obj = piyVar.b.get(piyVar.c);
                piyVar.d = obj;
            }
        }
        return obj;
    }

    @Override // defpackage.pnx
    public final String b() {
        try {
            return (String) CaptureResult.class.getDeclaredMethod("getCameraId", null).invoke(this.a, null);
        } catch (ReflectiveOperationException unused) {
            return null;
        }
    }

    @Override // defpackage.pnx
    public final long d() {
        return this.a.getFrameNumber();
    }

    @Override // defpackage.pnx
    public final pnw e() {
        return new pix(this.a.getRequest());
    }

    @Override // defpackage.pnx
    public final int ew() {
        return this.a.getSequenceId();
    }

    @Override // defpackage.pnt
    public Object ex(Class cls) {
        throw null;
    }

    @Override // defpackage.pnx
    public final List f() {
        return this.a.getKeys();
    }
}
