package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pko {
    public final int a;
    public final pas b;

    public pko(int i, pas pasVar) {
        this.a = i;
        this.b = pasVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof pko)) {
            return false;
        }
        pko pkoVar = (pko) obj;
        return pkoVar.a == this.a && pkoVar.b.equals(this.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
    }

    public final String toString() {
        rwb rwbVar = new rwb("ImageReaderFormat");
        rwbVar.b("ImageFormat", qpt.ay(this.a));
        rwbVar.b("Size", this.b);
        return rwbVar.toString();
    }
}
