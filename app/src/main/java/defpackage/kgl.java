package defpackage;

import j$.lang.Iterable$EL;
import j$.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kgl {
    public final Map a = new HashMap();
    public szh b = new szh();
    final /* synthetic */ kgn c;
    private final owq d;

    public kgl(kgn kgnVar, pjr pjrVar, scn scnVar) {
        this.c = kgnVar;
        Iterable$EL.forEach(scnVar, new gok(this, 13));
        this.d = new ovx(pjrVar);
    }

    public final void a(String str) {
        synchronized (this.c) {
            Map map = this.a;
            if (map.containsKey(str)) {
                map.put(str, true);
                b();
            }
        }
    }

    public final void b() {
        Map map = this.a;
        if (Collections.frequency(map.values(), true) == 1) {
            Collection.EL.stream(map.keySet()).filter(new jjj(this, 5)).findFirst().ifPresent(new ird(this, 14));
        } else if (this.b.isDone()) {
            this.b.cancel(false);
            this.b = new szh();
        }
        if (this.b.isDone()) {
            try {
                this.d.a((pjr) this.b.s());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }
}
