package defpackage;

import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class osu extends otm {
    private final WeakReference a;
    private final WeakReference b;

    public osu(Map map, Object obj, ofp ofpVar) {
        super(ofpVar);
        this.a = new WeakReference(map);
        this.b = new WeakReference(obj);
    }

    @Override // defpackage.osn
    public final void d(Status status) {
        Map map = (Map) this.a.get();
        int i = status.e;
        Object obj = this.b.get();
        if (i == 4002 && map != null && obj != null) {
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
