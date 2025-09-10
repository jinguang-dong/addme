package defpackage;

import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ost extends otm {
    private final WeakReference a;
    private final WeakReference b;

    public ost(Map map, Object obj, ofp ofpVar) {
        super(ofpVar);
        this.a = new WeakReference(map);
        this.b = new WeakReference(obj);
    }

    @Override // defpackage.osn
    public final void d(Status status) {
        Map map = (Map) this.a.get();
        Object obj = this.b.get();
        if (!status.b() && map != null && obj != null) {
            synchronized (map) {
                otr otrVar = (otr) map.remove(obj);
                if (otrVar != null) {
                    otrVar.m();
                }
            }
        }
        e(status);
    }
}
