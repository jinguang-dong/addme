package defpackage;

import android.util.Log;
import android.view.Surface;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class py {
    public static final ulz a = new ulz(0, umc.a);
    public final Object b = new Object();
    public final Map c = new LinkedHashMap();
    public final Set d = new LinkedHashSet();

    public final AutoCloseable a(Surface surface) {
        px pxVar;
        List listBN;
        surface.getClass();
        if (!surface.isValid()) {
            Log.w("CXCP", a.bz(surface, "registerSurface: Surface ", " isn't valid!"));
        }
        synchronized (this.b) {
            pxVar = new px(this, surface);
            Map map = this.c;
            Integer num = (Integer) map.get(surface);
            int iIntValue = (num != null ? num.intValue() : 0) + 1;
            map.put(surface, Integer.valueOf(iIntValue));
            if (iIntValue == 1) {
                Objects.toString(surface);
                pxVar.toString();
                listBN = ske.bN(this.d);
            } else {
                listBN = null;
            }
        }
        if (listBN != null) {
            Iterator it = listBN.iterator();
            while (it.hasNext()) {
                ((pw) it.next()).a();
            }
        }
        return pxVar;
    }
}
