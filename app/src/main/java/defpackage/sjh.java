package defpackage;

import java.util.Set;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sjh implements sji {
    public final String a;
    public final boolean b;
    public final int c;

    public sjh(String str, boolean z, int i) {
        this.a = str;
        this.b = z;
        this.c = 2;
    }

    @Override // defpackage.sji
    public final sif a(String str) {
        Level level = Level.ALL;
        Set set = sju.a;
        siq siqVar = sju.b;
        return new sjt(this.a, str, this.b, 2, level, true, set, siqVar);
    }

    public sjh() {
        this("", true, 2);
    }
}
