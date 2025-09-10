package defpackage;

import java.util.Set;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sjs implements sji {
    public final String a;
    public final boolean b;
    public final Level c;
    public final boolean d;
    public final Set e;
    public final siq f;
    public final int g;
    private volatile sjt h;

    public sjs(String str, boolean z, int i, Level level, boolean z2, Set set, siq siqVar) {
        this.a = str;
        this.b = z;
        this.g = 2;
        this.c = level;
        this.d = z2;
        this.e = set;
        this.f = siqVar;
    }

    @Override // defpackage.sji
    public final sif a(String str) {
        sjt sjtVar;
        if (!this.d || !str.contains(".")) {
            return new sju(this.a, str, this.b, 2, this.c, this.e, this.f);
        }
        sjt sjtVar2 = this.h;
        if (sjtVar2 != null) {
            return sjtVar2;
        }
        synchronized (this) {
            sjtVar = this.h;
            if (sjtVar == null) {
                sjt sjtVar3 = new sjt(this.a, null, this.b, 2, this.c, false, this.e, this.f);
                this.h = sjtVar3;
                sjtVar = sjtVar3;
            }
        }
        return sjtVar;
    }

    private sjs() {
        this("", true, 2, Level.ALL, false, sju.a, sju.b);
    }
}
