package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kiw {
    private final String a;

    public kiw(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof kiw) && this.a.equals(((kiw) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        rwb rwbVarW = rnt.W(this);
        rwbVarW.b("name", this.a);
        return rwbVarW.toString();
    }
}
