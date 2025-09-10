package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class php implements paq {
    public final pjr a;
    public final pcm b;
    public final boolean c;
    public final AtomicBoolean d;
    public final vp e;
    public final gop f;
    public final pbv g;
    private final uol h;

    public php(pjr pjrVar, vp vpVar, pcm pcmVar, pbv pbvVar, gop gopVar, uhf uhfVar, boolean z) {
        vpVar.getClass();
        this.a = pjrVar;
        this.e = vpVar;
        this.b = pcmVar;
        this.g = pbvVar;
        this.f = gopVar;
        this.c = z;
        this.d = new AtomicBoolean(false);
        this.h = ukc.C(ung.j(uhfVar), null, 0, new si(this, (uhb) null, 15), 3);
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        toString();
        this.d.set(true);
        uol uolVar = this.h;
        if (uolVar != null) {
            uolVar.s(null);
        }
    }
}
