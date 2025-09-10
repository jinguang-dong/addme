package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ofl {
    private final int a;
    private final oen b;
    private final String c;
    private final mwq d;

    public ofl(mwq mwqVar, oen oenVar, String str) {
        this.d = mwqVar;
        this.b = oenVar;
        this.c = str;
        this.a = Arrays.hashCode(new Object[]{mwqVar, oenVar, str});
    }

    public final String a() {
        return (String) this.d.b;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ofl)) {
            return false;
        }
        ofl oflVar = (ofl) obj;
        return a.K(this.d, oflVar.d) && a.K(this.b, oflVar.b) && a.K(this.c, oflVar.c);
    }

    public final int hashCode() {
        return this.a;
    }
}
