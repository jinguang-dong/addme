package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class edj {
    public final Map a = new HashMap();
    public final Map b = new HashMap();
    public final Object c = new Object();
    public final ejs d;

    static {
        dwj.a("WorkTimer");
    }

    public edj(ejs ejsVar) {
        this.d = ejsVar;
    }

    public final void a(ebm ebmVar) {
        synchronized (this.c) {
            if (((dxr) this.a.remove(ebmVar)) != null) {
                dwj.b();
                Objects.toString(ebmVar);
                this.b.remove(ebmVar);
            }
        }
    }
}
