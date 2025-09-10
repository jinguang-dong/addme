package defpackage;

import android.view.Surface;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class px implements AutoCloseable {
    public final Surface a;
    final /* synthetic */ py b;
    private final int c = py.a.b();
    private final uly d = new uly(false, umc.a);

    public px(py pyVar, Surface surface) {
        this.b = pyVar;
        this.a = surface;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        List listBN;
        if (this.d.b()) {
            toString();
            py pyVar = this.b;
            synchronized (pyVar.b) {
                Surface surface = this.a;
                Map map = pyVar.c;
                Integer num = (Integer) map.get(surface);
                if (num == null) {
                    throw new IllegalStateException(a.bA(this, surface, "Surface ", " (", ") has no use count"));
                }
                int iIntValue = num.intValue() - 1;
                map.put(surface, Integer.valueOf(iIntValue));
                if (iIntValue == 0) {
                    Objects.toString(surface);
                    toString();
                    listBN = ske.bN(pyVar.d);
                    map.remove(surface);
                } else {
                    listBN = null;
                }
            }
            if (listBN != null) {
                Iterator it = listBN.iterator();
                while (it.hasNext()) {
                    ((pw) it.next()).b();
                }
            }
        }
    }

    public final String toString() {
        return "SurfaceToken-" + this.c;
    }
}
