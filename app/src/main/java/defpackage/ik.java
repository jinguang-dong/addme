package defpackage;

import android.graphics.Typeface;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ik {
    private final Typeface a;
    private final String b;
    private final int c;

    public ik(Typeface typeface, String str, int i) {
        this.a = typeface;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ik)) {
            return false;
        }
        ik ikVar = (ik) obj;
        return this.c == ikVar.c && Objects.equals(this.a, ikVar.a) && Objects.equals(this.b, ikVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.c));
    }
}
