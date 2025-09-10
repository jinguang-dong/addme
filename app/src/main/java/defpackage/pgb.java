package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pgb implements pdv {
    public final scn a;
    public final scn b;
    public final scn c;
    public final scn d;
    public final int e;
    public final long f;
    private final int g;
    private final rww h;

    public pgb(scn scnVar, scn scnVar2, scn scnVar3, scn scnVar4, int i, rww rwwVar) {
        int i2;
        boolean z = true;
        a.I(!scnVar.isEmpty());
        if (i <= 0) {
            if (i == -1) {
                i = -1;
            } else {
                z = false;
            }
        }
        rnt.D(z, "Capacity %s must be greater than 0, or -1 to indicate that capacity is not tracked.", i);
        this.c = scnVar;
        this.a = scnVar2;
        this.b = scnVar3;
        this.d = scnVar4;
        this.e = i;
        this.h = rwwVar;
        this.f = ojl.bo(scnVar2);
        synchronized (phh.class) {
            i2 = phh.a;
            phh.a = i2 + 1;
        }
        this.g = i2;
    }

    @Override // defpackage.pdv
    public final int a() {
        return this.e;
    }

    @Override // defpackage.pdv
    public final owf b() {
        return (owf) this.h.fr();
    }

    @Override // defpackage.pdv
    public final /* synthetic */ Set c() {
        return this.d;
    }

    @Override // defpackage.pdv
    public final /* synthetic */ Set d() {
        return this.c;
    }

    public final String toString() {
        return "FrameStream-" + this.g;
    }
}
