package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class car {
    private final Resources.Theme a;
    private final int b;

    public car(Resources.Theme theme, int i) {
        this.a = theme;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof car)) {
            return false;
        }
        car carVar = (car) obj;
        return a.ao(this.a, carVar.a) && this.b == carVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "Key(theme=" + this.a + ", id=" + this.b + ')';
    }
}
